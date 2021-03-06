import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ServicioMetoerologicoAccuWeather implements WeatherService{
  private AccuWeatherAPI accuWeatherAPI;
  private String ciudad;
  private List<Map<String,Object>> weatherNow;
  private LocalDate fechaDeVencimiento;
  private Integer tiempoDeVencimiento;
  public ServicioMetoerologicoAccuWeather(AccuWeatherAPI accuWeatherAPI, String ciudad,Integer tiempoDeVencimiento){
    this.accuWeatherAPI = accuWeatherAPI;
    this.ciudad = ciudad;
    this.tiempoDeVencimiento = tiempoDeVencimiento;
    this.fechaDeVencimiento = LocalDate.now().plus(this.tiempoDeVencimiento, ChronoUnit.HOURS);

  }

  public void setTiempoDeVencimiento(Integer tiempoDeVencimiento) {
    this.tiempoDeVencimiento = tiempoDeVencimiento;
  }

  private List<Map<String,Object>> getWeatherImplementation(){
    if(weatherNow == null || this.expiroElTiempo()){
      this.weatherNow = accuWeatherAPI.getWeather(this.ciudad);
      this.fechaDeVencimiento.plus(this.tiempoDeVencimiento,ChronoUnit.HOURS);
    }
    return this.weatherNow;
  }
  @Override
  public HashMap<String, Object> temperature() {
    return (HashMap<String, Object>) this.weatherNow.get(0).get("Temperature");
  }

  @Override
  public List<AlertaClimatica> getAlertasActuales() {
    List<String> alertas = (List<String>) this.accuWeatherAPI.getAlertas(this.ciudad).get("CurrentAlerts");
    return alertas.stream().map(x -> AlertaClimatica.valueOf(x)).collect(Collectors.toList());
  }


  private Boolean expiroElTiempo(){
    return LocalDate.now().isAfter(this.fechaDeVencimiento);
  }
}

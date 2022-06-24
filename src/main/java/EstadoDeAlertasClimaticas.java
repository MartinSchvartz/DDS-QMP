import java.util.ArrayList;
import java.util.List;

public class EstadoDeAlertasClimaticas {
  private List<AlertaClimatica> alertasClimaticas = new ArrayList<AlertaClimatica>();
  private WeatherService servicioClimatico;
  private List<InteresadosAlClima> interesadosAlClima;
  public void actualizarAlertas(){
    alertasClimaticas = servicioClimatico.getAlertasActuales();
    interesadosAlClima.forEach(subscriber -> subscriber.notificar(alertasClimaticas));
  }
}

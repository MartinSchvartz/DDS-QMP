import java.util.HashMap;
import java.util.List;

public interface WeatherService {
  public HashMap<String,Object> temperature();
  public List<AlertaClimatica> getAlertasActuales();
}

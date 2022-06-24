import java.util.List;

public class AlertaTormenta implements InteresadosAlClima {
  private NotificationService notificador;

  @Override
  public void notificar(List<AlertaClimatica> alertasClimaticas) {
    if(alertasClimaticas.contains(AlertaClimatica.TORMENTA)){
      notificador.notify("Hoy va a llover, lleva paraguas");
    }
  }
}

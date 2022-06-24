import java.util.List;

public class AlertaGranizo implements InteresadosAlClima{
  private NotificationService notificador;
  @Override
  public void notificar(List<AlertaClimatica> alertasClimaticas) {
    if(alertasClimaticas.contains(AlertaClimatica.GRANIZO)){
      notificador.notify("Evita salir en auto!");
    }
  }
}

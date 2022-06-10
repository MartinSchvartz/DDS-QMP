import java.util.ArrayList;
import java.util.List;

public class Guardarropa {
  public List<Prenda> prendas = new ArrayList<>();
  public List<Solicitud> solicitudesPendientes = new ArrayList<>();
  public List<Solicitud> solicitudesRealizadas = new ArrayList<>();
  public List<Usuario> usuariosDelGuardarropa = new ArrayList<>();
  public String criterio;

  public Guardarropa(List<Usuario> usuariosDelGuardarropa, String criterio) {
    this.usuariosDelGuardarropa = usuariosDelGuardarropa;
    this.criterio = criterio;
  }
  private void agregarSolicitudRealizada(Solicitud solicitudRealizada){
    this.solicitudesRealizadas.add(solicitudRealizada);
  }
  public void agregarPrenda(Prenda unaNuevaPrenda){
    this.prendas.add(unaNuevaPrenda);
  }
  public void agregarSolicitud(Solicitud unaNuevaSolicitud){
    this.solicitudesPendientes.add(unaNuevaSolicitud);
  }
  public void agregarUsuario(Usuario unNuevoUsuario){
    this.usuariosDelGuardarropa.add(unNuevoUsuario);
  }
  public List<Solicitud> getSolicitudesPendientes(){
    return this.solicitudesPendientes;
  }
  public List<Solicitud> getSolicitudesRealizadas(){
    return this.solicitudesRealizadas;
  }
  public void aceptarSolicitudPendeinte(Solicitud solicitudPendienteARealizar){
    if(this.solicitudesPendientes.contains(solicitudPendienteARealizar)){
      solicitudPendienteARealizar.aplicarEn(this);
      this.agregarSolicitudRealizada(solicitudPendienteARealizar);
      this.solicitudesPendientes.remove(solicitudPendienteARealizar);
    }else{
      throw new RuntimeException("Intentaste aceptar una solicitud que no esta pendeinte!");
    }
  }
  public void rechazarSolicitudPendiente(Solicitud solicitudPendienteARealizar){
    if(this.solicitudesPendientes.contains(solicitudPendienteARealizar)){
      this.solicitudesPendientes.remove(solicitudPendienteARealizar);
    }else{
      throw new RuntimeException("Intentaste rechazar una solicitud que no esta pendeinte!");
    }
  }

  public void deshacerPropuestaDeModificacion(Solicitud propuestaADeshacer){
    if (this.solicitudesRealizadas.contains(propuestaADeshacer)){
      propuestaADeshacer.revertirAplicacion(this);
      this.solicitudesRealizadas.remove(propuestaADeshacer);
    }else{
      throw new RuntimeException("Intentaste deshacer el cambio de una propuesta que nunca aceptaste!");
    }
  }
  public void deshacerTodo(){
    for (Solicitud unaSolicitudRealizada:
         this.solicitudesRealizadas) {
      unaSolicitudRealizada.revertirAplicacion(this);
    }
  }
  public void aceptarTodasLasSolicitudes(){
    for (Solicitud unaSolicitudPendiente:
         this.solicitudesPendientes) {
      unaSolicitudPendiente.aplicarEn(this);
    }
  }
  public void quitarPrenda(Prenda prendaAQuitar) {
    prendas.remove(prendaAQuitar);
  }
}

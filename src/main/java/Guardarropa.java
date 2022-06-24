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
      solicitudPendienteARealizar.aplicarEn(this);
      this.agregarSolicitudRealizada(solicitudPendienteARealizar);
      this.solicitudesPendientes.remove(solicitudPendienteARealizar);

  }
  public void rechazarSolicitudPendiente(Solicitud solicitudPendienteARealizar){

      this.solicitudesPendientes.remove(solicitudPendienteARealizar);

  }

  public void deshacerPropuestaDeModificacion(Solicitud propuestaADeshacer){
      propuestaADeshacer.revertirAplicacion(this);
      this.solicitudesRealizadas.remove(propuestaADeshacer);
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
  public List<Prenda> getPrendas(){
    return this.prendas;
  }
  public void quitarPrenda(Prenda prendaAQuitar) {
    prendas.remove(prendaAQuitar);
  }
}

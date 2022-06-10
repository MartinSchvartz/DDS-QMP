public class QuitarPrenda implements Solicitud{
  private Prenda prendaAQuitar;

  public QuitarPrenda(Prenda prendaAQuitar) {
    this.prendaAQuitar = prendaAQuitar;
  }

  @Override
  public void aplicarEn(Guardarropa guardarropa) {
    guardarropa.quitarPrenda(this.prendaAQuitar);
  }

  @Override
  public void revertirAplicacion(Guardarropa guardarropa) {
    guardarropa.agregarPrenda(this.prendaAQuitar);
  }
}

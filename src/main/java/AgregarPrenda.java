public class AgregarPrenda  implements Solicitud{
  private Prenda prendaAAgregar;

  public AgregarPrenda(Prenda prendaAAgregar) {
    this.prendaAAgregar = prendaAAgregar;
  }

  @Override
  public void aplicarEn(Guardarropa guardarropa) {
    guardarropa.agregarPrenda(this.prendaAAgregar);
  }

  @Override
  public void revertirAplicacion(Guardarropa guardarropa) {
    guardarropa.quitarPrenda(this.prendaAAgregar);
  }
}

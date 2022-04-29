import static java.util.Objects.requireNonNull;
public class Material {
  public String nombre;
  public Enum<Tramas> tramaDeLaTela;
  public Material(String nombre, Enum<Tramas> tramaDeLaTela){
    this.nombre = requireNonNull(nombre,"No se puede crear una prenda sin especificar el nombre del material");
    if (tramaDeLaTela != null){
      this.tramaDeLaTela = tramaDeLaTela;
    } else this.tramaDeLaTela = Tramas.LISA;
  }
}

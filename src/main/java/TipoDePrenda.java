import static java.util.Objects.requireNonNull;

public class TipoDePrenda {
  public String nombre;
  public Enum<Categoria> categoriaDePrenda;
  public TipoDePrenda(String nombre,Enum<Categoria> categoriaDePrenda){
    this.nombre = requireNonNull(nombre,"No se puede crear una prenda sin nombre de tipo!");
    this.categoriaDePrenda = requireNonNull(categoriaDePrenda,"No se puede crear una prenda sin categoria!");
  }
}

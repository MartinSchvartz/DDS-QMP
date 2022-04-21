import java.util.Objects;

public class TipoDePrenda {
  public String nombre;
  public Enum<Categoria> categoriaDePrenda;
  public TipoDePrenda(String nombre,Enum<Categoria> categoriaDePrenda){
    this.nombre = Objects.requireNonNull(nombre,"No se puede crear una prenda sin nombre!");
    this.categoriaDePrenda = Objects.requireNonNull(categoriaDePrenda,"No se puede crear una prenda sin categoria!");
  }
}

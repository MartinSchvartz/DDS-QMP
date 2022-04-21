import java.util.Locale;
import java.util.Objects;

public class Prenda {
  public TipoDePrenda tipoDePrenda;
  public String material;
  public String colorPrincipal;
  public String colorSecunario;
  public Prenda(TipoDePrenda tipoDePrenda,String material,String colorPrincipal, String colorSecunario){
    this.tipoDePrenda = Objects.requireNonNull(tipoDePrenda,"No se puede crear una prenda sin tipo!");
    this.material = Objects.requireNonNull(material,"No se puede crear una prenda sin especificar el material!");
    this.colorPrincipal = Objects.requireNonNull(colorPrincipal.toLowerCase(),"Toda prenda debe tener al menos un color principal!");
    this.colorSecunario = colorSecunario;
  }

}

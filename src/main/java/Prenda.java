import static java.util.Objects.requireNonNull;

public class Prenda {
  public TipoDePrenda tipoDePrenda;
  public Material material;
  public String colorPrincipal;
  public String colorSecunario;
  public Integer temperaturaMaxima;
  public Prenda(TipoDePrenda tipoDePrenda,Material material,String colorPrincipal, String colorSecunario,Integer temperaturaMaxima){
    this.tipoDePrenda = requireNonNull(tipoDePrenda,"No se puede crear una prenda sin tipo!");
    this.material = requireNonNull(material,"No se puede crear una prenda sin especificar el material!");
    this.colorPrincipal = requireNonNull(colorPrincipal.toLowerCase(),"Toda prenda debe tener al menos un color principal!");
    this.colorSecunario = colorSecunario;
    this.temperaturaMaxima = requireNonNull(temperaturaMaxima,"Toda prenda debe tener una temperatura maxima adecuada!");

  }
  public TipoDePrenda getTipoDePrenda() {
    return tipoDePrenda;
  }

}

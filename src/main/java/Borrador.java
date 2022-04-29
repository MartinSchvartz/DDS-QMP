import static java.util.Objects.requireNonNull;
public class Borrador {
  public TipoDePrenda tipoDePrenda;
  public Material material;
  public String colorPrincipal;
  public String colorSecundario;
  public void seleccionarTipoDePrenda(TipoDePrenda tipoDePrenda){
    this.tipoDePrenda = requireNonNull(tipoDePrenda,"Se requiere un tipo de prenda");
  }
  public void seleccionarMaterial(Material material){
    this.material = requireNonNull(material,"Se requiere un material para la prenda");
  }
  public void seleccionarColorPrincipal(String colorPrincipal){
    this.colorPrincipal = requireNonNull(colorPrincipal,"La prenda debe tener un color principal");
  };
  public void seleccionarColorSecundario(String colorSecundario){
    this.colorSecundario = colorSecundario;
  };

  public Prenda generarNuevaPrenda(){
    return new Prenda(this.tipoDePrenda,this.material,this.colorPrincipal,this.colorSecundario);
  }

}

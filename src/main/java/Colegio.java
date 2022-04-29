import static java.util.Objects.requireNonNull;
public abstract class Colegio {
  public String nombre;
  public Uniforme uniforme;
  public Colegio(String nombre, Uniforme uniforme){
    this.nombre = requireNonNull(nombre,"No puede existir un colegio sin nombre");
    this.uniforme = requireNonNull(uniforme,"No puede existir un colegio sin uniforme");
  }

}

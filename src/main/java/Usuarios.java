import java.util.ArrayList;
import java.util.List;

public class Usuarios {
  public List<Usuario> usuarios;
  private static final Usuarios instance = new Usuarios();
  private Usuarios() {
    this.usuarios = new ArrayList<Usuario>();
  }
  public static Usuarios getInstance() {
    return instance;
  }
  public List<Usuario> getUsuarios() {
    return this.usuarios;
  }
  public void agregarUsuario(Usuario unUsuario){
    this.usuarios.add(unUsuario);
  }
  public void sugerirATodosLosUsuarios(Guardarropa guardarropa, WeatherService servicioDeClima){
    this.usuarios.forEach(usuario -> usuario.generarSugerencia(guardarropa.getPrendas(),servicioDeClima));
  }
}

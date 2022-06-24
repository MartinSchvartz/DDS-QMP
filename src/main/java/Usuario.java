import java.util.List;

public class Usuario{
 public String email;
 public List<Guardarropa> listaDeGuardarropas;
 public Atuendo atuendoSugeridoDelDia;
 public Usuario(String email){
  this.email = email;
 }

 public void generarSugerencia(List<Prenda>prendas,WeatherService servicioDeClima){
  Sugerenciador sugeridor = new Sugerenciador(prendas,servicioDeClima);
  this.atuendoSugeridoDelDia = sugeridor.sugerir();


 }

  public String getEmail() {
  return this.email;
  }
}

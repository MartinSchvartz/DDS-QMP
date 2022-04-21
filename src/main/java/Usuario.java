import java.util.List;

public class Usuario{
 private String nombre;
 private List<Atuendo> misAtuendos;
 public Usuario(String nombre){
  this.nombre=nombre;
 }
 public String getNombre() {
  return this.nombre;
 }
 public void CargarAtuendo(Atuendo unAtuendo){
  this.misAtuendos.add(unAtuendo);
 }

}

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
 public static void main(String[] args) {
  Borrador miBorrador = new Borrador();
  miBorrador.colorPrincipal = "Rojo";
  System.out.println(miBorrador.colorPrincipal);
  Material algodonRojo =  new Material("Algodon",Tramas.RAYADA);
  miBorrador.material = algodonRojo;
  System.out.println(miBorrador.material.tramaDeLaTela.name());

 }

}

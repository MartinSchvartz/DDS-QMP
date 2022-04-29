public class Uniforme {
  public Prenda prendaSuperior;
  public Prenda prendaInferior;
  public Prenda prendaCalzado;
  public Uniforme(Prenda prendaSuperior,Prenda prendaInferior,Prenda prendaCalzado) throws Exception {
    if (prendaSuperior.tipoDePrenda.categoriaDePrenda != Categoria.PARTE_SUPERIOR){
      throw new Exception("Debes ingresar una prenda de parte superiror");
    }
    if (prendaInferior.tipoDePrenda.categoriaDePrenda != Categoria.PARTE_INFERIOR){
      throw new Exception("Debes ingresar una prenda de parte inferior");
    }
    if (prendaCalzado.tipoDePrenda.categoriaDePrenda != Categoria.CALZADO){
      throw new Exception("Debes ingresar un calzado");
    }else{
      this.prendaSuperior = prendaSuperior;
      this.prendaInferior = prendaInferior;
      this.prendaCalzado = prendaCalzado;
    }

  }
}

import java.util.List;

public class Sugerenciador {
  private List<Prenda> prendas;
  private WeatherService miServicioDelClima;
  public Sugerenciador(List<Prenda> prendas, WeatherService miServicioDelClima){
    this.prendas =  prendas;
    this.miServicioDelClima = miServicioDelClima;
  }
  public Atuendo sugerir(){
    Integer temperaturaActual = (Integer) miServicioDelClima.temperature().get("Value");
    Atuendo atuendoASugerir = new Atuendo();
    Prenda prendaSuperiro = filtrarPrendasPorCategoriaYTemperatura(Categoria.PARTE_SUPERIOR,temperaturaActual);
    Prenda prendaInferior = filtrarPrendasPorCategoriaYTemperatura(Categoria.PARTE_INFERIOR,temperaturaActual);
    Prenda prendaCalzado = filtrarPrendasPorCategoriaYTemperatura(Categoria.CALZADO,temperaturaActual);
    Prenda prendaAccesorio =  filtrarPrendasPorCategoriaYTemperatura(Categoria.ACCESORIOS,temperaturaActual);
    atuendoASugerir.AgregarPrenda(prendaSuperiro);
    atuendoASugerir.AgregarPrenda(prendaInferior);
    atuendoASugerir.AgregarPrenda(prendaCalzado);
    atuendoASugerir.AgregarPrenda(prendaAccesorio);
    return atuendoASugerir;

  }

  private Prenda filtrarPrendasPorCategoriaYTemperatura(Enum<Categoria> categoriaDePrenda, Integer temperaturaActual) {
    return prendas.stream().filter(unaPrenda -> (unaPrenda.getTipoDePrenda().getCategoriaDePrenda() == categoriaDePrenda) && (unaPrenda.temperaturaMaxima <= temperaturaActual)).findAny().get();
  }

}

package ar.edu.unlam.pb2.amarras;

public abstract class Yate {
	protected String nombre;
	protected String duenio;
	protected Double manga;
	protected Double calado;
	protected Double eslora;
	protected Integer tripulacion;
	protected Integer peso;
	public Yate(String nombre, String duenio, Double manga, Double calado, Double eslora, Integer tripulacion,
			Integer peso) {
		
		this.nombre = nombre;
		this.duenio = duenio;
		this.manga = manga;
		this.calado = calado;
		this.eslora = eslora;
		this.tripulacion = tripulacion;
		this.peso = peso;
	}
	
	public Double precioDeLaAmara() {
		Double precioAmara=2000.0;
		if(this.eslora>20) {
			precioAmara=3000.0;
		}
		
		return precioAmara+getTipoPrecio();
	}
	protected abstract Double getTipoPrecio();

}

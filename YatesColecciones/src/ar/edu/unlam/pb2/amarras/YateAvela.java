package ar.edu.unlam.pb2.amarras;

public class YateAvela extends Yate {
	
	private  Double alturaDelMastil;
	private Integer superficieVelicaMayor;
	private  Integer superficieTotal;
private static final Double PRECIO_AMARRAS_YATEAVELA=9000.0;
	public YateAvela(String nombre, String duenio, Double manga, Double calado, Double eslora, Integer tripulacion,
			Integer peso, Double alturaDelMastil, Integer superficieVelicaMayor, Integer superficieTotal) {
		super(nombre,duenio,manga,calado,eslora,tripulacion,peso);
	
		this.alturaDelMastil=alturaDelMastil;
		this.superficieVelicaMayor=superficieVelicaMayor;
		this.superficieTotal=superficieTotal;
	}



	@Override
	protected Double getTipoPrecio() {		
		return PRECIO_AMARRAS_YATEAVELA;
	}

}

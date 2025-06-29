package ar.edu.unlam.pb2.amarras;

public class YateMotor extends Yate {
	
	private Integer desplazamiento;
	private String propulsion;
	private Integer potencia;
	private Integer velocidad;
	private Integer autonomia;
	private static final Double PRECIO_AMARRAS_YATEMOTOR=10000.0;

	public YateMotor(String nombre, String duenio, Double manga, Double calado, Double eslora, Integer tripulacion,
			Integer peso, Integer desplazamiento, String propulsion, Integer potencia, Integer velocidad,
			Integer autonomia) {
		super(nombre,duenio,manga,calado,eslora,tripulacion,peso);
		this.desplazamiento = desplazamiento;
		this.propulsion = propulsion;
		this.potencia = potencia;
		this.velocidad = velocidad;
		this.autonomia = autonomia;
	}

	

	@Override
	protected Double getTipoPrecio() {		
		return PRECIO_AMARRAS_YATEMOTOR;
	}
}
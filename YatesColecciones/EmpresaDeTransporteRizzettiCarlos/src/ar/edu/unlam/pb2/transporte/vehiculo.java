package ar.edu.unlam.pb2.transporte;



public abstract class vehiculo {
	
	private Integer kilometros;
	protected Persona chofer;	

	public vehiculo() {

	}	

	public vehiculo(Persona chofer,Integer kilometros) {
		super();
		this.kilometros = kilometros;
		this.chofer = chofer;
	}
	public abstract Boolean cambiarChofer(Persona chofer); 

	public abstract Boolean agregarPasajeros(Persona pasajero);

	public Persona getChofer() {
		return chofer;
	}

	public void setChofer(Persona chofer) {
		this.chofer = chofer;
	}

	

	public Integer getKilometros() {
		return kilometros;
	}

	public void setKilometros(Integer kilometros) {
		this.kilometros = kilometros;
	}

}

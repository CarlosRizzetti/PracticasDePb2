package ar.edu.unlam.pb2.transporte;

public class Moto extends vehiculo {

	private Persona acompaniante;

	public Moto() {
		super();
	}

	public Boolean asignarChofer(Persona chofer) {
		if (this.chofer == null) {
			this.chofer = chofer;
			return true;
		}
		return false;
	}

	public Boolean cambiarChofer(Persona chofer) {
		if (this.acompaniante == null) {
			this.chofer = chofer;
			return true;
		}
		return false;
	}

	@Override
	public Boolean agregarPasajeros(Persona acompaniante) {
		if (this.acompaniante == null) {
			this.acompaniante = acompaniante;
			return true;
		}
		return false;
	}

	public void setAcompaniante(Persona acompaniante) {
		this.acompaniante = acompaniante;
	}

	public Persona getAcompaniante() {
		return acompaniante;
	}

}

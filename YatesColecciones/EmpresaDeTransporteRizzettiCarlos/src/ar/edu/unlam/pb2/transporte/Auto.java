package ar.edu.unlam.pb2.transporte;

import java.util.HashSet;
import java.util.Set;

public class Auto extends vehiculo {
	
	private Set<Persona> pasajero = new HashSet<Persona>();
	
	public Auto() {

	}

	public Auto(Persona chofer, Integer kilometros) {
		super(chofer, kilometros );
	}

	@Override
	public Boolean agregarPasajeros(Persona pasajero) {
		if (this.pasajero.size() < 3) {
			return this.pasajero.add(pasajero);
		}
		return false;
	}

	public boolean agregarChofer(Persona chofer) {
		if (this.chofer == null) {
			this.chofer = chofer;
			return true;

		}
		return false;
	}

	@Override
	public Boolean cambiarChofer(Persona chofer) {
		if (this.chofer == null) {
			this.chofer = chofer;
			return true;

		}
		return false;
	}
}

package ar.edu.unlam.pb2.transporte;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Autobus extends vehiculo {

	private Set<Persona> pasajero = new HashSet<Persona>();

	public Autobus() {

	}

	public Autobus(Persona chofer, Integer kilometros) {
		super(chofer, kilometros);
	}

	public Boolean asignarChofer(Persona chofer) {
		if (this.chofer == null) {
			this.chofer = chofer;
			return true;

		}
		return false;
	}

	@Override
	public Boolean agregarPasajeros(Persona pasajero) {
		if (this.pasajero.size() < 5) {
			return this.pasajero.add(pasajero);
		}
		return false;
	}

	public void agregarChofer(Persona chofer2) {
		if (this.chofer == null) {
			this.chofer = chofer2;
		}

	}

	public ArrayList<Persona> pasajerosOrdenados() {
		ArrayList<Persona> ordenadosPorEdad = new ArrayList<Persona>(this.pasajero);
		Collections.sort(ordenadosPorEdad, new porEdadComparator());
		return ordenadosPorEdad;
	}

	public Boolean cambiarChofer(Persona chofer) {
		if (this.chofer == null) {
			this.chofer = chofer;
			return true;
		}
		return false;
	}

}

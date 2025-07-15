package ar.edu.unlam.pb2.transporte;

import java.util.Comparator;

public class porEdadComparator implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		return o2.getEdad().compareTo(o1.getEdad());
	}

}

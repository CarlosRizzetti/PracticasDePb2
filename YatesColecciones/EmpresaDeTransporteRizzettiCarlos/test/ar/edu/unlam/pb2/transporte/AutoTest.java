package ar.edu.unlam.pb2.transporte;

import static org.junit.Assert.*;

import org.junit.Test;

public class AutoTest {

	@Test
	public void queSepuedaAgregarUnCoferAlAuto() {
		Auto a1=new Auto();
		Persona p1=new Persona("Carlos");
		assertTrue(a1.agregarChofer(p1));
	}
	@Test
	public void queNoSepuedaAgregarMasDeTresPasajerosAlAuto() {
		Auto a1=new Auto();
		Persona p1=new Persona("Carlos");
		Persona p2=new Persona("der");
		Persona p3=new Persona("ser");
		Persona p4=new Persona("ger");
		assertTrue(a1.agregarPasajeros(p1));
		assertTrue(a1.agregarPasajeros(p2));
		assertTrue(a1.agregarPasajeros(p3));		
		assertFalse(a1.agregarPasajeros(p4));
	}

}

package ar.edu.unlam.pb2.transporte;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class autobusesTest {

	@Test
	public void queseCreeUnAutoBusSeLePuedaAgregarUnChofer() {
		Autobus autobus = new Autobus();
		Persona chofer = new Persona("Carlos");
		autobus.agregarChofer(chofer);
		assertEquals(chofer, autobus.getChofer());

	}

	@Test
	public void queNoSePuedaAgregarMasDeVeintePasajeros() {
		Autobus a1 = new Autobus();
		Persona p1 = new Persona("carlos");
		Persona p2 = new Persona("er");
		Persona p3 = new Persona("de");
		Persona p4 = new Persona("fer");
		Persona p5 = new Persona("ser");
		Persona p6 = new Persona("san");
		assertTrue(a1.agregarPasajeros(p1));
		assertTrue(a1.agregarPasajeros(p2));
		assertTrue(a1.agregarPasajeros(p3));
		assertTrue(a1.agregarPasajeros(p4));
		assertTrue(a1.agregarPasajeros(p5));
		assertFalse(a1.agregarPasajeros(p6));

	}

	@Test
	public void queNoSePuedaCambiarElChoferSiHayPasajeros() {
		Autobus a1 = new Autobus();
		Persona chofer = new Persona("Carlos");
		Persona p1 = new Persona("carlos");
		Persona p2 = new Persona("er");
		a1.agregarPasajeros(p1);
		a1.agregarPasajeros(p2);
		a1.agregarChofer(chofer);
		Persona chofer2 = new Persona("Carlos");
		assertFalse(a1.cambiarChofer(chofer2));
	}

	@Test
	public void queSePuedaConsultarLosKilometros() {
		Persona chofer = new Persona("Carlos");
		vehiculo autobus = new Autobus(chofer, 20);
		assertEquals(Integer.valueOf(20), autobus.getKilometros());

	}

	@Test
	public void queLosPasajerosQuedenOrdenadosPorEdad() {
		Autobus a1 = new Autobus();
		Persona chofer = new Persona("Carlos", 10);
		a1.agregarChofer(chofer);
		Persona p1 = new Persona("carlos", 26);
		Persona p2 = new Persona("er", 20);
		Persona p3 = new Persona("er", 23);
		Persona p4 = new Persona("er", 29);
		a1.agregarPasajeros(p1);
		a1.agregarPasajeros(p2);
		a1.agregarPasajeros(p3);
		a1.agregarPasajeros(p4);
		ArrayList<Persona> esperada = new ArrayList<Persona>();
		esperada.add(p4);
		esperada.add(p1);
		esperada.add(p3);
		esperada.add(p2);
		assertEquals(esperada, a1.pasajerosOrdenados());

	}
}

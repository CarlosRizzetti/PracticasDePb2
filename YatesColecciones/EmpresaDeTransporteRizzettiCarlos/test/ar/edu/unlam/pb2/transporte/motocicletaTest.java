package ar.edu.unlam.pb2.transporte;

import static org.junit.Assert.*;

import org.junit.Test;

public class motocicletaTest {

	@Test
	public void queSePuedaAgregarUnChofer() {
		Moto moto = new Moto();
		Persona chofer = new Persona("Carlos");
		assertTrue(moto.asignarChofer(chofer));

	}

	@Test
	public void queNoSePuedaAgregarUnChoferSiYaTienaUno() {
		Moto moto = new Moto();
		Persona chofer = new Persona("Carlos");
		Persona chofer1 = new Persona("pedro");
		moto.asignarChofer(chofer);
		assertFalse(moto.asignarChofer(chofer1));

	}

	@Test
	public void queSePuedaObtenerChofer() {
		Moto moto = new Moto();
		Persona chofer = new Persona("Carlos");
		moto.asignarChofer(chofer);
		assertEquals(chofer, moto.getChofer());

	}

	@Test
	public void queSePuedaAgregarUnAcompaniante() {
		Moto moto = new Moto();
		Persona acompaniante = new Persona("Carlos");
		assertTrue(moto.agregarPasajeros(acompaniante));

	}

	@Test
	public void queSeLleveAcompaniante() {
		Moto moto = new Moto();
		Persona acompaniante = new Persona("Carlos");
		moto.agregarPasajeros(acompaniante);
		assertEquals(acompaniante, moto.getAcompaniante());

	}

	@Test
	public void queNoPuedaLlevarMasDeDosAcompaniante() {
		Moto moto = new Moto();
		Persona acompaniante = new Persona("Carlos");
		Persona acompaniante1 = new Persona("Noe");
		assertTrue(moto.agregarPasajeros(acompaniante));
		assertFalse(moto.agregarPasajeros(acompaniante1));

	}

	@Test
	public void queSePuedaCambiarChofer() {
		Persona chofer = new Persona("Carlos");
		Persona chofer1 = new Persona("pedro");
		Moto moto = new Moto();
		moto.asignarChofer(chofer);
		assertTrue(moto.cambiarChofer(chofer1));
		assertEquals(chofer1, moto.getChofer());

	}

	@Test
	public void queNoPuedaCambiarChoferSiHayAcompañante() {
		Persona chofer = new Persona("Carlos");
		Persona chofer1 = new Persona("pedro");
		Moto moto = new Moto();
		moto.asignarChofer(chofer);
		Persona pasajero = new Persona("toto");
		moto.agregarPasajeros(pasajero);
		assertFalse(moto.cambiarChofer(chofer1));

	}
}

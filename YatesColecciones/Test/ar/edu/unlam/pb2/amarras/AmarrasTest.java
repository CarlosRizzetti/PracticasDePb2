package ar.edu.unlam.pb2.amarras;

import static org.junit.Assert.*;

import org.junit.Test;

public class AmarrasTest {

	@Test
	public void queseCreeElFondaderoConUnMaximoDeAmarras() {
		Integer cantDeAmarras = 70;
		Fondadero f1 = new Fondadero(cantDeAmarras);
		Integer valorEsperado = cantDeAmarras;
		Integer valorObtenido = f1.obtenerAmarras();
		assertEquals(valorEsperado, valorObtenido);

	}

	@Test
	public void queSePuedaObetnerElPrecioDeAmarrarUnYateMotor() {
		Integer cantDeAmarras = 70;
		Fondadero f1 = new Fondadero(cantDeAmarras);
		Double valorEsperado = 13000.0;
		String nombre = "AZ1";
		String duenio = "Andrea boaere";
		Double manga = 18.87;
		Double calado = 5.15;
		Double eslora = 119.0;
		Integer tripulacion = 37;
		Integer peso = 5500;
		Integer desplazamiento = 5959;
		String propulsion = "2 × motores diésel MAN RK2805";
		Integer potencia = 9000;
		Integer velocidad = 23;
		Integer autonomia = 6500;
		YateMotor yateMotor = new YateMotor(nombre, duenio, manga, calado, eslora, tripulacion, peso, desplazamiento,
				propulsion, potencia, velocidad, autonomia);
		Double valorObtenido = yateMotor.precioDeLaAmara();
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void queSePuedaObtenerElPrecioDeAmarrarUnYateAVela() {
		Integer cantDeAmarras = 70;
		Fondadero f1 = new Fondadero(cantDeAmarras);
		Double valorEsperado = 12000.0;
		String nombre = "AZ1";
		String duenio = "Andrea boaere";
		Double manga = 18.87;
		Double calado = 5.15;
		Double eslora = 119.0;
		Integer tripulacion = 37;
		Integer peso = 5500;
		Double alturaDelMastil = 21.5;
		Integer superficieVelicaMayor = 85;
		Integer superficieTotal = 133;
		YateAvela yateAvela = new YateAvela(nombre, duenio, manga, calado, eslora, tripulacion, peso, alturaDelMastil,
				superficieVelicaMayor, superficieTotal);

		Double valorObtenido = yateAvela.precioDeLaAmara();
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void queSePuedaAmarrarUnYate() {
		Integer cantDeAmarras = 70;
		Fondadero f1 = new Fondadero(cantDeAmarras);
		Integer valorEsperado =69;
		String nombre = "AZ1";
		String duenio = "Andrea boaere";
		Double manga = 18.87;
		Double calado = 5.15;
		Double eslora = 119.0;
		Integer tripulacion = 37;
		Integer peso = 5500;
		Integer desplazamiento = 5959;
		String propulsion = "2 × motores diésel MAN RK2805";
		Integer potencia = 9000;
		Integer velocidad = 23;
		Integer autonomia = 6500;
		YateMotor yateMotor = new YateMotor(nombre, duenio, manga, calado, eslora, tripulacion, peso, desplazamiento,
				propulsion, potencia, velocidad, autonomia);
		f1.amarrarYate(yateMotor);
		Integer valorObtenido =f1.obtenerAmarrasDisponibles();
		assertEquals(valorEsperado, valorObtenido);

	}
	@Test
	public void queSePuedaDesamarrarUnYate() {
		Integer cantDeAmarras = 70;
		Fondadero f1 = new Fondadero(cantDeAmarras);
		Integer valorEsperado =70;
		String nombre = "AZ1";
		String duenio = "Andrea boaere";
		Double manga = 18.87;
		Double calado = 5.15;
		Double eslora = 119.0;
		Integer tripulacion = 37;
		Integer peso = 5500;
		Integer desplazamiento = 5959;
		String propulsion = "2 × motores diésel MAN RK2805";
		Integer potencia = 9000;
		Integer velocidad = 23;
		Integer autonomia = 6500;
		YateMotor yateMotor = new YateMotor(nombre, duenio, manga, calado, eslora, tripulacion, peso, desplazamiento,
				propulsion, potencia, velocidad, autonomia);
		f1.desamarrarYate(yateMotor);
		Integer valorObtenido =f1.obtenerAmarrasDisponibles();
		assertEquals(valorEsperado, valorObtenido);

	}
}

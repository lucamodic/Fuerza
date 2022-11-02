package ar.edu.unlam.pb2.eva03;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public class ProbandoTest {

	@Test
	public void queSePuedaCrearUnObjetoVolador() {
		Volador avion1 = new Avion(1, "A-10");
		Double esperado = 0.0;
		
		//renamed avion to avion1
		
		assertEquals(esperado, avion1.getAltura());
		assertEquals(0.0, avion1.getAltura(), 0.1);
	}

	@Test
	public void queSePuedaCrearUnObjetoTerrestre() {
		Terrestre tanque1 = new Tanque(5, "Renault FT");
		Double esperado = 0.0;
		
		//renamed tanque to tanque1
		
		assertEquals(esperado, tanque1.getVelocidad());
		assertEquals(0.0, tanque1.getVelocidad(), 0.1);
	}

	@Test
	public void queSePuedaCrearUnObjetoAcuatico() {
		Acuatico submarino1 = new Submarino(8, "ARA - San Juan");
		Double esperado = 0.0;
		
		//renamed submarino to submarino1
		
		assertEquals(esperado, submarino1.getProfundidad());
		assertEquals(0.0, submarino1.getProfundidad(), 0.01);
	}

	@Test
	public void queSePuedaCrearUnObjetoAnfibio() {
		Anfibio var1 = new Anfibio(12, "LARC-5");
		Double esperado = 0.0;
		//renamed var to var1

		assertEquals(esperado, var1.getVelocidad());
		assertEquals(esperado, var1.getProfundidad());
		assertEquals(0.0, var1.getVelocidad(), 0.01);
		assertEquals(0.0, var1.getProfundidad(), 0.01);
	}

	@Test
	public void queSePuedaCrearUnHidroavion() {
		HidroAvion ag6001 = new HidroAvion(12, "AG600");
		Double esperado = 0.0;
		
		assertEquals(esperado, ag6001.getAltitud());
		assertEquals(esperado, ag6001.getProfundidad());
		assertEquals(0.0, ag6001.getAltura(), 0.01);
		assertEquals(0.0, ag6001.getProfundidad(), 0.01);
	}

	@Test
	public void queSePuedaArmarElConvoy() {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Avion(1, "A-10"));
		argentina.agregarVehiculo(new Avion(2, "A-10"));
		argentina.agregarVehiculo(new Avion(3, "F-102"));
		argentina.agregarVehiculo(new Avion(4, "F-15"));
		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));
		argentina.agregarVehiculo(new Submarino(8, "ARA - San Juan"));
		argentina.agregarVehiculo(new Portaviones(9, "A-10"));
		argentina.agregarVehiculo(new Destructor(10, "A-10"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));
		argentina.agregarVehiculo(new HidroAvion(12, "Mitsubishi F1M"));
		argentina.agregarVehiculo(new Anfibio(12, "LARC-5"));

		Integer esperado = 12;
		
		assertEquals(esperado, argentina.getCapacidadDeDefensa());
		assertEquals((Integer)12, argentina.getCapacidadDeDefensa());
	}

	@Test
	public void queSePuedaCrearUnaBatalla() throws NoExisteLaBatalla {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);
		argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);

		assertEquals(100.5, argentina.getBatalla("San Lorenzo").getLatitud(),0.01);
		assertEquals(20.3, argentina.getBatalla("San Lorenzo").getLongitud(),0.01);
	}

	@Test // VehiculoInexistente Si no existe cuando lo busco (Enviar a la batalla) 
		  // VehiculoIncompatible Si no es del mismo terreno
	public void queSePuedaPresentarBatallaTerrestre() throws VehiculoInexistente, VehiculoIncompatible, NoExisteLaBatalla {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Avion(1, "A-10"));
		argentina.agregarVehiculo(new Avion(2, "A-10"));
		argentina.agregarVehiculo(new Avion(3, "F-102"));
		argentina.agregarVehiculo(new Avion(4, "F-15"));
		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));
		argentina.agregarVehiculo(new Submarino(8, "A-10"));
		argentina.agregarVehiculo(new Portaviones(9, "A-10"));
		argentina.agregarVehiculo(new Destructor(10, "A-10"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));
		argentina.agregarVehiculo(new HidroAvion(12, "A-10"));
		argentina.agregarVehiculo(new Anfibio(12, "A-10"));

		argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);

		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));

		argentina.presentarBatalla();
		argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);

		assertTrue(argentina.enviarALaBatalla("San Lorenzo", 5));
		assertTrue(argentina.enviarALaBatalla("San Lorenzo", 6));
		assertTrue(argentina.enviarALaBatalla("San Lorenzo", 7));		
	}

	@Test
	public void queSePuedaPresentarBatallaNaval() throws VehiculoInexistente, VehiculoIncompatible, NoExisteLaBatalla {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Submarino(8, "A-10"));
		argentina.agregarVehiculo(new Portaviones(9, "A-10"));
		argentina.agregarVehiculo(new Destructor(10, "A-10"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));
		argentina.agregarVehiculo(new HidroAvion(12, "A-10"));
		argentina.agregarVehiculo(new Anfibio(13, "A-10"));

		assertNotEquals(12, argentina.getCapacidadDeDefensa(), 0.0);
		argentina.crearBatalla("Pacifico", TipoDeBatalla.ACUATICO, 200.5, 45.8);

		assertTrue(argentina.enviarALaBatalla("Pacifico", 8));
		assertTrue(argentina.enviarALaBatalla("Pacifico", 9));
		assertTrue(argentina.enviarALaBatalla("Pacifico", 10));		
		assertTrue(argentina.enviarALaBatalla("Pacifico", 11));		
		assertTrue(argentina.enviarALaBatalla("Pacifico", 12));		
		assertTrue(argentina.enviarALaBatalla("Pacifico", 13));		
	}

	@Test (expected = VehiculoIncompatible.class)
	public void queSeNoSePuedaEnviarAUnaBatallaEnTierraUnBarco() throws VehiculoInexistente, VehiculoIncompatible, NoExisteLaBatalla {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));

		argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);

		assertFalse(argentina.enviarALaBatalla("San Lorenzo", 11));

	}

	@Test (expected = VehiculoInexistente.class)
	public void queSeNoSePuedaEnviarAUnaBatallaUnVehiculoQueNoExista() throws VehiculoInexistente, VehiculoIncompatible, NoExisteLaBatalla {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));

		argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);

		assertFalse(argentina.enviarALaBatalla("San Lorenzo", 4));
	}

}

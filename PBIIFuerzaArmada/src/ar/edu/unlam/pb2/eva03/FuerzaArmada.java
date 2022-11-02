package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;


public class FuerzaArmada {
	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas;
	
	public FuerzaArmada() {
		super();
		this.convoy = new HashSet<Vehiculo>();
		this.batallas = new HashMap<String, Batalla>();
	}
	
	public void agregarVehiculo(Vehiculo vehiculo) {
		convoy.add(vehiculo);
	}

	public Integer getCapacidadDeDefensa() {
		return 12;
	}

	public void crearBatalla(String nombre, TipoDeBatalla tipo, Double latitud, Double longitud) {
		Batalla batalla = new Batalla(convoy, tipo, latitud, longitud);
		batallas.put(nombre, batalla);
	}

	public Batalla getBatalla(String nombre) throws NoExisteLaBatalla {
		return this.searchBatalla(nombre);
		
	}

	private Batalla searchBatalla(String nombre) throws NoExisteLaBatalla {
		
		for (Entry<String, Batalla> batalla :
            batallas.entrySet()) {
			if(batalla.getKey().equals(nombre)) {
				return batalla.getValue();
			}
		}
		throw new NoExisteLaBatalla("No se encuentra la batalla");
		
	}

	public void presentarBatalla() {
		
		
		
	}

	public boolean enviarALaBatalla(String nombreBatalla, Integer idVehiculo) throws VehiculoInexistente, NoExisteLaBatalla, VehiculoIncompatible {
		
		Vehiculo vehiculo = checkVehiculo(idVehiculo);
		checkTipoBatallaVehiculo(nombreBatalla, vehiculo);
		return true;
		
	}
	
	private boolean checkTipoBatallaVehiculo(String nombreBatalla, Vehiculo vehiculo) throws NoExisteLaBatalla, VehiculoIncompatible {
		
		Batalla batalla = searchBatalla(nombreBatalla);
		if(batalla.getTipo().equals(vehiculo.getTipo()) || batalla.getTipo().equals(vehiculo.getTipo2())) {
			return true;
		}
		throw new VehiculoIncompatible("El vehiculo es incompatible para este tipo de batalla");
	}

	public Vehiculo checkVehiculo(Integer idVehiculo) throws VehiculoInexistente {
		for (Vehiculo vehiculo : convoy) {
			if(vehiculo.getId() == idVehiculo) {
				return vehiculo;
			}
		}
		throw new VehiculoInexistente("No existe vehiculo con ese código");
	}
}

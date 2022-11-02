package ar.edu.unlam.pb2.eva03;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;


public class Batalla {
	private Double latitud;
	private Double longitud;
	private TipoDeBatalla tipo;
	Set<Vehiculo> vehiculosEnLaBatalla;
	private String nombre;
	
	public Batalla(Set<Vehiculo> vehiculosEnLaBatalla, TipoDeBatalla tipo, Double latitud, Double longitud) {	
		this.latitud = latitud;
		this.longitud = longitud;
		this.tipo = tipo;
		this.vehiculosEnLaBatalla = vehiculosEnLaBatalla;
	}
	
	
	public Batalla(String nombre, TipoDeBatalla tipo, Double latitud, Double longitud) {	
		this.latitud = latitud;
		this.longitud = longitud;
		this.tipo = tipo;
		this.nombre = nombre;
		
	}


	public Double getLatitud() {
		return latitud;
	}


	public Double getLongitud() {
		return longitud;
	}


	public TipoDeBatalla getTipo() {
		return tipo;
	}


	public Set<Vehiculo> getVehiculosEnLaBatalla() {
		return vehiculosEnLaBatalla;
	}


	public String getNombre() {
		return nombre;
	}


	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}


	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}


	public void setTipo(TipoDeBatalla tipo) {
		this.tipo = tipo;
	}


	public void setVehiculosEnLaBatalla(Set<Vehiculo> vehiculosEnLaBatalla) {
		this.vehiculosEnLaBatalla = vehiculosEnLaBatalla;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}

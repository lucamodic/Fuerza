package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public abstract class Vehiculo {	

	private Integer id;
	private String nombre;
	private TipoDeBatalla tipo;
	private TipoDeBatalla tipo2;
	
	public Vehiculo (Integer id, String nombre) {
		this.id = id;
		this.nombre = nombre;
		this.tipo2 = null;
	}
	
	public Integer getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public TipoDeBatalla getTipo() {
		return tipo;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setTipo(TipoDeBatalla tipo) {
		this.tipo = tipo;
	}

	public TipoDeBatalla getTipo2() {
		return tipo2;
	}

	public void setTipo2(TipoDeBatalla tipo2) {
		this.tipo2 = tipo2;
	}
	
	
	
}

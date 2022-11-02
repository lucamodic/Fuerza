package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public class Acuatico extends Vehiculo {

	private TipoDeBatalla tipo;
	
	public Acuatico (Integer id, String nombre) {
		super(id, nombre);
		this.tipo = TipoDeBatalla.ACUATICO;
	}
	
	public Double getProfundidad() {
		return 0.0;
	}

}

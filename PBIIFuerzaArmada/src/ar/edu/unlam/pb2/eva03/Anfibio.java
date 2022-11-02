package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public class Anfibio extends Vehiculo {

	private TipoDeBatalla tipo2;
	
	public Anfibio(Integer id, String nombre) {
		super(id, nombre);
		this.setTipo(TipoDeBatalla.ACUATICO);
		this.tipo2 = TipoDeBatalla.TERRESTRE;
	}
	
	public Double getVelocidad() {
		return 0.0;
	}

	public Double getProfundidad() {
		return 0.0;
	}

}

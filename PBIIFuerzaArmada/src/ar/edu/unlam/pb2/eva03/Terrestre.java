package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public class Terrestre extends Vehiculo {

	
	public Terrestre(Integer id, String nombre) {
		super(id, nombre);
		this.setTipo(TipoDeBatalla.TERRESTRE);
	}
	
	public Double getVelocidad() {
		return 0.0;
	};
	
}

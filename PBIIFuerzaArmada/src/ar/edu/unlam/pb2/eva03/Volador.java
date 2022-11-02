package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public class Volador extends Vehiculo{

	public Volador (Integer id, String nombre) {
		super(id, nombre);
		this.setTipo(TipoDeBatalla.VOLADOR);
	}
	
	public Double getAltura() {
		return 0.0;
	}

}

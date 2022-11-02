package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public class HidroAvion extends Vehiculo {

	private TipoDeBatalla tipo2;
	
	public HidroAvion(Integer id, String nombre) {
		super(id, nombre);
		this.setTipo(TipoDeBatalla.ACUATICO);
		this.setTipo2(TipoDeBatalla.VOLADOR);
	}

	public Double getProfundidad() {
		return 0.0;
	}

	public Double getAltitud() {
		return 0.0;
	}

	public Double getAltura() {
		return 0.0;
	}

	public TipoDeBatalla getTipo2() {
		return tipo2;
	}

	public void setTipo2(TipoDeBatalla tipo2) {
		this.tipo2 = tipo2;
	}
}

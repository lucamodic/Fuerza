package ar.edu.unlam.pb2.eva03;

public class Avion extends Volador{

	
	public Avion(Integer id, String nombre) {
		super(id, nombre);
	}

	@Override 
	public Double getAltura() {
		return 0.0;
	}
	
}

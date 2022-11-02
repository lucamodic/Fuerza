package ar.edu.unlam.pb2.eva03;

public class VehiculoIncompatible extends Exception {

	private String mensaje;

	public VehiculoIncompatible(String mensaje) {
		this.mensaje = mensaje;
		
	}
	
}

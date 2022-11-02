package ar.edu.unlam.pb2.eva03;

public class VehiculoInexistente extends Exception {

	private String mensaje;

	public VehiculoInexistente(String mensaje) {
		this.mensaje = mensaje;
		
	}
	
}

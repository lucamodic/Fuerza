package ar.edu.unlam.pb2.eva03;

public class NoExisteLaBatalla extends Exception {

	private String mensaje;

	public NoExisteLaBatalla(String mensaje) {
		this.mensaje = mensaje;
		
	}
}

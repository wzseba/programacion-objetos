package Ejercicio8;

public class siniestro{
	private String patente;
	private String fecha;
	private String detalle;
	
	public siniestro(String patente, String fecha, String detalle) {
		this.patente = patente;
		this.fecha = fecha;
		this.detalle = detalle;
	}

	public String getPatente() {
		return patente;
	}

	public String getFecha() {
		return fecha;
	}
	
	public String getDetalle() {
		return detalle;
	}
}

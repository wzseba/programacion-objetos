package cuenta;

public class Consumo {
	private String detalle;
	private int precio;
	
	public Consumo(String detalle, int precio) {
		this.detalle = detalle;
		this.precio = precio;
	}
	
	public String getDetalle() {
		return detalle;
	}

	public int getPrecio() {
		return precio;
	}
	
	@Override
	public String toString() {
		return detalle + "(" + precio + ")";
	}

}

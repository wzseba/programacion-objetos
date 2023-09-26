package main;

public class DetalleOrden {

	private NoteBook item;
	private float precioUnitario;
	private int cantidad;
	
	public DetalleOrden(NoteBook item, float precioUnitario, int cantidad) {
		this.item = item;
		this.precioUnitario = precioUnitario;
		this.cantidad = cantidad;
	}

	public NoteBook getItem() {
		return item;
	}

	public float getPrecioUnitario() {
		return precioUnitario;
	}

	public int getCantidad() {
		return cantidad;
	}
	
}

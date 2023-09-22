package main;

public class ProductoConDescuento extends Producto implements ConDescuento {

	private double descuento;

	public ProductoConDescuento(String marca, double precio) {
		super(marca, precio);
		this.descuento = 0;
	}

	@Override
	public void setDescuento(double des) {
		this.descuento = des;
	}

	@Override
	public double getDescuento() {
		return descuento;
	}

	@Override
	public double getPrecioDescuento() {
		return this.getPrecio() - this.getPrecio() * this.getDescuento() / 100;
	}
	
	public String toString() {
		return super.toString() + " - " + this.getDescuento();
	}

}

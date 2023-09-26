package main;

import java.util.ArrayList;
import java.util.Date;

public class Orden {
	
	private ArrayList<DetalleOrden> items;
	private int id;
	private Date creacion;
	private Date envio;
	
	public Orden(int id, Date creacion) {
		this.id = id;
		this.creacion = creacion;
		this.envio = null;
		this.items = new ArrayList<>();
	}
	
	public void agregarItem(DetalleOrden item) {
		this.items.add(item);
	}
	
	public int getNumeriItems() {
		return this.items.size();
	}
	
	public void setEnvio(Date envio) {
		this.envio = envio;
	}
	
	public float calcularTotalOrden() {
		float precioTotal = 0;
		for (DetalleOrden orden : this.items) {
			precioTotal += orden.getPrecioUnitario();
		}
		return precioTotal;
	}

}

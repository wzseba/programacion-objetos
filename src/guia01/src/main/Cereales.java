package main;

import java.time.LocalDate;

public class Cereales extends Producto implements EsAlimento {

	private TipoCereal tipoCereal;
	private LocalDate caducidad;


	public Cereales(String marca, double precio, TipoCereal tipoCereal) {
		super(marca, precio);
		this.tipoCereal = tipoCereal;
		this.caducidad = LocalDate.MAX;
	}

	@Override
	public void setCaducidad(LocalDate fc) {
		this.caducidad = fc;
	}

	@Override
	public LocalDate getCaducidad() {
		return this.caducidad;
	}

	@Override
	public int getCalorias() {
		return this.tipoCereal.getCalorias();
	}

	public TipoCereal getTipoCereal() {
		return tipoCereal;
	}

	public void setTipoCereal(TipoCereal tipoCereal) {
		this.tipoCereal = tipoCereal;
	}

	public String toString() {
		return super.toString() + " - " + this.tipoCereal.toString() + " - " + this.caducidad.toString() + " - " + this.getCalorias();
	}

}
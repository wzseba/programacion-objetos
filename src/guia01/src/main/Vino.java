package main;

import java.time.LocalDate;

public class Vino extends ProductoConDescuento implements EsLiquido, EsAlimento {
	
	private String tipoVino;
	
	private Double gradoAlcohol;

	private LocalDate caducidad;
	
	private Double volumen;
	
	private String tipoEnvase;
	
	@Override
	public void setCaducidad(LocalDate fc) {
		this.caducidad = caducidad;
	}

	public Vino(String marca, double precio, String tipoVino, Double gradoAlcohol) {
		super(marca, precio);
		this.tipoVino = tipoVino;
		this.gradoAlcohol = gradoAlcohol;
		this.caducidad = LocalDate.MAX;
		this.volumen = 0.0;
		this.tipoEnvase = "";
	}

	public String getTipoVino() {
		return tipoVino;
	}

	public void setTipoVino(String tipoVino) {
		this.tipoVino = tipoVino;
	}

	public Double getGradoAlcohol() {
		return gradoAlcohol;
	}

	public void setGradoAlcohol(Double gradoAlcohol) {
		this.gradoAlcohol = gradoAlcohol;
	}

	public double getVolumen() {
		return volumen;
	}

	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}

	public String getTipoEnvase() {
		return tipoEnvase;
	}

	public void setTipoEnvase(String tipoEnvase) {
		this.tipoEnvase = tipoEnvase;
	}

	public LocalDate getCaducidad() {
		return caducidad;
	}
	
	public int getCalorias() {
		return (int) (gradoAlcohol * 10);
	}


	
	public String toString() {
		return super.toString() + " - " + tipoVino + " - " + gradoAlcohol + " - " + caducidad
				+ " - " + volumen + " - " + tipoEnvase + " - " + getCalorias();
	}
	
	

}

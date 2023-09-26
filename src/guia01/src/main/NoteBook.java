package main;

public class NoteBook {
	
	private String marca;
	private String modelo;
	private String procesador;
	private float tamanioDisco;
	
	

	public NoteBook(String marca, String modelo, String procesador, float tamanioDisco) {
		this.marca = marca;
		this.modelo = modelo;
		this.procesador = procesador;
		this.tamanioDisco = tamanioDisco;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getProcesador() {
		return procesador;
	}

	public float getTamanioDisco() {
		return tamanioDisco;
	}
	
	
	
	
}

package main;

import java.util.ArrayList;

public class Cliente {
	private String nom;
	private int DNI;
	private ArrayList<Orden> ordenes;
	
	public Cliente(String nom, int DNI) {
		this.nom = nom;
		this.DNI = DNI;
		this.ordenes = new ArrayList<>();
	}
	
	public void addOrden(Orden o) {
		ordenes.add(o);
	}

	public String getNom() {
		return nom;
	}

	public int getDNI() {
		return DNI;
	}
	
	
	
}

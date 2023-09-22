package main;

public enum TipoCereal {

	MAIZ(8),
	TRIGO(12),
	ESPELTA(5),
	OTROS(15);

	private int calorias;

	private TipoCereal(int calorias) {
		this.calorias = calorias;
	}

	public int getCalorias() {
		return this.calorias;
	}

	public String toString() {
		return this.name() + " - " + this.calorias;
	}

}
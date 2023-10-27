package cuenta;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CuentaCompartida {
	private int cantComensales;
	private double cubiertos;
	private Map<Integer, Comensal> comensales;	
	
	public CuentaCompartida(int cantComensales, double cubiertos, Map comensales) {
		this.cantComensales = cantComensales;
		this.cubiertos = cubiertos;
		this.comensales = new TreeMap<Integer, Comensal>();
		
		for(int i = 0; i < cantComensales; i++) {
			comensales.put(i+1, new Comensal());
		}
		
	}
	
	
	public void addConsumo(Integer id, Consumo c) {
		Integer key = id;
		Comensal comensal = comensales.get(key);
		comensal.addConsumo(c);
		comensales.put(key, comensal);
			
		
	}
	
	public int getCant() {
		return cantComensales;
	}
	
	public double getCubiertos() {
		return cubiertos;
	}
}

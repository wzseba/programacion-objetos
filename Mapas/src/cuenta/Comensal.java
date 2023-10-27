package cuenta;

import java.util.ArrayList;
import java.util.List;

public class Comensal {
	private List<Consumo> lista = new ArrayList<Consumo>();
	
	public void addConsumo(Consumo con) {
		this.lista.add(con);
	}

	public List<Consumo> getLista() {
		return lista;
	}
}

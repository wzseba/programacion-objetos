package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import main.DetalleOrden;
import main.NoteBook;
import main.Orden;

class Ordentest {

	@Test
	void verificarOrden() {
		Orden orden = new Orden(1, new Date());
		orden.agregarItem(new DetalleOrden(new NoteBook("aple", "pro", "na", 0), 2000.0f,2));
		orden.agregarItem(new DetalleOrden(new NoteBook("pera", "pro", "na", 0), 5000.0f,2));
		assertEquals(7000, orden.calcularTotalOrden());
//		assertTrue(7000 == orden.calcularTotalOrden());
	}

}

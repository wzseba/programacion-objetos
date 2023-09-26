package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import main.Servicio;

class ServiciosTest {

	@Test
	void verificarFechaInicio() {
		Servicio ser = new Servicio(null);
		assertEquals(LocalDate.MAX, ser.getFechaInicio());
		ser.setFechaInicio(LocalDate.MIN);
		assertEquals(LocalDate.MIN, ser.getFechaInicio());
	}

}

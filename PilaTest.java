package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Teletipo;

class PilaTest {

	@Test
	void validarTeletipoConSlash() {
		Teletipo tele = new Teletipo("abc/d/e");
		assertEquals("ae", tele.procesar());
	}
	
	@Test
	void validarTeletipoConAmperson() {
		Teletipo tele = new Teletipo("abc&je/t");
		assertEquals("jet", tele.procesar());
	}

}

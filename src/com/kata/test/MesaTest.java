package com.kata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.kata.Mesa;

class MesaTest {

	@Test
	void testMesaInicial() {
		Mesa mesaActual = new Mesa();
		assertEquals(0,mesaActual.getListaJugadores().size());
	}
}

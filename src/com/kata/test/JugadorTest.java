package com.kata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.kata.Carta;
import com.kata.Jugador;

class JugadorTest {

	@Test
	void testJugador() {
		Jugador jugadorActual = new Jugador("Leonardo");
		Carta nuevaCarta = new Carta("As","Escudos",1);
		jugadorActual.agregarCarta(nuevaCarta);
		assertEquals(1,jugadorActual.getMano().size());
	}

}

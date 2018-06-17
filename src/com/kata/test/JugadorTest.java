package com.kata.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.kata.Carta;
import com.kata.Jugador;

public class JugadorTest {

	@Test
	public void testJugador() {
		Jugador jugadorActual = new Jugador("Leonardo");
		Carta nuevaCarta = new Carta("As","Escudos",1);
		jugadorActual.agregarCarta(nuevaCarta);
		assertEquals(1,jugadorActual.getMano().size());
	}

}

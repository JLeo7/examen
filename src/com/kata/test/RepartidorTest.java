package com.kata.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.kata.Jugador;
import com.kata.Mesa;

public class RepartidorTest {

	@Test
	public void testReparticionCarta() {
		Mesa mesaActual = new Mesa();
		Jugador jugadorActual = new Jugador("Leonardo");
		mesaActual.annadirJugador(jugadorActual);
		mesaActual.getRepartidor().repartirCarta(jugadorActual);
		assertEquals(1, jugadorActual.getMano().size());
		assertEquals(51, mesaActual.getRepartidor().getNaipe().getCartas().size());
	}

}

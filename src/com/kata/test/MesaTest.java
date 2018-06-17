package com.kata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.kata.Jugador;
import com.kata.Mesa;

class MesaTest {

	@Test
	void testMesaInicial() {
		Mesa mesaActual = new Mesa();
		assertEquals(0,mesaActual.getListaJugadores().size());
	}
	
	@Test
	void testAnnadirJugador() {
		Mesa mesaActual = new Mesa();
		Jugador jugadorActual = new Jugador("Leonardo");
		mesaActual.annadirJugador(jugadorActual);
		assertEquals(1,mesaActual.getListaJugadores().size());
	}
	
	@Test
	void testEmpezarJuego21() {
		Mesa mesaActual = new Mesa();
		Jugador jugadorActual = new Jugador("Leonardo");
		mesaActual.annadirJugador(jugadorActual);
		mesaActual.empezarAJugar21();
		assertEquals(2, jugadorActual.getMano().size());
	}
	
	@Test
	void testObtenerGanadores21() {
		Mesa mesaActual = new Mesa();
		Jugador jugadorActual = new Jugador("Leonardo");
		mesaActual.annadirJugador(jugadorActual);
		mesaActual.empezarAJugar21();
		assertTrue(mesaActual.obtenerGanadores21().size()>=1);
	}
}

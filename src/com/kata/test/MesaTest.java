package com.kata.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.kata.Carta;
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
	
	@Test
	void testCambioDeMano() {
		Mesa mesaActual = new Mesa();
		ArrayList<Carta> manoInicial = new ArrayList<Carta>();
		manoInicial.add(new Carta("Quina","Escudos",10));
		manoInicial.add(new Carta("Tres","Escudos",3));
		Jugador jugadorActual = new Jugador("Leonardo");
		jugadorActual.setMano(manoInicial);
		mesaActual.annadirJugador(jugadorActual);
		mesaActual.cambiarDeMano(jugadorActual);
		assertTrue(jugadorActual.calcularValorMano() != 13);
	}
	
	@Test
	void testGanarCon21YMedio() {
		Mesa mesaActual = new Mesa();
		ArrayList<Carta> manoInicial = new ArrayList<Carta>();
		manoInicial.add(new Carta("Dies","Escudos",10));
		manoInicial.add(new Carta("Dos","Escudos",2));
		Jugador jugadorActual = new Jugador("Leonardo");
		jugadorActual.setMano(manoInicial);
		mesaActual.annadirJugador(jugadorActual);
		assertEquals(1,mesaActual.obtenerGanadores21().size());
	}
	
	@Test
	void testGanarConComodin() {
		Mesa mesaActual = new Mesa();
		ArrayList<Carta> manoInicial = new ArrayList<Carta>();
		manoInicial.add(new Carta("Dies","Escudos",10));
		manoInicial.add(mesaActual.getComodin());
		Jugador jugadorActual = new Jugador("Leonardo");
		mesaActual.annadirJugador(jugadorActual);
		jugadorActual.setMano(manoInicial);
		assertEquals(1,mesaActual.obtenerGanadores21().size());
	}
	
	@Test
	void testEmpezarPartidaRon() {
		Mesa mesaActual = new Mesa();
		Jugador jugadorActual = new Jugador("Leonardo");
		mesaActual.annadirJugador(jugadorActual);
		mesaActual.empezarPartidaDeRon();
		assertEquals(7,jugadorActual.getMano().size());
	}
	
	@Test
	void testTomarCarta() {
		Mesa mesaActual = new Mesa();
		Jugador jugadorActual = new Jugador("Leonardo");
		mesaActual.annadirJugador(jugadorActual);
		mesaActual.empezarPartidaDeRon();
		mesaActual.tomarCartaDeDeck(jugadorActual);
		assertEquals(8,jugadorActual.getMano().size());
	}
} 

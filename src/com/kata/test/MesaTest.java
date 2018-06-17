package com.kata.test;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;

import com.kata.Carta;
import com.kata.Jugador;
import com.kata.Mesa;

public class MesaTest {

	@Test
	public void testMesaInicial() {
		Mesa mesaActual = new Mesa();
		assertEquals(0,mesaActual.getListaJugadores().size());
	}
	
	@Test
	public void testAnnadirJugador() {
		Mesa mesaActual = new Mesa();
		Jugador jugadorActual = new Jugador("Leonardo");
		mesaActual.annadirJugador(jugadorActual);
		assertEquals(1,mesaActual.getListaJugadores().size());
	}
	
	@Test
	public void testEmpezarJuego21() {
		Mesa mesaActual = new Mesa();
		Jugador jugadorActual = new Jugador("Leonardo");
		mesaActual.annadirJugador(jugadorActual);
		mesaActual.empezarAJugar21();
		assertEquals(2, jugadorActual.getMano().size());
	}
	
	@Test
	public void testObtenerGanadores21() {
		Mesa mesaActual = new Mesa();
		Jugador jugadorActual = new Jugador("Leonardo");
		mesaActual.annadirJugador(jugadorActual);
		mesaActual.empezarAJugar21();
		assertTrue(mesaActual.obtenerGanadores21().size()>=1);
	}
	
	@Test
	public void testCambioDeMano() {
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
	public void testGanarCon21YMedio() {
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
	public void testGanarConComodin() {
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
	public void testEmpezarPartidaRon() {
		Mesa mesaActual = new Mesa();
		Jugador jugadorActual = new Jugador("Leonardo");
		mesaActual.annadirJugador(jugadorActual);
		mesaActual.empezarPartidaDeRon();
		assertEquals(7,jugadorActual.getMano().size());
	}
	
	@Test
	public void testTomarCarta() {
		Mesa mesaActual = new Mesa();
		Jugador jugadorActual = new Jugador("Leonardo");
		mesaActual.annadirJugador(jugadorActual);
		mesaActual.empezarPartidaDeRon();
		mesaActual.tomarCartaDeDeck(jugadorActual);
		assertEquals(8,jugadorActual.getMano().size());
	}
	
	@Test
	public void testBotarCarta() {
		Mesa mesaActual = new Mesa();
		Jugador jugadorActual = new Jugador("Leonardo");
		mesaActual.annadirJugador(jugadorActual);
		mesaActual.empezarPartidaDeRon();
		mesaActual.turnoDeRon(jugadorActual);
		assertEquals(7,jugadorActual.getMano().size());
	}
	
	@Test
	public void testResetMesa() {
		Mesa mesaActual = new Mesa();
		Jugador jugadorActual = new Jugador("Leonardo");
		mesaActual.annadirJugador(jugadorActual);
		mesaActual.resetMesa();
		assertEquals(52, mesaActual.getRepartidor().getNaipe().getCartas().size());
		assertEquals(0, mesaActual.getListaJugadores().size());
	}
} 

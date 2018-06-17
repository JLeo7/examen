package com.kata.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.kata.Carta;

public class CartaTest {
	
	@Test(expected = IllegalArgumentException.class)
	public void testValorInvalido () throws Exception {
		new Carta("","",0);
		new Carta("","",11);
	}
	
	@Test
	public void testPalos () {
		Carta cartaEscudo = new Carta("As","Escudos",1);
		Carta cartaFlor = new Carta("As","Flores",1);
		Carta cartaEstrella = new Carta("As","Estrellas",1);
		Carta cartaGota = new Carta("As","Gotas",1);
		assertEquals("Escudos",cartaEscudo.getPalo());
		assertEquals("Flores",cartaFlor.getPalo());
		assertEquals("Estrellas",cartaEstrella.getPalo());
		assertEquals("Gotas",cartaGota.getPalo());
	}
	
	@Test
	public void testCompararCartasIguales() {
		Carta cartaUno = new Carta("Ka","Escudos",10);
		Carta cartaDos = new Carta("10","Flores",10);
		assertTrue(cartaUno.equals(cartaDos));
	}

}

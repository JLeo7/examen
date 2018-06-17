package com.kata.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.kata.Carta;

class CartaTest {
	
	@Test
	public void testValorInvalido () throws Exception {
		Carta cartaUno = new Carta("","",0);
		Carta cartaDos = new Carta("","",11);
		assertFalse(cartaUno.getValor() > 1 && cartaUno.getValor() < 10);
		assertFalse(cartaDos.getValor() > 1 && cartaDos.getValor() < 10);
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

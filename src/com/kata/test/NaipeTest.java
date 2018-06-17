package com.kata.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.kata.Naipe;

public class NaipeTest {
	
	@Test
	public void testNaipeUsable() {
		Naipe nuevoNaipe = new Naipe();
		assertEquals(52, nuevoNaipe.getCartas().size());
	}

}

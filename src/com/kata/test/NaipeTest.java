package com.kata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.kata.Naipe;

class NaipeTest {
	
	@Test
	void testNaipeUsable() {
		Naipe nuevoNaipe = new Naipe();
		assertEquals(52, nuevoNaipe.getCartas().size());
	}

}

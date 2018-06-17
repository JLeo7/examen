package com.kata;

public class Repartidor {
	private Naipe naipeActual;
	
	public Repartidor() {
		naipeActual = new Naipe();
	}
	
	public Naipe getNaipe() {
		return naipeActual;
	}
}

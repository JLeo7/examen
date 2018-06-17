package com.kata;

public class Repartidor {
	private Naipe naipeActual;
	
	public Repartidor() {
		naipeActual = new Naipe();
	}
	
	public Naipe getNaipe() {
		return naipeActual;
	}
	
	public void repartirCarta(Jugador jugadorActual) {
		jugadorActual.agregarCarta(naipeActual.getCartas().get(0));
		naipeActual.getCartas().remove(0);
	}
}

package com.kata;

import java.util.ArrayList;

public class Mesa {
	private Repartidor repartidorActual;
	private ArrayList<Jugador> listaJugadores;
	
	public Mesa() {
		repartidorActual = new Repartidor();
		listaJugadores = new ArrayList<Jugador>();
	}
	
	public void empezarAJugar21() {
		for(Jugador obj:listaJugadores) {
			repartidorActual.repartirCarta(obj);
			repartidorActual.repartirCarta(obj);
		}
	}
	
	public void annadirJugador(Jugador nuevoJugador) {
		listaJugadores.add(nuevoJugador);
	}
	
	public Repartidor getRepartidor() {
		return repartidorActual;
	}
	
	public ArrayList<Jugador> getListaJugadores() {
		return listaJugadores;
	}
}

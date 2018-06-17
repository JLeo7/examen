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
	
	public ArrayList<Jugador> obtenerGanadores21() {
		int valorManoGanadora = 0;
		ArrayList<Jugador> listaGanadores = new ArrayList<Jugador>();
		
		for (Jugador obj:listaJugadores) {
			if (obj.calcularValorMano() >= valorManoGanadora && obj.calcularValorMano() <= 21) {
				valorManoGanadora = obj.calcularValorMano();
			}
		}
		
		for (Jugador obj:listaJugadores) {
			if (obj.calcularValorMano() == valorManoGanadora) {
				listaGanadores.add(obj);
			}
		}
		
		return listaGanadores;
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

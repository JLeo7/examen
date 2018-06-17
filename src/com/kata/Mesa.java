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
			if (obj.calcularValorMano() >= valorManoGanadora) {
				valorManoGanadora = obj.calcularValorMano();
			}
		}
		
		for (Jugador obj:listaJugadores) {
			if (obj.calcularValorMano() == valorManoGanadora || mano21YMedio(obj)) {
				listaGanadores.add(obj);
			}
		}
		
		return listaGanadores;
	}
	
	public void annadirJugador(Jugador nuevoJugador) {
		listaJugadores.add(nuevoJugador);
	}
	
	public void cambiarDeMano(Jugador jugadorActual) {
		
		for(int i = 0; i <= 1; i++) {
			if((jugadorActual.getMano().get(i).getNombre().equals("Jota")
				|| jugadorActual.getMano().get(i).getNombre().equals("Quina")
				|| jugadorActual.getMano().get(i).getNombre().equals("Ka"))
				&& jugadorActual.calcularValorMano() == 13) {
				jugadorActual.getMano().remove(0);
				jugadorActual.getMano().remove(0);
				repartidorActual.repartirCarta(jugadorActual);
				repartidorActual.repartirCarta(jugadorActual);
			}
		}
	}
	
	public Repartidor getRepartidor() {
		return repartidorActual;
	}
	
	public ArrayList<Jugador> getListaJugadores() {
		return listaJugadores;
	}
	
	private boolean mano21YMedio(Jugador jugadorActual) {
		if(jugadorActual.calcularValorMano() == 12 && (jugadorActual.getMano().get(0).getNombre().equals("Dos") 
				|| jugadorActual.getMano().get(1).getNombre().equals("Dos"))) {
			return true;
		} else {
			return false;
		}
	}
}

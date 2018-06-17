package com.kata;

import java.util.ArrayList;

public class Jugador {
	private String nombre;
	private ArrayList<Carta> mano;
	
	public Jugador () {
		
	}
	
	public Jugador (String nombre) {
		this.nombre = nombre;
		mano = new ArrayList<Carta>();
	}
	
	public void agregarCarta(Carta nuevaCarta) {
		mano.add(nuevaCarta);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public ArrayList<Carta> getMano() {
		return mano;
	}
}

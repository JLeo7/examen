package com.kata;

public class Carta {
	
	private String nombre;
	private String palo;
	private int valor;
	
	public Carta() {
		
	}
	
	public Carta(String nombre, String palo,int valor) {
		if(valor >= 1 && valor <= 10) {
			this.nombre = nombre;
			this.palo = palo;
			this.valor = valor;
		} else {
			throw new IllegalArgumentException("Valor no permitido.");
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getPalo() {
		return palo;
	}
	
	public int getValor() {
		return valor;
	}
	
	@Override
	public boolean equals(Object obj) {
		Carta segCarta = (Carta) obj;
		if (getValor() == segCarta.getValor()) {
			return true;
		} else {
			return false;
		}
	}
}

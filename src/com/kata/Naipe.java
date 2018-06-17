package com.kata;

import java.util.ArrayList;
import java.util.Collections;

public class Naipe {
	private ArrayList<Carta> cartas;
		
	public Naipe() {
		cartas = new ArrayList<Carta>();
		annadirCartas();
		barajarCartas();
	}
	
	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	
	private void annadirCartas() {
		cartas.add(new Carta("As","Escudos",1));
		cartas.add(new Carta("2","Escudos",2));
		cartas.add(new Carta("3","Escudos",3));
		cartas.add(new Carta("4","Escudos",4));
		cartas.add(new Carta("5","Escudos",5));
		cartas.add(new Carta("6","Escudos",6));
		cartas.add(new Carta("7","Escudos",7));
		cartas.add(new Carta("8","Escudos",8));
		cartas.add(new Carta("9","Escudos",9));
		cartas.add(new Carta("10","Escudos",10));
		cartas.add(new Carta("Jota","Escudos",10));
		cartas.add(new Carta("Quina","Escudos",10));
		cartas.add(new Carta("Ka","Escudos",10));
		cartas.add(new Carta("As","Flores",1));
		cartas.add(new Carta("2","Flores",2));
		cartas.add(new Carta("3","Flores",3));
		cartas.add(new Carta("4","Flores",4));
		cartas.add(new Carta("5","Flores",5));
		cartas.add(new Carta("6","Flores",6));
		cartas.add(new Carta("7","Flores",7));
		cartas.add(new Carta("8","Flores",8));
		cartas.add(new Carta("9","Flores",9));
		cartas.add(new Carta("10","Flores",10));
		cartas.add(new Carta("Jota","Flores",10));
		cartas.add(new Carta("Quina","Flores",10));
		cartas.add(new Carta("Ka","Flores",10));
		cartas.add(new Carta("As","Estrellas",1));
		cartas.add(new Carta("2","Estrellas",2));
		cartas.add(new Carta("3","Estrellas",3));
		cartas.add(new Carta("4","Estrellas",4));
		cartas.add(new Carta("5","Estrellas",5));
		cartas.add(new Carta("6","Estrellas",6));
		cartas.add(new Carta("7","Estrellas",7));
		cartas.add(new Carta("8","Estrellas",8));
		cartas.add(new Carta("9","Estrellas",9));
		cartas.add(new Carta("10","Estrellas",10));
		cartas.add(new Carta("Jota","Estrellas",10));
		cartas.add(new Carta("Quina","Estrellas",10));
		cartas.add(new Carta("Ka","Estrellas",10));
		cartas.add(new Carta("As","Gotas",1));
		cartas.add(new Carta("2","Gotas",2));
		cartas.add(new Carta("3","Gotas",3));
		cartas.add(new Carta("4","Gotas",4));
		cartas.add(new Carta("5","Gotas",5));
		cartas.add(new Carta("6","Gotas",6));
		cartas.add(new Carta("7","Gotas",7));
		cartas.add(new Carta("8","Gotas",8));
		cartas.add(new Carta("9","Gotas",9));
		cartas.add(new Carta("10","Gotas",10));
		cartas.add(new Carta("Jota","Gotas",10));
		cartas.add(new Carta("Quina","Gotas",10));
		cartas.add(new Carta("Ka","Gotas",10));
	}
	
	private void barajarCartas() {
		Collections.shuffle(cartas);
	}
}

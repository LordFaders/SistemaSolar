package com.desafiolatam.model;

public class Luna implements ILuna {
	String nombre;
	int diametro;
	float tiempoDeOrbita;
	

	public void nombre() {
		
	}

	public void diametro() {
		
	}

	public void tiempoDeOrbita() {
		
	}

	public Luna() {
		super();

	}

	public Luna(String nombre, int diametro, float tiempoDeOrbita) {
		super();
		this.nombre = nombre;
		this.diametro = diametro;
		this.tiempoDeOrbita = tiempoDeOrbita;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public float getTiempoDeOrbita() {
		return tiempoDeOrbita;
	}

	public void setTiempoDeOrbita(float tiempoDeOrbita) {
		this.tiempoDeOrbita = tiempoDeOrbita;
	}

	@Override
	public String toString() {
		return " - Luna de nombre " + 
	nombre + " que mide " + diametro +  " km de diámetro, y el tiempo de órbita es de " + tiempoDeOrbita + " días.\n";
	}
	

}

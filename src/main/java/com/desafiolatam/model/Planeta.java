package com.desafiolatam.model;

import java.util.ArrayList;

public class Planeta implements IPlaneta {
	private String nombre;
	private int tamanio;
	private long distanciaAlSol;
	private ArrayList<Luna> lunas = new ArrayList<Luna>();
	
	public Planeta() {
		super();
	}

	public Planeta(String nombre, int tamanio, long distanciaAlSol) {
		super();
		this.nombre = nombre;
		this.tamanio = tamanio;
		this.distanciaAlSol = distanciaAlSol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public long getDistanciaAlSol() {
		return distanciaAlSol;
	}

	public void setDistanciaAlSol(long distanciaAlSol) {
		this.distanciaAlSol = distanciaAlSol;
	}

	public ArrayList<Luna> getLunas() {
		return lunas;
	}

	public void setLunas(ArrayList<Luna> lunas) {
		this.lunas = lunas;
	}

	@Override
	public String toString() {
		return "Planeta de nombre " + nombre + ", su tamaño es de " + tamanio + " km de diámetro, y su distancia al sol es de " + distanciaAlSol + ", km y tiene "
				+ lunas.size() + " lunas";
	}
	
	
	

}

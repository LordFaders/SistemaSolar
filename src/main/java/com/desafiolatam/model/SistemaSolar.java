package com.desafiolatam.model;

import java.util.ArrayList;

public class SistemaSolar {
	
	private ArrayList<Planeta> planetas = new ArrayList<Planeta>();
	
	public void agregarPlaneta(Planeta planeta) {
	this.planetas.add(planeta);
	}
	
	public void mostrarPlanetas() {
		//recorrer variable planetas e imprimir to string por planeta
		for(int i = 0; i < planetas.size(); i++) {
			System.out.println(planetas.get(i));
		}
	}
	
	public void mostrarPlanetasLunas() {
		//for anidado recorrer array luna dentro de array planeta
		System.out.println();
		for(int i = 0; i < planetas.size(); i++) {
			System.out.println(planetas.get(i).toString());
			for(int j = 0; j < planetas.get(i).getLunas().size(); j++) {
				System.out.println(planetas.get(i).getLunas().get(j).toString());
			}
			
		}
		
	}
}

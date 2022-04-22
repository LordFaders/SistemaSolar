package com.desafiolatam;

import java.util.ArrayList;

import com.desafiolatam.model.Luna;
import com.desafiolatam.model.Planeta;
import com.desafiolatam.model.SistemaSolar;

public class Main {

	public static void main(String[] args) {

		ArrayList<Planeta> planetas = new ArrayList<Planeta>();

		
		Planeta planetaMercurio = new Planeta();
		planetaMercurio.setNombre("mercurio");
		planetaMercurio.setTamanio(4480);
		planetaMercurio.setDistanciaAlSol(57910000l);
		planetas.add(planetaMercurio);

		Planeta planetaVenus = new Planeta();
		planetaVenus.setNombre("venus");
		planetaVenus.setTamanio(12104);
		planetaVenus.setDistanciaAlSol(108200000l);
		planetas.add(planetaVenus);

		Planeta planetaTierra = new Planeta();
		planetaTierra.setNombre("tierra");
		planetaTierra.setTamanio(12756);
		planetaTierra.setDistanciaAlSol(149600000l);
		planetas.add(planetaTierra);

		Planeta planetaMarte = new Planeta();
		planetaMarte.setNombre("marte");
		planetaMarte.setTamanio(6794);
		planetaMarte.setDistanciaAlSol(227940000l);
		planetas.add(planetaMarte);

		Planeta planetaJupiter = new Planeta();
		planetaJupiter.setNombre("jupiter");
		planetaJupiter.setTamanio(142984);
		planetaJupiter.setDistanciaAlSol(778330000l);
		planetas.add(planetaJupiter);

		Planeta planetaSaturno = new Planeta();
		planetaSaturno.setNombre("saturno");
		planetaSaturno.setTamanio(108728);
		planetaSaturno.setDistanciaAlSol(1429400000l);
		planetas.add(planetaSaturno);

		Planeta planetaUrano = new Planeta();
		planetaUrano.setNombre("urano");
		planetaUrano.setTamanio(51118);
		planetaUrano.setDistanciaAlSol(2870990000l);
		planetas.add(planetaUrano);

		Planeta planetaNeptuno = new Planeta();
		planetaNeptuno.setNombre("neptuno");
		planetaNeptuno.setTamanio(49532);
		planetaNeptuno.setDistanciaAlSol(4504300000l);
		planetas.add(planetaNeptuno);

		Planeta planetaPluton = new Planeta();
		planetaPluton.setNombre("pluton");
		planetaPluton.setTamanio(2320);
		planetaPluton.setDistanciaAlSol(5913520000l);
		planetas.add(planetaPluton);

		ArrayList<Luna> lunasTierra = new ArrayList<Luna>();

		Luna lunaTierra = new Luna();
		lunaTierra.setNombre("luna");
		lunaTierra.setDiametro(3476);
		lunaTierra.setTiempoDeOrbita(27.322f);
		lunasTierra.add(lunaTierra);
		planetaTierra.setLunas(lunasTierra);

		ArrayList<Luna> lunasMarte = new ArrayList<Luna>();
		Luna lunaMarte1 = new Luna();
		lunaMarte1.setNombre("deimos");
		lunaMarte1.setDiametro(8);
		lunaMarte1.setTiempoDeOrbita(1.263f);
		lunasMarte.add(lunaMarte1);

		Luna lunaMarte2 = new Luna();
		lunaMarte2.setNombre("phobos");
		lunaMarte2.setDiametro(28);
		lunaMarte2.setTiempoDeOrbita(0.319f);
		lunasMarte.add(lunaMarte2);
		planetaMarte.setLunas(lunasMarte);

		ArrayList<Luna> lunasJupiter = new ArrayList<Luna>();
		Luna lunaJupiter1 = new Luna();
		lunaJupiter1.setNombre("calisto");
		lunaJupiter1.setDiametro(4800);
		lunaJupiter1.setTiempoDeOrbita(16.689f);
		lunasJupiter.add(lunaJupiter1);

		Luna lunaJupiter2 = new Luna();
		lunaJupiter2.setNombre("ganimides");
		lunaJupiter2.setDiametro(5276);
		lunaJupiter2.setTiempoDeOrbita(7.155f);
		lunasJupiter.add(lunaJupiter2);
		planetaJupiter.setLunas(lunasJupiter);

		ArrayList<Luna> lunasSaturno = new ArrayList<Luna>();
		Luna lunaSaturno1 = new Luna();
		lunaSaturno1.setNombre("dione");
		lunaSaturno1.setDiametro(1120);
		lunaSaturno1.setTiempoDeOrbita(2.737f);
		lunasSaturno.add(lunaSaturno1);

		Luna lunaSaturno2 = new Luna();
		lunaSaturno2.setNombre("mimas");
		lunaSaturno2.setDiametro(398);
		lunaSaturno2.setTiempoDeOrbita(0.942f);
		lunasSaturno.add(lunaSaturno2);
		planetaSaturno.setLunas(lunasSaturno);

		ArrayList<Luna> lunasUrano = new ArrayList<Luna>();
		Luna lunaUrano1 = new Luna();
		lunaUrano1.setNombre("ariel");
		lunaUrano1.setDiametro(1160);
		lunaUrano1.setTiempoDeOrbita(2.520f);
		lunasUrano.add(lunaUrano1);

		Luna lunaUrano2 = new Luna();
		lunaUrano2.setNombre("desdedemona");
		lunaUrano2.setDiametro(54);
		lunaUrano2.setTiempoDeOrbita(0.474f);
		lunasUrano.add(lunaUrano2);
		planetaUrano.setLunas(lunasUrano);

		ArrayList<Luna> lunasNeptuno = new ArrayList<Luna>();
		Luna lunaNeptuno1 = new Luna();
		lunaNeptuno1.setNombre("galatea");
		lunaNeptuno1.setDiametro(140);
		lunaNeptuno1.setTiempoDeOrbita(0.40f);
		lunasNeptuno.add(lunaNeptuno1);

		Luna lunaNeptuno2 = new Luna();
		lunaNeptuno2.setNombre("proteus");
		lunaNeptuno2.setDiametro(420);
		lunaNeptuno2.setTiempoDeOrbita(1.12f);
		lunasNeptuno.add(lunaNeptuno2);
		planetaNeptuno.setLunas(lunasNeptuno);

		ArrayList<Luna> lunasPluton = new ArrayList<Luna>();
		Luna lunaPluton1 = new Luna();
		lunaPluton1.setNombre("charon");
		lunaPluton1.setDiametro(1207);
		lunaPluton1.setTiempoDeOrbita(6.387f);
		lunasPluton.add(lunaPluton1);

		Luna lunaPluton2 = new Luna();
		lunaPluton2.setNombre("nix");
		lunaPluton2.setDiametro(44);
		lunaPluton2.setTiempoDeOrbita(24.856f);
		lunasPluton.add(lunaPluton2);
		planetaPluton.setLunas(lunasPluton);

		//System.out.println(planetas);
		//System.out.println(planetaJupiter.getLunas().get(0).getDiametro());
		
		//agregar planeta al sistema solar
		
		SistemaSolar sistemaSolar = new SistemaSolar();
		
		sistemaSolar.agregarPlaneta(planetaMercurio);
		sistemaSolar.agregarPlaneta(planetaVenus);
		sistemaSolar.agregarPlaneta(planetaTierra);
		sistemaSolar.agregarPlaneta(planetaMarte);
		sistemaSolar.agregarPlaneta(planetaJupiter);
		sistemaSolar.agregarPlaneta(planetaSaturno);
		sistemaSolar.agregarPlaneta(planetaUrano);
		sistemaSolar.agregarPlaneta(planetaNeptuno);
		sistemaSolar.agregarPlaneta(planetaPluton);
		
		sistemaSolar.mostrarPlanetas();
		System.out.println();
		sistemaSolar.mostrarPlanetasLunas();
		
		
	}

	

}

package com.desafiolatam;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import com.desafiolatam.model.Luna;
import com.desafiolatam.model.Planeta;

public class AppTest {
   
	@Test
public void cantidadLunasTest() {
		
		ArrayList<Luna> lunasTierrasTest = new ArrayList<Luna>();
		Luna lunaTierrasTest = new Luna("Luna", 3476, 2.322F);
		lunasTierrasTest.add(lunaTierrasTest);
		Planeta planetaTest = new Planeta();
		planetaTest.setNombre("Tierras");
		planetaTest.setTamanio(4480);
		planetaTest.setDistanciaAlSol(57910000l);
		planetaTest.setLunas(lunasTierrasTest);
		assertEquals(1,planetaTest.getLunas().size());
	}
	
	@Test
	public void AgregarLunasTest() {
		
		ArrayList<Luna> lunasTierrasTest = new ArrayList<Luna>();
		Luna lunaTierrasTest = new Luna("Luna", 3476, 2.322F);
		lunaTierrasTest.setNombre("Maven");
		lunaTierrasTest.setDiametro(4480);
		lunaTierrasTest.setTiempoDeOrbita(57910000l);
		lunasTierrasTest.add(lunaTierrasTest);
		Planeta planetaTest = new Planeta();
		planetaTest.setNombre("Tierras");
		planetaTest.setTamanio(4480);
		planetaTest.setDistanciaAlSol(57910000l);
		planetaTest.setLunas(lunasTierrasTest);
		assertTrue(planetaTest.getLunas().size()>0);
	
	}
	
	@Test
	public void ComprobarCantidadLunasNullTest() {
		
		ArrayList<Luna> lunasTierrasTest = new ArrayList<Luna>();
		Planeta planetaTest = new Planeta();
		planetaTest.setNombre("Tierras");
		planetaTest.setTamanio(4480);
		planetaTest.setDistanciaAlSol(57910000l);
		planetaTest.setLunas(lunasTierrasTest);
		assertTrue(planetaTest.getLunas().size()==0);
	
	}
	
	@Test
	public void ComprobarCantidadLunasTest() {
		
		ArrayList<Luna> lunasTierrasTest = new ArrayList<Luna>();
		Luna lunaTierrasTest = new Luna();
		lunaTierrasTest.setNombre("Maven");
		lunaTierrasTest.setDiametro(4480);
		lunaTierrasTest.setTiempoDeOrbita(57910000l);
		lunasTierrasTest.add(lunaTierrasTest);
		Planeta planetaTest = new Planeta();
		planetaTest.setNombre("Tierras");
		planetaTest.setTamanio(4480);
		planetaTest.setDistanciaAlSol(57910000l);
		planetaTest.setLunas(lunasTierrasTest);
		assertTrue(planetaTest.getLunas().size()==1);
	
	}
	
	
	@Test
	public void lunasArrayListTest() {
		
		ArrayList<Luna> lunasTierrasTest = new ArrayList<Luna>();
		Luna lunaTierrasTest01 = new Luna("Luna", 3476, 2.322F);
		Luna lunaTierrasTest02 = new Luna("Luna", 3477, 2.323F);
		lunasTierrasTest.add(lunaTierrasTest01);
		lunasTierrasTest.add(lunaTierrasTest02);
		Planeta planetaTest = new Planeta();
		planetaTest.setNombre("Tierras");
		planetaTest.setTamanio(4480);
		planetaTest.setDistanciaAlSol(57910000l);
		planetaTest.setLunas(lunasTierrasTest);
		assertEquals(2,planetaTest.getLunas().size());
	}
	
}

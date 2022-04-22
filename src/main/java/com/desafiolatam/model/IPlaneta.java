package com.desafiolatam.model;

import java.util.ArrayList;

public interface IPlaneta {

	public String getNombre();

	public void setNombre(String nombre);

	public int getTamanio();

	public void setTamanio(int tamanio);

	public long getDistanciaAlSol();

	public void setDistanciaAlSol(long distanciaAlSol);

	public ArrayList<Luna> getLunas();

	public void setLunas(ArrayList<Luna> lunas);
}

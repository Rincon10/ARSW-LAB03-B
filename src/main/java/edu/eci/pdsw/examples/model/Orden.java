package edu.eci.pdsw.examples.model;

import java.util.LinkedList;
import java.util.List;

public class Orden {

	List<Plato> platos;

	public Orden() {
		platos=new LinkedList<>();
	}
	
	public void agregarPlato(Plato p){
		platos.add(p);
	}
	
	public List<Plato> getPlatos(){
		return platos;
	}
	
        @Override
	public String toString(){
		return platos.toString();
	}
	
}

package edu.eci.pdsw.examples.beans.impl;

import edu.eci.pdsw.examples.model.Orden;
import edu.eci.pdsw.examples.model.Plato;
import edu.eci.pdsw.examples.beans.CalculadorCuenta;
import edu.eci.pdsw.examples.beans.CalculadorIVA;


public class CalculadorCuentaConIva implements CalculadorCuenta {

	CalculadorIVA civa;
	
	
	@Override
	public int calcularCosto(Orden o) {
		int total=0;
		for (Plato p:o.getPlatos()){
			total+=p.getPrecio()*(1+civa.obtenerPorcentajeIva(p));
		}
		return total;
	}

}

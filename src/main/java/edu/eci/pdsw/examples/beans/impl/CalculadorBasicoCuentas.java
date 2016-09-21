package edu.eci.pdsw.examples.beans.impl;

import edu.eci.pdsw.examples.model.Orden;
import edu.eci.pdsw.examples.model.Plato;
import edu.eci.pdsw.examples.beans.CalculadorCuenta;
import org.springframework.stereotype.Service;

public class CalculadorBasicoCuentas implements CalculadorCuenta {

	@Override
	public int calcularCosto(Orden o) {
		int total=0;
		for (Plato p:o.getPlatos()){
			total+=p.getPrecio();
		}
		return total;
	}

}

package edu.eci.pdsw.examples.beans.impl;

import edu.eci.pdsw.examples.model.Plato;
import edu.eci.pdsw.examples.beans.CalculadorIVA;


public class CalculadorIVARegimen2013 implements CalculadorIVA {

	@Override
	public float obtenerPorcentajeIva(Plato p) {
		if (p.getNombre().contains("gaseosa")){
			return 0.10f;
		}
		else{
			return 0.16f;
		}
	}

}

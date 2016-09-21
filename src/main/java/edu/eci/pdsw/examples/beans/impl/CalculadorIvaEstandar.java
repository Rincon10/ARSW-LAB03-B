package edu.eci.pdsw.examples.beans.impl;

import org.springframework.stereotype.Service;
import edu.eci.pdsw.examples.model.Plato;
import edu.eci.pdsw.examples.beans.CalculadorIVA;

public class CalculadorIvaEstandar implements CalculadorIVA {

	@Override
	public float obtenerPorcentajeIva(Plato p) {
		return 0.16f;
	}

}

package co.edu.unbosque.unit.structure;

import co.edu.unbosque.model.Viajero;

public class NodoViajero {
	 Viajero viajero;
	    NodoViajero siguiente;
	    
	    public NodoViajero(Viajero viajero) {
	        this.viajero = viajero;
	        this.siguiente = null;
	    }
	}


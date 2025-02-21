package co.edu.unbosque.model;

import co.edu.unbosque.unit.structure.MyLinkedList;

public class ClaseX {
    private MyLinkedList<Vuelo> vuelos;

    public ClaseX() {
        this.vuelos = new MyLinkedList<>();
    }

    public void agregarVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
    }

    public MyLinkedList<Vuelo> obtenerVuelos() {
        return vuelos;
    }
}
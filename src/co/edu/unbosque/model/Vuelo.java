package co.edu.unbosque.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import co.edu.unbosque.unit.structure.MyLinkedList;

public class Vuelo implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String numeroVuelo;
    private String aerolinea;
    private LocalDateTime fechaSalida;
    private LocalDateTime fechaLlegada;
    private String destino;
    private String origen;
    private MyLinkedList<Viajero> viajeros;

    public Vuelo(String numeroVuelo, String aerolinea, LocalDateTime fechaSalida, LocalDateTime fechaLlegada, String destino, String origen) {
        this.numeroVuelo = numeroVuelo;
        this.aerolinea = aerolinea;
        this.setFechaSalida(fechaSalida);
        this.setFechaLlegada(fechaLlegada);
        this.destino = destino;
        this.origen = origen;
        this.viajeros = new MyLinkedList<>();
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void agregarViajero(Viajero viajero) {
        viajeros.add(viajero);
    }

    public String obtenerListaViajeros() {
        return obtenerListaViajerosRecursivo(viajeros, 0, "");
    }

    private String obtenerListaViajerosRecursivo(MyLinkedList<Viajero> lista, int index, String resultado) {
        if (index >= lista.size()) return resultado;
        return obtenerListaViajerosRecursivo(lista, index + 1, resultado + lista.get(index) + "\n");
    }

    @Override
    public String toString() {
        return "Vuelo " + numeroVuelo + " de " + aerolinea + " hacia " + destino + " desde " + origen + " con viajeros: \n" + obtenerListaViajeros();
    }

	public LocalDateTime getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(LocalDateTime fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public LocalDateTime getFechaLlegada() {
		return fechaLlegada;
	}

	public void setFechaLlegada(LocalDateTime fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}
}
package co.edu.unbosque.controller;

import co.edu.unbosque.model.ClaseX;
import co.edu.unbosque.model.Vuelo;
import co.edu.unbosque.unit.structure.MyLinkedList;
import co.edu.unbosque.view.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

public class Controller {
    private View vista;
    private ClaseX modelo;

    public Controller() {
        vista = new View();
        modelo = new ClaseX();

        vista.getBtnAgregar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarVuelo();
            }
        });

        vista.getBtnMostrar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarVuelos();
            }
        });

        vista.setVisible(true);
    }

    private void agregarVuelo() {
        String num = vista.getTxtNumeroVuelo().getText().trim();
        String aero = vista.getTxtAerolinea().getText().trim();
        String origen = vista.getTxtOrigen().getText().trim();
        String destino = vista.getTxtDestino().getText().trim();

        if (num.isEmpty() || aero.isEmpty() || origen.isEmpty() || destino.isEmpty()) {
            vista.getTxtArea().setText("⚠ Todos los campos son obligatorios.");
            return;
        }

        Vuelo nuevoVuelo = new Vuelo(num, aero, LocalDateTime.now(), LocalDateTime.now(), destino, origen);
        modelo.agregarVuelo(nuevoVuelo);
        vista.getTxtArea().setText("✅ Vuelo agregado correctamente.");

        // Limpiar los campos
        vista.getTxtNumeroVuelo().setText("");
        vista.getTxtAerolinea().setText("");
        vista.getTxtOrigen().setText("");
        vista.getTxtDestino().setText("");
    }

    private void mostrarVuelos() {
        if (modelo.obtenerVuelos().size() == 0) {
            vista.getTxtArea().setText(" No hay vuelos registrados.");
        } else {
            String vuelosTexto = convertirListaAString(modelo.obtenerVuelos());
            vista.getTxtArea().setText(" Lista de vuelos:\n" + vuelosTexto);
        }
    }

    private String convertirListaAString(MyLinkedList<Vuelo> lista) {
        return convertirListaAStringRecursivo(lista, "");
    }

    private String convertirListaAStringRecursivo(MyLinkedList<Vuelo> lista, String resultado) {
        if (lista.getHeadData() == null) return resultado;
        return convertirListaAStringRecursivo(lista.getRest(), resultado + lista.getHeadData().toString() + "\n");
    }
}

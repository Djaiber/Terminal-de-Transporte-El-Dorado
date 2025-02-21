package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
    private JTextField txtNumeroVuelo, txtAerolinea, txtOrigen, txtDestino;
    private JButton btnAgregar, btnMostrar;
    private JTextArea txtArea;

    public View() {
        setTitle("Terminal de Transporte El Dorado");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panelSuperior = new JPanel(new GridLayout(4, 2));
        panelSuperior.add(new JLabel("Número de Vuelo:"));
        panelSuperior.add(txtNumeroVuelo = new JTextField());
        panelSuperior.add(new JLabel("Aerolinea:"));
        panelSuperior.add(txtAerolinea = new JTextField());
        panelSuperior.add(new JLabel("Origen:"));
        panelSuperior.add(txtOrigen = new JTextField());
        panelSuperior.add(new JLabel("Destino:"));
        panelSuperior.add(txtDestino = new JTextField());

        JPanel panelBotones = new JPanel(new GridLayout(2, 2));
        panelBotones.add(btnAgregar = new JButton("Agregar Vuelo"));
        panelBotones.add(btnMostrar = new JButton("Mostrar Vuelos"));

        txtArea = new JTextArea();
        add(panelSuperior, BorderLayout.NORTH);
        add(panelBotones, BorderLayout.CENTER);
        add(new JScrollPane(txtArea), BorderLayout.SOUTH);
    }

    public JTextField getTxtNumeroVuelo() { return txtNumeroVuelo; }
    public JTextField getTxtAerolinea() { return txtAerolinea; }
    public JTextField getTxtOrigen() { return txtOrigen; }
    public JTextField getTxtDestino() { return txtDestino; }
    public JButton getBtnAgregar() { return btnAgregar; }
    public JButton getBtnMostrar() { return btnMostrar; }
    public JTextArea getTxtArea() { return txtArea; }
}

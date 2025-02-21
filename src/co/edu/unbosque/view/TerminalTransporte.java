package co.edu.unbosque.view;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TerminalTransporte {
	 private JFrame frame;
	    private JTextField txtNumeroVuelo, txtAerolinea, txtOrigen, txtDestino;
	    private JButton btnAgregar, btnMostrar;
	    private DefaultTableModel modeloTabla;
	    private JTable tablaVuelos;

	    public TerminalTransporte() {
	        frame = new JFrame("Terminal de Transporte El Dorado");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(600, 400);
	        frame.setLayout(new GridBagLayout());
	        frame.setLocationRelativeTo(null);

	        GridBagConstraints gbc = new GridBagConstraints();
	        gbc.insets = new Insets(5, 5, 5, 5);
	        gbc.fill = GridBagConstraints.HORIZONTAL;

	        JLabel lblNumeroVuelo = new JLabel("Número de Vuelo:");
	        gbc.gridx = 0;
	        gbc.gridy = 0;
	        frame.add(lblNumeroVuelo, gbc);

	        txtNumeroVuelo = new JTextField(15);
	        gbc.gridx = 1;
	        frame.add(txtNumeroVuelo, gbc);

	        JLabel lblAerolinea = new JLabel("Aerolínea:");
	        gbc.gridx = 0;
	        gbc.gridy = 1;
	        frame.add(lblAerolinea, gbc);

	        txtAerolinea = new JTextField(15);
	        gbc.gridx = 1;
	        frame.add(txtAerolinea, gbc);

	        JLabel lblOrigen = new JLabel("Origen:");
	        gbc.gridx = 0;
	        gbc.gridy = 2;
	        frame.add(lblOrigen, gbc);

	        txtOrigen = new JTextField(15);
	        gbc.gridx = 1;
	        frame.add(txtOrigen, gbc);

	        JLabel lblDestino = new JLabel("Destino:");
	        gbc.gridx = 0;
	        gbc.gridy = 3;
	        frame.add(lblDestino, gbc);

	        txtDestino = new JTextField(15);
	        gbc.gridx = 1;
	        frame.add(txtDestino, gbc);

	        btnAgregar = new JButton("Agregar Vuelo");
	        gbc.gridx = 0;
	        gbc.gridy = 4;
	        frame.add(btnAgregar, gbc);

	        btnMostrar = new JButton("Mostrar Vuelos");
	        gbc.gridx = 1;
	        frame.add(btnMostrar, gbc);

	        modeloTabla = new DefaultTableModel(new String[]{"Número", "Aerolínea", "Origen", "Destino"}, 0);
	        tablaVuelos = new JTable(modeloTabla);
	        JScrollPane scrollPane = new JScrollPane(tablaVuelos);
	        gbc.gridwidth = 2;
	        gbc.gridx = 0;
	        gbc.gridy = 5;
	        gbc.fill = GridBagConstraints.BOTH;
	        gbc.weightx = 1;
	        gbc.weighty = 1;
	        frame.add(scrollPane, gbc);

	        btnAgregar.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                agregarVuelo();
	            }
	        });

	        btnMostrar.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                mostrarVuelos();
	            }
	        });

	        frame.setVisible(true);
	    }

	    private void agregarVuelo() {
	        String numero = txtNumeroVuelo.getText();
	        String aerolinea = txtAerolinea.getText();
	        String origen = txtOrigen.getText();
	        String destino = txtDestino.getText();

	        if (numero.isEmpty() || aerolinea.isEmpty() || origen.isEmpty() || destino.isEmpty()) {
	            JOptionPane.showMessageDialog(frame, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
	            return;
	        }

	        modeloTabla.addRow(new Object[]{numero, aerolinea, origen, destino});
	        limpiarCampos();
	    }

	    private void mostrarVuelos() {
	        if (modeloTabla.getRowCount() == 0) {
	            JOptionPane.showMessageDialog(frame, "No hay vuelos registrados", "Información", JOptionPane.INFORMATION_MESSAGE);
	        }
	    }

	    private void limpiarCampos() {
	        txtNumeroVuelo.setText("");
	        txtAerolinea.setText("");
	        txtOrigen.setText("");
	        txtDestino.setText("");
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(TerminalTransporte::new);
	    }
	}

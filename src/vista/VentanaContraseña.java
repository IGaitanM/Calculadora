package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controlador.GestorEventos2;

public class VentanaContraseņa extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel panel = new JPanel();
	private JButton botonAceptar;
	private JPasswordField contraseņa;
	private JLabel texto, imagen1;
	private String contraseņaMaestra;

	
	public VentanaContraseņa() {
		
		setBounds(650, 260, 380, 273);
		getContentPane().setLayout(new BorderLayout());
		panel.setBackground(new Color(8, 4, 1));
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		setUndecorated(true);
		inicializarComponentes();
	}
	
	public void inicializarComponentes() {
		
		botonAceptar = new JButton("Confirmar");
		botonAceptar.setBounds(40, 144, 100, 38);
		botonAceptar.setBackground(new Color(47, 43, 27));
		botonAceptar.setFont(new Font("Verdana", 1, 14));
		botonAceptar.setForeground(new Color(210, 169, 57));
		botonAceptar.setHorizontalAlignment(JTextField.CENTER);
		botonAceptar.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(210, 169, 57)));
		panel.add(botonAceptar);
		
		imagen1 = new JLabel("");
		imagen1.setIcon(new ImageIcon("src/img/password.png"));
		imagen1.setBounds(168, 0, 176, 223);
		panel.add(imagen1);
		
		texto = new JLabel("CONTRASEŅA");
		texto.setForeground(new Color(210, 169, 57));
		texto.setFont(new Font("Verdana", Font.BOLD, 14));
		texto.setBounds(35, 51, 115, 29);
		panel.add(texto);
		
		contraseņa = new JPasswordField();
		contraseņa.setBounds(10, 101, 156, 20);
		contraseņa.requestFocus();
		panel.add(contraseņa);
		
		
	}
	
	public void establecerGestor (GestorEventos2 gestor2) {
		botonAceptar.addActionListener(gestor2);
	}

	public JButton getBotonAceptar() {
		return botonAceptar;
	}

	public void setBotonAceptar(JButton botonAceptar) {
		this.botonAceptar = botonAceptar;
	}

	public JPasswordField getContraseņa() {
		return contraseņa;
	}

	public void setContraseņa(JPasswordField contraseņa) {
		this.contraseņa = contraseņa;
	}

	public JLabel getTexto() {
		return texto;
	}

	public void setTexto(JLabel texto) {
		this.texto = texto;
	}

	public JLabel getImagen1() {
		return imagen1;
	}

	public void setImagen1(JLabel imagen1) {
		this.imagen1 = imagen1;
	}

	public JPanel getPanel() {
		return panel;
	}

	public String getContraseņaMaestra() {
		return contraseņaMaestra;
	}

	public void setContraseņaMaestra(String contraseņaMaestra) {
		this.contraseņaMaestra = contraseņaMaestra;
	}
	
	
	
}

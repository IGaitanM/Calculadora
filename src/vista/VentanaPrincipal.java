package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controlador.GestorEventos;

public class VentanaPrincipal extends JFrame {
	
	private JLabel fondo;
	private JTextField cajaNum1, cajaNum2, cajaResultado;
	private JButton botonSumar, botonRestar, botonMultipli, botonDividir, botonRaiz2, botonRaiz3;
   

  
	
	public VentanaPrincipal() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(810, 530);
		setLocationRelativeTo(null);
		setLayout(null);
		setTitle("Calculadora");
		setIconImage(Toolkit.getDefaultToolkit().getImage("fallout4logo.png"));
		inicializarComplementos();
		setVisible(true);
	
	}

	public void establecerGestor (GestorEventos gestor) {
		botonSumar.addActionListener(gestor);
	
	}
	
	public void inicializarComplementos () {
		
		getContentPane().setBackground(Color.black);
		
		cajaNum1 = new JTextField();
		cajaNum1.setBounds(270, 85, 180, 20);
		cajaNum1.setBackground(new Color(47, 43, 27));
		cajaNum1.setFont(new Font("Verdana", 1, 18));
		cajaNum1.setForeground(new Color(210, 169, 57));
		cajaNum1.setHorizontalAlignment(JTextField.CENTER);
		cajaNum1.setText("NÚMERO1");
		cajaNum1.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(210, 169, 57)));
		add(cajaNum1);
		
		cajaNum2 = new JTextField();
		cajaNum2.setBounds(450, 85, 180, 20);
		cajaNum2.setBackground(new Color(47, 43, 27));
		cajaNum2.setFont(new Font("Verdana", 1, 18));
		cajaNum2.setForeground(new Color(210, 169, 57));
		cajaNum2.setHorizontalAlignment(JTextField.CENTER);
		cajaNum2.setText("NÚMERO2");
		cajaNum2.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(210, 169, 57)));
		add(cajaNum2);
		
		botonSumar = new JButton("SUMAR");
		botonSumar.setBounds(490, 147, 80, 20);
		botonSumar.setBackground(new Color(210, 169, 57));
        botonSumar.setFont(new java.awt.Font("Verdana", 1, 12));
        botonSumar.setBorder(null);
		add(botonSumar);
		
		botonRestar = new JButton("RESTAR");
		botonRestar.setBounds(310, 147, 90, 20);
		botonRestar.setBackground(new Color(210, 169, 57));
		botonRestar.setFont(new java.awt.Font("Verdana", 1, 12));
		botonRestar.setBorder(null);
		add(botonRestar);
		
		botonMultipli = new JButton("MULTIPLICAR");
		botonMultipli.setBounds(290, 210, 120, 20);
		botonMultipli.setBackground(new Color(210, 169, 57));
		botonMultipli.setFont(new java.awt.Font("Verdana", 1, 12));
		botonMultipli.setBorder(null);
		add(botonMultipli);
		
		botonDividir = new JButton("DIVIDIR");
		botonDividir.setBounds(490, 210, 70, 20);
		botonDividir.setBackground(new Color(210, 169, 57));
		botonDividir.setFont(new java.awt.Font("Verdana", 1, 12));
		botonDividir.setBorder(null);
		add(botonDividir);
		
		botonRaiz2 = new JButton("RAIZ 2");
		botonRaiz2.setBounds(330, 250, 70, 20);
		botonRaiz2.setBackground(new Color(210, 169, 57));
		botonRaiz2.setFont(new java.awt.Font("Verdana", 1, 12));
		botonRaiz2.setBorder(null);
		add(botonRaiz2);
		
		botonRaiz3 = new JButton("RAIZ 3");
		botonRaiz3.setBounds(490, 250, 70, 20);
		botonRaiz3.setBackground(new Color(210, 169, 57));
		botonRaiz3.setFont(new java.awt.Font("Verdana", 1, 12));
		botonRaiz3.setBorder(null);
		add(botonRaiz3);
		
		cajaResultado = new JTextField();
		cajaResultado.setBounds(370, 305, 150, 20);
		cajaResultado.setBackground(new java.awt.Color(23, 18, 8));
        cajaResultado.setFont(new Font("Verdana", 1, 18));
        cajaResultado.setForeground(new Color(210, 169, 57));
        cajaResultado.setText("RESULTADO");
        cajaResultado.setHorizontalAlignment(JTextField.CENTER);
        cajaResultado.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(210, 169, 57)));
		add(cajaResultado);
		
		fondo = new JLabel(new ImageIcon("PimpBoy3Billion.jpg"));
		fondo.setBounds(0, 0, 810, 530);
		add(fondo);
	
	}

	public JTextField getCajaNum1() {
		return cajaNum1;
	}

	public void setCajaNum1(JTextField cajaNum1) {
		this.cajaNum1 = cajaNum1;
	}

	public JTextField getCajaNum2() {
		return cajaNum2;
	}

	public void setCajaNum2(JTextField cajaNum2) {
		this.cajaNum2 = cajaNum2;
	}

	public JTextField getCajaResultado() {
		return cajaResultado;
	}

	public void setCajaResultado(JTextField cajaResultado) {
		this.cajaResultado = cajaResultado;
	}

	public JButton getBotonSumar() {
		return botonSumar;
	}

	public void setBotonSumar(JButton botonSumar) {
		this.botonSumar = botonSumar;
	}

	public JButton getBotonRestar() {
		return botonRestar;
	}

	public void setBotonRestar(JButton botonRestar) {
		this.botonRestar = botonRestar;
	}

	public JButton getBotonMultipli() {
		return botonMultipli;
	}

	public void setBotonMultipli(JButton botonMultipli) {
		this.botonMultipli = botonMultipli;
	}

	public JButton getBotonDividir() {
		return botonDividir;
	}

	public void setBotonDividir(JButton botonDividir) {
		this.botonDividir = botonDividir;
	}

	public JButton getBotonRaiz2() {
		return botonRaiz2;
	}

	public void setBotonRaiz2(JButton botonRaiz2) {
		this.botonRaiz2 = botonRaiz2;
	}

	public JButton getBotonRaiz3() {
		return botonRaiz3;
	}

	public void setBotonRaiz3(JButton botonRaiz3) {
		this.botonRaiz3 = botonRaiz3;
	}

	
}


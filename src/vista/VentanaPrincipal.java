package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controlador.GestorEventos;

public class VentanaPrincipal extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel fondo, Num1, Num2;
	private JTextField cajaNum1, cajaNum2, cajaResultado;
	private JButton botonSumar, botonRestar, botonMultipli, botonDividir,
					botonRaiz2, botonRaiz3, botonOff, botonOn;
   

	public VentanaPrincipal() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(830, 570);
		setLocationRelativeTo(null);
		setLayout(null);
		setTitle("Calculadora");
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/img/fallout-4-icon.png"));
		inicializarComplementos();
		cajaNum1.requestFocus();
		setVisible(true);
	
	}

	public void establecerGestor (GestorEventos gestor) {
		botonSumar.addActionListener(gestor);
		botonRestar.addActionListener(gestor);
		botonDividir.addActionListener(gestor);
		botonMultipli.addActionListener(gestor);
		botonRaiz2.addActionListener(gestor);
		botonRaiz3.addActionListener(gestor);
		botonOff.addActionListener(gestor);
		botonOn.addActionListener(gestor);
	
	}
	
	public void inicializarComplementos () {
		
		getContentPane().setBackground(Color.black);
		
		Num1 = new JLabel ();
		Num1.setBounds(272, 85, 80, 20);
		Num1.setBackground(new java.awt.Color(23, 18, 8));
		Num1.setFont(new Font("Verdana", 1, 14));
		Num1.setForeground(new Color(210, 169, 57));
		Num1.setText("Número1");
		Num1.setBorder(null);
		add(Num1);
		
		Num2 = new JLabel ();
		Num2.setBounds(550, 85, 80, 20);
		Num2.setBackground(new java.awt.Color(23, 18, 8));
		Num2.setFont(new Font("Verdana", 1, 14));
		Num2.setForeground(new Color(210, 169, 57));
		Num2.setText("Número2");
		Num2.setBorder(null);
		add(Num2);
		
		cajaNum1 = new JFormattedTextField ();
		cajaNum1.setBounds(346, 85, 100, 20);
		cajaNum1.setBackground(new Color(47, 43, 27));
		cajaNum1.setFont(new Font("Verdana", 1, 18));
		cajaNum1.setForeground(new Color(210, 169, 57));
		cajaNum1.setHorizontalAlignment(JTextField.CENTER);
		cajaNum1.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(210, 169, 57)));
		add(cajaNum1);
		
		cajaNum2 = new JTextField();
		cajaNum2.setBounds(446, 85, 100, 20);
		cajaNum2.setBackground(new Color(47, 43, 27));
		cajaNum2.setFont(new Font("Verdana", 1, 18));
		cajaNum2.setForeground(new Color(210, 169, 57));
		cajaNum2.setHorizontalAlignment(JTextField.CENTER);
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
		cajaResultado.setBounds(345, 305, 200, 20);
		cajaResultado.setBackground(new java.awt.Color(23, 18, 8));
        cajaResultado.setFont(new Font("Verdana", 1, 18));
        cajaResultado.setForeground(new Color(210, 169, 57));
        cajaResultado.setText("RESULTADO");
        cajaResultado.setHorizontalAlignment(JTextField.CENTER);
        cajaResultado.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(210, 169, 57)));
		add(cajaResultado);
		
		botonOff = new JButton(new ImageIcon("src/img/off40.png"));
		botonOff.setBounds(476, 375, 45, 80);
		botonOff.setFont(new Font("Tw Cen MT Condensed Extra Bold", 1, 14));
		botonOff.setForeground(Color.BLACK);
		botonOff.setText("OFF");
	    botonOff.setContentAreaFilled(false);
	    botonOff.setHorizontalTextPosition(SwingConstants.CENTER);
	    botonOff.setVerticalAlignment(SwingConstants.TOP);
	    botonOff.setVerticalTextPosition(SwingConstants.TOP);
	    botonOff.setBorder(null);
	    botonOff.setFocusPainted(false);
	    add(botonOff);
	    
	    botonOn = new JButton(new ImageIcon("src/img/on40.png"));
	    botonOn.setBounds(368, 374, 45, 80);
	    botonOn.setFont(new Font("Tw Cen MT Condensed Extra Bold", 1, 14));
	    botonOn.setForeground(Color.BLACK);
	    botonOn.setText("ON");
	    botonOn.setContentAreaFilled(false);
	    botonOn.setHorizontalTextPosition(SwingConstants.CENTER);
	    botonOn.setVerticalAlignment(SwingConstants.TOP);
	    botonOn.setVerticalTextPosition(SwingConstants.TOP);
	    botonOn.setBorder(null);
	    botonOn.setFocusPainted(false);
	    add(botonOn);
		
		fondo = new JLabel(new ImageIcon("src/img/PimpBoy3BillionSin2.jpg"));
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

	public JButton getBotonOff() {
		return botonOff;
	}

	public void setBotonOff(JButton botonOff) {
		this.botonOff = botonOff;
	}

	public JLabel getFondo() {
		return fondo;
	}

	public void setFondo(JLabel fondo) {
		this.fondo = fondo;
	}

	public JButton getBotonOn() {
		return botonOn;
	}

	public void setBotonOn(JButton botonOn) {
		this.botonOn = botonOn;
	}

	public JLabel getNum1() {
		return Num1;
	}

	public void setNum1(JLabel num1) {
		Num1 = num1;
	}

	public JLabel getNum2() {
		return Num2;
	}

	public void setNum2(JLabel num2) {
		Num2 = num2;
	}
	

	
}


package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import vista.VentanaPrincipal;

public class GestorEventos implements ActionListener {

	private VentanaPrincipal ventana;
	
	public GestorEventos (VentanaPrincipal ventana) {
		this.ventana = ventana;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		double Caja1Parseada;
		double Caja2Parseada;
		
		if (e.getSource() == ventana.getBotonSumar()) {
			Caja1Parseada= Double.parseDouble(ventana.getCajaNum1().getText());
			Caja2Parseada= Double.parseDouble(ventana.getCajaNum2().getText());
			double suma = Caja1Parseada + Caja2Parseada;
			String sumaString = Double.toString(suma);
			ventana.getCajaResultado().setText(sumaString);
			
		}
		
		if (e.getSource() == ventana.getBotonRestar()) {
			Caja1Parseada= Double.parseDouble(ventana.getCajaNum1().getText());
			 Caja2Parseada= Double.parseDouble(ventana.getCajaNum2().getText());
			double resta = Caja1Parseada - Caja2Parseada;
			String restaString = Double.toString(resta);
			ventana.getCajaResultado().setText(restaString);
			
		}
		
		if (e.getSource() == ventana.getBotonMultipli()) {
			Caja1Parseada= Double.parseDouble(ventana.getCajaNum1().getText());
			Caja2Parseada= Double.parseDouble(ventana.getCajaNum2().getText());
			double multi = Caja1Parseada * Caja2Parseada;
			String multiString = Double.toString(multi);
			ventana.getCajaResultado().setText(multiString);
			
		}
		
		if (e.getSource() == ventana.getBotonDividir()) {
			Caja1Parseada= Double.parseDouble(ventana.getCajaNum1().getText());
			Caja2Parseada= Double.parseDouble(ventana.getCajaNum2().getText());
			double divi = Caja1Parseada / Caja2Parseada;
			String diviString = Double.toString(divi);
			ventana.getCajaResultado().setText(diviString);
	
			
		}
		if (e.getSource() == ventana.getBotonOff()) {
			
			ventana.getFondo().setIcon(new ImageIcon("PimpBoy3BillionOFF.jpg"));
			ventana.getBotonSumar().setVisible(false);
			ventana.getBotonRestar().setVisible(false);
			ventana.getBotonMultipli().setVisible(false);
			ventana.getBotonDividir().setVisible(false);
			ventana.getBotonRaiz2().setVisible(false);
			ventana.getBotonRaiz3().setVisible(false);
			ventana.getCajaNum1().setVisible(false);
			ventana.getCajaNum2().setVisible(false);
			ventana.getCajaResultado().setVisible(false);
			
		}
		if (e.getSource() == ventana.getBotonOn()) {
			
			ventana.getFondo().setIcon(new ImageIcon("PimpBoy3BillionSin.jpg"));
			ventana.getBotonSumar().setVisible(true);
			ventana.getBotonRestar().setVisible(true);
			ventana.getBotonMultipli().setVisible(true);
			ventana.getBotonDividir().setVisible(true);
			ventana.getBotonRaiz2().setVisible(true);
			ventana.getBotonRaiz3().setVisible(true);
			ventana.getCajaNum1().setVisible(true);
			ventana.getCajaNum2().setVisible(true);
			ventana.getCajaResultado().setVisible(true);
			
		}
	}
	
}

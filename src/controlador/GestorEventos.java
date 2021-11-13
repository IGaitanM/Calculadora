package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.VentanaPrincipal;

public class GestorEventos implements ActionListener {

	private VentanaPrincipal ventana;
	
	public GestorEventos (VentanaPrincipal ventana) {
		this.ventana = ventana;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		double Caja1Parseada= Double.parseDouble(ventana.getCajaNum1().getText());
		double Caja2Parseada= Double.parseDouble(ventana.getCajaNum2().getText());
		
		if (e.getSource() == ventana.getBotonSumar()) {
			double suma = Caja1Parseada + Caja2Parseada;
			String sumaString = Double.toString(suma);
			ventana.getCajaResultado().setText(sumaString);
			
		}
		
		if (e.getSource() == ventana.getBotonRestar()) {
			double resta = Caja1Parseada - Caja2Parseada;
			String restaString = Double.toString(resta);
			ventana.getCajaResultado().setText(restaString);
			
		}
		
		if (e.getSource() == ventana.getBotonMultipli()) {
			double multi = Caja1Parseada * Caja2Parseada;
			String multiString = Double.toString(multi);
			ventana.getCajaResultado().setText(multiString);
			
		}
		
		if (e.getSource() == ventana.getBotonDividir()) {
			double divi = Caja1Parseada / Caja2Parseada;
			String diviString = Double.toString(divi);
			ventana.getCajaResultado().setText(diviString);
		}
		
		if (e.getSource() == ventana.getBotonRaiz2()) {
			
		}
		
		if (e.getSource() == ventana.getBotonRaiz3()) {
			
		}
	}
	
}

package controlador;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import vista.VentanaContrase�a;
import vista.VentanaPrincipal;

public class GestorEventos implements ActionListener {

	private VentanaPrincipal ventana;
	
	public GestorEventos (VentanaPrincipal ventana) {
		this.ventana = ventana;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		double caja1Parseada;
		double caja2Parseada;
		
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
		
	
		
			if (e.getSource() == ventana.getBotonSumar()) {
				if (verificarCajas()){
					caja1Parseada= Double.parseDouble(ventana.getCajaNum1().getText());
					caja2Parseada= Double.parseDouble(ventana.getCajaNum2().getText());
					double suma = caja1Parseada + caja2Parseada;
					String sumaString = Double.toString(suma);
					ventana.getCajaResultado().setText(sumaString);
				}
				
			}
			
			if (e.getSource() == ventana.getBotonRestar()) {
				if (verificarCajas()){
					caja1Parseada= Double.parseDouble(ventana.getCajaNum1().getText());
					caja2Parseada= Double.parseDouble(ventana.getCajaNum2().getText());
					double resta = caja1Parseada - caja2Parseada;
					String restaString = Double.toString(resta);
					ventana.getCajaResultado().setText(restaString);
				}
			}
			
			if (e.getSource() == ventana.getBotonMultipli()) {
				if (verificarCajas()){
					caja1Parseada= Double.parseDouble(ventana.getCajaNum1().getText());
					caja2Parseada= Double.parseDouble(ventana.getCajaNum2().getText());
					double multi = caja1Parseada * caja2Parseada;
					String multiString = Double.toString(multi);
					ventana.getCajaResultado().setText(multiString);
				}	
			}
			
			if (e.getSource() == ventana.getBotonDividir()) {
				if (verificarCajas()){
					caja1Parseada= Double.parseDouble(ventana.getCajaNum1().getText());
					caja2Parseada= Double.parseDouble(ventana.getCajaNum2().getText());
					double divi = caja1Parseada / caja2Parseada;
					String diviString = Double.toString(divi);
					ventana.getCajaResultado().setText(diviString);
				}	
			}
			
			if (e.getSource() == ventana.getBotonRaiz2()) {
				UIManager.put("OptionPane.background", new Color(210,169,57));
				UIManager.put("Panel.background", new Color(210,169,57));
				UIManager.put("Font.foreground", new Color(210,169,57));
				
				JOptionPane.showMessageDialog(null, "Funcionalidad no disponible", "En construcci�n", 
											JOptionPane.ERROR_MESSAGE, new ImageIcon("noDisponible2.png"));
			}
			if (e.getSource() == ventana.getBotonRaiz3()) {
				VentanaContrase�a ventana2 = new VentanaContrase�a();
				GestorEventos2 gestor2 = new GestorEventos2(ventana2);
				ventana2.establecerGestor(gestor2);
				ventana2.setVisible(true);
				

					caja1Parseada= Double.parseDouble(ventana.getCajaNum1().getText());
					double raizCubica = Math.cbrt(caja1Parseada);
					String raizCubicaString = Double.toString(raizCubica);
					ventana.getCajaResultado().setText(raizCubicaString);

					
			}
			
		}	
	
	
		public boolean verificarCajas() {
			boolean resultado=false;
			if (!ventana.getCajaNum1().getText().equals("") && !ventana.getCajaNum2().getText().equals("")) {
				if (comprobarParseo(ventana.getCajaNum1().getText()) && comprobarParseo(ventana.getCajaNum2().getText()) ) 
					resultado=true;
				else {
					resultado=false;
				}
			}
	
			return resultado;
		}	
	
		public boolean comprobarParseo(String cajaTexto) {
			try {
				Double.parseDouble(cajaTexto);
				return true;
			} catch (NumberFormatException nfe){
				UIManager.put("OptionPane.background", new Color(210,169,57));
				UIManager.put("Panel.background", new Color(210,169,57));
				UIManager.put("Font.foreground", new Color(210,169,57));
				JOptionPane.showMessageDialog(null, "Inserte n�meros por favor", "Aviso", 
											JOptionPane.ERROR_MESSAGE, new ImageIcon("errorNumeros.png"));
				return false;
			}
		}
		
		
}

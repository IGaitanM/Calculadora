package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import vista.VentanaContraseña;
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
		
		// Acciones al pulsar el botón de apagar OFF
		
		if (e.getSource() == ventana.getBotonOff()) {
			
			ventana.getFondo().setIcon(new ImageIcon("src/img/PimpBoy3BillionOFF.jpg"));
			ventana.getNum1().setVisible(false);
			ventana.getNum2().setVisible(false);
			ventana.getBotonSumar().setVisible(false);
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
		
		// Acciones al pulsar el botón de encender ON
		
		if (e.getSource() == ventana.getBotonOn()) {
			
			ventana.getFondo().setIcon(new ImageIcon("src/img/PimpBoy3BillionSin2.jpg"));
			ventana.getNum1().setVisible(true);
			ventana.getNum2().setVisible(true);
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
		
	
		// Acciones al pulsar el botón SUMAR
		
			if (e.getSource() == ventana.getBotonSumar()) {
				if (verificarCajas()){
					caja1Parseada= Double.parseDouble(ventana.getCajaNum1().getText());
					caja2Parseada= Double.parseDouble(ventana.getCajaNum2().getText());
					double suma = caja1Parseada + caja2Parseada;
					String sumaString = Double.toString(suma);
					ventana.getCajaResultado().setText(sumaString);
					ventana.getCajaNum1().requestFocus();
				}
				
			}
			
			// Acciones al pulsar el botón RESTAR
			
			if (e.getSource() == ventana.getBotonRestar()) {
				if (verificarCajas()){
					caja1Parseada= Double.parseDouble(ventana.getCajaNum1().getText());
					caja2Parseada= Double.parseDouble(ventana.getCajaNum2().getText());
					double resta = caja1Parseada - caja2Parseada;
					String restaString = Double.toString(resta);
					ventana.getCajaResultado().setText(restaString);
					ventana.getCajaNum1().requestFocus();
				}
			}
			
			// Acciones al pulsar el botón MULIPLICAR
			
			if (e.getSource() == ventana.getBotonMultipli()) {
				if (verificarCajas()){
					caja1Parseada= Double.parseDouble(ventana.getCajaNum1().getText());
					caja2Parseada= Double.parseDouble(ventana.getCajaNum2().getText());
					double multi = caja1Parseada * caja2Parseada;
					String multiString = Double.toString(multi);
					ventana.getCajaResultado().setText(multiString);
				}	
			}
			
			// Acciones al pulsar el botón DIVIDIR 
			
			if (e.getSource() == ventana.getBotonDividir()) {
				if (verificarCajas()){
					caja1Parseada= Double.parseDouble(ventana.getCajaNum1().getText());
					caja2Parseada= Double.parseDouble(ventana.getCajaNum2().getText());
					double divi = caja1Parseada / caja2Parseada;
					String diviString = Double.toString(divi);
					ventana.getCajaResultado().setText(diviString);
					ventana.getCajaNum1().requestFocus();
				}	
			}
			
			// Acciones al pulsar el botón RAIZ2
			
			if (e.getSource() == ventana.getBotonRaiz2()) {
				UIManager.put("OptionPane.background", new Color(210,169,57));
				UIManager.put("Panel.background", new Color(210,169,57));
				UIManager.put("Font.foreground", new Color(210,169,57));
				
				JOptionPane.showMessageDialog(null, "Funcionalidad no disponible", "En construcción", 
											JOptionPane.ERROR_MESSAGE, new ImageIcon("src/img/noDisponible2.png"));
				ventana.getCajaNum1().requestFocus();
			}
			
			// Acciones al pulsar el botón RAIZ3
			
			if (e.getSource() == ventana.getBotonRaiz3()) {
				VentanaContraseña ventana2 = new VentanaContraseña();
				GestorEventos2 gestor2 = new GestorEventos2(ventana2);
				ventana2.establecerGestor(gestor2);     
				ventana2.setVisible(true);
				
				if (!ventana.getCajaNum1().getText().isEmpty()) {
						caja1Parseada= Double.parseDouble(ventana.getCajaNum1().getText());
						double raizCubica = Math.cbrt(caja1Parseada);
						DecimalFormat formato1 = new DecimalFormat("#.0000");
						String raizCubicaString = (formato1.format(raizCubica));
						ventana.getCajaResultado().setText(raizCubicaString);	
						ventana.getCajaNum1().requestFocus();
				}
			}
				
		}
					
	
		public boolean verificarCajas() {
			boolean resultado=false;
			if (!ventana.getCajaNum1().getText().isEmpty() && !ventana.getCajaNum2().getText().isEmpty()) {
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
				JOptionPane.showMessageDialog(null, "Inserte números por favor", "Aviso", 
											JOptionPane.ERROR_MESSAGE, new ImageIcon("src/img/errorNumeros.png"));
				return false;
			}
		}
		
		
}

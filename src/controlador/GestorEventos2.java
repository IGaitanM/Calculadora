package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import vista.VentanaContraseña;

public class GestorEventos2 implements ActionListener {

	public VentanaContraseña ventana2;
	
	public GestorEventos2(VentanaContraseña ventana2) {
		this.ventana2= ventana2;
	}
		
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (!validarContraseña()) {
			UIManager.put("OptionPane.background", new Color(210,169,57));
			UIManager.put("Panel.background", new Color(210,169,57));
			UIManager.put("Font.foreground", new Color(210,169,57));
			ventana2.getImagen1().setIcon(new ImageIcon("src/img/seta.png"));
			JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "ERROR", 
										JOptionPane.ERROR_MESSAGE, new ImageIcon("src/img/radiaccion.png"));
		}
		else {
			ventana2.dispose();
		}
	}
		
	
	
	public boolean validarContraseña() {

	    char contraseñaArray[] = ventana2.getContraseña().getPassword();
	    String pass = new String(contraseñaArray);

	    if (pass.equals("rachel")) {
	    	ventana2.setContraseñaMaestra(pass);
	        return true;
	    } 
	    else
	    	return false;
	   
	}

}

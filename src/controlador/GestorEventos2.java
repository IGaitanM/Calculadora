package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import vista.VentanaContrase�a;

public class GestorEventos2 implements ActionListener {

	public VentanaContrase�a ventana2;
	
	public GestorEventos2(VentanaContrase�a ventana2) {
		this.ventana2= ventana2;
	}
		
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (!validarContrase�a()) {
			UIManager.put("OptionPane.background", new Color(210,169,57));
			UIManager.put("Panel.background", new Color(210,169,57));
			UIManager.put("Font.foreground", new Color(210,169,57));
			ventana2.getImagen1().setIcon(new ImageIcon("src/img/seta.png"));
			JOptionPane.showMessageDialog(null, "Contrase�a incorrecta", "ERROR", 
										JOptionPane.ERROR_MESSAGE, new ImageIcon("src/img/radiaccion.png"));
		}
		else {
			ventana2.dispose();
		}
	}
		
	
	
	public boolean validarContrase�a() {

	    char contrase�aArray[] = ventana2.getContrase�a().getPassword();
	    String pass = new String(contrase�aArray);

	    if (pass.equals("rachel")) {
	    	ventana2.setContrase�aMaestra(pass);
	        return true;
	    } 
	    else
	    	return false;
	   
	}

}

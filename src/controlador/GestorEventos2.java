package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import vista.VentanaContraseña;

public class GestorEventos2 implements ActionListener {

	public VentanaContraseña ventana2;
	
	public GestorEventos2(VentanaContraseña ventana2) {
		this.ventana2= ventana2;
	}
		
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (ventana2.getContraseña().getText()!="rachel") {
			ventana2.getImagen1().setIcon(new ImageIcon("seta.png"));
			
		}
		
	}

}

package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import vista.VentanaContrase�a;

public class GestorEventos2 implements ActionListener {

	public VentanaContrase�a ventana2;
	
	public GestorEventos2(VentanaContrase�a ventana2) {
		this.ventana2= ventana2;
	}
		
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (ventana2.getContrase�a().getText()!="rachel") {
			ventana2.getImagen1().setIcon(new ImageIcon("seta.png"));
			
		}
		
	}

}

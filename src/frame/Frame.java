package frame;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame {
	private JPanel panel;
	
	private JButton boton1, boton2;
	
	public Frame() {
		setTitle("Iglesia Belén");
		
		this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH); // Maximizar la ventana
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar la ventana
		this.setVisible(true); // Hacer visible el frame
		
		panel = new JPanel();
		panel.setLayout(null);
		setContentPane(panel);
		
		boton1 = new JButton("Hola");
		boton1.setBounds(20, 20, 200, 20);
		panel.add(boton1);
	}

}

package swing;

import javax.swing.*;
import java.awt.event.*;

public class Button01 extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton boton1;
	
	public Button01() {
		setLayout(null);
		boton1 = new JButton("Finalizar");
		boton1.setBounds(300, 250, 100, 30);
		add(boton1);
		boton1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		Button01 b1 = new Button01();
		b1.setBounds(0, 0, 450, 350);
		b1.setVisible(true);
	}
}

package swing;

import javax.swing.*;

public class Formulario04 extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label1, label2, label3;
	
	public Formulario04() {
		setLayout(null);
		label1 = new JLabel("Rojo");
		label1.setBounds(10, 20, 100, 30);
		add(label1);
		label2 = new JLabel("Verde");
		label2.setBounds(10, 60, 100, 30);
		add(label2);
		label3 = new JLabel("Azul");
		label3.setBounds(10, 100, 100, 30);
		add(label3);
	}
	
	public static void main(String[] args) {
		Formulario04 f4 = new Formulario04();
		f4.setBounds(0, 0, 300, 200);
		f4.setVisible(true);
	}
}

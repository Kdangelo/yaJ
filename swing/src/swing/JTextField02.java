package swing;

import javax.swing.*;
import java.awt.event.*;

public class JTextField02 extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textfield1, textfield2;
	private JButton boton1;
	
	public JTextField02() {
		setLayout(null);
		textfield1 = new JTextField();
		textfield1.setBounds(10, 10, 100, 30);
		add(textfield1);
		textfield2 = new JTextField();
		textfield2.setBounds(10, 50, 100, 30);
		add(textfield2);
		boton1 = new JButton("Sumar");
		boton1.setBounds(10, 90, 100, 30);
		add(boton1);
		boton1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			String cad1 = textfield1.getText();
			String cad2 = textfield2.getText();
			int x1 = Integer.parseInt(cad1);
			int x2 = Integer.parseInt(cad2);
			int suma = x1 + x2;
			String total = String.valueOf(suma);
			setTitle(total);
		}
	}
	
	public static void main(String[] ar) {
		JTextField02 jt2=new JTextField02();
		jt2.setBounds(0,0,240,170);
		jt2.setVisible(true);
	}
}

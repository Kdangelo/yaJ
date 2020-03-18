package listasTipoPila;

import java.awt.event.*;
import javax.swing.*;

public class Formula extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField tf1;
	private JButton boton1;
	
	public Formula() {
		setLayout(null);
		tf1 = new JTextField("{2*(4-5)-{3*4}-[4-5]}");
		tf1.setBounds(10,10,230,30);
		add(tf1);
		boton1 = new JButton("Verificar fórmula.");
		boton1.setBounds(10,70,180,30);
		add(boton1);
		boton1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			if (balanceada()) {
				setTitle("Está correctamente balanceada.");
			} else {
				setTitle("No está correctamente balanceada.");
			}
		}
	}
	
	public boolean balanceada() {
		Pila04 pila1 = new Pila04();
		String cadena = tf1.getText();
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == '(' || cadena.charAt(i) == '[' || cadena.charAt(i) == '{' ) {
				pila1.insertar(cadena.charAt(i));
			} else {
				if (cadena.charAt(i) == ')') {
    	    	    if (pila1.extraer() != '(') {
    	    	        return false;
    	    	    }
				} else {
					if (cadena.charAt(i) == ']') {
						if (pila1.extraer() != '[') {
							return false;
						}
					} else {
						if (cadena.charAt(i) == '}') {
							if (pila1.extraer() != '{') {
								return false;
							}
						} else {

						}
					}
				}
			}
		}
		if (pila1.vacia()) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Formula formula1 = new Formula();
		formula1.setBounds(0,0,360,160);
		formula1.setVisible(true);
	}
}
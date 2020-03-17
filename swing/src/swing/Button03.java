package swing;

import javax.swing.*;
import java.awt.event.*;

public class Button03 extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton boton1, boton2;
	
	public Button03() {
		setLayout(null);
		boton1=new JButton("Varón");
		boton1.setBounds(10,10,100,30);
		boton1.addActionListener(this);
		add(boton1);
		boton2=new JButton("Mujer");
		boton2.setBounds(10,70,100,30);
		boton2.addActionListener(this);
		add(boton2);
    }
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			setTitle("Varón");
        }
		if (e.getSource() == boton2) {
            setTitle("Mujer");
        }
    }
	
	public static void main(String[] ar) {
        Button03 b3 = new Button03();
        b3.setBounds(0,0,250,140);
        b3.setVisible(true);
    }
}

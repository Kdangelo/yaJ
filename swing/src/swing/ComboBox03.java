package swing;

import javax.swing.*;
import java.awt.event.*;

public class ComboBox03 extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label1,label2;
    private JTextField textfield1;
    private JComboBox<String> combo1;
    private JButton boton1;
    
    public ComboBox03() {
    	setLayout(null);
        label1 = new JLabel("Usuario:");
        label1.setBounds(10,10,100,30);
        add(label1);
        textfield1 = new JTextField();
        textfield1.setBounds(120,10,120,30);
        add(textfield1);
        label2 = new JLabel();
        label2.setBounds(10,50,100,30);
        add(label2);
        combo1 = new JComboBox<String>();
        combo1.setBounds(120,50,100,30);
        combo1.addItem("Argentina");
        combo1.addItem("Chile");
        combo1.addItem("España");
        combo1.addItem("Brasil");
        add(combo1);
        boton1 = new JButton("Confirmar");
        boton1.setBounds(10,100,100,30);
        boton1.addActionListener(this);
        add(boton1);
    }
    
    public void actionPerformed(ActionEvent e) {
    	if (e.getSource() == boton1) {
			String nombre = textfield1.getText();
			String pais = (String) combo1.getSelectedItem();
			setTitle(nombre + " - " +  pais);
		}
    }
    
    public static void main(String[] ar) {
    	ComboBox03 formulario1 = new ComboBox03();
        formulario1.setBounds(10,20,300,200);
        formulario1.setVisible(true);
    }
}

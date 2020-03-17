package swing;

import javax.swing.*;
import java.awt.event.*;

public class ComboBox01 extends JFrame implements ItemListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JComboBox<String> combo1;
	
	public ComboBox01() {
		setLayout(null);
        combo1 = new JComboBox<String>();
        combo1.setBounds(10,10,80,20);
        add(combo1);
        combo1.addItem("rojo");
        combo1.addItem("vede");
        combo1.addItem("azul");
        combo1.addItem("amarillo");
        combo1.addItem("negro");
        combo1.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == combo1) {
			String select = (String) combo1.getSelectedItem();
			setTitle(select);
		}
	}
	
	public static void main(String[] ar) {
		ComboBox01 formulario1 = new ComboBox01();
        formulario1.setBounds(0,0,200,150);
        formulario1.setVisible(true);
    }
}

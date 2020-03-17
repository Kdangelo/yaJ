package swing;

import javax.swing.*;

public class TextArea01 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textfield1;
    private JTextArea textarea1;
    private JScrollPane scrollpane1;
    
    public TextArea01() {
    	setLayout(null);
        textfield1 = new JTextField();
        textfield1.setBounds(10,10,200,30);
        add(textfield1);
        textarea1 = new JTextArea();
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(10,50,400,300);
        add(scrollpane1);
    }
    
    public static void main(String[] ar) {
    	TextArea01 ta1 = new TextArea01();
    	ta1.setBounds(0,0,540,400);
    	ta1.setVisible(true);
    } 
}

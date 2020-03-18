package listasTipoCola;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Supermercado extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel l1, l2, l3;
	private JButton boton1;
	
	public Supermercado() {
		setLayout(null);
        boton1=new JButton("Activar Simulaci�n");
        boton1.setBounds(10,10,180,30);
        add(boton1);
        boton1.addActionListener(this);
        l1=new JLabel("Clientes atendidos por caja:");
        l1.setBounds(10,50,400,30);
        add(l1);
        l2=new JLabel("Se marchan sin hacer compras:");
        l2.setBounds(10,90,400,30);
        add(l2);
        l3=new JLabel("Tiempo promedio en cola:");
        l3.setBounds(10,130,400,30);
        add(l3);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			simulacion();
		}	
	}
	
	public void simulacion() {
		int estado1 = 0, estado2 = 0, estado3 = 0;
		int marchan = 0;
		int llegada = 2 + (int)(Math.random() *2);
		int salida1 = -1, salida2 = -1, salida3 = -1;
		int cantAten1 = 0, cantAten2 = 0, cantAten3 = 0;
		int tiempoEnCola = 0;
		int cantidadEnCola = 0;
		Cola02 cola1 = new Cola02();
		Cola02 cola2 = new Cola02();
		Cola02 cola3 = new Cola02();
		for (int minuto = 0; minuto < 600; minuto++) {
			if (llegada == minuto) {
				if (estado1 == 0) {
					estado1 = 1;
					salida1 = minuto + 7 + (int)(Math.random() *5);
				} else {
					if (estado2 == 0) {
						estado2 = 1;
						estado2 = minuto + 7 + (int)(Math.random() *5); 
					} else {
						if (estado3 == 0) {
							estado3 = 1;
							estado3 = minuto + 7 + (int)(Math.random() *5);
						} else {
							if (cola1.cantidad() == 6 && cola2.cantidad() == 6 && cola3.cantidad() == 6) {
								marchan++;
							} else {
								if (cola1.cantidad() <= cola2.cantidad() && cola1.cantidad() <= cola3.cantidad()) {
									cola1.insertar(minuto);
								} else {
									if (cola2.cantidad() <= cola3.cantidad()) {
										cola2.insertar(minuto);
									} else {
										cola3.insertar(minuto);
									}
								}
							}
						}
					}
				}
				llegada = minuto + 2 + (int)(Math.random() *2); 
			}
			if (salida1 == minuto) {
				cantAten1++;
				estado1 = 0;
				if (!cola1.vacia()) {
					estado1 = 1;
					int m = cola1.extraer();
					salida1 = minuto + 7 + (int)(Math.random() *5);
					tiempoEnCola = tiempoEnCola + (minuto - m);
					cantidadEnCola++;
				}
			}
			if (salida2 == minuto) {
				cantAten2++;
				estado2 = 0;
				if (!cola2.vacia()) {
					estado2 = 1;
					int m = cola2.extraer();
					salida2 = minuto + 7 + (int)(Math.random() *5);
					tiempoEnCola = tiempoEnCola + (minuto - m);
					cantidadEnCola++;
				}
			}
			if (salida3 == minuto) {
				cantAten3++;
				estado3 = 0;
				if (!cola3.vacia()) {
					estado3 = 1;
					int m = cola3.extraer();
					salida3 = minuto + 7 + (int)(Math.random() *5);
					tiempoEnCola = tiempoEnCola + (minuto - m);
					cantidadEnCola++;
				}
			}
		}
		l1.setText("Clientes atendidos por caja: caja 1=" + cantAten1 + " caja 2=" + cantAten2 + " caja 3=" + cantAten3 );
		l2.setText("Se marchan sin hacer compras: " + marchan);
		if (cantidadEnCola > 0) {
			int tiempoPromedio = tiempoEnCola/cantidadEnCola;
			l3.setText("Tiempo promedio en cola: " + tiempoPromedio);
		}
	}
	
	public static void main(String[] args) {
		Supermercado super1 = new Supermercado();
		super1.setBounds(0,0,390,250);
        super1.setVisible(true);
	}
}
package listasTipoPila;

public class Pila {
	
	class Nodo {
		int dato;
		Nodo puntero;
	}
	
	private Nodo punteroRaiz;
	
	Pila() {
		punteroRaiz = null;
	}
	
	public void insertar(int x) {
		Nodo nuevoNodo = new Nodo();
		nuevoNodo.dato = x;
		if (punteroRaiz == null) {
			nuevoNodo.puntero = null;
			punteroRaiz = nuevoNodo;
		} else {
			nuevoNodo.puntero = punteroRaiz;
			punteroRaiz = nuevoNodo;
		}
	}
	
	public int extraer() {
		if (punteroRaiz != null) {
			int infoDato = punteroRaiz.dato;
			punteroRaiz = punteroRaiz.puntero;
			return infoDato;
		} else {
			return Integer.MAX_VALUE;
		}
		
	}
	
	public void imprimir() {
		Nodo record = punteroRaiz;
		System.out.println("Listado de todos los elementos de la pila.");
		while (record != null) {
			System.out.println(record.dato + "; ");
			record = record.puntero;
		} 
		System.out.println();
	}

	public static void main(String[] args) {
		Pila pila1 = new Pila();
		pila1.insertar(10);
		pila1.insertar(20);
		pila1.insertar(30);
		pila1.imprimir();
		System.out.println("Extraemos de la pila: " + pila1.extraer());
		pila1.imprimir();		
	}
}
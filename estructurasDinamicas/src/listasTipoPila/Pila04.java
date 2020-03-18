package listasTipoPila;

public class Pila04 {

	class Nodo {
		char simbolo;
		Nodo sig;
	}
	
	private Nodo raiz;
	
	public Pila04() {
		raiz = null;
	}
	
	public void insertar(char x) {
		Nodo nuevo = new Nodo();
		nuevo.simbolo = x;
		if (raiz == null) {
			nuevo.sig = null;
			nuevo = raiz;
		} else {
			nuevo.sig = raiz;
			nuevo = raiz;
		}
	}
	
	public char extraer() {
		if (raiz != null) {
			char informacion = raiz.simbolo;
			raiz = raiz.sig;
			return informacion;
		} else {
			return Character.MAX_VALUE;
		}
	}
	
	public boolean vacia() {
		if (raiz == null) {
			return true;
		} else {
			return false;
		}
	}
}
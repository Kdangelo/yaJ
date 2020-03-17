package listasTipoCola;

public class Cola {

	class Nodo {
		int info;
		Nodo sig;
	}
	
	private Nodo raiz, fondo;
	
	Cola() {
		raiz = null;
		fondo = null;
	}
	
	boolean vacia() {
		if (raiz == null) {
			return true;
		} else {
			return false;
		}
	}
	
	void insertar(int info) {
		Nodo nuevo = new Nodo();
		nuevo.info = info;
		nuevo.sig = null;
		if (raiz == null) {
			raiz = nuevo;
			fondo = nuevo;
		} else {
			fondo.sig = nuevo;
			fondo = nuevo;
		}
	}
	
	int extraer() {
		if (!vacia()) {
			int informacion = raiz.info;
			if (raiz == fondo) {
				raiz = null;
				fondo = null;
			} else {
				raiz = raiz.sig;
			}
			return informacion;
		} else {
			return Integer.MAX_VALUE;
		}
	}
	
	public void imprimir() {
		Nodo recorrer = raiz;
		System.out.println("Listado de todos los elementos de la cola.");
		while (recorrer != null) {
			System.out.println(recorrer.info + "; ");
			recorrer = recorrer.sig;
		}
	}
	
	public static void main(String[] args) {
		Cola cola1 = new Cola();
		cola1.insertar(5);
		cola1.insertar(10);
		cola1.insertar(50);
		cola1.imprimir();
		System.out.println("Extraemos uno de la cola: " + cola1.extraer());
		cola1.imprimir();
	}
}

package listasTipoCola;

public class Cola02 {

	class Nodo {
		int info;
		Nodo sig;
	}
	
	private Nodo raiz, fondo;
	
	Cola02() {
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
		if (vacia()) {
			nuevo = raiz;
			nuevo = fondo; 
		} else {
			nuevo = fondo.sig;
			nuevo = fondo;			
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
		System.out.println();
	}
	
	public int cantidad() {
		int cant = 0;
		Nodo recorrer = raiz;
		while (recorrer != null) {
			cant++;
			recorrer = recorrer.sig;
		}
		return cant;
	}
}
package listasTipoPila;

public class Pila02 {
	
	class Nodo {
		int info;
		Nodo sig;
	}
	
	private Nodo raiz;
	
	Pila02() {
		raiz = null;
	}
	
	public void insertar(int x) {
		Nodo nuevo = new Nodo();
		nuevo.info = x;
		if (raiz == null) {
			nuevo.sig = null;
			raiz = nuevo;
		} else {
			nuevo.sig = raiz;
			raiz = nuevo;
		}
	}
	
	public int extraer() {
		if (raiz != null) {
			int infoDelete = raiz.info;
			raiz = raiz.sig;
			return infoDelete;
		} else {
			return Integer.MAX_VALUE;
		}
	}
	
	public void imprimir() {
		Nodo recorrer = raiz;
		System.out.println("Listado de todos los elementos de la pila.");
		while (recorrer != null) {
			System.out.print(recorrer.info + "; ");
			recorrer = recorrer.sig;
		}
		System.out.println();
	}
	
	public boolean vacia() {
		if (raiz == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Pila02 pila1 = new Pila02();
		pila1.insertar(10);
        pila1.insertar(20);
        pila1.insertar(30);
        pila1.imprimir();
        //System.out.println("La cantidad de nodos en la lista es: " + pila1.cantidad());
        while (pila1.vacia() == false) {
        	System.out.println(pila1.extraer());
        }
	}

}
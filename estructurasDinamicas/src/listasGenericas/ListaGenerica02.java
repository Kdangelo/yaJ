package listasGenericas;

public class ListaGenerica02 {

	class Nodo {
		int info;
		Nodo sig;
	}
	
	private Nodo raiz;
	
	public ListaGenerica02() {
		raiz = null;
	}
	
	void insertarPrimero(int x) {
		Nodo nuevo = new Nodo();
		nuevo.info = x;
		nuevo.sig = raiz;
		raiz = nuevo;
	}
	
	public void insertarUltimo(int x) {
		Nodo nuevo = new Nodo();
		nuevo.info = x;
		if (raiz == null) {
			raiz = nuevo;
		} else {
			Nodo recorrer = raiz;
			while (recorrer.sig != null) {
				recorrer = recorrer.sig;
			}
			recorrer.sig = nuevo;
		}
	}
	
	public void insertarSegundo(int x) {
		if (raiz != null) {
			Nodo nuevo = new Nodo();
			nuevo.info = x;
			if (raiz.sig == null) {
				raiz.sig = nuevo;
			} else {
				nuevo.sig = raiz.sig;
				nuevo.sig = raiz;
			}
		}
	}
	
	public void insertarAnteUltimo(int x) {
		if (raiz != null) {
			Nodo nuevo = new Nodo();
			nuevo.info = x;
			if (raiz.sig == null) {
				nuevo.sig = raiz;
				raiz = nuevo;
			} else {
				Nodo atras = raiz;
				Nodo reco = raiz.sig;
				while (reco.sig != null) {
					atras = reco;
					reco = reco.sig;
				}
				nuevo.sig = atras.sig;
				atras.sig = nuevo;
			}
		}
	}
	
	public void borrarPrimero() {
		if (raiz != null) {
			raiz = raiz.sig;
		}
	}
	
	public void borrarSegundo() {
		if (raiz != null) {
			if (raiz.sig != null) {
				Nodo tercero = raiz.sig;
				tercero = tercero.sig;
				raiz.sig = tercero;
			}
		}
	}
	
	public void borrarUltimo() {
		if (raiz != null) {
			if (raiz.sig == null) {
				raiz = null;
			} else {
				Nodo reco = raiz.sig;
				Nodo atras = reco;
				while (reco.sig != null) {
					atras = reco;
					reco = reco.sig;
				}
				atras.sig = null;
			}
		}
	}
	
	public void imprimir() {
		Nodo reco = raiz;
		while (reco != null) {
			System.out.println(reco.info);
			reco = reco.sig;
		}
		System.out.println();
	}
	
	public void borraMayor() {
		if (raiz != null) {
			Nodo reco = raiz;
			int may = raiz.info;
			while (reco != null) {
				if (reco.info > may) {
					may = reco.info;
				}
				reco = reco.sig;
			}
			reco = raiz;
			Nodo atras = raiz;
			while (reco != null) {
				if (reco.info == may) {
					if (reco == raiz) {
						raiz = raiz.sig;
						atras = raiz;
						reco = raiz;
					} else {
						atras.sig = reco.sig;
						reco = reco.sig;
					}
				} else {
					atras = reco;
					reco = reco.sig;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		ListaGenerica02 lg = new ListaGenerica02();
        lg.insertarPrimero(10);
        lg.insertarPrimero(45);
        lg.insertarPrimero(23);
        lg.insertarPrimero(89);
        lg.imprimir();
        System.out.println("Insertamos un nodo al final: ");
        lg.insertarUltimo(160);
        lg.imprimir();
	}
}

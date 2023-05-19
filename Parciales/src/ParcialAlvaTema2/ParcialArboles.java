package ParcialAlvaTema2;

import ejercicio1.ArbolBinario;

public class ParcialArboles {
	private ArbolBinario<Integer> arbol;

	public ParcialArboles(ArbolBinario<Integer> arbol) {
		this.arbol = arbol;
	}
	
	
	public Boolean isTwoTree(int num) {
		ArbolBinario<Integer> aux;
		
		//int totHI = 0;
		//int totHD = 0;
		//analizar bien la linea de codigo siguiente
		aux = buscar(this.arbol, num);
		boolean encontre = false;
		/*
		while(!aux.esHoja()) {	
			//si no encuentro, retorno false
			if(!encontre) {
				return false;
			}
			if(encontre == true) {
			
				if(aux.tieneHijoIzquierdo()) { //si tiene hijo izquierdo cuento por sus hizq
					if(cont(aux.getHijoIzquierdo()) == cont(aux.getHijoDerecho())) {
						totHI++;
					}
				}
				if(aux.tieneHijoDerecho()) {//si tiene hijo derecho, cuento por sus hder
					if(cont(aux.getHijoIzquierdo()) == cont(aux.getHijoDerecho())) {
						totHD++;
					}
				}
			}		
		}
		
		//si cumple, retorno true, sino false
		if(totHI == totHD) {
			return true;
		
		}else
			
			return false;
	}
	*/
		if(!aux.esVacio()) {
			encontre = (cont(aux.getHijoIzquierdo()) == cont(aux.getHijoDerecho()));
		}
		return encontre;
	}	
		
	
	/*recorre todo el arbol y me devuelve si encontro el dato
	private ArbolBinario<Integer> buscar(ArbolBinario<Integer> arbol, int num, boolean ok) {
		if(!arbol.esVacio()) {
			ok = false;
		}
		if(arbol.getDato() == num) {
			ok = true;
		}
		if(arbol.tieneHijoIzquierdo())
			arbol = buscar(arbol.getHijoIzquierdo(), num, ok);
		if(arbol.tieneHijoDerecho())
			arbol = buscar(arbol.getHijoDerecho(), num, ok);
		
		return arbol;
	}
	
	*/
	//metodo de compañero(el problema no es aca)
	private ArbolBinario<Integer> buscar(ArbolBinario<Integer> arbol, int num) {
		ArbolBinario<Integer> aux = new ArbolBinario<Integer>();
		if(arbol.getDato() == num) {
			aux = arbol;
		}
		if(arbol.tieneHijoIzquierdo())
			aux = buscar(arbol.getHijoIzquierdo(), num);
		if(arbol.tieneHijoDerecho())
			aux = buscar(arbol.getHijoDerecho(), num);
		
		return aux;
	}
	
	
	//cuenta la cant de nodos con ambos hijos, resta los que son -1 y retorna la cant
	private int cont(ArbolBinario<Integer> aux) {
	
		if(aux.esHoja()) {
			return -1; //condicion de -1 si no tiene hijos
		}
		int cant = 0;
		
		if(!aux.esHoja())	
			if(aux.tieneHijoIzquierdo() && aux.tieneHijoDerecho()) {
				cant++;
			}
			if(aux.tieneHijoIzquierdo()) {
				cant += cont(aux.getHijoIzquierdo());
			}
			if(aux.tieneHijoDerecho()) {
				cant += cont(aux.getHijoDerecho());
			}
	return cant;	
	}
	
}

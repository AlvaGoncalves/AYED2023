package ejercicio1;

import ejercicio3.ColaGenerica;

public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;   
	private ArbolBinario<T> hijoDerecho; 

	
	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
	
	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	 
	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo!=null;
	}

	 
	public boolean tieneHijoDerecho() {
		return this.hijoDerecho!=null;
	}

	public int contarHojas() {
		int total = 0;
		if(this.esVacio()) {
			return 1;
		}else { 
			/*return (1 + this.getHijoIzquierdo().contarHojas()
					+ this.getHijoDerecho().contarHojas());
			*/
			if(this.tieneHijoIzquierdo()) {
				total = total + this.getHijoIzquierdo().contarHojas();
			}
			if(this.tieneHijoDerecho()) {
				total = total + this.getHijoDerecho().contarHojas();
			}
		}
		return total;
	}
	
	
	
    public ArbolBinario<T> espejo() {
		ArbolBinario<T> arbol = new ArbolBinario<T>();
    	
    	if(this.esVacio()) {
			return null;
		}else {
		
			if(this.tieneHijoDerecho()) {
				arbol.agregarHijoIzquierdo(this.getHijoIzquierdo().espejo());
			}
			if(this.tieneHijoIzquierdo()) {
				arbol.agregarHijoDerecho(this.getHijoDerecho().espejo());;
			}
		}
    	return arbol;
	}

//ver video pseudocodigo para refrescar el algoritmo
	public void entreNiveles(int n, int m){
		ArbolBinario<T> Arbol = null;
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		cola.encolar(this);
		cola.encolar(null); //tengo el primer nodo
		int nivel = 0;
		while(!cola.esVacia() && (nivel <= m)) {
			Arbol = cola.desencolar();
			if(Arbol != null) {
				if(nivel >= n)
					System.out.println(Arbol.getDato());
				if(Arbol.tieneHijoIzquierdo())
					cola.encolar(Arbol.getHijoIzquierdo());
				if(Arbol.tieneHijoDerecho())
					cola.encolar(Arbol.getHijoDerecho());			
			}else if(!cola.esVacia())
					cola.encolar(null);
					nivel++;
		}
		
	}

	

}

package Parcial11agusrnfr;

import ejercicio1.ArbolBinario;
import tp03.ejercicio3.ColaGenerica;

public class Parcial {

	public boolean esArbolCreciente(ArbolBinario<Integer> arbol) {
		ColaGenerica<ArbolBinario<Integer>> cola = new ColaGenerica<ArbolBinario<Integer>>();
		ArbolBinario<Integer> aux = new ArbolBinario<Integer>();
		boolean esCreciente = true;
		int cantNxNivel = 0;
		int cantH = 1;
		cola.encolar(arbol);
		cola.encolar(null);
		while(!cola.esVacia()) { //ya que termino de iterar cuando me quedo sin datos del arbol
			aux = cola.desencolar();
			if(aux != null) {//la primera vez entra ACA
				if(aux.tieneHijoIzquierdo()) {
					cantH++;
					cola.encolar(aux.getHijoIzquierdo());
				}
				if(aux.tieneHijoDerecho()) {
					cantH++;
					cola.encolar(aux.getHijoDerecho());	
				}
				if(cantNxNivel >= cantH) {
					return false;
				}
			}else {
				if(cola.esVacia()) {
					cantNxNivel++; //si el nivel es 0, cant de nodos es 1, si es 1, la cant de nodos es 2, y asi sucesivamente
					cola.encolar(null); //salto de nivel
				}
			}
		}
		return esCreciente;
	}
		
}

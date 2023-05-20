package Parcial4agusrnfr;

import ejercicio1.ArbolGeneral;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class Parcial {
	private ArbolGeneral<Integer> arbol;
	
	public Parcial(ArbolGeneral<Integer> arbol) {
		this.arbol = arbol;
	}
	
	public ListaGenerica<Integer> devolverCaminoMasLejano(){
		ListaEnlazadaGenerica<Integer> actual = new ListaEnlazadaGenerica<Integer>();
		ListaEnlazadaGenerica<Integer> maximo = new ListaEnlazadaGenerica<Integer>();
		recorrer(arbol, actual, maximo);
		return maximo;
	}
	
	
	private void recorrer(ArbolGeneral<Integer> a, ListaEnlazadaGenerica<Integer> max, ListaEnlazadaGenerica<Integer> actual ) {
	 if(!a.esVacio()) {	
		actual.agregarInicio(a.getDato());
		
		if(a.esHoja()) {
			if(actual.tamanio() > max.tamanio()) {
				clonar(max, actual);
			}
		}
		else {
			ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
			hijos.comenzar();
			while(!hijos.fin()) {
				recorrer(hijos.proximo(), max, actual);
				//elimino si me muevo para atras, ya que es otro camino
				actual.eliminarEn(actual.tamanio());
			}
		}
	 }	
	}
	
	
	private void clonar(ListaEnlazadaGenerica<Integer> max, ListaEnlazadaGenerica<Integer> actual) {
		
		//elimino todos los datos de max
		max.comenzar();
		while(!max.fin()) {
			max.eliminar(max.proximo());
		}
		
		//con max ya eliminado copio todos los datos de actual en este
		actual.comenzar();
		while(!actual.fin()) {
			max.agregarFinal(actual.proximo());
		}
	}
	
	
}

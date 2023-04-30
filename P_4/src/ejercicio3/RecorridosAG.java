package ejercicio3;

import ejercicio1.ArbolGeneral;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp03.ejercicio3.ColaGenerica;

public class RecorridosAG {

	
	public ListaGenerica<Integer> numerosImparesMayoresQuePreOrden(ArbolGeneral<Integer> a, Integer n){
		ListaEnlazadaGenerica<Integer> L = new ListaEnlazadaGenerica<Integer>();
		this.preOrden(L, a, n);
		return L;
	}
	
	private void preOrden(ListaEnlazadaGenerica<Integer> L, ArbolGeneral<Integer> a, Integer n) {
		if((a.getDato() % 2 == 1) && (a.getDato() > n)) {
			L.agregarFinal(a.getDato());
		}
		ListaGenerica<ArbolGeneral<Integer>> lhijos = a.getHijos();
		lhijos.comenzar();
		while(!lhijos.fin()) {
			preOrden(L, a.getHijos().proximo(), n);				
		}
	}
	
	
	public ListaGenerica<Integer> numerosImparesMayoresQuePostOrden(ArbolGeneral<Integer> a, Integer n){
		ListaEnlazadaGenerica<Integer> L = new ListaEnlazadaGenerica<Integer>();
		this.postOrden(L, a, n);
		return L;
	}	
	
	private void postOrden(ListaEnlazadaGenerica<Integer> L, ArbolGeneral<Integer> a, Integer n) {
		if(a.tieneHijos()) {	
			ListaGenerica<ArbolGeneral<Integer>> lhijos = a.getHijos();
			lhijos.comenzar();
			while(!lhijos.fin()) {
				postOrden(L, a.getHijos().proximo(), n);
			}
		}else if((a.getDato() % 2 == 1) && (a.getDato() > n)) {
				L.agregarFinal(a.getDato());	
		}
		
	}

	
	public ListaGenerica<Integer> numerosImparesMayoresQueInOrden(ArbolGeneral<Integer> a, Integer n){
		ListaEnlazadaGenerica<Integer> L = new ListaEnlazadaGenerica<Integer>();
		this.inOrden(L, a, n);
		return L;
	}
	
	private void inOrden(ListaEnlazadaGenerica<Integer> L, ArbolGeneral<Integer> a, Integer n) {
		ListaGenerica<ArbolGeneral<Integer>> lhijos = a.getHijos();
		lhijos.comenzar();
		if(!lhijos.esVacia()) {
			inOrden(L, a.getHijos().proximo(), n);
		}
		if((a.getDato() % 2 == 1) && (a.getDato() > n)) {
			L.agregarFinal(a.getDato());
		}
		while(!lhijos.fin()) {
			inOrden(L, a.getHijos().proximo(), n);
		}
	}
	
	
	
	
	public ListaGenerica<Integer> numerosImparesMayoresQuePorNiveles(ArbolGeneral<Integer> a, Integer n){
		ArbolGeneral<Integer> aux;
		ListaGenerica<ArbolGeneral<Integer>> hijos;
		ListaGenerica<Integer> L = new ListaEnlazadaGenerica<Integer>();
		ColaGenerica<ArbolGeneral<Integer>> cola = new ColaGenerica<ArbolGeneral<Integer>>();
		cola.encolar(a);
		while(!cola.esVacia()) {
			aux = cola.desencolar();
			if((aux.getDato() % 2 == 1) && (aux.getDato() > n)) {
				L.agregarFinal(aux.getDato());
			}
			if(aux.tieneHijos()) {
				hijos = aux.getHijos();
				hijos.comenzar();
				while(!hijos.fin()) {
					cola.encolar(hijos.proximo());
				}
			}
		}
		return L;	
	}
}

package ejercicio1;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
//import tp03.ejercicio3.ColaGenerica;

public class ArbolGeneral<T> {

	private T dato;

	private ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public void setHijos(ListaGenerica<ArbolGeneral<T>> hijos) {
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ArbolGeneral(T dato) {
		this.dato = dato;
	}

	public ArbolGeneral(T dato, ListaGenerica<ArbolGeneral<T>> hijos) {
		this(dato);
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ListaGenerica<ArbolGeneral<T>> getHijos() {
		return this.hijos;
	}

	public void agregarHijo(ArbolGeneral<T> unHijo) {

		this.getHijos().agregarFinal(unHijo);
	}

	public boolean esHoja() {

		return !this.tieneHijos();
	}
	
	public boolean tieneHijos() {
		return !this.hijos.esVacia();
	}
	
	public boolean esVacio() {

		return this.dato == null && !this.tieneHijos();
	}

	

	public void eliminarHijo(ArbolGeneral<T> hijo) {
		if (this.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
			if (hijos.incluye(hijo)) 
				hijos.eliminar(hijo);
		}
	}
	
	public ListaEnlazadaGenerica<T> preOrden() {
		return null;
	}
	/*
	                   1
				   /   |   \ 
	*			  3    7    10
	*			/  |   |   / | \
	*		   8   2   5  6  4  20
	*				   |
	*				   9	 
	*/
	
	public Integer altura() {
		int altura = -1;
		if(this.esHoja()) 
			return 0;
		if(this.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> lhijos = this.getHijos();
			lhijos.comenzar();
			while(!lhijos.fin()) {
				altura = Math.max(altura, lhijos.proximo().altura());
			}
		}
		return altura + 1;//cada vez que invoco a los hijos se suma de a uno y compara, lo que recursivamente va a generar que se vaya haciendo el calculo solo
	}
	
	/*	
		int h = 0;
		ArbolGeneral<T> aux;
		ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>();
		cola.encolar(this);
		cola.encolar(null);
		h++;
		while(!cola.esVacia()) {
			aux = cola.desencolar();
			if((aux != null)&&(aux.tieneHijos())) {
				h++;
				ListaGenerica<ArbolGeneral<T>> hijos = aux.getHijos();
				hijos.comenzar();
				while(!hijos.fin()) {
					cola.encolar(hijos.proximo());
				}
			}else {
				if(aux == null) {
					
				}
			}
		}
	}
	*/
	
	public Integer nivel(T dato) {
		// falta implementar
		return -1;
	}

	public Integer ancho() {
		// Falta implementar..
		return 0;
	}

}
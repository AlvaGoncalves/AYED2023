package Parcialimagenes;

import ejercicio1.ArbolGeneral;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp03.ejercicio3.ColaGenerica;

public class Parcial {
	ArbolGeneral<Recurso> a;
	
	public Parcial(ArbolGeneral<Recurso> a) {
		this.a = a;
	}
	
	public ListaGenerica<Recurso> calcular(ArbolGeneral<Recurso> a, int n) {
		int nivelActual = 0;
		ArbolGeneral<Recurso> aux;
		ListaGenerica<Recurso> result = new ListaEnlazadaGenerica<Recurso>();
		ColaGenerica<ArbolGeneral<Recurso>> cola = new ColaGenerica<ArbolGeneral<Recurso>>();
		cola.encolar(a);
		cola.encolar(null);
		nivelActual++;
		while(!cola.esVacia() && nivelActual <= n) {
			aux = cola.desencolar();

			if(aux != null) {
				if(nivelActual == n && aux.getDato().esImagen()) {
					result.agregarFinal(aux.getDato());
				if(aux.tieneHijos()) {
					ListaGenerica<ArbolGeneral<Recurso>> hijos = aux.getHijos();
					hijos.comenzar();
					while(!hijos.fin()) {
							cola.encolar(hijos.proximo()); //no agrego aca pq solo me interesan las imagenes y no los directorios
						}								   //directorios = nodos internos, imagenes = hojas
					}
				}	
			}
			else
				if(!cola.esVacia()) {
					cola.encolar(null);
					nivelActual++;
					if(nivelActual > n) {
						return result;
					}
					
				}
		}
		return result;	
	}	
}

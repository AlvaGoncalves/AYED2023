package Parcial6agusrnfr;

import ejercicio1.ArbolBinario;
import tp03.ejercicio3.ColaGenerica;

public class Parcial {
	
	public void colorearArbol(ArbolBinario<String> arbol, int maxColor) {
		ColaGenerica<ArbolBinario<String>> cola = new ColaGenerica<ArbolBinario<String>>();
		ArbolBinario<String> aux;
		
		cola.encolar(arbol);
		cola.encolar(null);
		
		int cant = 0;
		String color = "negro";
		while(!cola.esVacia()) {
			aux = cola.desencolar();
			
			if(aux != null) {
				
				cant++; //hacerlo antes de la condicion si o si
				if(cant > maxColor) {
					color = "verde";
				}
				
				aux.setDato(color);
					
				if(aux.tieneHijoIzquierdo()) {
					aux.getHijoIzquierdo().setDato(color);
					cola.encolar(aux.getHijoIzquierdo());
				}
				if(aux.tieneHijoDerecho()) {
					aux.getHijoDerecho().setDato(color);
					cola.encolar(aux.getHijoDerecho());
					
				}
					
					/*
					if(aux.tieneHijoIzquierdo()) {
						if(aux.getDato() == "negro") {
							aux.getHijoIzquierdo().setDato("Rojo");
							cola.encolar(aux.getHijoIzquierdo());
							cant++;
						}
						if(aux.getDato() == "rojo") {
							aux.getHijoIzquierdo().setDato("Negro");
							cola.encolar(aux.getHijoIzquierdo());
							cant++;
						}
					
				}
					if(aux.tieneHijoDerecho()) {
						if(aux.getDato() == "negro") {
							aux.getHijoIzquierdo().setDato("Rojo");
							cola.encolar(aux.getHijoIzquierdo());
							cant++;
						}
						if(aux.getDato() == "rojo") {
							aux.getHijoDerecho().setDato("Negro");
							cola.encolar(aux.getHijoDerecho());
							cant++;
						}
					}
					*/
				
			}else
				if(!cola.esVacia()) {
					cola.encolar(null);
					cant = 0;
					if(color == "negro")
						color = "rojo";
					else	
						if(color == "rojo")
							color = "negro";
				}	
		}
	}
	
	
}

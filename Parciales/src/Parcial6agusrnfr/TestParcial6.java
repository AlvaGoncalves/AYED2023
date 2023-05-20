package Parcial6agusrnfr;

import ejercicio1.ArbolBinario;
import tp03.ejercicio3.ColaGenerica;

public class TestParcial6 {

	public static void recorrerArbol(ArbolBinario<String> a) {
		ColaGenerica<ArbolBinario<String>> cola = new ColaGenerica<ArbolBinario<String>>();
		ArbolBinario<String> aux;
		
		cola.encolar(a);
		while (!cola.esVacia()) {
			aux = cola.desencolar();
			System.out.println(aux.getDato());
			if (aux.tieneHijoIzquierdo())
				cola.encolar(aux.getHijoIzquierdo());
			if (aux.tieneHijoDerecho())
				cola.encolar(aux.getHijoDerecho());
		}
	}	
	
	
	public static void main(String[] args) {
		ArbolBinario<String> a = new ArbolBinario<String>("blanco");
		ArbolBinario<String> b = new ArbolBinario<String>("blanco");
		ArbolBinario<String> c = new ArbolBinario<String>("blanco");
		ArbolBinario<String> d = new ArbolBinario<String>("blanco");
		ArbolBinario<String> e = new ArbolBinario<String>("blanco");
		ArbolBinario<String> f = new ArbolBinario<String>("blanco");
		ArbolBinario<String> g = new ArbolBinario<String>("blanco");
		ArbolBinario<String> h = new ArbolBinario<String>("blanco");
		ArbolBinario<String> i = new ArbolBinario<String>("blanco");
		ArbolBinario<String> j = new ArbolBinario<String>("blanco");
		
		
		a.agregarHijoIzquierdo(b);
		a.agregarHijoDerecho(c);
		
		b.agregarHijoIzquierdo(d);
		b.agregarHijoDerecho(e);
		
		c.agregarHijoIzquierdo(f);
		c.agregarHijoDerecho(g);	
		
		Parcial p = new Parcial();
		
		p.colorearArbol(a, 3);
		System.out.println("ARBOL");
		
		recorrerArbol(a);
		
		
	}

}

package ejercicio3P3;

import ejercicio1.ArbolBinario;
import ejercicio2.ListaGenerica;

public class ContadorArbol {
	private ArbolBinario<Integer> a = new ArbolBinario<Integer>();
	
	public ListaGenerica<Integer> numerosParesIn(ArbolBinario<Integer> arbol, ListaGenerica<Integer> l){
		if(arbol.tieneHijoIzquierdo())
			numerosParesIn(arbol.getHijoIzquierdo(), l);
		if((arbol.getDato() / 2  == 0))
			l.agregarInicio(arbol.getDato());
		if(arbol.tieneHijoDerecho())
			numerosParesIn(arbol.getHijoDerecho(), l);
		
		
		return l;
	}
	
	public ListaGenerica<Integer> numerosParesPost(ArbolBinario<Integer> arbol, ListaGenerica<Integer> l){
		if(arbol.tieneHijoIzquierdo())
			numerosParesPost(arbol.getHijoIzquierdo(), l);
		if(arbol.tieneHijoDerecho())
			numerosParesPost(arbol.getHijoDerecho(), l);
		if((arbol.getDato() / 2  == 0))
			l.agregarInicio(arbol.getDato());
		
		
		return l;
	}
	
}

package ejercicio5;

import ejercicio1.ArbolBinario;
import ejercicio3.ColaGenerica;

public class ProfundidadDeArbolesBinarios {
	private ArbolBinario<Integer> a = new ArbolBinario<Integer>();
	
	
	public int sumaElementosProfundidad(int p) {
		ColaGenerica<ArbolBinario<Integer>> cola = new ColaGenerica<ArbolBinario<Integer>>();
		ArbolBinario<Integer> aux = null;
		int tot = 0;
		int pos = 0;
		cola.encolar(a);
		cola.encolar(null);
		tot += a.getDato();
		pos++;
		while((!cola.esVacia()) && (pos <= p)){
			aux = cola.desencolar();
			if(aux != null) {
				if(aux.tieneHijoIzquierdo()) {
					tot += aux.getHijoIzquierdo().getDato();
					cola.encolar(aux.getHijoIzquierdo());
				}	
				if(aux.tieneHijoDerecho()) {
					tot += aux.getHijoDerecho().getDato();
					cola.encolar(aux.getHijoDerecho());
				}
			}else
				if(!cola.esVacia()) {
					System.out.println();
					cola.encolar(null);
				}
				pos++;
		}
		return tot;	
	}
}

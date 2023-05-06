package Parcial2agusrnfr;

import ejercicio1.ArbolBinario;

public class Parcial {
	
	public Integer sumaImparesPosOrderMayorA(ArbolBinario<Integer> a, int limite) {
		int tot = -1;
		if(a.esVacio()) {
			return tot;
		}else {
			tot = sumador(a,limite);
		}
		return tot;
	}
	
	
	private Integer sumador(ArbolBinario<Integer> a, int limite) {
		int suma = 0;
		if(a.tieneHijoIzquierdo()) {
			suma += sumador(a.getHijoIzquierdo(), limite);
		}
		if(a.tieneHijoDerecho()) {
			suma += sumador(a.getHijoDerecho(), limite);
		}
		
		if((a.getDato() % 2 == 1) && (suma > limite)) {
			suma += a.getDato();
		}
		return suma;
	}
	
}

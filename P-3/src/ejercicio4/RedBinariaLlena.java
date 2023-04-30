package ejercicio4;

import ejercicio1.ArbolBinario;

public class RedBinariaLlena {
	private ArbolBinario<Integer> a = new ArbolBinario<Integer>();

	public int retardoReenvio() {
		return maxRetardo(a);
	}
	
	public int maxRetardo(ArbolBinario<Integer> a) {
		if(a.esHoja())
			return a.getDato();
		else {
				return a.getDato() + Math.max(maxRetardo(a.getHijoIzquierdo()), maxRetardo(a.getHijoDerecho()));
		}
		
	}
}

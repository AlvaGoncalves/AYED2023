package ParcialAlvaTema1;

import ejercicio1.ArbolBinario;

public class ParcialArboles {
	private ArbolBinario<Integer> A;
	
	public ParcialArboles(ArbolBinario<Integer> A) {
		this.A = A;
	}
	
	
	/* 
	 * 					31
	 * 				num
	 * 			3	     44  
	 * 		77    8         17 
	 * 	13	  19	4	  3    10
	 * 	  2                1      3
 	 *
 	 * en este caso seria false pq en el arbol izq de num hay 2 hijos derechos unicos
 	 * y en el caso del sub arbol derecho de num hay 3 hijos derechos unicos
 	 * 
 	 * no se cumple -> cantHI > cantHD
 	 */
	
	
	public boolean isLeftTree(int num) {
		if(A.esHoja() || A.esVacio())
			return false;
		
		ArbolBinario<Integer> aux = buscar(A, num); //busco el dato y guardo el sub-arbol
		int cantHD = 0, cantHI = 0;
		
		if(aux.getDato() == num) { //si lo encuentro empiezo el conteo (inicializo las variables)
			cantHI = -1;   //-1 pq se le van a sumar la cant hijos
			cantHD = -1;
			
			if(aux.tieneHijoIzquierdo())
				cantHI += contar(aux.getHijoIzquierdo());
			
			if(aux.tieneHijoDerecho())
				cantHD += contar(aux.getHijoDerecho());
			
			return (cantHI > cantHD);
		
		}else
		     return false;
	}
	
	private ArbolBinario<Integer> buscar(ArbolBinario<Integer> A, int num) {
		ArbolBinario<Integer> encontrado = null; //arbol aux que utilizo para poder devolver los datos correctamente
		
		if(A.getDato() == num) { //si lo encuentro devuelvo el sub-arbol con la raiz
			encontrado = A; 
			return encontrado;
		}	
		if(A.tieneHijoIzquierdo()) //sino sigo por los hijos izquierdos
					encontrado = buscar(A.getHijoIzquierdo(), num);	
		if(encontrado == null && A.tieneHijoDerecho()) // no se si es necesario el null????????
					encontrado = buscar(A.getHijoDerecho(), num);
			
		return encontrado;
	}	
			
	
	
	private int contar(ArbolBinario<Integer> a) {
		if(A.esHoja()) //si es hoja no puedo hacer calculos con los hijos 
			return 0;
		int cont = 0;
		
		//si no es hoja empiezo un postOrden
		
		if(a.tieneHijoIzquierdo())//cuento hi e hd para atras analizando la condicion como caso base 
			cont += contar(a.getHijoIzquierdo());
		if(a.tieneHijoDerecho())
			cont += contar(a.getHijoDerecho());
		//si va por los hi los suma y los duevuelve, lo mismo con los hijos derechos
		if((a.tieneHijoDerecho() && !a.tieneHijoIzquierdo()) || (a.tieneHijoIzquierdo() && a.tieneHijoDerecho()))
			cont++;
		
		return cont;
	}
	
}

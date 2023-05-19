package ParcialAlvaTema2;

import ejercicio1.ArbolBinario;

public class TestParcialArboles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArbolBinario<Integer> a = new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> b = new ArbolBinario<Integer>(2);
		ArbolBinario<Integer> c = new ArbolBinario<Integer>(3);
		ArbolBinario<Integer> d = new ArbolBinario<Integer>(4);
		ArbolBinario<Integer> e = new ArbolBinario<Integer>(5);
		ArbolBinario<Integer> f = new ArbolBinario<Integer>(6);
	
		
		
		a.agregarHijoIzquierdo(b); 
		a.agregarHijoDerecho(c);  
		
		b.agregarHijoIzquierdo(d); 
		b.agregarHijoDerecho(e);
		
		c.agregarHijoIzquierdo(f);

		
		/*					 1
		 *				  /    \			
		 * 				2	    3
		 * 			  /   \    /
		 * 			3      5  6
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		int n = 2;
		
		ParcialArboles p = new ParcialArboles(a);
		System.out.println("Decir que el nodo "+n+" es twoFreeTree es: "+p.isTwoTree(n));
		
	}

}

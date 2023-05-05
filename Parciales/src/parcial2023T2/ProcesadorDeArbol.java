package parcial2023T2;

import ejercicio1.ArbolBinario;

public class ProcesadorDeArbol {
	private ArbolBinario<Integer> a = new ArbolBinario<Integer>();
	
	public Objeto procesar() {
		Objeto o = new Objeto();
		if(!a.esVacio())
			return null;
		else {
			procesar(o, a);
			return o;
		}
	}
	
	private void procesar(Objeto o, ArbolBinario<Integer> a) {
		if(!a.esHoja()) {
			if(a.tieneHijoIzquierdo()) {
				procesar(o, a.getHijoIzquierdo());
			}
			if(a.tieneHijoDerecho()) {
				procesar(o, a.getHijoDerecho());
			}
			if(a.getDato() % 2 == 1) {
				o.aumentarImp();
				if(((a.tieneHijoIzquierdo()) && (!a.tieneHijoDerecho())) || ((!a.tieneHijoIzquierdo()) && (a.tieneHijoDerecho()))) {
					o.getL().agregarInicio(a.getDato());
				}
			}
		}else {
			System.out.print("no aplica a este nodo");
		}
		
	}
	
}

package parcial2023T1;
import ejercicio1.ArbolBinario;

public class ProcesadorDeArbol {
	private ArbolBinario<Integer> a = new ArbolBinario<Integer>();
	
	public Resultado procesar() {
		Resultado r = new Resultado();// tengo que hacer r = null? 
		if(a.esVacio()) //duda this o a.esVacio()
			return null;
		else {
			procesar(r, a);
			return r;
		}
	}
	
	private void procesar(Resultado r, ArbolBinario<Integer> a) {
		if(!a.esHoja()) {
			if(a.getDato() % 2 == 0){//si es par aumento
				r.aumentarPares();//hace cantp++
		
				if((a.tieneHijoDerecho() && a.tieneHijoIzquierdo())) //si es par y tiene 2 hijos agrego a lista
					r.getPares().agregarInicio(a.getDato());
			else { 	
				if(a.tieneHijoIzquierdo()) { //sino sigo recorriendo hasta que termine
					procesar(r, a.getHijoIzquierdo());
				}
				if(a.tieneHijoDerecho()) {
					procesar(r, a.getHijoDerecho());
				}
			}
			}	
		}
	}
}	


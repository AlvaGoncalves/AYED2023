package parcial2023T1;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class Resultado {
	private ListaGenerica<Integer> pares = new ListaEnlazadaGenerica<Integer>();
	private int cantP = 0;
	
	
	
	public int getCantP() {
		return cantP;
	}
	public void setCantP(int cantP) {
		this.cantP = cantP;
	}
	public ListaGenerica<Integer> getPares() {
		return pares;
	}
	public void setPares(ListaGenerica<Integer> pares) {
		this.pares = pares;
	}
	
	public void aumentarPares() {
		this.cantP++;
	}
	
}


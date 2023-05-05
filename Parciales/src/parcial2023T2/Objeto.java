package parcial2023T2;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class Objeto {
	private ListaGenerica<Integer> l = new ListaEnlazadaGenerica<Integer>();
	private int cantI = 0;
	
	/*
	 * solo si calculo como variables separas y las paso utilizo este constructor 
	 * 
	public Objeto(int cantI, ListaGenerica<Integer> L ) {
		this.setCantI(cantI);
		this.setL(L);
	}
	*/

	public void aumentarImp() {
		this.cantI++;
	}
	
	public ListaGenerica<Integer> getL() {
		return l;
	}


	public void setL(ListaGenerica<Integer> l) {
		this.l = l;
	}


	public int getCantI() {
		return cantI;
	}


	public void setCantI(int cantI) {
		this.cantI = cantI;
	}
	
	
}

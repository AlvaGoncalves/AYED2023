package ejercicio7;

import ejercicio1.ArbolGeneral;
import tp02.ejercicio2.ListaGenerica;

public class RedDeAguaPotable {
	private ArbolGeneral<Integer> a;
	
	public double minimoCaudal(double caudal) {
		double min = 99999;
		return minimoCaudal(a, caudal, min);
	}	
	
	private double minimoCaudal(ArbolGeneral<Integer> a, double caudal, double min) {
		//double min = 999999;
		if(a.esHoja()) {
			return caudal;
		}
		else
			if(a.tieneHijos()) {
				ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
				hijos.comenzar();
				while(!hijos.fin()) {
						min = Math.min(min, minimoCaudal(hijos.proximo(), caudal / hijos.tamanio(), min));
				}	
			}
	    return min;
	}
}


package ParcialGematrica;

import ejercicio1.ArbolGeneral;
import tp02.ejercicio2.ListaGenerica;

public class ProcesadorGramatical {
	
	public int contar(ArbolGeneral<Integer> a, int valor) {
		int cont = 0;
		if(a.esHoja() || a.getDato() == 0) {
			return 0;
		}
		else {
			if(a.getDato() >= valor) { //comparo con valor para ver si tengo que seguir recorriendo o directamente retorno
				return cont;
			}
			ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
			hijos.comenzar();
			while(!hijos.fin()) {
				cont += contar(hijos.proximo(), valor);
			}
		}
		return cont;
	}
}


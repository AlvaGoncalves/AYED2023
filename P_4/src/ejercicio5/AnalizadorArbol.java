package ejercicio5;

import ejercicio1.ArbolGeneral;
import tp02.ejercicio2.ListaGenerica;
import tp03.ejercicio3.ColaGenerica;

public class AnalizadorArbol {

	
	
	public int devolverMaximoPromedio(ArbolGeneral<AreaEmpresa> arbol) {
		ColaGenerica<ArbolGeneral<AreaEmpresa>> cola = new ColaGenerica<ArbolGeneral<AreaEmpresa>>();
		ArbolGeneral<AreaEmpresa> aux;
		int tot = 0;
		int cant = 0;
		int maxP = -1;
		
		cola.encolar(arbol);
		cola.encolar(null);
		
		while(!cola.esVacia()) {
			
			aux = cola.desencolar();
			
			if(aux != null) {
				
				tot += aux.getDato().getTardanza();
				cant++;
				
				if(aux.tieneHijos()) {
					ListaGenerica<ArbolGeneral<AreaEmpresa>> hijos = aux.getHijos();
					hijos.comenzar();
					while(!hijos.fin()) {
						
						cola.encolar(hijos.proximo());
						
					}
					
				}
			}
			else { 
					tot = tot / cant;
					
					if(maxP < tot)
						maxP = tot;
					
					cant = 0;
					tot = 0;
				
				if(!cola.esVacia()) {
					cola.encolar(null);
				}
			}	
		}
		return maxP;
	}
	
}

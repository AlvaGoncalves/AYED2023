package ejercicio5;

import ejercicio1.ArbolGeneral;

public class mainEj5 {

	public static void main(String[] args) {
		
		/*
		 * 					m = 14
		 * 		
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		AreaEmpresa m = new AreaEmpresa("m", 14);
		AreaEmpresa n = new AreaEmpresa("n", 23);
		AreaEmpresa o = new AreaEmpresa("o", 10);
		AreaEmpresa p = new AreaEmpresa("p", 5);
		AreaEmpresa q = new AreaEmpresa("q", 8);
		AreaEmpresa r = new AreaEmpresa("r", 30);
		AreaEmpresa s = new AreaEmpresa("s", 40);
		AreaEmpresa t = new AreaEmpresa("t", 100);
		
		
		ArbolGeneral<AreaEmpresa> M = new ArbolGeneral<AreaEmpresa>(m);
		ArbolGeneral<AreaEmpresa> N = new ArbolGeneral<AreaEmpresa>(n);
		ArbolGeneral<AreaEmpresa> O = new ArbolGeneral<AreaEmpresa>(o);
		ArbolGeneral<AreaEmpresa> P = new ArbolGeneral<AreaEmpresa>(p);
		ArbolGeneral<AreaEmpresa> Q = new ArbolGeneral<AreaEmpresa>(q);
		ArbolGeneral<AreaEmpresa> R = new ArbolGeneral<AreaEmpresa>(r);
		ArbolGeneral<AreaEmpresa> S = new ArbolGeneral<AreaEmpresa>(s);
		ArbolGeneral<AreaEmpresa> T = new ArbolGeneral<AreaEmpresa>(t);
		
		
		M.agregarHijo(N);
		M.agregarHijo(O);
		M.agregarHijo(P);
		
		
		N.agregarHijo(Q);
		N.agregarHijo(R);
		
		O.agregarHijo(S);
		
		
		Q.agregarHijo(T);
		
		
		
		AnalizadorArbol clase = new AnalizadorArbol();
		
		
		System.out.println("EL MAYOR PROMEDIO DE TARDANZA POR NIVEL DEL ARBOL ES DE: "+clase.devolverMaximoPromedio(M));
		
	}

}

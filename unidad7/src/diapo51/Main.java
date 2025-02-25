package diapo51;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		ListaNumeros cola = new ListaNumeros();
		cola.encolar(9);
		cola.encolar(10);
		cola.encolar(20);
	
	
		System.out.println("Cola después de añadirle a la misma");
		cola.mostrar();
	
	
	
		int desencolado = cola.desencolar();
		System.out.println("Cola después de desencolar");
		cola.mostrar();
		
		
		
	
	ListaNumeros pila = new ListaNumeros();
		pila.apilar(10);
		pila.apilar(20);
		pila.apilar(0);
	
		
		System.out.println("Lista después de apilar");
		pila.mostrar();
	

		
		
	System.out.println("Lista después de desapilar");
	
	pila.mostrar();
	
	
	}

}

package Ejemplo4;

import Ejemplo4.hilos.Ejercicio4;

public class Principal {
	 static Ejercicio4 leo1;
	 static Ejercicio4 leo2;
	 static Ejercicio4 leo3;
	 static Ejercicio4 leo4;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 leo1 = new Ejercicio4(1," leo1 ");
		 leo2 = new Ejercicio4(5," leo2 ");
		 leo3 = new Ejercicio4(8," leo3 ");
		 leo4 = new Ejercicio4(9," leo4 ");
		 leo1.start();
		 leo2.start();
		 leo3.start();
		 leo4.start();
		
	}

}

package Ejemplo4;

public class hilos {
	public static class Ejercicio4 extends Thread {
		 String nombre;
		 public Ejercicio4 (int prioridad,String nombre){
		 this.nombre=nombre;
		 setPriority(prioridad);
		}
		 public void run(){
		 System.out.println("\n Llego a la meta " + nombre);
		}
		 
		
		}
}

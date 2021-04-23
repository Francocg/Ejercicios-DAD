package Ejemplo3;

import java.util.Scanner;

public class Hilo extends Thread{
	@Override
	public void run() {
		Scanner num = new Scanner(System.in);
		System.out.print("Ingrese el numero: ");
		int factorial = 1;
		int i = num.nextInt();
		for (int j = i; j > 0; j--) {
			factorial = factorial *j;
		}System.out.println(factorial);
	}
	

}

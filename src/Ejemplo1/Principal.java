package Ejemplo1;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hilo h1 = new Hilo();
		Hilo h2 = new Hilo();
		h1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		h2.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}

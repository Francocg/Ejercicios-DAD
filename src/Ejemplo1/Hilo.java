package Ejemplo1;



public class Hilo extends Thread{

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.print(i);
			try {
				Hilo.sleep(10);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
	}


}

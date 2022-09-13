package SyncTrhead;

public class ThreadSync {
	public static void main(String[] args) throws InterruptedException {

		// Clase HilosVarios:
		HilosVarios thread1 = new HilosVarios();
		HilosVarios2 thread2 = new HilosVarios2(thread1);
		thread2.start();
		thread1.start();
		// thread1.join(); // espera a que el hilo muera

		thread2.join(); // espera a que el hilo muera para seguir con el flujo de codigo

		System.out.println("Hilos terminados");
	}
}

class HilosVarios extends Thread {

	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Ejecutando hilo " + i + " En el hilo: " + getName());
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class HilosVarios2 extends Thread {

	private Thread thread;

	public HilosVarios2(Thread thread) {
		this.thread = thread;
	}

	public void run() {

		try {
			thread.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		for (int i = 0; i <= 5; i++) {
			System.out.println("Ejecutando hilo " + i + " En el hilo: " + getName());
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

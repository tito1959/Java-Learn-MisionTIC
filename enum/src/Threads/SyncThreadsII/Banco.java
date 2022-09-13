package SyncThreadsII;

// import java.util.concurrent.locks.*;

public class Banco {
	/*
	 * Crear 100 cuentas corrientes y asignar 2000 de valor
	 */
	private final double[] cuentas;
	// private Lock cierreBanco = new ReentrantLock();
	// private Condition saldoSuficiente;

	public Banco() {
		this.cuentas = new double[100];
		for (int i = 0; i < cuentas.length; i++) {
			cuentas[i] = 2000;
		}
		// saldoSuficiente = cierreBanco.newCondition(); // debe establecerce el bloqueo en base a una condicion
	}

	public synchronized void transferencia(int cuentaOrigen, int cuentaDestino, double cantidad) {

		// cierreBanco.lock();
		try {
			while (cuentas[cuentaOrigen] < cantidad) {
				// saldoSuficiente.await(); // detiene los hilos que contengan la misma condicion.
				wait();
			}

			System.out.println(Thread.currentThread());
			cuentas[cuentaOrigen] -= cantidad; // dinero descontado de la transferencia
			System.out.printf("%10.2f de %d para %d", cantidad, cuentaOrigen, cuentaDestino);

			cuentas[cuentaDestino] += cantidad;

			System.out.printf(" Saldo Total: %10.2f%n", getSaldoTotal());

			// saldoSuficiente.signalAll(); // reanuda los hilos, lo que evita que el hilo muera y todos realicen la transferencia
			notifyAll(); // informa a todos los hilos que puede reanudar
		} catch (Exception e) {
			e.printStackTrace();
		}/*  finally {
			cierreBanco.unlock();
		}*/
	}

	public double getSaldoTotal() {
		double suma_cuentas = 0;
		for (double a : cuentas) {
			suma_cuentas += a;
		}
		return suma_cuentas;
	}
}

package SyncThreadsII;

public class EjecucionTransferencias implements Runnable {

    private Banco banco;
    private int deCuenta;
    private double cantMax;

    public EjecucionTransferencias(Banco b, int esDe, double max) {
        this.banco = b;
        this.deCuenta = esDe;
        this.cantMax = max;
    }

    @Override
    public void run() {

        while (true) {
            int paraCuenta = (int) (100 * Math.random()); // Establece la cuenta a la que se realizara la transaccion
            double cantidad = cantMax * Math.random(); // cantidad a transferir
            banco.transferencia(deCuenta, paraCuenta, cantidad);

            //deteniendo el tiempo que tarda el hilo en realizar la transaccion:
            try {
                Thread.sleep((int) (Math.random() * 30));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

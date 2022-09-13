package SyncThreadsII;
/*
 * Este programa crea una lista de 100 cuentas con un total neto de 200k, dichas cuentas realizan transferencias de manera aleatoria valores a otras cuentas
 * podemos sincronizar el flujo de los hilos con el método lock el cual bloquea el fujo del codigo establecido.
 * tambien podemos asignar condicionales a los bloqueos del código, esto permite que el flujo de los hilos se detengan en ciertas circustancias...
 * Ejemplo: en este proyecto se evita que dos hilos realizen una transaccion al mismo tiempo, por lo que se detiene el flujo de los hilos que intenten realizar
 * la misma transaccion
 * 
 * Si usamos las condicionales de tipo object solo podemos establecer una condicion
 */
public class BancoSinSincronizar {
    public static void main(String[] args) {
        
        Banco banco = new Banco();
        for (int i = 0; i < 100; i++) {
            EjecucionTransferencias transferencia = new EjecucionTransferencias(banco, i, 2000);
            Thread thread = new Thread(transferencia);
            thread.start();
        }
    }
}

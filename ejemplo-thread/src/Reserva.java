import java.util.Random;

public class Reserva {
    private static final int FILAS = 5;
    private static final int COLUMNAS = 10;
    private static final int NUM_CLIENTES = 5;

    private static int[][] asientos = new int[FILAS][COLUMNAS];
    private static Random random = new Random();

    public static void main(String[] args) {
        // Inicializar asientos disponibles
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                asientos[i][j] = 0;
            }
        }

        // Crear hilos para los clientes
        Thread[] clientes = new Thread[NUM_CLIENTES];
        for (int i = 0; i < NUM_CLIENTES; i++) {
            clientes[i] = new Thread(new Cliente("Cliente " + (i + 1)));
            clientes[i].start();
        }
    }

    static class Cliente implements Runnable {
        private String nombre;

        public Cliente(String nombre) {
            this.nombre = nombre;
        }

        public void run() {
            while (true) {
                int fila = random.nextInt(FILAS);
                int columna = random.nextInt(COLUMNAS);

                synchronized (asientos) {
                    if (asientos[fila][columna] == 0) {
                        asientos[fila][columna] = 1;
                        System.out.println(nombre + " reservó el asiento (" + fila + "," + columna + ")");
                    } else {
                        System.out.println(nombre + " intentó reservar un asiento ocupado en (" + fila + "," + columna + ")");
                    }
                }

                // Simular un tiempo de espera antes de la siguiente reserva
                try {
                    Thread.sleep(random.nextInt(2000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

import javax.print.attribute.standard.Fidelity;

public class App4 {

    static int CLIENTES=10;
    static int FILAS=5;
    static int COLUMNAS=2;
    static int[][] sillas=new int[FILAS][COLUMNAS];
    static Thread[] clientes = new Thread[CLIENTES];


    public static void main(String arg[]){
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                sillas[i][j] = 0;
            }
          }
          for(int i=0;i<CLIENTES;i++){
            clientes[i]=new Thread(new Cliente(i+1));
            clientes[i].start();
          }
          for(int i=0;i<CLIENTES;i++){            
            try {
                clientes[i].join();
            } catch (InterruptedException e) {                
                e.printStackTrace();
            }
          }
          System.out.println("Reservar final");
          for(int i=0;i<FILAS;i++){
            for(int j=0;j<COLUMNAS;j++){
                System.out.println("["+i+"]"+"["+j+"]="+sillas[i][j]);
            }
          } 
    }

    public synchronized static boolean reservarSilla(int fila,int columna,int idCliente){
       
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {            
            e.printStackTrace();
        }
        if(sillas[fila][columna]==0){
           sillas[fila][columna]=idCliente;
           System.out.println(idCliente + " reservó el asiento (" + fila + "," + columna + ")");
           return true;
        }else{
            System.out.println(idCliente + " intentó reservar un asiento ocupado en (" + fila + "," + columna + ")");
            return false;
        }
    }
    
}

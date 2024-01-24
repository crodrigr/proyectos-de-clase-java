import java.util.Random;

public class Cliente implements Runnable {

     private static Random random = new Random();
   

    private int id;

    public Cliente(int id){
         this.id=id;
    }

    @Override
    public void run() {

        while(App4.reservarSilla(random.nextInt(App4.FILAS), random.nextInt(App4.COLUMNAS), id)==false){
            
        }
        
      
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
}

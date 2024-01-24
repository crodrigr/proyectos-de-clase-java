
public class NombreThread extends Thread {

    public NombreThread(String nombre){
        super(nombre);
    }

    @Override
    public void run(){
        System.out.println("Inicio del proceso del hilo" +getName());
        for(int i=0;i<10;i++){
            try {
                Thread.sleep((long)(Math.random()*1000));
            } catch (InterruptedException e) {                
                e.printStackTrace();
            }
            System.out.println(i+":"+this.getName());
        }
        System.out.println("Finaliza el hilo: "+getName());        

       
    }
    
}

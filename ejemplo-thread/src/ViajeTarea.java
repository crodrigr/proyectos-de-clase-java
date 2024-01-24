public class ViajeTarea  implements Runnable{

    private String nombre;

    public ViajeTarea(String nombre){
        this.nombre=nombre;
    }

    @Override
    public void run() {
        System.out.println("Inicio viaje a:" +getNombre());
        for(int i=0;i<10;i++){
            System.out.println(i+" - "+getNombre());
            try {
                
                Thread.sleep((long)(Math.random()*1000));
            } catch (InterruptedException e) {                
                e.printStackTrace();
            }
            
        }
        System.out.println("Finaliza el viaje: "+getNombre());        

        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    


    
}

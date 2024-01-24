public class Nombre {
     private String nombre;

     public Nombre(String nombre){
        this.nombre=nombre;
     }

    public void run(){
        System.out.println("Inicio del proceso del hilo" +getNombre());
        for(int i=0;i<10;i++){
            try {
                Thread.sleep((long)(Math.random()*1000));
            } catch (InterruptedException e) {                
                e.printStackTrace();
            }
            System.out.println(i+":"+this.getNombre());
        }
        System.out.println("Finaliza el hilo: "+getNombre());
    } 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

     

    
}

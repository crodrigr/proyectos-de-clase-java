public class App2 {

    public static void main(String arg[]){


          new Thread(new ViajeTarea("Bogota")).start();
          new Thread(new ViajeTarea("Cartagena")).start();
          new Thread(new ViajeTarea("Cali")).start();
          new Thread(new ViajeTarea("Medellin")).start();
          Thread h1=new Thread(new ViajeTarea("Miami"));
          h1.start();


    }
    
}

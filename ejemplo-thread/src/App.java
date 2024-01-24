public class App {
    public static void main(String[] args) throws Exception {
        
        Thread h1=new NombreThread("maria");
        Thread h2=new NombreThread("juan");
        Thread h3=new NombreThread("pedro");
        Thread h4=new NombreThread("jose");
        h1.start();
        h2.start();
        h3.start();
        h1.join();
        h2.join();
        h3.join();
        System.out.println("Fin del main");

        
    }
}

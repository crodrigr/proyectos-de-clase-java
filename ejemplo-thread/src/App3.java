public class App3 {

    public static void main(String arg[]){
      
        new Thread(new ImprimirFrases("Hola,", "que tal")).start();
        new Thread(new ImprimirFrases("Quien éres,", "tú")).start();
        new Thread(new ImprimirFrases("Muchas,", "gracias amigo")).start();

    

    }

    public static synchronized void imprimirFrases(String frase1,String frase2){
          System.out.print(frase1);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


          System.out.print(" "+frase2+"\n");


    }

    
}

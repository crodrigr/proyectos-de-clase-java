public class EjemploAritemica {

    public static void main(String arg[]){

          Calculadora cal=new Calculadora();

          Artimetica suma=(a,b)->a+b;
          Artimetica resta=(a,b)->a-b;

          System.out.println(cal.computar(4, 5, suma));
          System.out.println(cal.computar(4, 5, resta));
          System.out.println(cal.computar(4, 5, (a,b)->b*a));





    }
    
}

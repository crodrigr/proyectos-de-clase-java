import java.util.stream.Stream;

public class EjemploReduce {


    public static void main(String arg[]){

        Stream<String> nombres=Stream.of("paco","pedro","juan","maria","pedro","paco","dolores").distinct();
        String resultado=nombres.reduce("resultado de concatenación", (a,b)->a+" # "+b);
        System.out.println(resultado);

        //nombres.forEach(n->System.out.println(n));


    }
    
}

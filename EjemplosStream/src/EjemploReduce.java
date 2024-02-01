import java.util.stream.Stream;

public class EjemploReduce {


    public static void main(String arg[]){

        Stream<String> nombres=Stream.of("paco","pedro","juan","maria","pedro","paco","dolores");

        nombres.forEach(n->System.out.println(n));


    }
    
}

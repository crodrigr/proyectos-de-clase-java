import java.util.function.Predicate;

public class EjemploPredicate {

    public static void main(String arg[]){

           Predicate<Integer> positivo=num->num>=0;

           System.out.println(positivo.test(3));




    }
    
}

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {

    public static void main(String arg[]){

            Function<String,String> cadena=(param)-> "Hola que tal: "+param;

            String  rta=cadena.apply("juan");
            System.out.println(rta);

            BiFunction<String,String,String> cadena2=(param1,param2)->"Nombre1: "+param1+" Nombre2:"+param2;


            System.out.println(cadena2.apply("Maria","Daniel"));



    }
    
}

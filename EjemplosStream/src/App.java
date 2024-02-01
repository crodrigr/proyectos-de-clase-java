import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {
        Stream<String> lista = Stream.of("norma", "Juan", "daniel");
        lista.forEach(n -> System.out.println(n));

        List<String> nombres = new ArrayList<>();
        nombres.add("camilo");
        nombres.add("monica");
        nombres.add("diana");
        nombres.add("jorge");
        nombres.add("jose");
        nombres.add("alberto");
        nombres.add("dario");

        String[] arrNombres = { "diego", "angy", "juan" };

        Stream<String> arrNombresSteam = Arrays.stream(arrNombres);
        arrNombresSteam.forEach(n -> System.out.println(n));

        // Stream<String> snombres=nombres.stream().;
        // snombres.forEach(n->System.out.println(n));

        nombres.stream().forEach(n -> System.out.println(n));

        /*
         * /for(String x : lista){
         * System.out.println(x);
         * }
         */

        Stream<String> animales = Stream.<String>builder()
                .add("Pato")
                .add("Gato")
                .add("Perro")
                .build();
        animales.forEach(e -> System.out.println(e));

    }
}

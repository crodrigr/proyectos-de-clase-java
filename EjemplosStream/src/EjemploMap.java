import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploMap {

    public static void main(String arg[]) {

        String[] nombres = { "camilo", "juan", "pedro", "dario" };

        Stream<String> nombreStream = Arrays.stream(nombres);

        Stream<String> nombresUppercase = nombreStream.map(nombre -> nombre.toUpperCase());

        System.out.println("");
        nombresUppercase.forEach(n -> System.out.println(n));

        System.out.println("---------map--nombres---genero");
        List<Cliente> listCliente = new ArrayList<>();
        listCliente.add(new Cliente("Carlos", "1001", "M",1200));
        listCliente.add(new Cliente("Juan", "1002", "M",1500));
        listCliente.add(new Cliente("Pedro", "1002", "M",7800));
        listCliente.add(new Cliente("Maria", "1003", "F",1000));
        listCliente.add(new Cliente("Daniela", "1004", "F",12000));
        listCliente.add(new Cliente("Jose", "1005", "M",50000));

        Stream<Cliente> newListCliente = listCliente.stream()
                .map(c -> {
                    if (c.getGenero().equals("M")) {
                        c.setNombre(c.getNombre().toUpperCase());
                    }
                    return c;
                });

        newListCliente.forEach(c -> System.out.println(c.getNombre()));

        // filter
        System.out.println("---------filer--por---genero");
        Stream<Cliente> newListCliente2 = listCliente.stream()
                .map(c->{
                    c.setNombre(c.getNombre().toUpperCase());
                    return c;
                })
                .filter(c->c.getGenero().equals("F"));
                   
              
                
        newListCliente2.forEach(c -> System.out.println(c.getNombre()));

    }

}

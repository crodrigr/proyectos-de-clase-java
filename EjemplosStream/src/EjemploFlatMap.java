import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EjemploFlatMap {

    public static void main(String arg[]) {

        System.out.println("---------map--nombres---genero");
        List<Cliente> listCliente = new ArrayList<>();
        listCliente.add(new Cliente("Carlos", "1001", "M", 1200));
        listCliente.add(new Cliente("Juan", "1002", "M", 1500));
        listCliente.add(new Cliente("Pedro", "1002", "M", 7800));
        listCliente.add(new Cliente("Maria", "1003", "F", 1000));
        listCliente.add(new Cliente("Daniela", "1004", "F", 12000));
        listCliente.add(new Cliente("Jose", "1005", "M", 50000));

        Stream<Cliente> clientes = listCliente.stream().map(c -> {
                                                                c.setNombre(c.getNombre().toUpperCase());
                                                                return c;
                                                            })
                                                        .filter(c->c.getGenero().equals("F"))
                                                        .flatMap(c->{
                                                            double totalPagar=c.getTotalPagar()-c.getTotalPagar()*0.20;
                                                            c.setTotalPagar(totalPagar);
                                                            return Stream.of(c);
                                                        });

        clientes.forEach(c -> {
            System.out.println("Nombre: " + c.getNombre());
            System.out.println("Documento: " + c.getDocumento());
            System.out.println("Genero: " + c.getGenero());
            System.out.println("TotalPagar: " + c.getTotalPagar());
        });

    }

}


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class App {
    public static void main(String[] args) throws Exception {
         
        
        Consumer<Date> consumidor=fecha->{
              SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd");
              System.out.println(f.format(fecha)); 
         };


        Consumer<Cliente> mostraDatosCliente=cliente->{
                   System.out.println("Datos del cliente");
                   System.out.println("Nombre: "+cliente.getNombre());
                   System.out.println("Celular: "+cliente.getCelular());
        };

        BiConsumer<Cliente,Integer> datosClienteEdad=(cliente,edad)->System.out.println("Nombre:"+cliente.getNombre()+" Edad:"+edad);

         Cliente cliente1=new Cliente("Juan Perez","3145589852");
         Cliente cliente2=new Cliente("Maria Gomez","3145897555");
         Cliente cliente3=new Cliente("Jose Garcia","3205589852");

         datosClienteEdad.accept(cliente1,35);

         /*List<Cliente> listCliente=new ArrayList<>();
         listCliente.add(cliente1);
         listCliente.add(cliente2);
         listCliente.add(cliente3);
    
        listCliente.forEach(cliente->System.out.println("Nombre: "+cliente.getNombre()));*/

    }
}

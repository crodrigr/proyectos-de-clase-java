import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import models.Cliente;

public class App {
    public static void main(String[] args)  {
    
        //crearArchivoBuffer();
        //crearArchivoPrintWrite();
        //System.out.println(leerArchivoBuffer("cliente.txt"));
        List<Cliente> clientes=leerArchivoCliente("cliente.txt");
        for(Cliente c: clientes){
            System.out.println("Nombre: "+c.getNombre());
            System.out.println("Apellido: "+c.getApellido());
            System.out.println("Email: "+c.getEmail());
            System.out.println("Direccion: "+c.getDireccion());
            System.out.println("Celular: "+c.getCelular());
        }
        clientes.add(new Cliente("pepito","perez","pperez@gmail","xxxx","3145555"));
        clientes.add(new Cliente("roberto","fernandez","rfernandez@gmail","xxxx","3145555"));
        clientes.add(new Cliente("jorge","lamus","jlamus@gmail","xxxx","3145555"));
        escribirArchivoCliente(clientes);

    }

    public static void crearArchivoBuffer(){

        File archivo = new File("ejemplo.txt");

        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo,true))) {
            buffer.append("Hola que tal amigos!\n")
                    .append("Todo bien?, yo acá escribiendo\n")
                    .append("Hasta luego lucas\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void crearArchivoPrintWrite(){

        File archivo = new File("ejemplo2.txt");

        try (PrintWriter buffer = new  PrintWriter(new FileWriter(archivo,true))) {
            buffer.println("Hola que tal amigos!");
            buffer.println("Todo bien?, yo acá escribiendo");
            buffer.println("Hasta luego lucas");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String leerArchivoBuffer(String nombreArchivo){
        StringBuilder sb=new StringBuilder();
        File file=new File(nombreArchivo);
        try(BufferedReader reader=new BufferedReader(new FileReader(file))){
            String linea;
            while ((linea=reader.readLine())!=null) {
                sb.append(linea).append("\n");
                
            }

        }catch(IOException e){
            e.printStackTrace();
        }

        return sb.toString();       

    }

    public static List<Cliente> leerArchivoCliente(String nombreArchivo){
        List<Cliente> clientes=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        File file=new File(nombreArchivo);
        try(BufferedReader reader=new BufferedReader(new FileReader(file))){
            String linea;
            while ((linea=reader.readLine())!=null) {
               String[] registro=linea.split(",");
               clientes.add(new Cliente(registro[0],registro[1],registro[2],registro[3],registro[4])); 
            }

        }catch(IOException e){
            e.printStackTrace();
        }

        return clientes;       

    }

    public static void escribirArchivoCliente(List<Cliente> clientes){

        File archivo = new File("cliente.txt");

        try (PrintWriter buffer = new  PrintWriter(new FileWriter(archivo))) {
             for(Cliente c: clientes){
                 buffer.println(c.getNombre()+","+c.getApellido()+","+c.getEmail()+","+c.getDireccion()+","+c.getCelular());
             }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

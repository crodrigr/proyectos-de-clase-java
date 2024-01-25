import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class App {
    public static void main(String[] args)  {
    
        //crearArchivoBuffer();
        //crearArchivoPrintWrite();
        System.out.println(leerArchivoBuffer("cliente.txt"));

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
}

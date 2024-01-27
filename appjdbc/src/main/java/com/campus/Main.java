package com.campus;

import java.util.List;
import java.util.Scanner;

import com.campus.model.Producto;
import com.campus.repository.ProductoRepository;
import com.campus.repository.ProductoRepositoryImpl;

public class Main {

    private static Scanner leer = new Scanner(System.in);
    private static ProductoRepository productoRepository = new ProductoRepositoryImpl();

    public static void main(String[] args) {

        int op = 0;

        do {
            op = menuProducto();
            switch (op) {
                case 1:
                    listarProducto(productoRepository.listar());
                    break;
                case 2:
                    productoRepository.guardar(crearProducto());
                    break;
                case 3:
                    break;
                case 4:
                    break;

                default:
                    break;
            }

        } while (op >= 1 && op < 5);

    }

    private static int menuProducto() {
        System.out.println("___MENU PRODUCTO____");
        System.out.println("1. Listar productos");
        System.out.println("2. Crear producto");
        System.out.println("3. Eliminar producto");
        System.out.println("4. Actualizar producto ");
        System.out.println("5. Salir");
        return leer.nextInt();
    }

    private static void listarProducto(List<Producto> productos) {
        System.out.print("Listado de productos\n");
        for (Producto producto : productos) {
            System.out.println("Codigo: " + producto.getCodigo());
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio Venta: " + producto.getPrecioVenta());
            System.out.println("Precio Compra: " + producto.getPrecioCompra());
            System.out.println("Descripcion: " + producto.getDescripcion());
            System.out.println();
        }
    }

    private static Producto crearProducto() {       
        System.out.print("Listado de productos\n"); 
        leer.nextLine();       
        System.out.print("Nombre: ");
        String nombre=leer.nextLine();        
        System.out.print("Precio Venta:");
        double precioVenta=leer.nextDouble();
        System.out.print("Precio Compra: ");
        double precioCompra=leer.nextDouble();
        System.out.print("Descripcion: ");
        leer.nextLine();
        String descripcion=leer.nextLine();
        Producto pr=new Producto();
        pr.setNombre(nombre);
        pr.setPrecioCompra(precioCompra);
        pr.setPrecioVenta(precioVenta);
        pr.setDescripcion(descripcion);
        return pr;

    }
}
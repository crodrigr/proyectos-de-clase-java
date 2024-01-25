package com.campus;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.campus.models.Cliente;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Main {
    public static void main(String[] args) {

        List<Cliente> listClientes = new ArrayList<>();

        /*listClientes.add(new Cliente("pepito", "perez", "pperez@gmail", "xxxx", "3145555"));
        listClientes.add(new Cliente("roberto", "fernandez", "rfernandez@gmail", "xxxx", "3145555"));
        listClientes.add(new Cliente("jorge", "lamus", "jlamus@gmail", "xxxx", "3145555"));
        listClientes.add(new Cliente("ramiro", "lamus", "jlamus@gmail", "xxxx", "3145555"));
        listClientes.add(new Cliente("jose", "lamus", "jlamus@gmail", "xxxx", "3145555"));
        listClientes.add(new Cliente("andres", "lamus", "jlamus@gmail", "xxxx", "3145555"));
        listClientes.add(new Cliente("juan", "lamus", "jlamus@gmail", "xxxx", "3145555"));
        listClientes.add(new Cliente("carlos", "lamus", "jlamus@gmail", "xxxx", "3145555"));
        listClientes.add(new Cliente("dario", "lamus", "jlamus@gmail", "xxxx", "3145555"));
        listClientes.add(new Cliente("diego", "lamus", "jlamus@gmail", "xxxx", "3145555"));
        escribirClientJson(listClientes);*/

        listClientes=leerClienteJson();
        for(Cliente c: listClientes){
            System.out.println("Nombre: "+c.getNombre());
            System.out.println("Apellido: "+c.getApellido());
            System.out.println("Email: "+c.getEmail());
            System.out.println("Direccion: "+c.getDireccion());
            System.out.println("Celular: "+c.getCelular());
        }

    }

    public static void escribirClientJson(List<Cliente> listCliente) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        try {
            objectMapper.writeValue(new File("clientes.json"), listCliente);
            System.out.println("Se guardo los clientes en cliente.json");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<Cliente> leerClienteJson(){
            ObjectMapper objectMapper=new ObjectMapper();
            List<Cliente> listClientes=new ArrayList<>();
            try{
               listClientes=objectMapper.readValue(new File("clientes.json"), new TypeReference<List<Cliente>>(){});
            }catch(IOException e){
               e.printStackTrace();
            }
            return listClientes;


    }

}
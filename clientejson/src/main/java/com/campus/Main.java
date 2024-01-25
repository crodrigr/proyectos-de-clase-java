package com.campus;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.campus.models.Cliente;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Main {
    public static void main(String[] args) {

        List<Cliente> listClientes=new ArrayList<>();

        listClientes.add(new Cliente("pepito","perez","pperez@gmail","xxxx","3145555"));
        listClientes.add(new Cliente("roberto","fernandez","rfernandez@gmail","xxxx","3145555"));
        listClientes.add(new Cliente("jorge","lamus","jlamus@gmail","xxxx","3145555"));
        listClientes.add(new Cliente("ramiro","lamus","jlamus@gmail","xxxx","3145555"));
        listClientes.add(new Cliente("jose","lamus","jlamus@gmail","xxxx","3145555"));
        listClientes.add(new Cliente("andres","lamus","jlamus@gmail","xxxx","3145555"));
        listClientes.add(new Cliente("juan","lamus","jlamus@gmail","xxxx","3145555"));
        listClientes.add(new Cliente("carlos","lamus","jlamus@gmail","xxxx","3145555"));
        listClientes.add(new Cliente("dario","lamus","jlamus@gmail","xxxx","3145555"));
        listClientes.add(new Cliente("diego","lamus","jlamus@gmail","xxxx","3145555"));

        escribirClientJson(listClientes);
    
    }

    public static void escribirClientJson(List<Cliente> listCliente){
         ObjectMapper objectMapper=new ObjectMapper();
         objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

         try {
            objectMapper.writeValue(new File("clientes.json"), listCliente);
            System.out.println("Se guardo los clientes en cliente.json");
         } catch (IOException e) {
             e.printStackTrace();
         }
 


    }
}
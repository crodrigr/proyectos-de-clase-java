package com.campus.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
    private int codigo;
    private String nombre;
    private double precioVenta;
    private double precioCompra;

}

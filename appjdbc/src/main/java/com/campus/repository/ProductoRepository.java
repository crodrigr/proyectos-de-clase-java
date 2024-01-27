package com.campus.repository;

import java.util.List;

import com.campus.model.Producto;

public interface ProductoRepository {

    List<Producto> listar();

    Producto porCodigo(int id);

    void guardar(Producto producto);

    void eliminar(int id);
    
}

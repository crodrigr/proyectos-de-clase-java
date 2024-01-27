package com.campus.repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.campus.model.Producto;
import com.campus.util.ConexionBaseDatos;

public class ProductoRepositoryImpl implements ProductoRepository {

    private Connection getConnection()throws SQLException{
         return ConexionBaseDatos.getInstance();
    }

    @Override
    public List<Producto> listar() {
       
        throw new UnsupportedOperationException("Unimplemented method 'listar'");
    }

    @Override
    public Producto porCodigo(int id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'porCodigo'");
    }

    @Override
    public void guardar(Producto producto) {
        
        throw new UnsupportedOperationException("Unimplemented method 'guardar'");
    }

    @Override
    public void eliminar(int id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }
    
}

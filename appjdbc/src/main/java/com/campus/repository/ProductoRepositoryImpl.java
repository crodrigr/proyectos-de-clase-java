package com.campus.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.campus.model.Producto;
import com.campus.util.ConexionBaseDatos;

public class ProductoRepositoryImpl implements ProductoRepository {

    private Connection getConnection() throws SQLException {
        return ConexionBaseDatos.getInstance();
    }

    @Override
    public List<Producto> listar() {
        List<Producto> listProductos = new ArrayList<>();

        try (Statement stmt = getConnection().createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM producto ")) {
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setCodigo(rs.getInt("codigo"));
                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioVenta(rs.getDouble("precioVenta"));
                producto.setPrecioCompra(rs.getDouble("precioCompra"));
                listProductos.add(producto);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listProductos;

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

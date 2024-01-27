package com.campus.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
                listProductos.add(crearProducto(rs));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listProductos;

    }

    @Override
    public Producto porCodigo(int codigo) {
        Producto producto = null;
        try (PreparedStatement stmt = getConnection().prepareStatement("SELECT * FROM producto WHERE CODIGO=?")) {
            stmt.setInt(1, codigo);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    producto = crearProducto(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return producto;

    }

    @Override
    public void guardar(Producto producto) {
        String sql;
        if (producto.getCodigo() > 0) {
            sql = "UPDATE producto SET nombre=?, precioVenta=?, precioCompra=?, descripcion=? WHERE codigo=?";
        } else {
            sql = "INSERT INTO producto(nombre,precioVenta,precioCompra,descripcion) VALUES(?,?,?,?)";
        }

        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            stmt.setString(1, producto.getNombre());
            stmt.setDouble(2, producto.getPrecioVenta());
            stmt.setDouble(3, producto.getPrecioCompra());
            stmt.setString(4, producto.getDescripcion());

            if (producto.getCodigo() > 0) {
                stmt.setInt(5, producto.getCodigo());
            }
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void eliminar(int codigo) {
        try (PreparedStatement stmt = getConnection().prepareStatement("DELETE FROM producto WHERE codigo=?")) {
            stmt.setInt(1, codigo);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private Producto crearProducto(ResultSet rs) throws SQLException {
        Producto producto = new Producto();
        producto.setCodigo(rs.getInt("codigo"));
        producto.setNombre(rs.getString("nombre"));
        producto.setDescripcion(rs.getString("descripcion"));
        producto.setPrecioVenta(rs.getDouble("precioVenta"));
        producto.setPrecioCompra(rs.getDouble("precioCompra"));
        return producto;

    }

}

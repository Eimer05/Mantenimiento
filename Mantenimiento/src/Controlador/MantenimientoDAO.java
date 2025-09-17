package Controlador;

import Modelo.Mantenimiento;
import java.sql.*;
import util.ConexionSQLite;

public class MantenimientoDAO {

    public void registrarMantenimiento(Mantenimiento mantenimiento) {
        String sql = "INSERT INTO mantenimiento (nombre, cedula, fechaRegistro, tipoMant, detalles, precio) VALUES (?, ?, ?, ?, ?, ?)";
        try (
                Connection conn = ConexionSQLite.conectar(); 
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, mantenimiento.getNombre());
            pstmt.setString(2, mantenimiento.getCedula());
            pstmt.setString(3, mantenimiento.getFechaRegistro());
            pstmt.setString(4, mantenimiento.tipoMant());
            pstmt.setString(5, mantenimiento.detalles());
            pstmt.setDouble(6, mantenimiento.precio());
            pstmt.executeUpdate();
            System.out.println("Mantenimiento resgistrado");
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            System.err.println("Error al registrar mantenimiento: " + e.getMessage());
        }

        public List<Mantenimiento> getMantenimientos(){
            List<Mantenimiento> result = new ArrayList<>();
    
            return result;
        }

    }

}

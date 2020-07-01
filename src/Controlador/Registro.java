package Controlador;

import Modelo.Grua;
import Modelo.Usuario;
import db.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Registro {

    //LISTAR GRUAS
    public ArrayList<Grua> listarTodasGruas() {
        ArrayList<Grua> lista = new ArrayList<Grua>();

        try {
            Conexion bd = new Conexion();
            Connection cxn = bd.obtenerConexion();

            String sql = "SELECT * FROM DASHBOARD_GRUA ORDER BY PATENTE_GRUA";
            PreparedStatement stmt = cxn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Grua grua = new Grua();

                grua.setPATENTE_GRUA(rs.getString("PATENTE_GRUA"));
                grua.setESTADO(rs.getBoolean("ESTADO"));
                grua.setMARCA(rs.getString("MARCA"));
                grua.setMODELO(rs.getString("MODELO"));
                grua.setTIPO(rs.getString("TIPO"));
                grua.setANIO(rs.getString("ANIO"));

                lista.add(grua);

            }
            stmt.close();
            cxn.close();

        } catch (Exception e) {
            System.out.println("Error al listar gruas " + e.getMessage());

        }
        return lista;
    }

    //ELIMINAR GRUAS
    public boolean eliminarGrua(Grua grua) {
        try {
            Conexion conex = new Conexion();
            Connection cnx = conex.obtenerConexion();
            String query = "UPDATE DASHBOARD_GRUA set estado_delete=? WHERE patente_grua=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setBoolean(1, grua.getESTADO_DELETE());
            stmt.setString(2, grua.getPATENTE_GRUA());
            int filas = stmt.executeUpdate();
            stmt.close();
            cnx.close();
            if (filas == 1) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error al eliminar grúa " + e.getMessage());
            return false;
        }
    }
}

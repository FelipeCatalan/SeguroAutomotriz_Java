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
        ArrayList<Grua> lista = new ArrayList<>();

        try {
            Conexion bd = new Conexion();
            Connection cxn = bd.obtenerConexion();

            String sql = "SELECT * FROM DASHBOARD_GRUA WHERE (ESTADO_DELETE=1) ORDER BY PATENTE_GRUA";
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
            String query = "UPDATE DASHBOARD_GRUA set estado_delete=?, estado=? WHERE patente_grua=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setBoolean(1, grua.getESTADO_DELETE());
            stmt.setBoolean(2, grua.getESTADO());
            stmt.setString(3, grua.getPATENTE_GRUA());
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

    //AGREGAR GRUAS
    public boolean agregarGrua(Grua grua) {
        try {
            Conexion bd = new Conexion();
            Connection cxn = bd.obtenerConexion();

            String sql = "INSERT INTO DASHBOARD_GRUA (PATENTE_GRUA,ESTADO,ESTADO_DELETE,MARCA,MODELO,TIPO,ANIO,SERVICIO_GRUA_ID_SERVICIO,USUARIO_RUT_USUARIO) VALUES(?,?,?,?,?,?,?,?,?)";

            PreparedStatement stmt = cxn.prepareStatement(sql);

            stmt.setString(1, grua.getPATENTE_GRUA());
            stmt.setBoolean(2, grua.getESTADO());
            stmt.setBoolean(3, grua.getESTADO_DELETE());
            stmt.setString(4, grua.getMARCA());
            stmt.setString(5, grua.getMODELO());
            stmt.setString(6, grua.getTIPO());
            stmt.setString(7, grua.getANIO());
            stmt.setInt(8, grua.getSERVICIO_GRUA_ID_SERVICIO());
            stmt.setInt(9, grua.getUSUARIO_RUT_USUARIO());

            stmt.executeUpdate();
            stmt.close();
            cxn.close();
            return true;

        } catch (Exception e) {
            System.out.println("Error al agregar grua " + e.getMessage());
            return false;
        }
    }

    //BUSCAR GRUA EXISTENTE
    public Grua buscarGrua(String PATENTE_GRUA) {
        Grua grua = new Grua();
        try {
            Conexion bd = new Conexion();
            Connection cxn = bd.obtenerConexion();

            String sql = "SELECT * FROM DASHBOARD_GRUA WHERE PATENTE_GRUA=?";
            PreparedStatement stmt = cxn.prepareStatement(sql);

            stmt.setString(1, PATENTE_GRUA);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                grua.setPATENTE_GRUA(rs.getString("PATENTE_GRUA"));
                grua.setESTADO(rs.getBoolean("ESTADO"));
                grua.setMARCA(rs.getString("MARCA"));
                grua.setMODELO(rs.getString("MODELO"));
                grua.setTIPO(rs.getString("TIPO"));
                grua.setANIO(rs.getString("ANIO"));

            }
        } catch (Exception e) {
            System.out.println("Error al buscar por patente " + e.getMessage());
        }
        return grua;
    }

    //LISTAR GRUAS ELIMINADAS
    public ArrayList<Grua> listarTodasGruasDisabled() {
        ArrayList<Grua> lista = new ArrayList<>();

        try {
            Conexion bd = new Conexion();
            Connection cxn = bd.obtenerConexion();

            String sql = "SELECT * FROM DASHBOARD_GRUA WHERE (ESTADO_DELETE=0) ORDER BY PATENTE_GRUA";
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

    //MODIFICAR GRUAS
    public boolean modificarGruas(Grua grua) {
        try {
            Conexion conex = new Conexion();
            Connection cnx = conex.obtenerConexion();
            String query = "UPDATE DASHBOARD_GRUA set marca=?, modelo=?, tipo=?, anio=? WHERE patente_grua=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, grua.getMARCA());
            stmt.setString(2, grua.getMODELO());
            stmt.setString(3, grua.getTIPO());
            stmt.setString(4, grua.getANIO());
            stmt.setString(5, grua.getPATENTE_GRUA());
            int filas = stmt.executeUpdate();
            stmt.close();
            cnx.close();
            if (filas == 1) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error al modificar grúa " + e.getMessage());
            return false;
        }
    }
}

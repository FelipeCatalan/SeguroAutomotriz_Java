/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import Modelo.Usuario;
import Recursos.Hasher;
import Vista.Login;
import Vista.principalPanel;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jota Wolf
 */
public class FuncionLogin {
    
    Usuario us = new Usuario();
    Conexion cc = new Conexion();
    Connection con = cc.obtenerConexion();
    PreparedStatement pst;
    CallableStatement cst;
    ResultSet rs;
    
    public void acceder(Usuario us) throws Exception {
        String rol = "";
        String nom = "";
        String sql = " select * from dashboard_usuario where rut_usuario=?";
        String contra = "";
        String est="";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, us.getRut_usuario());
            rs = pst.executeQuery();

            while (rs.next()) {
                rol = rs.getString("rol");
                est = rs.getString("is_active");
                contra = Hasher.passwordShouldMatch(us.getPassword(), rs.getString("password"));
            }
            if ((rol.equals("4")) && (est.equals("1")) && (contra != "error")) {
                 principalPanel home = new principalPanel();
                 home.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Error de acceso , Rol no permitido");
                Login l = new Login();
                l.setVisible(true);
            }

        } catch (SQLException e) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, e);
        }
        con.close();
    }



    
}

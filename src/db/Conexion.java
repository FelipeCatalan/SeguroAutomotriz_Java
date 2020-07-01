package db;
//Imports
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Conexion
public class Conexion {
    
    public Connection obtenerConexion() {
        Connection cxn = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cxn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","C##ADMIN","portafolio2020");
            System.out.println("Conexión exitosa");
        } catch (Exception e) {
            System.out.println("No se conectó " + e.getMessage());
        }

        return cxn;
    }

    

    
}

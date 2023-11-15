/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programperpustakaan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;/**
 *
 * @author lenovo
 */
public class Konektor {
    private static Connection mysqlconfig;

    public static Connection koneksi() {
        
        try {
            String url = "jdbc:mysql://localhost:3306/perpustakaan";
            String user = "root";
            String pass = "";
            
            mysqlconfig = DriverManager.getConnection(url, user, pass);
            return mysqlconfig;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Tidak dapat terhubung ke Database: " + e.getMessage());
            throw new RuntimeException("Tidak dapat terhubung ke Database", e);
        }
    }
}







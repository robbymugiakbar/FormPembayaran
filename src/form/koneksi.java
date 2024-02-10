/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package form;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Dell Inspiron
 */
public class koneksi {
 private static Connection koneksi;
 public static Connection koneksiDB() throws SQLException {
        if (koneksi==null){
            try {
                String DB="jdbc:mysql://localhost:3306/dbdata";
                String user="root";
                String pass="";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi=(Connection) DriverManager.getConnection(DB,user,pass);
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "koneksi gagal");
            }
        } return koneksi;
 }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package picturematching.database;

import java.sql.*;

/**
 *
 * @author Ramdan Rohendi
 */
public class Koneksi {
    private static Connection koneksi;
    
    public static Connection getConnection() throws SQLException {
        if (koneksi == null) {
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_picture_matching", "root", "");
        }
        
        return koneksi;
    }
}

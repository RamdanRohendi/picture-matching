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
    private static final String DB_HOST = "localhost";
    private static final String DB_PORT = "3306";
    private static final String DB_NAME = "db_picture_matching";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "";
    
    public static Connection getConnection() throws SQLException {
        if (koneksi == null) {
            koneksi = DriverManager.getConnection("jdbc:mysql://"+DB_HOST+":"+DB_PORT+"/"+DB_NAME, DB_USERNAME, DB_PASSWORD);
        }
        
        return koneksi;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package picturematching.controllers;

import java.sql.*;
import java.util.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.mindrot.jbcrypt.BCrypt;
import picturematching.Main;
import picturematching.models.User;
import picturematching.database.Koneksi;

/**
 *
 * @author Ramdan Rohendi
 */
public class UserController {
    public ArrayList<User> getAllData(){
        ArrayList<User> users = new ArrayList<>();

        try {
            String query = "SELECT * FROM user;";
            PreparedStatement statement = Koneksi.getConnection().prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            
            while (rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String icon_profile = rs.getString("icon_profile");
                String nama_lengkap = rs.getString("nama_lengkap");
                String email = rs.getString("email");
                String tentang_saya = rs.getString("tentang_saya");
                Date tanggal_lahir = rs.getTimestamp("tanggal_lahir");
                Date created_at = rs.getTimestamp("created_at");
                Date updated_at = rs.getTimestamp("updated_at");
                
                users.add(new User(id, username, password, icon_profile, nama_lengkap, email, tentang_saya, tanggal_lahir, created_at, updated_at));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat pengambilan data.", "Database Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return users;
    }
    
    public boolean login(String inputUsername, String inputPassword) {
        boolean status = false;
        User user = new User();
        
        try {
            int is_available = 0;
            String query = "SELECT * FROM user WHERE username = '"+inputUsername+"';";
            PreparedStatement statement = Koneksi.getConnection().prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            
            while (rs.next()) {
                is_available = rs.getInt(1);
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String icon_profile = rs.getString("icon_profile");
                String nama_lengkap = rs.getString("nama_lengkap");
                String email = rs.getString("email");
                String tentang_saya = rs.getString("tentang_saya");
                Date tanggal_lahir = rs.getTimestamp("tanggal_lahir");
                Date created_at = rs.getTimestamp("created_at");
                Date updated_at = rs.getTimestamp("updated_at");
                
                user = new User(id, username, password, icon_profile, nama_lengkap, email, tentang_saya, tanggal_lahir, created_at, updated_at);
            }
            
            if (is_available > 0) {
//                String hashed = BCrypt.hashpw("admin12345", BCrypt.gensalt());
                if (BCrypt.checkpw(inputPassword, user.getPassword())) {
                    status = true;
                    Main.is_login = true;
                    Main.userlogin = user;
                    System.out.println("Login Berhasil");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat pengambilan data.", "Database Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return status;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package picturematching.controllers;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
            String query = "SELECT * FROM users;";
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
    
    public User getOneData(int inputId){
        User user = new User();

        try {
            int is_available = 0;
            String query = "SELECT * FROM users WHERE id = '"+inputId+"';";
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
            
            if (is_available < 1) {
                JOptionPane.showMessageDialog(null, "Data yang anda cari tidak ditemukan.", "Not Found", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat pengambilan data.", "Database Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return user;
    }
    
    public boolean login(String inputUsername, String inputPassword) {
        boolean status = false;
        User user = new User();
        
        try {
            int is_available = 0;
            String query = "SELECT * FROM users WHERE username = '"+inputUsername+"';";
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
    
    public boolean register(String inputEmail, String inputUsername, String inputPassword) {
        boolean status = false;
        
        try {
            int statusResponse;
            String query = "INSERT INTO users (email, username, password) VALUES (?, ?, ?)";
            PreparedStatement statement = Koneksi.getConnection().prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, inputEmail);
            statement.setString(2, inputUsername);
            statement.setString(3, BCrypt.hashpw(inputPassword, BCrypt.gensalt()));
            statusResponse = statement.executeUpdate();
            ResultSet rs = statement.executeQuery();
            statement.close();
            
            if (statusResponse > 0) {
                User user;
                while (rs.next()) {
                    user = this.getOneData(rs.getInt(1));
                    
                    if (user.getUsername() == null) {
                        JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat pengambilan data.", "Database Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        status = true;
                        Main.is_login = true;
                        Main.userlogin = user;
                        System.out.println("Register Berhasil");
                    }
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cobalah dengan email atau username yang berbeda.", "Autentikasi Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return status;
    }
    
    public boolean update(int id, String inputNamaLengkap, String inputTanggalLahir, String inputTentangSaya) throws ParseException {
        boolean status = false;
        
        try {
            int statusResponse;
            String query = "UPDATE users SET nama_lengkap = '?', tanggal_lahir = '?', tentang_saya = '?' WHERE id = ?";
            PreparedStatement statement = Koneksi.getConnection().prepareStatement(query);
            statement.setString(1, inputNamaLengkap);
            statement.setString(2, inputTanggalLahir);
            statement.setString(3, inputTentangSaya);
            statement.setInt(4, id);
            statusResponse = statement.executeUpdate();
            statement.close();
            
            if (statusResponse > 0) {
                status = true;
                Main.userlogin.setNama_lengkap(inputNamaLengkap);
                if (inputTanggalLahir != null) {
                    if (!inputTanggalLahir.isBlank() || !inputTanggalLahir.isEmpty()) {
                        Main.userlogin.setTanggal_lahir(new SimpleDateFormat("yyyy-MM-dd").parse(inputTanggalLahir));
                    }
                }
                Main.userlogin.setTentang_saya(inputTentangSaya);
                System.out.println("Update Profile Berhasil");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat pemrosesan data.", "Database Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return status;
    }
}
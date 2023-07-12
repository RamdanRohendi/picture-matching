/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package picturematching.models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import picturematching.database.Koneksi;

/**
 *
 * @author Ramdan Rohendi
 */
public class User {
    private int id;
    private String username;
    private String password;
    private String icon_profile;
    private String nama_lengkap;
    private String email;
    private String tentang_saya;
    private Date tanggal_lahir;
    private Date created_at;
    private Date updated_at;

    public User() {
    }

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public User(String username, String password, String icon_profile, String nama_lengkap, String email, String tentang_saya, Date tanggal_lahir) {
        this.username = username;
        this.password = password;
        this.icon_profile = icon_profile;
        this.nama_lengkap = nama_lengkap;
        this.email = email;
        this.tentang_saya = tentang_saya;
        this.tanggal_lahir = tanggal_lahir;
    }

    public User(int id, String username, String password, String icon_profile, String nama_lengkap, String email, String tentang_saya, Date tanggal_lahir, Date created_at, Date updated_at) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.icon_profile = icon_profile;
        this.nama_lengkap = nama_lengkap;
        this.email = email;
        this.tentang_saya = tentang_saya;
        this.tanggal_lahir = tanggal_lahir;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }
    
    public HistoryPlaying historyPlaying() {
        HistoryPlaying history = new HistoryPlaying();
        
        try {
            int is_available = 0;
            String query = "SELECT * FROM history_playing WHERE user_id = '"+this.id+"';";
            PreparedStatement statement = Koneksi.getConnection().prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            
            while (rs.next()) {
                is_available = rs.getInt(1);
                int history_id = rs.getInt("id");
                int user_id = rs.getInt("user_id");
                int best_score = rs.getInt("best_score");
                int jml_play_normal = rs.getInt("jml_play_normal");
                int jml_play_hard = rs.getInt("jml_play_hard");
                Date history_created_at = rs.getTimestamp("created_at");
                Date history_updated_at = rs.getTimestamp("updated_at");
                
                history = new HistoryPlaying(history_id, user_id, best_score, jml_play_normal, jml_play_hard, history_created_at, history_updated_at);
            }
            
            if (is_available < 1) {
                JOptionPane.showMessageDialog(null, "Tidak Terdapat Data History.", "Data Not Found", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat pengambilan data.", "Database Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return history;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getIcon_profile() {
        return icon_profile;
    }

    public String getNama_lengkap() {
        return nama_lengkap;
    }

    public String getEmail() {
        return email;
    }

    public String getTentang_saya() {
        return tentang_saya;
    }

    public Date getTanggal_lahir() {
        return tanggal_lahir;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }
}

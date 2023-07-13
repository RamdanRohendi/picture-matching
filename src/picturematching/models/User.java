/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package picturematching.models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
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
    
    public GameHistory myHistory() {
        GameHistory history = new GameHistory();
        
        try {
            int is_available = 0;
            String query = "SELECT * FROM game_histories WHERE user_id = '"+this.id+"';";
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
                
                history = new GameHistory(history_id, user_id, best_score, jml_play_normal, jml_play_hard, history_created_at, history_updated_at);
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

    public void setNama_lengkap(String nama_lengkap) {
        this.nama_lengkap = nama_lengkap;
    }
    
    public String getNama_lengkap() {
        return nama_lengkap;
    }

    public String getEmail() {
        return email;
    }

    public void setTentang_saya(String tentang_saya) {
        this.tentang_saya = tentang_saya;
    }
    
    public String getTentang_saya() {
        return tentang_saya;
    }

    public void setTanggal_lahir(Date tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }
    
    public Date getTanggal_lahir() {
        return tanggal_lahir;
    }
    
    public String getStringTanggal_lahir() {
        String data = "";
        
        if (this.tanggal_lahir != null) {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            data = dateFormat.format(this.tanggal_lahir);
        }
        
        return data;
    }
    
    public String getStringFormattedTanggal_lahir() {
        String data = "";
        HashMap<String, String> bulan = new HashMap<>();
        bulan.put("01", "Januari");
        bulan.put("02", "Februari");
        bulan.put("03", "Maret");
        bulan.put("04", "April");
        bulan.put("05", "Mei");
        bulan.put("06", "Juni");
        bulan.put("07", "Juli");
        bulan.put("08", "Agustus");
        bulan.put("09", "September");
        bulan.put("10", "Oktober");
        bulan.put("11", "November");
        bulan.put("12", "Desember");
        
        if (this.tanggal_lahir != null) {
            data = this.getStringTanggal_lahir();
            String[] dataPecah = data.split("-");
            data = dataPecah[2] + " " + bulan.get(dataPecah[1]) + " " + dataPecah[0];
        }
        
        return data;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }
}

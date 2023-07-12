/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package picturematching.models;

import java.util.Date;

/**
 *
 * @author Ramdan Rohendi
 */
public class HistoryPlaying {
    private int id;
    private int user_id;
    private int best_score;
    private int jml_play_normal;
    private int jml_play_hard;
    private Date created_at;
    private Date updated_at;

    public HistoryPlaying() {
    }

    public HistoryPlaying(int user_id) {
        this.user_id = user_id;
    }

    public HistoryPlaying(int best_score, int jml_play_normal, int jml_play_hard) {
        this.best_score = best_score;
        this.jml_play_normal = jml_play_normal;
        this.jml_play_hard = jml_play_hard;
    }

    public HistoryPlaying(int id, int user_id, int best_score, int jml_play_normal, int jml_play_hard, Date created_at, Date updated_at) {
        this.id = id;
        this.user_id = user_id;
        this.best_score = best_score;
        this.jml_play_normal = jml_play_normal;
        this.jml_play_hard = jml_play_hard;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }
    
    public int getId() {
        return id;
    }

    public int getUser_id() {
        return user_id;
    }

    public int getBest_score() {
        return best_score;
    }

    public int getJml_play_normal() {
        return jml_play_normal;
    }

    public int getJml_play_hard() {
        return jml_play_hard;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }
    
    
}

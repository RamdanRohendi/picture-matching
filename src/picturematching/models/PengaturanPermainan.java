/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package picturematching.models;

/**
 *
 * @author Ramdan Rohendi
 */
public class PengaturanPermainan {
    private String kesulitan;
    private int jmlKartu;
    private int batasWaktu;
    private PengaturanGrid pengaturanGrid;

    public String getKesulitan() {
        return kesulitan;
    }

    public void setKesulitan(String kesulitan) {
        this.kesulitan = kesulitan;
    }

    public int getJmlKartu() {
        return jmlKartu;
    }

    public void setJmlKartu(int jmlKartu) {
        this.jmlKartu = jmlKartu;
        
        switch (jmlKartu) {
            case 16 -> this.batasWaktu = 60;
            case 20 -> this.batasWaktu = 90;
            case 24 -> this.batasWaktu = 120;
            default -> this.batasWaktu = 0;
        }
        
        pengaturanGrid = new PengaturanGrid(jmlKartu);
    }

    public int getBatasWaktu() {
        return batasWaktu;
    }

    public PengaturanGrid getPengaturanGrid() {
        return pengaturanGrid;
    }
}

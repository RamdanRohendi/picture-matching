/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package picturematching.models;

/**
 *
 * @author Ramdan Rohendi
 */
public class PengaturanGrid {
    private int baris;
    private int kolom;
    private int jarakH;
    private int jarakV;

    public PengaturanGrid(int jmlData) {
        switch (jmlData) {
            case 6 -> {
                this.baris = 3;
                this.kolom = 2;
                this.jarakH = 45;
                this.jarakV = 20;
            }
            case 10 -> {
                this.baris = 4;
                this.kolom = 3;
                this.jarakH = 10;
                this.jarakV = 10;
            }
            case 14 -> {
                this.baris = 5;
                this.kolom = 3;
                this.jarakH = 10;
                this.jarakV = 10;
            }
            case 16 -> {
                this.baris = 4;
                this.kolom = 4;
                this.jarakH = 10;
                this.jarakV = 35;
            }
            case 20 -> {
                this.baris = 5;
                this.kolom = 4;
                this.jarakH = 10;
                this.jarakV = 10;
            }
            case 24 -> {
                this.baris = 6;
                this.kolom = 4;
                this.jarakH = 10;
                this.jarakV = 10;
            }
            default -> System.out.println("Mohon masukan jumlah data yang telah ditentukan saja.");
        }
    }

    public int getBaris() {
        return baris;
    }

    public int getKolom() {
        return kolom;
    }

    public int getJarakH() {
        return jarakH;
    }

    public int getJarakV() {
        return jarakV;
    }
}

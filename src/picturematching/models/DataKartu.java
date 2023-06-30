/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package picturematching.models;

import java.io.File;

/**
 *
 * @author Ramdan Rohendi
 */
public class DataKartu {
    private final String kartu[];

    public DataKartu() {
        String folderPath = getClass().getResource("/picturematching/assets/cards").toString().replace("file:/", "");

        // Kode dibawah akan membaca file yang ada pada folder assets/cards
        // Untuk menambah gambar masukan saja file gambarnya ke folder assets/cards
        // Pastikan gambarnya memiliki ketentuan :
        // - Berformat .png
        // - Berdimensi 50x50
        // - Nama file hanya huruf saja dan lowercase (Tidak Kapital)
        File folder = new File(folderPath);
        File[] listOfFiles = folder.listFiles();
        this.kartu = new String[listOfFiles.length];

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                this.kartu[i] = listOfFiles[i].getName().replace(".png", "");
            }
        }
    }

    public String[] getKartu() {
        return kartu;
    }
}

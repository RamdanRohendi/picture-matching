/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package picturematching.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JLabel;
import javax.swing.Timer;
import picturematching.Main;
import picturematching.events.CardClickListener;
import picturematching.models.DataKartu;
import picturematching.models.PengaturanPermainan;
import picturematching.views.Playing;
import picturematching.views.StatGame;

/**
 *
 * @author Ramdan Rohendi
 */
public class PermainanController {
    private final PengaturanPermainan pengaturanPermainan;
    private final DataKartu dataKartu;
    
    public PermainanController() {
        this.pengaturanPermainan = new PengaturanPermainan();
        this.dataKartu = new DataKartu();
    }
    
    public void setTingkatKesulitan(String kesulitan) {
        pengaturanPermainan.setKesulitan(kesulitan);
    }
    
    public void setJumlahKartu(int jmlKartu) {
        pengaturanPermainan.setJmlKartu(jmlKartu);
    }
    
    public PengaturanPermainan getPengaturan() {
        return pengaturanPermainan;
    }
    
    public String[] getDataKartu(int jml) {
        String kartu[] = this.dataKartu.getKartu();
        int indexKartuRandom[] = new int[(jml/2)];
        String kartuTerpilih[] = new String[jml];
        
        Random r = new Random();
        
        for (int i = 0; i < (jml/2); i++) {
            int indexRandom = r.nextInt(kartu.length);
            
            while (cekTersedia(indexKartuRandom, indexRandom)) {
                indexRandom = r.nextInt(kartu.length);
            }
            
            indexKartuRandom[i] = indexRandom;
            kartuTerpilih[i] = kartu[indexKartuRandom[i]];
            kartuTerpilih[(jml/2) + i] = kartu[indexKartuRandom[i]];
        }
        
        Collections.shuffle(Arrays.asList(kartuTerpilih));
        
        return kartuTerpilih;
    }
    
    private boolean cekTersedia(int dataArray[], int dicari) {
        boolean status = false;
        
        for (int i = 0; i < dataArray.length; i++) {
            if (dataArray[i] == dicari) {
                status = true;
                break;
            }
        }
        
        return status;
    }
    
    public void settingTapPertama(Playing frame) {
        frame.setWaktuSpentTerhitung(0);
        frame.setWaktuSpent(new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setWaktuSpentTerhitung(frame.getWaktuSpentTerhitung()+1);
            }
        }));

        frame.getWaktuSpent().start();

        if (frame.getKesulitan().equals("Hard")) {
            int batasWaktu = Main.permainanController.getPengaturan().getBatasWaktu();
            frame.setWaktuLimitTerhitung(batasWaktu);
            frame.setWaktuLimit(new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.setWaktuLimitTerhitung(frame.getWaktuLimitTerhitung()-1);

                    if (frame.getWaktuLimitTerhitung() <= 0) {
                        frame.getWaktuSpent().stop();
                        frame.getWaktuLimit().stop();

                        StatGame statGame = new StatGame("gameover", frame.getWaktuSpentTerhitung());
                        statGame.setLocation(frame.getLocation());
                        statGame.setVisible(true);
                        frame.dispose();
                    }

                    int minutesPassed = frame.getWaktuLimitTerhitung() / 60;
                    int secondsRemainder = frame.getWaktuLimitTerhitung() % 60;
                    String timeString = String.format("%02d:%02d", minutesPassed, secondsRemainder);
                    frame.setEdtTimer(timeString);
                }
            }));

            frame.getWaktuLimit().start();
        }

        frame.setPertamaKlik(false);
    }
    
    public void cekKesamaanKartu(Playing frame, CardClickListener listener, JLabel kartu) {
            String dataName[] = kartu.getName().split(" ");
            String indexKartu = dataName[0];
            String namaKartu = dataName[1];
        
            JLabel kartuSebelum = frame.getKartuPertama();

            String dataNameSebelum[] = kartuSebelum.getName().split(" ");
            String indexKartuSebelum = dataNameSebelum[0];
            String namaKartuSebelum = dataNameSebelum[1];

            if (!indexKartuSebelum.equals(indexKartu)) {
                if (!kartuSebelum.getName().equals("0 _done") && !kartu.getName().equals("0 _done")) {
                    if (namaKartuSebelum.equals(namaKartu)) {
                        frame.setJmlDone((frame.getJmlDone() + 1));
                        frame.setJmlTerbuka(0);
                        kartu.setName("0 _done");
                        kartuSebelum.setName("0 _done");

                        if (frame.getJmlDone() >= (frame.getJmlKartu()/2)) {
                            frame.getWaktuSpent().stop();
                            if (frame.getKesulitan().equals("Hard")) {
                                frame.getWaktuLimit().stop();
                            }

                            StatGame statGame = new StatGame("win", frame.getWaktuSpentTerhitung());
                            statGame.setLocation(frame.getLocation());
                            statGame.setVisible(true);
                            frame.dispose();
                        }
                    } else {
                        listener.setWaktuBukaTerhitung(0);
                        listener.setWaktuBuka(new Timer(1000, new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                listener.setWaktuBukaTerhitung(listener.getWaktuBukaTerhitung() + 1);

                                if (listener.getWaktuBukaTerhitung() >= 1) {
                                    listener.setWaktuBukaTerhitung(0);
                                    kartuSebelum.setIcon(null);
                                    kartu.setIcon(null);
                                    listener.getWaktuBuka().stop();
                                    frame.setJmlTerbuka(0);
                                }
                            }
                        }));
                        
                        listener.getWaktuBuka().start();
                    }
                }
            }
    }
}

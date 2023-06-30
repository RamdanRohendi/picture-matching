/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package picturematching.events;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;
import picturematching.Main;
import picturematching.views.Playing;

/**
 *
 * @author Ramdan Rohendi
 */
public class CardClickListener implements MouseListener {
    private final Playing frame;
    private Timer waktuBuka;
    private int waktuBukaTerhitung;

    public CardClickListener(Playing frame) {
        this.frame = frame;
    }

    public Timer getWaktuBuka() {
        return waktuBuka;
    }

    public void setWaktuBuka(Timer waktuBuka) {
        this.waktuBuka = waktuBuka;
    }

    public int getWaktuBukaTerhitung() {
        return waktuBukaTerhitung;
    }

    public void setWaktuBukaTerhitung(int waktuBukaTerhitung) {
        this.waktuBukaTerhitung = waktuBukaTerhitung;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        frame.setTxtInfoClick("");
        frame.setJmlTerbuka((frame.getJmlTerbuka() + 1));

        if (frame.isPertamaKlik()) {
            Main.permainanController.settingTapPertama(frame);
        }

        JLabel kartu = (JLabel) e.getSource();
        String dataName[] = kartu.getName().split(" ");
        String namaKartu = dataName[1];
        
        if (!kartu.getName().equals("0 _done")) {
            String dirKartu = "/picturematching/assets/cards/"+namaKartu+".png";
            ImageIcon gbrKartu = new ImageIcon(getClass().getResource(dirKartu));
            kartu.setIcon(gbrKartu);
        }

        if (frame.getJmlTerbuka() >= 2) {
            Main.permainanController.cekKesamaanKartu(frame, this, kartu);
        } else {
            frame.setKartuPertama(kartu);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}

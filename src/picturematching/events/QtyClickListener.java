/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package picturematching.events;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import picturematching.Main;
import picturematching.views.Playing;

/**
 *
 * @author Ramdan Rohendi
 */
public class QtyClickListener implements MouseListener {
    private final JFrame frame;

    public QtyClickListener(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        JLabel qtyClick = (JLabel) e.getSource();
        String qtyFullText = qtyClick.getText();
        String qtyText = qtyFullText.substring(2, qtyFullText.indexOf(" Cards"));
        int qty =  Integer.parseInt(qtyText);

        Main.permainanController.setJumlahKartu(qty);

        Playing viewPlaying = new Playing();
        viewPlaying.setLocation(frame.getLocation());
        viewPlaying.setVisible(true);
        frame.setVisible(false);
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package picturematching.views;

import javax.swing.ImageIcon;
import picturematching.Main;
import picturematching.events.QtyClickListener;

/**
 *
 * @author Ramdan Rohendi
 */
public class QtyCard extends javax.swing.JFrame {
    
    public QtyCard() {
        initComponents();
        this.settingPilihanQuantity();
        
        this.qty1.addMouseListener(new QtyClickListener(this));
        this.qty2.addMouseListener(new QtyClickListener(this));
        this.qty3.addMouseListener(new QtyClickListener(this));
    }
    
    private void settingPilihanQuantity() {
        String tingkatKesulitan = Main.permainanController.getPengaturan().getKesulitan();
        ImageIcon iconNormal = new ImageIcon(getClass().getResource("/picturematching/assets/normal.png"));
        ImageIcon iconHard = new ImageIcon(getClass().getResource("/picturematching/assets/hard.png"));
        this.txtDifficulty.setText(tingkatKesulitan);
        
        if (tingkatKesulitan.equals("Normal")) {
            this.gbrDifficulty.setIcon(iconNormal);
            this.qty1.setText("- 6 Cards");
            this.qty2.setText("- 10 Cards");
            this.qty3.setText("- 14 Cards");
        }
        
        if (tingkatKesulitan.equals("Hard")) {
            this.gbrDifficulty.setIcon(iconHard);
            this.qty1.setText("- 16 Cards");
            this.descQty1.setText("  Time limit = 1 min");
            this.qty2.setText("- 20 Cards");
            this.descQty2.setText("  Time limit = 1:30 min");
            this.qty3.setText("- 24 Cards");
            this.descQty3.setText("  Time limit = 2 min");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Head = new javax.swing.JPanel();
        Body = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        txtDifficulty = new javax.swing.JLabel();
        gbrDifficulty = new javax.swing.JLabel();
        qty1 = new javax.swing.JLabel();
        qty2 = new javax.swing.JLabel();
        qty3 = new javax.swing.JLabel();
        descQty1 = new javax.swing.JLabel();
        descQty2 = new javax.swing.JLabel();
        descQty3 = new javax.swing.JLabel();
        Foot = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Picture Matching - How Many Cards");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Head.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout HeadLayout = new javax.swing.GroupLayout(Head);
        Head.setLayout(HeadLayout);
        HeadLayout.setHorizontalGroup(
            HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        HeadLayout.setVerticalGroup(
            HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        Body.setBackground(new java.awt.Color(204, 204, 204));

        Title.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("How Many Cards");

        txtDifficulty.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        txtDifficulty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDifficulty.setText("Normal");

        gbrDifficulty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gbrDifficulty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picturematching/assets/normal.png"))); // NOI18N
        gbrDifficulty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        qty1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        qty1.setText("- 6 Cards ");
        qty1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        qty1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        qty2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        qty2.setText("- 10 Cards ");
        qty2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        qty2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        qty3.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        qty3.setText("- 14 Cards ");
        qty3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        qty3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        descQty1.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N

        descQty2.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N

        descQty3.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N

        javax.swing.GroupLayout BodyLayout = new javax.swing.GroupLayout(Body);
        Body.setLayout(BodyLayout);
        BodyLayout.setHorizontalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addComponent(txtDifficulty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BodyLayout.createSequentialGroup()
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(gbrDifficulty, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qty3)
                            .addComponent(qty2)
                            .addComponent(qty1))))
                .addContainerGap(104, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descQty1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(descQty2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(descQty3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        BodyLayout.setVerticalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Title)
                .addGap(18, 18, 18)
                .addComponent(txtDifficulty)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gbrDifficulty, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(qty1)
                .addGap(2, 2, 2)
                .addComponent(descQty1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(qty2)
                .addGap(2, 2, 2)
                .addComponent(descQty2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(qty3)
                .addGap(0, 0, 0)
                .addComponent(descQty3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        Foot.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout FootLayout = new javax.swing.GroupLayout(Foot);
        Foot.setLayout(FootLayout);
        FootLayout.setHorizontalGroup(
            FootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        FootLayout.setVerticalGroup(
            FootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Head, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Foot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(Foot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        Home home = new Home();
        home.setLocation(this.getLocation());
        home.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QtyCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QtyCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QtyCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QtyCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QtyCard().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JPanel Foot;
    private javax.swing.JPanel Head;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel descQty1;
    private javax.swing.JLabel descQty2;
    private javax.swing.JLabel descQty3;
    private javax.swing.JLabel gbrDifficulty;
    private javax.swing.JLabel qty1;
    private javax.swing.JLabel qty2;
    private javax.swing.JLabel qty3;
    private javax.swing.JLabel txtDifficulty;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package picturematching.views;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import picturematching.Main;
import picturematching.controllers.UserController;

/**
 *
 * @author Ramdan Rohendi
 */
public class EditProfile extends javax.swing.JFrame {
    private UserController userController;

    public EditProfile() {
        userController = new UserController();
        initComponents();
        
        inputNamaLengkap.setText(Main.userlogin.getNama_lengkap());
        inputTanggalLahir.setText(Main.userlogin.getStringTanggal_lahir());
        inputTentangSaya.setText(Main.userlogin.getTentang_saya());
    }
    
    private void actionUpdateProfile() throws ParseException {
        int id = Main.userlogin.getId();
        String nama_lengkap = this.inputNamaLengkap.getText();
        String tanggal_lahir = this.inputTanggalLahir.getText();
        String tentang_saya = this.inputTentangSaya.getText();
        
        boolean check_update = userController.update(id, nama_lengkap, tanggal_lahir, tentang_saya);

        if (check_update) {
            Profile profile = new Profile();
            profile.setLocation(this.getLocation());
            profile.setVisible(true);
            this.setVisible(false);
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
        btnHighscore = new javax.swing.JLabel();
        Body = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JLabel();
        lblNamaLengkap = new javax.swing.JLabel();
        inputNamaLengkap = new javax.swing.JTextField();
        lblTanggalLahir = new javax.swing.JLabel();
        inputTanggalLahir = new javax.swing.JTextField();
        lblTentangSaya = new javax.swing.JLabel();
        scrPaneTentangSaya = new javax.swing.JScrollPane();
        inputTentangSaya = new javax.swing.JTextArea();
        Foot = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Picture Matching - Edit Profile");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Head.setBackground(new java.awt.Color(102, 102, 102));

        btnHighscore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picturematching/assets/ranking.png"))); // NOI18N
        btnHighscore.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHighscore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHighscoreMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout HeadLayout = new javax.swing.GroupLayout(Head);
        Head.setLayout(HeadLayout);
        HeadLayout.setHorizontalGroup(
            HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeadLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHighscore)
                .addContainerGap())
        );
        HeadLayout.setVerticalGroup(
            HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHighscore)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Body.setBackground(new java.awt.Color(204, 204, 204));

        Title.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Edit Profile");

        btnSimpan.setBackground(new java.awt.Color(0, 0, 0));
        btnSimpan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picturematching/assets/btnsimpan.png"))); // NOI18N
        btnSimpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSimpanMouseClicked(evt);
            }
        });

        lblNamaLengkap.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        lblNamaLengkap.setText("Nama Lengkap");

        inputNamaLengkap.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lblTanggalLahir.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        lblTanggalLahir.setText("Tanggal Lahir");

        inputTanggalLahir.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lblTentangSaya.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        lblTentangSaya.setText("Tentang Saya");

        inputTentangSaya.setColumns(20);
        inputTentangSaya.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        inputTentangSaya.setLineWrap(true);
        inputTentangSaya.setRows(5);
        scrPaneTentangSaya.setViewportView(inputTentangSaya);

        javax.swing.GroupLayout BodyLayout = new javax.swing.GroupLayout(Body);
        Body.setLayout(BodyLayout);
        BodyLayout.setHorizontalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BodyLayout.createSequentialGroup()
                        .addComponent(lblTentangSaya)
                        .addGap(190, 190, 190))
                    .addComponent(scrPaneTentangSaya, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputNamaLengkap)
                    .addComponent(inputTanggalLahir, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BodyLayout.createSequentialGroup()
                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNamaLengkap, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTanggalLahir, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
            .addComponent(btnSimpan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BodyLayout.setVerticalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(Title)
                .addGap(28, 28, 28)
                .addComponent(lblNamaLengkap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNamaLengkap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTanggalLahir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTentangSaya)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrPaneTentangSaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnSimpan)
                .addGap(14, 14, 14))
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

    private void btnSimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMouseClicked
        try {
            this.actionUpdateProfile();
        } catch (ParseException ex) {
            Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSimpanMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Profile profile = new Profile();
        profile.setLocation(this.getLocation());
        profile.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnHighscoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHighscoreMouseClicked
        Highscore highscore = new Highscore();
        highscore.setLocation(this.getLocation());
        highscore.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHighscoreMouseClicked

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
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JPanel Foot;
    private javax.swing.JPanel Head;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel btnHighscore;
    private javax.swing.JLabel btnSimpan;
    private javax.swing.JTextField inputNamaLengkap;
    private javax.swing.JTextField inputTanggalLahir;
    private javax.swing.JTextArea inputTentangSaya;
    private javax.swing.JLabel lblNamaLengkap;
    private javax.swing.JLabel lblTanggalLahir;
    private javax.swing.JLabel lblTentangSaya;
    private javax.swing.JScrollPane scrPaneTentangSaya;
    // End of variables declaration//GEN-END:variables
}

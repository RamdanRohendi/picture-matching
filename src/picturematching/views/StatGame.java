/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package picturematching.views;

/**
 *
 * @author Ramdan Rohendi
 */
public class StatGame extends javax.swing.JFrame {

    public StatGame() {
        initComponents();
    }
    
    public StatGame(String status, int waktuSpent) {
        initComponents();
        
        if (status.equals("win")) {
            txtStat.setText("<html> <body> <center> YOU<br>WIN </center> </body> </html>");
        }
        
        if (status.equals("gameover")) {
            txtTimeSpent.setForeground(new java.awt.Color(0, 0, 0));
            edtTimeSpent.setForeground(new java.awt.Color(0, 0, 0));
            txtStat.setText("<html> <body> <center> GAME<br>OVER </center> </body> </html>");
        }
        
        int minutesPassed = waktuSpent / 60;
        int secondsRemainder = waktuSpent % 60;
        String timeString = String.format("%02d:%02d", minutesPassed, secondsRemainder);
        edtTimeSpent.setText(timeString);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StatGame = new javax.swing.JPanel();
        txtStat = new javax.swing.JLabel();
        goHome = new javax.swing.JLabel();
        txtTimeSpent = new javax.swing.JLabel();
        edtTimeSpent = new javax.swing.JLabel();

        setTitle("Picture Matching - Playing");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(java.awt.Color.black);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        StatGame.setBackground(new java.awt.Color(0, 0, 0));
        StatGame.setMaximumSize(new java.awt.Dimension(312, 500));
        StatGame.setMinimumSize(new java.awt.Dimension(312, 500));

        txtStat.setFont(new java.awt.Font("Rockwell", 0, 48)); // NOI18N
        txtStat.setForeground(new java.awt.Color(255, 255, 255));
        txtStat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtStat.setText("<html>\n<body>\n<center>\nYOU<br>WIN\n</center>\n</body>\n</html>");

        goHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        goHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picturematching/assets/home.png"))); // NOI18N
        goHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goHomeMouseClicked(evt);
            }
        });

        txtTimeSpent.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        txtTimeSpent.setForeground(new java.awt.Color(255, 255, 255));
        txtTimeSpent.setText("Time Spent:");

        edtTimeSpent.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        edtTimeSpent.setForeground(new java.awt.Color(255, 255, 255));
        edtTimeSpent.setText("00:00");

        javax.swing.GroupLayout StatGameLayout = new javax.swing.GroupLayout(StatGame);
        StatGame.setLayout(StatGameLayout);
        StatGameLayout.setHorizontalGroup(
            StatGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtStat)
            .addGroup(StatGameLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(txtTimeSpent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtTimeSpent)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(goHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        StatGameLayout.setVerticalGroup(
            StatGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatGameLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(txtStat, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(StatGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimeSpent)
                    .addComponent(edtTimeSpent))
                .addGap(42, 42, 42)
                .addComponent(goHome)
                .addGap(124, 124, 124))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(StatGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(StatGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        Home home = new Home();
        home.setLocation(this.getLocation());
        home.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void goHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goHomeMouseClicked
        // TODO add your handling code here:
        Home home = new Home();
        home.setLocation(this.getLocation());
        home.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_goHomeMouseClicked

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
            java.util.logging.Logger.getLogger(StatGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StatGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StatGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StatGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel StatGame;
    private javax.swing.JLabel edtTimeSpent;
    private javax.swing.JLabel goHome;
    private javax.swing.JLabel txtStat;
    private javax.swing.JLabel txtTimeSpent;
    // End of variables declaration//GEN-END:variables
}

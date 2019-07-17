
import java.awt.Font;
import java.io.File;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.JOptionPane;
public class character extends javax.swing.JFrame {

    
    public character() {
        initComponents();
      
        jLabel2.setFont(new Font("Broadway",Font.PLAIN,30));
        jLabel3.setFont(new Font("Broadway",Font.PLAIN,15));
        jLabel4.setFont(new Font("Broadway",Font.PLAIN,15));
         jLabel5.setFont(new Font("Broadway",Font.PLAIN,15));
        jLabel6.setFont(new Font("Broadway",Font.PLAIN,15));
         jLabel7.setFont(new Font("Broadway",Font.PLAIN,15));
        jLabel8.setFont(new Font("Broadway",Font.PLAIN,15));
        jLabel9.setFont(new Font("Broadway",Font.PLAIN,15));
        jLabel10.setFont(new Font("Broadway",Font.PLAIN,15));
        jLabel11.setFont(new Font("Broadway",Font.PLAIN,15));
        jLabel12.setFont(new Font("Broadway",Font.PLAIN,15));
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(null);

        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(590, 170, 55, 23);

        jLabel5.setText("3.Sania Mirza");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 140, 140, 20);

        jLabel10.setText("8.Kim Jong");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 290, 160, 14);

        jLabel11.setText("9.Steve Jobs");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(40, 310, 200, 30);

        jLabel12.setText("10.Rohit Khandelwal");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(40, 340, 250, 14);

        jLabel9.setText("7.Donald Trump");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 260, 150, 14);

        jLabel8.setText("6.Malala Yousafjai");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 230, 330, 14);

        jLabel7.setText("5.Kareena Kapoor");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 200, 350, 14);

        jLabel6.setText("4.Jalaluddin Akbar");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 170, 200, 14);

        jLabel3.setText("1.Amitabh Bachachan");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 80, 190, 30);

        jLabel4.setText("2.Sachin Tendulkar");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 110, 180, 30);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Characters to be choosen are:");
        jLabel2.setToolTipText("");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 20, 490, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/charj/newpackage/4032760-puzzle-wallpapers.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-880, -310, 2280, 1480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         new first1().setVisible(true);
          try{
            JFXPanel j=new JFXPanel();
      
         String  uri=new File("au1.mp3").toURI().toString();
         new MediaPlayer(new Media(uri)).play();}
        catch(Exception ex){
        JOptionPane.showMessageDialog(null,ex);}
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
        
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
            java.util.logging.Logger.getLogger(character.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(character.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(character.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(character.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new character().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

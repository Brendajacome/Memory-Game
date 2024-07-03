/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import java.awt.Color;
import java.security.SecureRandom;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class EasyMode extends javax.swing.JFrame {
ArrayList <JLabel> Labels = new ArrayList();
SecureRandom cardsrandom = new cardsrandom();
String[] piceasy = new String[6];
String[][]easyroute = new String [4][3];
int[] cards = new int [6];

    public EasyMode() {
        initComponents();
        setSize(700, 800);
        setLocationRelativeTo(this);
        loadingLabels();
        addcard();
        jPanel1easy.setVisible(false);
    }
void loadingLabels(){
    Labels.add(card1);
    Labels.add(card2);
    Labels.add(card3);
    Labels.add(card4);
    Labels.add(card5);
    Labels.add(card6);
    Labels.add(card7);
    Labels.add(card8);
    Labels.add(card9);
    Labels.add(card10);
    Labels.add(card11);
    Labels.add(card12);
}
public int cardImagen(){
  int cardcreated = cardsrandom.nextInt(6);
    
    return cardcreated;
}
void addcard(){
    for (int pic = 0; pic < piceasy.length; pic++){
      piceasy[pic] = "/img/" + (pic + 1) + ".jpg";
  }  
}
public void loadimageslabels(){
    int counter=0;
    for (int row=0; row <easyroute.length;row++){
        for (int column=0; column <easyroute[0].length;column++){
            int temp = cardImagen();
            if(cards[temp]==2){
                column--;
            }else{
             easyroute[row][column]=piceasy[temp];  
             cards[temp]++;
            }  
        }
    }
    
    for (int row=0; row <easyroute.length;row++){
        for (int column=0; column <easyroute[0].length;column++){
           Labels.get(counter).setOpaque(true);
           Labels.get(counter).setIcon(new ImageIcon(getClass().getResource(easyroute[row][column])));
           counter++;
        }
    } 
}
void flipcards() {
    ImageIcon backIcon = new ImageIcon(getClass().getResource("/others/1.jpg"));
    for (int i = 0; i < Labels.size(); i++) {
        Labels.get(i).setIcon(backIcon);
    }
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startButton = new javax.swing.JButton();
        jPanel1easy = new javax.swing.JPanel();
        card1 = new javax.swing.JLabel();
        card2 = new javax.swing.JLabel();
        card3 = new javax.swing.JLabel();
        card4 = new javax.swing.JLabel();
        card5 = new javax.swing.JLabel();
        card6 = new javax.swing.JLabel();
        card7 = new javax.swing.JLabel();
        card8 = new javax.swing.JLabel();
        card9 = new javax.swing.JLabel();
        card10 = new javax.swing.JLabel();
        card11 = new javax.swing.JLabel();
        card12 = new javax.swing.JLabel();
        play = new javax.swing.JButton();
        compare = new javax.swing.JButton();
        hits = new javax.swing.JLabel();
        failures = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("easy");
        getContentPane().setLayout(null);

        startButton.setText("Empezar");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        getContentPane().add(startButton);
        startButton.setBounds(30, 70, 80, 23);

        jPanel1easy.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        card1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        card2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        card3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        card4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        card5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        card6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        card7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        card8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        card9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        card10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        card11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        card12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1easyLayout = new javax.swing.GroupLayout(jPanel1easy);
        jPanel1easy.setLayout(jPanel1easyLayout);
        jPanel1easyLayout.setHorizontalGroup(
            jPanel1easyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1easyLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1easyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1easyLayout.createSequentialGroup()
                        .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(card5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(card6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1easyLayout.createSequentialGroup()
                        .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1easyLayout.createSequentialGroup()
                        .addGroup(jPanel1easyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1easyLayout.createSequentialGroup()
                                .addComponent(card7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(card8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1easyLayout.createSequentialGroup()
                                .addComponent(card10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(card12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1easyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(card11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1easyLayout.setVerticalGroup(
            jPanel1easyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1easyLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1easyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1easyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1easyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1easyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(card10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1easy);
        jPanel1easy.setBounds(30, 116, 340, 420);

        play.setText("MOSTRAR/JUGAR");
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });
        getContentPane().add(play);
        play.setBounds(410, 106, 130, 30);

        compare.setText("COMPARAR");
        getContentPane().add(compare);
        compare.setBounds(410, 166, 130, 30);

        hits.setBorder(javax.swing.BorderFactory.createTitledBorder("ACIERTOS"));
        getContentPane().add(hits);
        hits.setBounds(430, 236, 100, 90);

        failures.setBorder(javax.swing.BorderFactory.createTitledBorder("FALLOS"));
        getContentPane().add(failures);
        failures.setBounds(430, 361, 100, 90);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton);
        backButton.setBounds(490, 540, 72, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        // TODO add your handling code here:
        jPanel1easy.setVisible(true);
    }//GEN-LAST:event_startButtonActionPerformed

    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        // TODO add your handling code here:
        if(easyroute[0][0]==null){
        loadimageslabels();
        play.setText("Jugar");
      }else{
         flipcards();
         play.setText("Jugar");
        }
    }//GEN-LAST:event_playActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        Interface Main = new Interface();
        Main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(EasyMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EasyMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EasyMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EasyMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EasyMode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel card1;
    private javax.swing.JLabel card10;
    private javax.swing.JLabel card11;
    private javax.swing.JLabel card12;
    private javax.swing.JLabel card2;
    private javax.swing.JLabel card3;
    private javax.swing.JLabel card4;
    private javax.swing.JLabel card5;
    private javax.swing.JLabel card6;
    private javax.swing.JLabel card7;
    private javax.swing.JLabel card8;
    private javax.swing.JLabel card9;
    private javax.swing.JButton compare;
    private javax.swing.JLabel failures;
    private javax.swing.JLabel hits;
    private javax.swing.JPanel jPanel1easy;
    private javax.swing.JButton play;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables
}

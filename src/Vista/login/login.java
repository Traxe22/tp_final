/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.login;

import java.awt.Color;
//import static javafx.scene.paint.Color.color;
import org.xml.sax.Attributes;
import Vista.menuPrincipal.principalMenu;
import javax.swing.JOptionPane;

/**
 *
 * @author APOLO
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    int xMouse, yMouse;

    public login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jB_acceder = new javax.swing.JButton();
        JL_imagenLogo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        jL_exitTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(51, 51, 51));
        background.setMinimumSize(new java.awt.Dimension(800, 500));
        background.setPreferredSize(new java.awt.Dimension(810, 500));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jB_acceder.setFont(new java.awt.Font("HP Simplified", 1, 15)); // NOI18N
        jB_acceder.setText("ACCEDER");
        jB_acceder.setToolTipText("");
        jB_acceder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB_acceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_accederMouseClicked(evt);
            }
        });
        jB_acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_accederActionPerformed(evt);
            }
        });
        background.add(jB_acceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 170, 40));

        JL_imagenLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/DISEÑO B-N2.png"))); // NOI18N
        JL_imagenLogo.setText("jLabel2");
        background.add(JL_imagenLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 680, 370));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(51, 51, 51));
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitBtnMouseExited(evt);
            }
        });

        jL_exitTxt.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jL_exitTxt.setForeground(new java.awt.Color(255, 255, 255));
        jL_exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_exitTxt.setText("X");
        jL_exitTxt.setAlignmentX(40.0F);
        jL_exitTxt.setAlignmentY(40.0F);
        jL_exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jL_exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jL_exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jL_exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jL_exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitBtnLayout.createSequentialGroup()
                .addComponent(jL_exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 745, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 50));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_accederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_accederActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_accederActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitBtnMouseClicked

    private void jL_exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        jL_exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_jL_exitTxtMouseEntered

    private void exitBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseExited
        exitBtn.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_exitBtnMouseExited

    private void jL_exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_exitTxtMouseExited
        exitBtn.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_jL_exitTxtMouseExited

    private void jL_exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_exitTxtMouseClicked
        int option = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que queres cerrar el programa?", "Confirmar cierre", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jL_exitTxtMouseClicked

    private void jB_accederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_accederMouseClicked
        dispose();
        principalMenu menu = new principalMenu();
        menu.setVisible(true);
    }//GEN-LAST:event_jB_accederMouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_imagenLogo;
    private javax.swing.JPanel background;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JButton jB_acceder;
    private javax.swing.JLabel jL_exitTxt;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

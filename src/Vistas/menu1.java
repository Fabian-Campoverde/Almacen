/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import desplazable.Desface;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author FABIAN CAMPOVERDE
 */
public class menu1 extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    
    Desface desplace;
    public menu1() {
        initComponents();
//        desplace= new Desface();
//        boton.addActionListener(e -> {
//            // Al hacer clic en el botón, se crea y muestra la segunda ventana
//            registro_product a = new registro_product();
//            a.setVisible(true);
//        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(950, 455));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        getContentPane().setLayout(null);

        menu1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cetgo.png"))); // NOI18N
        jLabel1.setText("CATEGORIAS");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel1.setVerifyInputWhenFocusTarget(false);
        menu1.add(jLabel1);
        jLabel1.setBounds(0, 100, 220, 50);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/inicio.png"))); // NOI18N
        jLabel2.setText("INICIO  ");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel2.setVerifyInputWhenFocusTarget(false);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        menu1.add(jLabel2);
        jLabel2.setBounds(0, 0, 220, 50);

        user.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        user.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/user_1.png"))); // NOI18N
        user.setText(" USUARIOS");
        user.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        user.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        user.setIconTextGap(15);
        user.setVerifyInputWhenFocusTarget(false);
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userMouseClicked(evt);
            }
        });
        menu1.add(user);
        user.setBounds(0, 50, 220, 50);

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/producto.png"))); // NOI18N
        jLabel4.setText("PRODUCTOS");
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel4.setVerifyInputWhenFocusTarget(false);
        menu1.add(jLabel4);
        jLabel4.setBounds(0, 150, 220, 50);

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mensaje.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel5.setVerifyInputWhenFocusTarget(false);
        menu1.add(jLabel5);
        jLabel5.setBounds(0, 200, 220, 50);

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/apagar.png"))); // NOI18N
        jLabel6.setText("SALIR");
        jLabel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel6.setVerifyInputWhenFocusTarget(false);
        menu1.add(jLabel6);
        jLabel6.setBounds(0, 250, 220, 50);

        getContentPane().add(menu1);
        menu1.setBounds(0, 0, 221, 320);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
//        if (menu1.getX()==0) {
//            desplace.desplazarIzquierda(menu1, menu1.getX(), -155, 10, 10);
//        } else if (menu1.getX()!=0) {
//            desplace.desplazarDerecha(menu1, menu1.getX(), 0, 10, 10);
//        }
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
      menu1.setSize(new Dimension(menu1.getWidth(), this.getHeight()));
    }//GEN-LAST:event_formComponentResized

    private void userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseClicked
        MenuUsuario m= new MenuUsuario();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_userMouseClicked

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
            java.util.logging.Logger.getLogger(menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new menu1().setVisible(true);
                new menu1().pack();
                 
            }
        });
    }
//class registro_product extends JFrame {
//    public registro_product() {
//        setTitle("Segunda Ventana");
//        setSize(500, 600);
//
//        // Agregar un WindowListener para interceptar el evento de cierre de la ventana
//        addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                // Al cerrar la ventana, se cierra solo esta ventana
//                dispose();
//            }
//        });
//
//        setLocationRelativeTo(null);
//    }
//}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel menu1;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
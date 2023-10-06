/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasFinal;

import VistasFinal.Login;
import Controlador.ControladorUsuario;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.IntelliJTheme;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubIJTheme;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.EventQueue;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author FABIAN CAMPOVERDE
 */
public class RegistroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form RegistroUsuario
     */
    public RegistroUsuario() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        crazyPanel1 = new raven.crazypanel.CrazyPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombres = new javax.swing.JTextField();
        apellidos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dni = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        contra = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox();
        registro = new javax.swing.JButton();
        sesion = new javax.swing.JButton();
        modo = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(300, 100));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        crazyPanel1.setFlatLafStyleComponent(new raven.crazypanel.FlatLafStyleComponent(
            "",
            new String[]{
                "font:bold +10",
                "font:bold +1",
                "",
                "showClearButton:true;JTextField.placeholderText=Nombres",
                "showClearButton:true;JTextField.placeholderText=Apellidos",
                "",
                "showClearButton:true;JTextField.placeholderText=Ejemplo:12345678",
                "",
                "showClearButton:true;JTextField.placeholderText=usuario@gmail.com",
                "",
                "showClearButton:true;JTextField.placeholderText=**********",
                "",
                "showClearButton:true;JTextField.placeholderText=987654321",
                "",
                "",
                "background:lighten(@background,8%);borderWidth:1",
                ""
            }
        ));
        crazyPanel1.setMigLayoutConstraints(new raven.crazypanel.MigLayoutConstraints(
            "wrap 2,fillx,insets 25",
            "[grow 0,trail]15[fill]",
            "",
            new String[]{
                "wrap,al lead",
                "wrap,al lead",
                "",
                "split 2",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "span 2,al trail",
                "al trail",
                ""
            }
        ));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATOS PERSONALES");
        crazyPanel1.add(jLabel1);

        jLabel3.setText("*Campo obligatorio");
        crazyPanel1.add(jLabel3);

        jLabel4.setText("Nombres completos");
        crazyPanel1.add(jLabel4);
        crazyPanel1.add(nombres);
        crazyPanel1.add(apellidos);

        jLabel2.setText("DNI");
        crazyPanel1.add(jLabel2);
        crazyPanel1.add(dni);

        jLabel6.setText("Correo");
        crazyPanel1.add(jLabel6);
        crazyPanel1.add(correo);

        jLabel7.setText("Contraseña");
        crazyPanel1.add(jLabel7);
        crazyPanel1.add(contra);

        jLabel8.setText("Telefono");
        crazyPanel1.add(jLabel8);
        crazyPanel1.add(telefono);

        jLabel9.setText("Tipo de Usuario");
        crazyPanel1.add(jLabel9);

        tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Administrador", "Encargado de Almacen", "Ventas" }));
        crazyPanel1.add(tipo);

        registro.setText("REGISTRAR");
        registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroActionPerformed(evt);
            }
        });
        crazyPanel1.add(registro);

        sesion.setText("Iniciar Sesión");
        sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sesionActionPerformed(evt);
            }
        });

        modo.setText("Modo");
        modo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modoMouseClicked(evt);
            }
        });
        modo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("REGISTRO DE USUARIOS");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(crazyPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(sesion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(modo)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modo)
                    .addComponent(sesion))
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crazyPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
//     
//                int newY = (this.getHeight() - user.getHeight()) / 2; // Mantenemos la posición vertical
//                user.setLocation(user.getX(), newY);
//
//                // Ajustamos la posición horizontal en función del ancho de la ventana
//                int xOffset = this.getWidth() / 4; // Cambia este valor según tus preferencias
//                user.setLocation(275,45);

    }//GEN-LAST:event_formComponentResized

    private void modoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modoActionPerformed
        if (!FlatLaf.isLafDark()) {
            EventQueue.invokeLater(() -> {
                modo.setIcon(new FlatSVGIcon("Img/sun.svg"));
                modo.setText("Dia");
                FlatAnimatedLafChange.showSnapshot();
                FlatDarculaLaf.setup();
                FlatLaf.updateUI();
                FlatAnimatedLafChange.hideSnapshotWithAnimation();

            });

        } else {
            EventQueue.invokeLater(() -> {
                modo.setIcon(new FlatSVGIcon("Img/moon.svg"));
                modo.setText("Noche");
                FlatAnimatedLafChange.showSnapshot();
                FlatIntelliJLaf.setup();
                FlatLaf.updateUI();
                FlatAnimatedLafChange.hideSnapshotWithAnimation();

            });
        }

    }//GEN-LAST:event_modoActionPerformed
    private MenuUsuarios menu;

    public void Registro(MenuUsuarios menuCategoria) {
        this.menu= menuCategoria;
    }
    private void modoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modoMouseClicked

    }//GEN-LAST:event_modoMouseClicked

    private void registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroActionPerformed
        String a, b, c, d, h, DNI, tel;
        int e, f;
        int g = 0;
        a = contra.getText();

        b = nombres.getText();
        c = apellidos.getText();
        d = correo.getText();
        DNI = dni.getText();
        tel = telefono.getText();
        h = (String) tipo.getSelectedItem();
        if (h.equals("Administrador")) {
            g = 1;
        }
        if (h.equals("Encargado de Almacen")) {
            g = 2;
        }
        if (h.equals("Ventas")) {
            g = 3;
        }
        if (a.equals("") || b.equals("") || c.equals("") || d.equals("") || DNI.equals("") || tel.equals("") || h.equals("") || g == 0) {
            JOptionPane.showMessageDialog(null, "Ingresar datos correctos");
        } else {
            e = Integer.parseInt(DNI);
            f = Integer.parseInt(tel);
            ControladorUsuario.setDatos(c, b, a, d, e, f, g);
            String msg = ControladorUsuario.decisor(1);
            if (msg.equals("DNI debe ser unico uwu")) {
                JOptionPane.showMessageDialog(null, msg);
            } else {
                JOptionPane.showMessageDialog(null, msg);
                contra.setText("");
                nombres.setText("");
                apellidos.setText("");
                correo.setText("");
                dni.setText("");
                telefono.setText("");
                tipo.setSelectedItem("Seleccionar");
//                Login log = new Login();
//                log.setVisible(true);
//                this.setVisible(false);
                menu.actualizarTabla();

            }
        }
    }//GEN-LAST:event_registroActionPerformed

    private void sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sesionActionPerformed
        Login a = new Login();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_sesionActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        FlatLaf.registerCustomDefaultsSource("Prop");
        FlatLightLaf.setup();
        //IntelliJTheme.setup(RegistroUsuario.class.getResourceAsStream("/template.theme.json"));
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroUsuario().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidos;
    private javax.swing.JTextField contra;
    private javax.swing.JTextField correo;
    private raven.crazypanel.CrazyPanel crazyPanel1;
    private javax.swing.JTextField dni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton modo;
    private javax.swing.JTextField nombres;
    private javax.swing.JButton registro;
    private javax.swing.JButton sesion;
    private javax.swing.JTextField telefono;
    private javax.swing.JComboBox tipo;
    // End of variables declaration//GEN-END:variables
}

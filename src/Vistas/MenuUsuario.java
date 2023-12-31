/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controlador.ControladorUsuario;
import Modelo.bUsuario;
import desplazable.Desface;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author FABIAN CAMPOVERDE
 */
public class MenuUsuario extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
//    Desface desplace;
    bUsuario bean = new bUsuario();
    DefaultTableModel modelo = new DefaultTableModel();
    private TableRowSorter trs;

    public MenuUsuario() {
        initComponents();
        listar();

//        desplace= new Desface();
//        boton.addActionListener(e -> {
//            // Al hacer clic en el botón, se crea y muestra la segunda ventana
//            registro_product a = new registro_product();
//            a.setVisible(true);
//        });
    }

    private void listar() {
        List<bUsuario> lista = ControladorUsuario.listar(1);
        modelo = (DefaultTableModel) tabla.getModel();

        Object[] ob = new Object[7];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getDni();
            ob[1] = lista.get(i).getNombres();
            ob[2] = lista.get(i).getApellidos();
            ob[3] = lista.get(i).getTelefono();
            ob[4] = lista.get(i).getNom_tipo();
            ob[5] = lista.get(i).getCorreo();
            ob[6] = lista.get(i).getContraseña();
            modelo.addRow(ob);
        }
        tabla.setModel(modelo);
    }

    private void limpiar() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = 0 - 1;
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

        jLabel7 = new javax.swing.JLabel();
        menu1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tel = new javax.swing.JTextField();
        dni = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        ape = new javax.swing.JTextField();
        tipo = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        pass = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        add = new javax.swing.JLabel();
        update = new javax.swing.JLabel();
        clear = new javax.swing.JLabel();
        delete = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        buscar_dni = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        buscar_nombre = new javax.swing.JTextField();

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/crear.png"))); // NOI18N
        jLabel7.setText("CREAR");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("USUARIOS");
        setPreferredSize(new java.awt.Dimension(1100, 500));
        setSize(new java.awt.Dimension(950, 455));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        getContentPane().setLayout(null);

        menu1.setBackground(new java.awt.Color(204, 204, 255));
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
        jLabel5.setText("OBSERVACIONES");
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel5.setVerifyInputWhenFocusTarget(false);
        menu1.add(jLabel5);
        jLabel5.setBounds(0, 200, 220, 50);

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/historial.png"))); // NOI18N
        jLabel6.setText("HISTORIAL");
        jLabel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel6.setVerifyInputWhenFocusTarget(false);
        menu1.add(jLabel6);
        jLabel6.setBounds(0, 300, 220, 50);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        menu1.add(jSeparator1);
        jSeparator1.setBounds(0, -8, 220, 60);

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/prov.png"))); // NOI18N
        jLabel13.setText("PROVEEDORES");
        jLabel13.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel13.setVerifyInputWhenFocusTarget(false);
        menu1.add(jLabel13);
        jLabel13.setBounds(0, 250, 220, 50);

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/gestion.png"))); // NOI18N
        jLabel14.setText("CONFIGURACIÓN");
        jLabel14.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel14.setVerifyInputWhenFocusTarget(false);
        menu1.add(jLabel14);
        jLabel14.setBounds(0, 350, 220, 50);

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/apagar.png"))); // NOI18N
        jLabel15.setText("SALIR");
        jLabel15.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel15.setVerifyInputWhenFocusTarget(false);
        menu1.add(jLabel15);
        jLabel15.setBounds(0, 400, 220, 50);

        getContentPane().add(menu1);
        menu1.setBounds(0, 0, 221, 460);

        tabla.setBackground(new java.awt.Color(153, 255, 204));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Nombres", "Apellidos", "Telefono", "Tipo", "Correo", "Contra"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(250, 250, 610, 200);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 11))); // NOI18N
        jPanel1.setLayout(null);

        jLabel3.setText("DNI");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 40, 50, 14);

        jLabel8.setText("Nombres");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 90, 60, 14);

        jLabel9.setText("Apellidos");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(310, 90, 70, 14);

        jLabel10.setText("Telefono");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(310, 40, 70, 14);

        jLabel11.setText("Tipo");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(690, 60, 40, 14);
        jPanel1.add(tel);
        tel.setBounds(380, 30, 230, 30);

        dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniActionPerformed(evt);
            }
        });
        jPanel1.add(dni);
        dni.setBounds(90, 30, 200, 30);
        jPanel1.add(correo);
        correo.setBounds(90, 130, 200, 30);
        jPanel1.add(ape);
        ape.setBounds(380, 80, 230, 30);

        tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Administrador", "Encargado de almacen", "Ventas" }));
        jPanel1.add(tipo);
        tipo.setBounds(660, 90, 100, 20);

        jLabel18.setText("Correo");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(20, 140, 33, 14);
        jPanel1.add(nom);
        nom.setBounds(90, 80, 200, 30);

        jLabel19.setText("Contraseña");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(310, 140, 70, 14);
        jPanel1.add(pass);
        pass.setBounds(380, 130, 230, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(240, 10, 780, 190);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 11))); // NOI18N
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jPanel2.setLayout(null);

        add.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 11)); // NOI18N
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/crear_1.png"))); // NOI18N
        add.setText("  CREAR");
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        jPanel2.add(add);
        add.setBounds(30, 70, 140, 50);

        update.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 11)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/modif.png"))); // NOI18N
        update.setText("  ACTUALIZAR");
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        jPanel2.add(update);
        update.setBounds(30, 120, 140, 50);

        clear.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 11)); // NOI18N
        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/delete.png"))); // NOI18N
        clear.setText("LIMPIAR");
        clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });
        jPanel2.add(clear);
        clear.setBounds(40, 20, 110, 50);

        delete.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 11)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/delete.png"))); // NOI18N
        delete.setText("   ELIMINAR");
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        jPanel2.add(delete);
        delete.setBounds(40, 170, 110, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(880, 230, 170, 230);

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/apagar.png"))); // NOI18N
        jLabel12.setText("SALIR");
        jLabel12.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel12.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 250, 220, 50);

        jLabel16.setText("BUSCAR POR DNI");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(250, 210, 100, 30);

        buscar_dni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscar_dniKeyTyped(evt);
            }
        });
        getContentPane().add(buscar_dni);
        buscar_dni.setBounds(350, 210, 170, 30);

        jLabel17.setText("BUSCAR POR NOMBRE");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(550, 210, 130, 30);

        buscar_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscar_nombreKeyTyped(evt);
            }
        });
        getContentPane().add(buscar_nombre);
        buscar_nombre.setBounds(680, 210, 180, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
//        if (menu1.getX()==0) {
//            desplace.desplazarIzquierda(menu1, menu1.getX(), -155, 10, 10);
//        } else if (menu1.getX()!=0) {
//            desplace.desplazarDerecha(menu1, menu1.getX(), 0, 10, 10);
//        }
        MenuPrincipal m= new MenuPrincipal();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        menu1.setSize(new Dimension(menu1.getWidth(), this.getHeight()));
    }//GEN-LAST:event_formComponentResized

    private void dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
//        almacen a = new almacen();
//        a.setVisible(true);
//        this.setVisible(false);
        String a, b, c, d, h, DNI, tele;
        int e, f;
        int g = 0;
        a = pass.getText();

        b = nom.getText();
        c = ape.getText();
        d = correo.getText();
        DNI = dni.getText();
        tele = tel.getText();
        h = (String) tipo.getSelectedItem();
        if (h.equals("Administrador")) {
            g = 1;
        }
        if (h.equals("Encargado de almacen")) {
            g = 2;
        }
        if (h.equals("Ventas")) {
            g = 3;
        }
        if (a.equals("") || b.equals("") || c.equals("") || d.equals("") || DNI.equals("") || tele.equals("") || h.equals("") || g == 0) {
            JOptionPane.showMessageDialog(null, "Ingresar datos correctos");
        } else {
            e = Integer.parseInt(DNI);
            f = Integer.parseInt(tele);
            ControladorUsuario.setDatos(c, b, a, d, e, f, g);
            String msg = ControladorUsuario.decisor(1);
            if (msg.equals("DNI debe ser unico uwu")) {
                JOptionPane.showMessageDialog(null, msg);
            } else {
                JOptionPane.showMessageDialog(null, msg);
                pass.setText("");
                nom.setText("");
                ape.setText("");
                correo.setText("");
                dni.setText("");
                tel.setText("");
                tipo.setSelectedItem("Seleccionar");
//                logeo log = new logeo();
//                log.setVisible(true);
//                this.setVisible(false);
                limpiar();
                listar();

            }
        }
    }//GEN-LAST:event_addMouseClicked

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int fila = tabla.getSelectedRow();
        dni.setEnabled(false);
        dni.setText(tabla.getValueAt(fila, 0).toString());
        nom.setText(tabla.getValueAt(fila, 1).toString());
        ape.setText(tabla.getValueAt(fila, 2).toString());
        tel.setText(tabla.getValueAt(fila, 3).toString());
        tipo.setSelectedItem(tabla.getValueAt(fila, 4).toString());
        correo.setText(tabla.getValueAt(fila, 5).toString());
        pass.setText(tabla.getValueAt(fila, 6).toString());
        dni.setEnabled(false);
    }//GEN-LAST:event_tablaMouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked

        int fila = tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona la fila a modificar");
        } else {
            String cod = dni.getText();
            String nombre = nom.getText();
            String apellidos = ape.getText();
            String t = tel.getText();
            String email = correo.getText();
            String contras = pass.getText();
            String h = (String) tipo.getSelectedItem();
            int g = 0;
            if (h.equals("Administrador")) {
                g = 1;
            }
            if (h.equals("Encargado de almacen")) {
                g = 2;
            }
            if (h.equals("Ventas")) {
                g = 3;
            }
            if (cod.equals("") || nombre.equals("") || apellidos.equals("") || email.equals("") || contras.equals("") || h.equals("") || g == 0) {
                JOptionPane.showMessageDialog(null, "Ingresar datos correctos");
            } else {
                int DNI = Integer.parseInt(cod);
                int tele = Integer.parseInt(t);
                ControladorUsuario.setDatos(apellidos, nombre, contras, email, DNI, tele, g);
                String msg = ControladorUsuario.decisor(3);
                if (!msg.equals("Actualizado correctamente")) {
                    JOptionPane.showMessageDialog(null, msg);
                } else {
                    JOptionPane.showMessageDialog(null, msg);
                    pass.setText("");
                    correo.setText("");
                    ape.setText("");
                    nom.setText("");
                    dni.setText("");
                    tel.setText("");
                    tipo.setSelectedItem("Seleccionar");
                    limpiar();
                    listar();
                }
            }
        }
    }//GEN-LAST:event_updateMouseClicked

    private void buscar_dniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscar_dniKeyTyped

        buscar_dni.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent key) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + buscar_dni.getText(), 0));
            }

        }
        );
        trs = new TableRowSorter(tabla.getModel());
        tabla.setRowSorter(trs);
    }//GEN-LAST:event_buscar_dniKeyTyped

    private void buscar_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscar_nombreKeyTyped
        buscar_nombre.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent key) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + buscar_nombre.getText(), 1));
            }

        }
        );
        trs = new TableRowSorter(tabla.getModel());
        tabla.setRowSorter(trs);
    }//GEN-LAST:event_buscar_nombreKeyTyped

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        pass.setText("");
        correo.setText("");
        ape.setText("");
        nom.setText("");
        dni.setText("");
        tel.setText("");
        tipo.setSelectedItem("Seleccionar");
        dni.setEnabled(true);
    }//GEN-LAST:event_clearMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
//        if (!dni.getText().isEmpty()) {
//            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Estas seguro de eliminar el usuario?", "Confirmar", 2);
//            if (confirmacion == 0) {
//                ControladorUsuario.deleteDatos(Integer.parseInt(dni.getText()));
//                String msg = ControladorUsuario.decisor(4);
//                if (!msg.equals("Eliminado correctamente")) {
//                    JOptionPane.showMessageDialog(null, msg);
//                } else {
//                    JOptionPane.showMessageDialog(null, msg);
//                    pass.setText("");
//                    correo.setText("");
//                    ape.setText("");
//                    nom.setText("");
//                    dni.setText("");
//                    tel.setText("");
//                    tipo.setSelectedItem("Seleccionar");
//                    limpiar();
//                    listar();
//                }
//            }
    }//GEN-LAST:event_deleteMouseClicked
    

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
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new MenuUsuario().setVisible(true);
                new MenuUsuario().pack();

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
    private javax.swing.JLabel add;
    private javax.swing.JTextField ape;
    private javax.swing.JTextField buscar_dni;
    private javax.swing.JTextField buscar_nombre;
    private javax.swing.JLabel clear;
    private javax.swing.JTextField correo;
    private javax.swing.JLabel delete;
    private javax.swing.JTextField dni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel menu1;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField pass;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tel;
    private javax.swing.JComboBox tipo;
    private javax.swing.JLabel update;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}

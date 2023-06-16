/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.menuPrincipal;

import Control.ClienteData;
import Modelo.Cliente;
import java.awt.Color;
import java.util.concurrent.ExecutionException;
import javax.swing.JOptionPane;

/**
 *
 * @author Hugo, APOLO
 */
public class agregarCliente extends javax.swing.JFrame {

    ClienteData cliData = new ClienteData();

    /**
     * Creates new form agregarCliente
     */
    int xMouse, yMouse;

    public agregarCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jP_header = new javax.swing.JPanel();
        HomeBtn = new javax.swing.JPanel();
        HomeBtnTxt = new javax.swing.JLabel();
        BtnExit = new javax.swing.JPanel();
        BtnExitTxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jT_nombreCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jT_apellidoCliente = new javax.swing.JTextField();
        jT_direccionCliente = new javax.swing.JTextField();
        jT_idCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jT_telefonoCliente = new javax.swing.JTextField();
        jB_EliminarCliente = new javax.swing.JButton();
        jB_EditarCliente = new javax.swing.JButton();
        jB_AgregarCliente = new javax.swing.JButton();
        jB_buscarCliente = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jB_Limpiar = new javax.swing.JButton();

        jLabel3.setText("Nombre");
        jLabel3.setMinimumSize(new java.awt.Dimension(50, 16));
        jLabel3.setPreferredSize(new java.awt.Dimension(50, 15));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        jP_header.setBackground(new java.awt.Color(51, 51, 51));
        jP_header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jP_headerMouseDragged(evt);
            }
        });
        jP_header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jP_headerMousePressed(evt);
            }
        });

        HomeBtn.setBackground(new java.awt.Color(51, 51, 51));

        HomeBtnTxt.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        HomeBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        HomeBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HomeBtnTxt.setText("<");
        HomeBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout HomeBtnLayout = new javax.swing.GroupLayout(HomeBtn);
        HomeBtn.setLayout(HomeBtnLayout);
        HomeBtnLayout.setHorizontalGroup(
            HomeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 92, Short.MAX_VALUE)
            .addGroup(HomeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(HomeBtnLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(HomeBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        HomeBtnLayout.setVerticalGroup(
            HomeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(HomeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(HomeBtnLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(HomeBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        BtnExit.setBackground(new java.awt.Color(51, 51, 51));
        BtnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BtnExitTxt.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        BtnExitTxt.setForeground(new java.awt.Color(255, 255, 255));
        BtnExitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnExitTxt.setText("X");
        BtnExitTxt.setMaximumSize(new java.awt.Dimension(70, 70));
        BtnExitTxt.setMinimumSize(new java.awt.Dimension(70, 70));
        BtnExitTxt.setPreferredSize(new java.awt.Dimension(70, 70));
        BtnExitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnExitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnExitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnExitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtnExitLayout = new javax.swing.GroupLayout(BtnExit);
        BtnExit.setLayout(BtnExitLayout);
        BtnExitLayout.setHorizontalGroup(
            BtnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnExitLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnExitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        BtnExitLayout.setVerticalGroup(
            BtnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnExitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnExitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/LOGOCHIQUITO.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jP_headerLayout = new javax.swing.GroupLayout(jP_header);
        jP_header.setLayout(jP_headerLayout);
        jP_headerLayout.setHorizontalGroup(
            jP_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_headerLayout.createSequentialGroup()
                .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                .addComponent(BtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jP_headerLayout.setVerticalGroup(
            jP_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jP_headerLayout.createSequentialGroup()
                .addGroup(jP_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Cliente");
        jLabel2.setPreferredSize(new java.awt.Dimension(50, 15));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellido");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Direccion");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Telefono");

        jB_EliminarCliente.setBackground(new java.awt.Color(204, 0, 51));
        jB_EliminarCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jB_EliminarCliente.setForeground(new java.awt.Color(255, 255, 255));
        jB_EliminarCliente.setText("Eliminar ");
        jB_EliminarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB_EliminarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_EliminarClienteMouseClicked(evt);
            }
        });
        jB_EliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_EliminarClienteActionPerformed(evt);
            }
        });

        jB_EditarCliente.setBackground(new java.awt.Color(255, 255, 255));
        jB_EditarCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jB_EditarCliente.setForeground(new java.awt.Color(0, 0, 0));
        jB_EditarCliente.setText("Editar");
        jB_EditarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB_EditarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_EditarClienteMouseClicked(evt);
            }
        });
        jB_EditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_EditarClienteActionPerformed(evt);
            }
        });

        jB_AgregarCliente.setBackground(new java.awt.Color(255, 255, 255));
        jB_AgregarCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jB_AgregarCliente.setForeground(new java.awt.Color(0, 0, 0));
        jB_AgregarCliente.setText("Agregar ");
        jB_AgregarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB_AgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_AgregarClienteActionPerformed(evt);
            }
        });

        jB_buscarCliente.setBackground(new java.awt.Color(255, 255, 255));
        jB_buscarCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jB_buscarCliente.setForeground(new java.awt.Color(0, 0, 0));
        jB_buscarCliente.setText("Buscar");
        jB_buscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_buscarClienteActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Nombre");

        jB_Limpiar.setBackground(new java.awt.Color(255, 255, 255));
        jB_Limpiar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jB_Limpiar.setForeground(new java.awt.Color(0, 0, 0));
        jB_Limpiar.setText("Limpiar");
        jB_Limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_LimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jT_direccionCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                                    .addComponent(jT_apellidoCliente)
                                    .addComponent(jT_telefonoCliente)
                                    .addComponent(jT_nombreCliente)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jB_AgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jB_EditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jB_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jT_idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jB_buscarCliente)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(jB_EliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(217, 217, 217))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jP_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jP_header, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_buscarCliente)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT_nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jT_apellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jT_direccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT_telefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_EditarCliente)
                    .addComponent(jB_AgregarCliente)
                    .addComponent(jB_Limpiar))
                .addGap(18, 18, 18)
                .addComponent(jB_EliminarCliente)
                .addGap(60, 60, 60))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_AgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_AgregarClienteActionPerformed
        // TODO add your handling code here:
        try {
            String nom = jT_nombreCliente.getText();
            String ape = jT_apellidoCliente.getText();
            String dir = jT_direccionCliente.getText();
            String telString = jT_telefonoCliente.getText();
            long tel = 0;

            try {
                tel = Long.parseLong(telString);
            } catch (NumberFormatException e) {
                // Manejar el caso en el que el número de teléfono no sea un entero válido
                JOptionPane.showMessageDialog(this, "Número de teléfono no válido.");
                return;
            }

            Cliente cli = new Cliente(ape, nom, dir, telString);
            cliData.agregarCliente(cli);
            Limpiar();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al Guardar." + ex.getMessage());
        }
    }//GEN-LAST:event_jB_AgregarClienteActionPerformed

    private void jB_EditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_EditarClienteActionPerformed
        // TODO add your handling code here:
        int option = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que queres editar el cliente?", "EDITAR CLIENTE", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            try {
                int id = Integer.parseInt(jT_idCliente.getText());
                String nom = jT_nombreCliente.getText();
                String ape = jT_apellidoCliente.getText();
                String dom = jT_direccionCliente.getText();
                String tel = jT_telefonoCliente.getText();
                Cliente cli = new Cliente(id, ape, nom, dom, tel);
                cliData.modificarCliente(cli);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al Actualizar" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_jB_EditarClienteActionPerformed

    private void jB_buscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_buscarClienteActionPerformed
        // TODO add your handling code here:

        try {
            int id = Integer.parseInt(jT_idCliente.getText());
            Cliente clienteEncontrado = cliData.buscarClientePorId(id);
            if (clienteEncontrado != null) {
                String nom = clienteEncontrado.getNombre();
                String ape = clienteEncontrado.getApellido();
                String dom = clienteEncontrado.getDomicilio();
                String tel = clienteEncontrado.getTelefono();
                jT_nombreCliente.setText(nom);
                jT_apellidoCliente.setText(ape);
                jT_direccionCliente.setText(dom);
                jT_telefonoCliente.setText(tel);
            } else {
                JOptionPane.showMessageDialog(this, "Cliente no encontrado.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al buscar." + ex.getMessage());
        }
    }//GEN-LAST:event_jB_buscarClienteActionPerformed

    private void jB_EliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_EliminarClienteActionPerformed
        // TODO add your handling code here:
        try {
            int id = Integer.parseInt(jT_idCliente.getText());
            cliData.eliminarCliente(id);
            JOptionPane.showMessageDialog(this, "Cliente eliminado.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al eliminar al cliente." + ex.getMessage());
        }

    }//GEN-LAST:event_jB_EliminarClienteActionPerformed

    private void jB_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_LimpiarActionPerformed
        // TODO add your handling code here:
        jT_idCliente.setText("");
        jT_nombreCliente.setText("");
        jT_apellidoCliente.setText("");
        jT_direccionCliente.setText("");
        jT_telefonoCliente.setText("");
    }//GEN-LAST:event_jB_LimpiarActionPerformed

    private void HomeBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnTxtMouseClicked
        dispose();
        principalMenu log = new principalMenu();
        log.setVisible(true);
    }//GEN-LAST:event_HomeBtnTxtMouseClicked

    private void HomeBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnTxtMouseEntered
        HomeBtn.setBackground(Color.MAGENTA);
    }//GEN-LAST:event_HomeBtnTxtMouseEntered

    private void HomeBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnTxtMouseExited
        HomeBtn.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_HomeBtnTxtMouseExited

    private void BtnExitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnExitTxtMouseClicked
        int option = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que queres cerrar el programa?", "CONFIRMAR CIERRE", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_BtnExitTxtMouseClicked

    private void BtnExitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnExitTxtMouseEntered
        BtnExit.setBackground(Color.RED);
    }//GEN-LAST:event_BtnExitTxtMouseEntered

    private void BtnExitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnExitTxtMouseExited
        BtnExit.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_BtnExitTxtMouseExited

    private void jP_headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_headerMouseDragged
        //Esto hace que se pueda draggear el programa
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jP_headerMouseDragged

    private void jP_headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jP_headerMousePressed

    private void jB_EliminarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_EliminarClienteMouseClicked
        int option = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que queres eliminar el cliente?", "ELIMINAR CLIENTE", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            // completar esto con logica con la base de datos
        }
    }//GEN-LAST:event_jB_EliminarClienteMouseClicked

    private void jB_EditarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_EditarClienteMouseClicked
        int option = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que queres editar el cliente?", "EDITAR CLIENTE", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            // completar esto con logica con la base de datos
        }
    }//GEN-LAST:event_jB_EditarClienteMouseClicked

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
            java.util.logging.Logger.getLogger(agregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agregarCliente().setVisible(true);
            }
        });
    }

    public void Limpiar() {
        jT_idCliente.setText("");
        jT_nombreCliente.setText("");
        jT_apellidoCliente.setText("");
        jT_direccionCliente.setText("");
        jT_telefonoCliente.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnExit;
    private javax.swing.JLabel BtnExitTxt;
    private javax.swing.JPanel HomeBtn;
    private javax.swing.JLabel HomeBtnTxt;
    private javax.swing.JButton jB_AgregarCliente;
    private javax.swing.JButton jB_EditarCliente;
    private javax.swing.JButton jB_EliminarCliente;
    private javax.swing.JButton jB_Limpiar;
    private javax.swing.JButton jB_buscarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jP_header;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jT_apellidoCliente;
    private javax.swing.JTextField jT_direccionCliente;
    private javax.swing.JTextField jT_idCliente;
    private javax.swing.JTextField jT_nombreCliente;
    private javax.swing.JTextField jT_telefonoCliente;
    // End of variables declaration//GEN-END:variables
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.menuPrincipal;

import Control.DetalleCompraData;
import Control.ProveedorData;
import Modelo.DetalleCompra;
import Modelo.Proveedor;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hugo, APOLO
 */
public class vistaDetalleCompra extends javax.swing.JFrame {

    int xMouse, yMouse;

    ProveedorData provData = new ProveedorData();
    private DetalleCompraData DcompraData = new DetalleCompraData();
    private DefaultTableModel modelo = new DefaultTableModel();

    //Carga proveedores
    private void cargarProveedores() {
        List<Proveedor> prove = provData.obtenerProveedores();
        for (Proveedor proveedor : prove) {
            jC_listaProveedores.addItem(proveedor);
        }
    }

    //Armado de cabecera
    public void armarCabecera() {
        ArrayList titulos = new ArrayList();
        titulos.add("Cantidad");
        titulos.add("Precio Costo");
        titulos.add("idCompra");
        titulos.add("idProducto");
        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                titulos.add("Cantidad");
                titulos.add("Precio Costo");
                titulos.add("idCompra");
                titulos.add("idProducto");
                return false;
            }

        };
        for (Object titulo : titulos) {
            modelo.addColumn(titulo);
            jT_tabla_historialDeCompras.setModel(modelo);
        }

    }

    //Llenado de tabla
    public void llenarTabla() {
        Proveedor proveSelec = (Proveedor) jC_listaProveedores.getSelectedItem();

        List<DetalleCompra> compras = DcompraData.obtenerDetallesCompraPorProveedor(proveSelec.getIdProveedor());
        DefaultTableModel modelo = (DefaultTableModel) jT_tabla_historialDeCompras.getModel();
        modelo.setRowCount(0); // Limpiar la tabla antes de agregar los datos

        for (DetalleCompra compra : compras) {
            Object[] fila = {compra.getCantidad(), compra.getPrecioCosto(), compra.getIdCompra(), compra.getIdProducto()};
            modelo.addRow(fila);
        }
    }

    //Inicializador de componentes
    public vistaDetalleCompra() {
        initComponents();
        cargarProveedores();
        armarCabecera();
        llenarTabla();
        jC_listaProveedores.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                llenarTabla(); // Llamar al método para actualizar la tabla al seleccionar un proveedor
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jP_header = new javax.swing.JPanel();
        HomeBtn = new javax.swing.JPanel();
        HomeBtnTxt = new javax.swing.JLabel();
        BtnExit = new javax.swing.JPanel();
        BtnExitTxt = new javax.swing.JLabel();
        JL_LOGO = new javax.swing.JLabel();
        JL_Titulo = new javax.swing.JLabel();
        JL_Titulo2 = new javax.swing.JLabel();
        jC_listaProveedores = new javax.swing.JComboBox<>();
        jS_tablaHistorialDeCompras = new javax.swing.JScrollPane();
        jT_tabla_historialDeCompras = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
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
            .addGap(0, 0, Short.MAX_VALUE)
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

        JL_LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/LOGOCHIQUITO.png"))); // NOI18N
        JL_LOGO.setText("jLabel2");

        javax.swing.GroupLayout jP_headerLayout = new javax.swing.GroupLayout(jP_header);
        jP_header.setLayout(jP_headerLayout);
        jP_headerLayout.setHorizontalGroup(
            jP_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_headerLayout.createSequentialGroup()
                .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                .addComponent(JL_LOGO, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212)
                .addComponent(BtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jP_headerLayout.setVerticalGroup(
            jP_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jP_headerLayout.createSequentialGroup()
                .addGroup(jP_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(HomeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JL_LOGO, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        JL_Titulo.setFont(new java.awt.Font("HP Simplified", 1, 24)); // NOI18N
        JL_Titulo.setForeground(new java.awt.Color(204, 0, 204));
        JL_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_Titulo.setText("HISTORIAL DE COMPRAS");

        JL_Titulo2.setBackground(new java.awt.Color(51, 51, 51));
        JL_Titulo2.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        JL_Titulo2.setForeground(new java.awt.Color(255, 255, 255));
        JL_Titulo2.setText("PROVEEDORES");

        jC_listaProveedores.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jT_tabla_historialDeCompras.setFont(new java.awt.Font("HP Simplified", 1, 15)); // NOI18N
        jT_tabla_historialDeCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jT_tabla_historialDeCompras.setGridColor(new java.awt.Color(51, 51, 51));
        jT_tabla_historialDeCompras.setPreferredSize(new java.awt.Dimension(800, 275));
        jT_tabla_historialDeCompras.setSelectionBackground(new java.awt.Color(204, 0, 204));
        jS_tablaHistorialDeCompras.setViewportView(jT_tabla_historialDeCompras);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(JL_Titulo2)
                .addGap(31, 31, 31)
                .addComponent(jC_listaProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(JL_Titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jP_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jS_tablaHistorialDeCompras)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jP_header, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JL_Titulo)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jC_listaProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_Titulo2))
                .addGap(18, 18, 18)
                .addComponent(jS_tablaHistorialDeCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnTxtMouseClicked
        dispose();
        vistaCompra com = new vistaCompra();
        com.setVisible(true);
    }//GEN-LAST:event_HomeBtnTxtMouseClicked

    private void HomeBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnTxtMouseEntered
        HomeBtn.setBackground(Color.MAGENTA);
    }//GEN-LAST:event_HomeBtnTxtMouseEntered

    private void HomeBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnTxtMouseExited
        HomeBtn.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_HomeBtnTxtMouseExited

    private void BtnExitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnExitTxtMouseClicked
        int option = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que queres cerrar el programa?", "Confirmar cierre", JOptionPane.YES_NO_OPTION);
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
            java.util.logging.Logger.getLogger(vistaDetalleCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaDetalleCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaDetalleCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaDetalleCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaDetalleCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnExit;
    private javax.swing.JLabel BtnExitTxt;
    private javax.swing.JPanel HomeBtn;
    private javax.swing.JLabel HomeBtnTxt;
    private javax.swing.JLabel JL_LOGO;
    private javax.swing.JLabel JL_Titulo;
    private javax.swing.JLabel JL_Titulo2;
    private javax.swing.JComboBox<Proveedor> jC_listaProveedores;
    private javax.swing.JPanel jP_header;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jS_tablaHistorialDeCompras;
    private javax.swing.JTable jT_tabla_historialDeCompras;
    // End of variables declaration//GEN-END:variables
}

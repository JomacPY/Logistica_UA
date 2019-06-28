/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.contrUsuario;
import controlador.contrlEquipo;
import controlador.contrlProveedor;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.ConsultaEquipo;
import modelo.ConsultaProveedor;
import modelo.ConsultaUsuario;
import modelo.clEquipo;
import modelo.clProveedor;
import modelo.clUsuario;

/**
 *
 * @author matias
 */
public class formularioPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form formularioPrincipal
     */
    public formularioPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuRegistrarU = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuRegistrarP = new javax.swing.JMenuItem();
        jmenu3 = new javax.swing.JMenu();
        menuRegistrarE = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\matias\\Pictures\\images.jpg")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("MENU  PRINCIPAL");

        jMenu1.setText("Usuario");

        menuRegistrarU.setText("Menu Usuario");
        menuRegistrarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistrarUActionPerformed(evt);
            }
        });
        jMenu1.add(menuRegistrarU);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Proveedor");

        menuRegistrarP.setText("Menu Proveedor");
        menuRegistrarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistrarPActionPerformed(evt);
            }
        });
        jMenu2.add(menuRegistrarP);

        jMenuBar1.add(jMenu2);

        jmenu3.setText("Equipo");
        jmenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenu3ActionPerformed(evt);
            }
        });

        menuRegistrarE.setText("Menu Equipo");
        menuRegistrarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistrarEActionPerformed(evt);
            }
        });
        jmenu3.add(menuRegistrarE);

        jMenuBar1.add(jmenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel1)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuRegistrarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistrarPActionPerformed
        try {
            clProveedor prov = new clProveedor();
            ConsultaProveedor conP = new ConsultaProveedor();
            formularioProveedor formP = new formularioProveedor();
            
            contrlProveedor ctrl = new contrlProveedor(prov,conP,formP);
            ctrl.iniciar();
            formP.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(formularioPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuRegistrarPActionPerformed

    private void jmenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmenu3ActionPerformed

    private void menuRegistrarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistrarEActionPerformed
        try {
            clEquipo equi = new clEquipo();
            ConsultaEquipo conE = new ConsultaEquipo();
            formularioCargar form = new formularioCargar();
            contrlEquipo ctrl = new contrlEquipo(equi,conE,form);
            ctrl.iniciar();
            form.setVisible(true);
            this.dispose();
           } catch (SQLException ex) {
            Logger.getLogger(formularioPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuRegistrarEActionPerformed

    private void menuRegistrarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistrarUActionPerformed
          try {
            clUsuario usua = new clUsuario();
            ConsultaUsuario conU = new ConsultaUsuario();
            formularioUsuario formU = new formularioUsuario();
            
            contrUsuario ctrl = new contrUsuario(usua,conU,formU);
            ctrl.iniciar();
            formU.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(formularioPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }   
                
    }//GEN-LAST:event_menuRegistrarUActionPerformed

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
            java.util.logging.Logger.getLogger(formularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formularioPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmenu3;
    public javax.swing.JMenuItem menuRegistrarE;
    public javax.swing.JMenuItem menuRegistrarP;
    public javax.swing.JMenuItem menuRegistrarU;
    // End of variables declaration//GEN-END:variables
}
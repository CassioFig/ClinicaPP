/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.sql.*;
import Utils.ModuloConexao;
import java.awt.Color;

/**
 *
 * @author cassi_wh5ztk2
 */
public class PrincipalView extends javax.swing.JFrame {
    Connection conexao = null;
    

    /**
     * Creates new form PrincipalView
     */
    public PrincipalView() {
        initComponents();
        conexao = ModuloConexao.conector();
        if (conexao != null) {
            lblStatus.setText("Conectado");
            lblStatus.setForeground(Color.green);
        } else {
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

        desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menCadastrar = new javax.swing.JMenu();
        menCadFun = new javax.swing.JMenuItem();
        menCadSal = new javax.swing.JMenuItem();
        menu = new javax.swing.JMenu();
        menListarFuncionario = new javax.swing.JMenuItem();
        menListarFolha = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Clínica - Tela Principal");
        setResizable(false);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Status:");

        lblStatus.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(204, 0, 0));
        lblStatus.setText("Desconectado");

        menCadastrar.setText("Cadastrar");
        menCadastrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        menCadFun.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        menCadFun.setText("Funcionário");
        menCadFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadFunActionPerformed(evt);
            }
        });
        menCadastrar.add(menCadFun);

        menCadSal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        menCadSal.setText("Salário");
        menCadSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadSalActionPerformed(evt);
            }
        });
        menCadastrar.add(menCadSal);

        jMenuBar1.add(menCadastrar);

        menu.setText("Listar");
        menu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        menListarFuncionario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        menListarFuncionario.setText("Funcionários");
        menListarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menListarFuncionarioActionPerformed(evt);
            }
        });
        menu.add(menListarFuncionario);

        menListarFolha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        menListarFolha.setText("Folha Salarial");
        menListarFolha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menListarFolhaActionPerformed(evt);
            }
        });
        menu.add(menListarFolha);

        jMenuBar1.add(menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblStatus))
                    .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblStatus))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(676, 535));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menCadFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadFunActionPerformed
        FuncionarioView funcionario = new FuncionarioView();
        funcionario.setVisible(true);
        desktop.add(funcionario);
    }//GEN-LAST:event_menCadFunActionPerformed

    private void menCadSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadSalActionPerformed
        FolhaPagamentoView fv = new FolhaPagamentoView();
        fv.setVisible(true);
        desktop.add(fv);
    }//GEN-LAST:event_menCadSalActionPerformed

    private void menListarFolhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menListarFolhaActionPerformed
        ListaFolhaPagamentoView lfpv = new ListaFolhaPagamentoView();
        lfpv.setVisible(true);
        desktop.add(lfpv);
    }//GEN-LAST:event_menListarFolhaActionPerformed

    private void menListarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menListarFuncionarioActionPerformed
        ListaFuncionarioView lfv = new ListaFuncionarioView();
        lfv.setVisible(true);
        desktop.add(lfv);
    }//GEN-LAST:event_menListarFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JMenuItem menCadFun;
    private javax.swing.JMenuItem menCadSal;
    private javax.swing.JMenu menCadastrar;
    private javax.swing.JMenuItem menListarFolha;
    private javax.swing.JMenuItem menListarFuncionario;
    private javax.swing.JMenu menu;
    // End of variables declaration//GEN-END:variables
}
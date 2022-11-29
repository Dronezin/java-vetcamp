/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.admDAO;
import dto.adm_cadprodutoDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nanabe
 */
public class adm_estprodutoVIEW extends javax.swing.JFrame {

    /**
     * Creates new form adm_estprodutoVIEW
     */
    public adm_estprodutoVIEW() {
        initComponents();
        setLocationRelativeTo(null);
        listarProduto();
        listarProdutoEs();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_estproduto = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaSaida = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEntrada = new javax.swing.JTable();
        jLabel_Saida = new javax.swing.JLabel();
        jLabel_Entrada = new javax.swing.JLabel();
        btnProd = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" ");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_estproduto.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        jLabel_estproduto.setForeground(new java.awt.Color(244, 249, 252));
        jLabel_estproduto.setText("Estoque Produto");
        getContentPane().add(jLabel_estproduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, 40));

        tabelaSaida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATA", "PRODUTO", "QUANTIDADE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaSaida);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 160, 460, -1));

        tabelaEntrada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATA", "PRODUTO", "ESTOQUE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaEntrada);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel_Saida.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel_Saida.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_Saida.setText("Saída");
        getContentPane().add(jLabel_Saida, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, -1, -1));

        jLabel_Entrada.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel_Entrada.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_Entrada.setText("Entrada");
        getContentPane().add(jLabel_Entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        btnProd.setText("Adicionar Prod.");
        btnProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdActionPerformed(evt);
            }
        });
        getContentPane().add(btnProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 130, 40));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdActionPerformed
       adm_produtoVIEW obj = new adm_produtoVIEW();
       obj.setVisible(true);
    }//GEN-LAST:event_btnProdActionPerformed

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
            java.util.logging.Logger.getLogger(adm_estprodutoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adm_estprodutoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adm_estprodutoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adm_estprodutoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adm_estprodutoVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnProd;
    private javax.swing.JLabel jLabel_Entrada;
    private javax.swing.JLabel jLabel_Saida;
    private javax.swing.JLabel jLabel_estproduto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaEntrada;
    private javax.swing.JTable tabelaSaida;
    // End of variables declaration//GEN-END:variables

    public void listarProduto() {

        try {

            admDAO objadmdao = new admDAO();

            DefaultTableModel model = (DefaultTableModel) tabelaEntrada.getModel();
            model.setNumRows(0);

            ArrayList<adm_cadprodutoDTO> listae = objadmdao.pesquisarEstoque();

            for (int num = 0; num < listae.size(); num++) {

                model.addRow(new Object[]{
                    listae.get(num).getData(),
                    listae.get(num).getNome_produto(),
                    listae.get(num).getQuantidade_produto()

                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "adm_estprodutoVIEW - listarProduto: " + erro);
        }
    }
    
    private void listarProdutoEs() {

        try {

            admDAO objadmdao = new admDAO();

            DefaultTableModel model = (DefaultTableModel) tabelaSaida.getModel();
            model.setNumRows(0);

            ArrayList<adm_cadprodutoDTO> listaes = objadmdao.pesquisarEstoqueSaida();

            for (int num = 0; num < listaes.size(); num++) {

                model.addRow(new Object[]{
                    listaes.get(num).getData(),
                    listaes.get(num).getNome_produto(),
                    listaes.get(num).getQuantidade_produto()

                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "adm_estprodutoVIEW - listarProdutoEs: " + erro);
        }
    }

}
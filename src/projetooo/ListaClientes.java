/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetooo;

import DAO.ClienteDao;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Hybriun System
 */
public class ListaClientes extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public ListaClientes() {
        initComponents();
        this.setLocationRelativeTo(null);

        btnListaClientes.setOpaque(true);
        btnListaClientes.setBackground(new Color(0, 20, 30));

        btnInicio.setOpaque(true);
        btnInicio.setBackground(new Color(0, 20, 30));

        btnNovoCliente.setOpaque(true);
        btnNovoCliente.setBackground(new Color(0, 20, 30));

        btnSair.setOpaque(true);
        btnSair.setBackground(new Color(0, 20, 30));
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        updateClientList();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnListaClientes = new javax.swing.JButton();
        btnNovoCliente = new javax.swing.JButton();
        lbNome = new javax.swing.JLabel();
        lbCPF = new javax.swing.JLabel();
        lbTelefone = new javax.swing.JLabel();
        lbCEP = new javax.swing.JLabel();
        lbRua = new javax.swing.JLabel();
        lbNumero = new javax.swing.JLabel();
        lbComplemento = new javax.swing.JLabel();
        lbTodosClientes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtId = new javax.swing.JTextField();
        btnDeletar = new javax.swing.JButton();
        btnEditar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel2.setBackground(new java.awt.Color(2, 37, 55));

        btnSair.setBackground(new java.awt.Color(0, 51, 153));
        btnSair.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.setBorder(null);
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnInicio.setBackground(new java.awt.Color(51, 0, 51));
        btnInicio.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setText("Página inicial");
        btnInicio.setBorder(null);
        btnInicio.setBorderPainted(false);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnListaClientes.setBackground(new java.awt.Color(0, 51, 153));
        btnListaClientes.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnListaClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnListaClientes.setText("Listar clientes");
        btnListaClientes.setBorder(null);
        btnListaClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListaClientes.setEnabled(false);
        btnListaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaClientesActionPerformed(evt);
            }
        });

        btnNovoCliente.setBackground(new java.awt.Color(51, 0, 51));
        btnNovoCliente.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnNovoCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoCliente.setText("Novo cliente");
        btnNovoCliente.setBorder(null);
        btnNovoCliente.setBorderPainted(false);
        btnNovoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnListaClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
            .addComponent(btnNovoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNovoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
        );

        lbNome.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lbCPF.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lbTelefone.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lbCEP.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lbRua.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lbNumero.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbNumero.setToolTipText("");

        lbComplemento.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lbTodosClientes.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lbTodosClientes.setText("Todos os clientes");

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "CPF", "Telefone", "Endereço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(153, 153, 153));
        jTable1.setSelectionBackground(new java.awt.Color(230, 230, 230));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        btnDeletar.setBackground(new java.awt.Color(2, 37, 55));
        btnDeletar.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletar.setText("Deletar");
        btnDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnEditar1.setBackground(new java.awt.Color(2, 37, 55));
        btnEditar1.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar1.setText("Editar");
        btnEditar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Id");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbTodosClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbNome)
                                    .addComponent(lbCPF)
                                    .addComponent(lbTelefone)
                                    .addComponent(lbCEP)
                                    .addComponent(lbRua)
                                    .addComponent(lbNumero)
                                    .addComponent(lbComplemento))
                                .addGap(62, 62, 62))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtId))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTelefone)
                        .addGap(83, 83, 83)
                        .addComponent(lbCEP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbRua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbComplemento))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbTodosClientes)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        btnDeletar.getAccessibleContext().setAccessibleName("Editar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoClienteActionPerformed
        new NovoCliente().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNovoClienteActionPerformed

    private void btnListaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaClientesActionPerformed

    }//GEN-LAST:event_btnListaClientesActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        new Inicio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Sair do sistema",
            JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        String id = txtId.getText();
        if(id.isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo ID", "Erro de busca", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir registro " + id + "?", "Alerta" , JOptionPane.WARNING_MESSAGE);
        if(confirm == JOptionPane.YES_OPTION){
            try{
                ClienteDao.deleteClient(GlobalVariables.UserId, id);
                updateClientList();
                JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                txtId.setText("");
            } catch (SQLException ex) {                
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro de exclusão", JOptionPane.ERROR_MESSAGE);
            }            
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar1ActionPerformed
        String id = txtId.getText();
        Connection conn = new mysqlConnector().conn;
        if(id.isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo ID", "Erro de busca", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            Map result = ClienteDao.getClient(GlobalVariables.UserId, id);
            if(result.isEmpty()){
                JOptionPane.showMessageDialog(null, "ID não encontrado", "Erro de busca", JOptionPane.ERROR_MESSAGE);
            } else {
                NovoCliente telaNovoCliente; 
                telaNovoCliente = new NovoCliente(id, result.get("name").toString(), result.get("cpf").toString(), result.get("phone").toString(), 
                        result.get("cep").toString(), result.get("adress").toString(), result.get("adress_number").toString(),
                        result.get("neighborhood").toString(), result.get("city").toString());
                telaNovoCliente.setVisible(true); // mostrar tela
                telaNovoCliente.setLocationRelativeTo(null); //abrir no centro
                this.dispose();  
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ID nao encontrado", "Erro de busca", JOptionPane.ERROR_MESSAGE);
        }
        
        
        try {
            Statement stmd = conn.createStatement();
            ResultSet rs = stmd.executeQuery("SELECT * FROM client WHERE USER_ID = " + GlobalVariables.UserId + " AND ID = " + id);

            while(rs.next()){
                String name = rs.getString("name");
                String cpf = rs.getString("cpf");
                String phone = rs.getString("phone");                
                String cep = rs.getString("cep");
                String adress = rs.getString("adress");
                String numero = rs.getString("adress_number");
                String bairro = rs.getString("neighborhood");
                String cidade = rs.getString("city");   
                if(name != null) {
                    NovoCliente telaNovoCliente = new NovoCliente(id, name, cpf, phone, cep, adress, numero, bairro, cidade);
                    telaNovoCliente.setVisible(true); // mostrar tela
                    telaNovoCliente.setLocationRelativeTo(null); //abrir no centro
                    this.dispose();                    
                } else{
                    JOptionPane.showMessageDialog(null, "ID não encontrado", "Erro de busca", JOptionPane.ERROR_MESSAGE);
                }
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ID não encontrado", "Erro de busca", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditar1ActionPerformed

    private void updateClientList(){               

        Connection conn = new mysqlConnector().conn;
        try {
            Statement stmd = conn.createStatement();
            ResultSet rs = stmd.executeQuery("SELECT * FROM client WHERE USER_ID = " + GlobalVariables.UserId);
            DefaultTableModel jTable = (DefaultTableModel) jTable1.getModel();
            
            if (jTable.getRowCount() > 0) {
                for (int i = jTable.getRowCount() - 1; i > -1; i--) {
                    jTable.removeRow(i);
                }
            }
            
            while(rs.next()){
                Integer id = rs.getInt("id");
                String name = rs.getString("name");
                String cpf = rs.getString("cpf");
                String phone = rs.getString("phone");
                String adress = rs.getString("adress");
                jTable.addRow(new Object[]{id, name, cpf, phone, adress});
                
            }
        } catch (Exception e) {
        }
    }
    
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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ListaClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar1;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnListaClientes;
    private javax.swing.JButton btnNovoCliente;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbCEP;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbComplemento;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbRua;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lbTodosClientes;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}

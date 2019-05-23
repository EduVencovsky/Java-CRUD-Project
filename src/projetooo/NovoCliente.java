/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetooo;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Hybriun System
 */
public class NovoCliente extends javax.swing.JFrame {

    public String id;
    /**
     * Creates new form TelaInicial
     */
    public NovoCliente() {
        initComponents();
        this.id = null;
        this.setLocationRelativeTo(null);

        btnListaClientes.setOpaque(true);
        btnListaClientes.setBackground(new Color(0, 20, 30));

        btnInicio.setOpaque(true);
        btnInicio.setBackground(new Color(0, 20, 30));

        btnNovoCliente.setOpaque(true);
        btnNovoCliente.setBackground(new Color(0, 20, 30));

        btnSair.setOpaque(true);
        btnSair.setBackground(new Color(0, 20, 30));
        
        btnCadastrar.setOpaque(true);
        btnCadastrar.setBackground(new Color(0, 20, 30));
    }
    
    public NovoCliente(String id, String nome , String cpf, String telefone, String cep,
        String endereco,
        String numero,
        String bairro,
        String cidade ) {
        
        initComponents();
        this.id = id;
        
        txtNome.setText(nome);
        txtCPF.setText(cpf);       
        txtTelefone.setText(telefone);
        txtCEP.setText(cep);
        txtEndereco.setText(endereco);
        txtNumero.setText(numero);
        txtBairro.setText(bairro);
        txtCidade.setText(cidade);
        
        this.setLocationRelativeTo(null);

        btnListaClientes.setOpaque(true);
        btnListaClientes.setBackground(new Color(0, 20, 30));

        btnInicio.setOpaque(true);
        btnInicio.setBackground(new Color(0, 20, 30));

        btnNovoCliente.setOpaque(true);
        btnNovoCliente.setBackground(new Color(0, 20, 30));

        btnSair.setOpaque(true);
        btnSair.setBackground(new Color(0, 20, 30));
        
        btnCadastrar.setOpaque(true);
        btnCadastrar.setBackground(new Color(0, 20, 30));
        
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
        jLabel2 = new javax.swing.JLabel();
        lbCadNome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lbCadCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        lbCadTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        lbCadCEP = new javax.swing.JLabel();
        txtCEP = new javax.swing.JFormattedTextField();
        lbCadEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lbCadNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lbCadBairro = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lbCadCidade = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        btnNovoCliente.setEnabled(false);
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

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel2.setText("Informações pessoais");
        jLabel2.setToolTipText("");

        lbCadNome.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbCadNome.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel3.setText("Cadastrar novo cliente");
        jLabel3.setToolTipText("");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lbCadCPF.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbCadCPF.setText("CPF");

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setPreferredSize(new java.awt.Dimension(51, 20));

        lbCadTelefone.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbCadTelefone.setText("Telefone");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel4.setText("Informações de entrega");
        jLabel4.setToolTipText("");

        lbCadCEP.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbCadCEP.setText("CEP");

        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbCadEndereco.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbCadEndereco.setText("Endereço");

        lbCadNumero.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbCadNumero.setText("Número");

        lbCadBairro.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbCadBairro.setText("Bairro");

        lbCadCidade.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbCadCidade.setText("Cidade");

        btnCadastrar.setBackground(new java.awt.Color(2, 37, 55));
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar cliente");
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(txtTelefone))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbNumero)
                                .addGap(0, 0, 0)
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtNome)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(332, 332, 332)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbNome)
                                            .addComponent(lbCPF)))
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(lbCadNome)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(lbCadCPF)
                                        .addGap(251, 251, 251)
                                        .addComponent(lbCadTelefone))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(lbCEP))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(lbRua)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCadNumero)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNumero)
                                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbCadCEP, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEndereco)
                                    .addComponent(lbCadEndereco)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbCadBairro)
                                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbCadCidade)
                                            .addComponent(txtCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)))))
                            .addComponent(jLabel4))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lbCadNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCadCPF)
                    .addComponent(lbCadTelefone))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lbNome)
                        .addGap(6, 6, 6)
                        .addComponent(lbCPF)
                        .addGap(90, 90, 90)
                        .addComponent(lbCEP)
                        .addGap(0, 0, 0)
                        .addComponent(lbRua))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbCadCEP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbCadEndereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCadNumero)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbCadBairro)
                                .addComponent(lbCadCidade)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbNumero)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovoClienteActionPerformed

    private void btnListaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaClientesActionPerformed
        new ListaClientes().setVisible(true);
        this.dispose();
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

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        List<String> camposRequeridos = new ArrayList<String>();
        String nome = txtNome.getText();        
        String cpf = txtCPF.getText();       
        String telefone = txtTelefone.getText();
        String cep = txtCEP.getText();
        String endereco = txtEndereco.getText();
        String numero = txtNumero.getText();
        String bairro = txtBairro.getText();
        String cidade = txtCidade.getText();
        
        if("".equals(nome)) {
            camposRequeridos.add("Nome");
        }        
        if("".equals(cpf)) {
            camposRequeridos.add("CPF");
        }        
        if("".equals(telefone)) {
            camposRequeridos.add("Telefone");
        }        
        if("".equals(cep)) {
            camposRequeridos.add("CEP");
        }        
        if("".equals(endereco)) {
            camposRequeridos.add("Endereço");
        }        
        if("".equals(numero)) {
            camposRequeridos.add("Numero");
        }        
        if("".equals(bairro)) {
            camposRequeridos.add("Bairro");
        }        
        if("".equals(cidade)) {
            camposRequeridos.add("Cidade");
        }
        if(camposRequeridos.size() > 0 ){
            String erro = String.join(", ", camposRequeridos);
            JOptionPane.showMessageDialog(null,"Os campos " + erro + " são necessarios", "", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Connection conn = new mysqlConnector().conn;
        try {                
            Statement stmd = conn.createStatement();
            Integer rs = null;
            if(this.id != null){
                rs = stmd.executeUpdate("UPDATE CLIENT SET NAME = '"+ nome + 
                        "', CPF = '"+ cpf + 
                        "', PHONE = '"+ telefone + 
                        "', CEP = '"+ cep + 
                        "', ADRESS = '"+ endereco + 
                        "', ADRESS_NUMBER = '"+ numero + 
                        "', CITY = '"+ cidade + 
                        "', NEIGHBORHOOD = '"+ bairro +
                        "'" + 
                        "WHERE USER_ID = '" + GlobalVariables.UserId + 
                        "' AND ID = '" + this.id + "'");
                if(rs == 1){
                    ListaClientes telaListaClientes = new ListaClientes();
                    telaListaClientes.setVisible(true); // mostrar tela
                    telaListaClientes.setLocationRelativeTo(null); //abrir no centro                 
                    this.dispose();
                } else{ 
                    JOptionPane.showMessageDialog(null, "Cadastro Invalido", "Erro de Cadastro", JOptionPane.ERROR_MESSAGE);
                }
                
            } else {
                rs = stmd.executeUpdate("INSERT INTO CLIENT (USER_ID, NAME, CPF, PHONE, CEP, ADRESS, ADRESS_NUMBER, CITY, NEIGHBORHOOD)" + 
                        "VALUES ('" + GlobalVariables.UserId + "', '" 
                        + nome + "', '" 
                        + cpf + "', '" 
                        + telefone + "', '" 
                        + cep + "', '" 
                        + endereco + "', '" 
                        + numero + "', '" 
                        + cidade + "', '" 
                        + bairro + "')");

                if(rs == 1){
                    ListaClientes telaListaClientes = new ListaClientes();
                    telaListaClientes.setVisible(true); // mostrar tela
                    telaListaClientes.setLocationRelativeTo(null); //abrir no centro                 
                    this.dispose();
                } else{ 
                    JOptionPane.showMessageDialog(null, "Cadastro Invalido", "Erro de Cadastro", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problema de connexão com Servidor", "Erro de login", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(NovoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnListaClientes;
    private javax.swing.JButton btnNovoCliente;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbCEP;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbCadBairro;
    private javax.swing.JLabel lbCadCEP;
    private javax.swing.JLabel lbCadCPF;
    private javax.swing.JLabel lbCadCidade;
    private javax.swing.JLabel lbCadEndereco;
    private javax.swing.JLabel lbCadNome;
    private javax.swing.JLabel lbCadNumero;
    private javax.swing.JLabel lbCadTelefone;
    private javax.swing.JLabel lbComplemento;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbRua;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.avaliacao_1.view;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import br.com.avaliacao_1.dto.FornecedorDTO;
import br.com.avaliacao_1.ctr.FornecedorCTR;

public class FornecedorVIEW extends javax.swing.JInternalFrame {

    FornecedorDTO fornecedorDTO = new FornecedorDTO();
    FornecedorCTR fornecedorCTR = new FornecedorCTR();
    
    int gravar_alterar;
    ResultSet rs;
    DefaultTableModel modelo_jtl_consultar_forn;
    
    public FornecedorVIEW() {
        initComponents();
        liberaCampos(false);
        liberaBotoes(true, false, true, false, false);
        modelo_jtl_consultar_forn = (DefaultTableModel) jtl_consultar_forn.getModel();
        
    }
    
    public void setPosicao(){
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2 );
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nome_forn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cnpj_forn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        logradouro_forn = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        numero_forn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bairro_forn = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cidade_forn = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        estado_forn = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cep_forn = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        telefone_forn = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtl_consultar_forn = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pesquisa_nome_forn = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Dotum", 1, 14)); // NOI18N
        jLabel1.setText("Fornecedor");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Nome: ");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("CNPJ:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Logradouro:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Número:");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Bairro:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("CIdade:");

        cidade_forn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidade_fornActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Estado:");

        estado_forn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("CEP:");

        cep_forn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cep_fornActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("Telefone:");

        btnNovo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao_1/view/img/novo.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao_1/view/img/salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao_1/view/img/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao_1/view/img/excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao_1/view/img/sair.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jtl_consultar_forn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome"
            }
        ));
        jtl_consultar_forn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtl_consultar_fornMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtl_consultar_forn);

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("Nome:");

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao_1/view/img/pesquisar.png"))); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Dotum", 1, 14)); // NOI18N
        jLabel13.setText("Consulta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(numero_forn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bairro_forn, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE))
                                .addComponent(logradouro_forn, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nome_forn, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cidade_forn, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cep_forn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10)
                                        .addGap(155, 155, 155)
                                        .addComponent(jLabel3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(estado_forn, 0, 140, Short.MAX_VALUE)
                                    .addComponent(cnpj_forn)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(telefone_forn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(pesquisa_nome_forn))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nome_forn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(logradouro_forn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12)
                                .addComponent(pesquisa_nome_forn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(bairro_forn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(numero_forn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cidade_forn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(estado_forn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cep_forn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(telefone_forn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(cnpj_forn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvar)
                            .addComponent(btnCancelar)
                            .addComponent(btnExcluir)
                            .addComponent(btnSair)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cidade_fornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidade_fornActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidade_fornActionPerformed

    private void cep_fornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cep_fornActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cep_fornActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        liberaCampos(true);
        liberaBotoes(false, true, true, false, true);
        gravar_alterar = 1;
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(gravar_alterar == 1){
            gravar();
            gravar_alterar = 0;
        }
        else{
            if(gravar_alterar == 2){
                alterar();
                gravar_alterar = 0;
            }
            else{
                JOptionPane.showMessageDialog(null, "Erro no Sistema!!! ");      
            }
        }
        limpaCampos();
        liberaCampos(false);
        liberaBotoes(true, false, true, false, false);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        preencheTabela(pesquisa_nome_forn.getText());
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void jtl_consultar_fornMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtl_consultar_fornMouseClicked
        preencheCampos(Integer.parseInt(String.valueOf(
        jtl_consultar_forn.getValueAt(
        jtl_consultar_forn.getSelectedRow(), 0))));
        
        liberaBotoes(false, true, true, true, true);
    }//GEN-LAST:event_jtl_consultar_fornMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluir();
        limpaCampos();
        liberaCampos(false);
        liberaBotoes(true, false, true, false, false);
        modelo_jtl_consultar_forn.setNumRows(0);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpaCampos();
        liberaCampos(false);
        modelo_jtl_consultar_forn.setNumRows(0);
        liberaBotoes(true, false, true, false, false);
        gravar_alterar = 0;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void liberaCampos(boolean a){
        nome_forn.setEnabled(a);
        logradouro_forn.setEnabled(a);
        numero_forn.setEnabled(a);
        bairro_forn.setEnabled(a);
        cidade_forn.setEnabled(a);
        cep_forn.setEnabled(a);
        estado_forn.setEnabled(a);        
        cnpj_forn.setEnabled(a);
        telefone_forn.setEnabled(a);
    }
    
    private void limpaCampos(){    
        nome_forn.setText("");
        logradouro_forn.setText("");
        numero_forn.setText("");
        bairro_forn.setText("");
        cidade_forn.setText("");
        cep_forn.setText("");
        cnpj_forn.setText("");
        telefone_forn.setText("");
    }
    
     private void liberaBotoes(boolean a, boolean b, boolean c, boolean d, boolean e){
        
        btnNovo.setEnabled(a);
        btnSalvar.setEnabled(b);
        btnSair.setEnabled(c);
        btnExcluir.setEnabled(d);
        btnCancelar.setEnabled(e);
    }
     
     private void gravar(){
        
       try{
           fornecedorDTO.setNome_forn(nome_forn.getText());
           fornecedorDTO.setLogradouro_forn(logradouro_forn.getText());
           fornecedorDTO.setNumero_forn(Integer.parseInt(numero_forn.getText()));
           fornecedorDTO.setBairro_forn(bairro_forn.getText());
           fornecedorDTO.setCidade_forn(cidade_forn.getText());
           fornecedorDTO.setEstado_forn(estado_forn.getSelectedItem().toString());
           fornecedorDTO.setCep_forn(cep_forn.getText());
           fornecedorDTO.setCnpj_forn(cnpj_forn.getText());
           fornecedorDTO.setTelefone_forn(telefone_forn.getText());
           
           JOptionPane.showMessageDialog(null, fornecedorCTR.inserirFornecedor(fornecedorDTO));
           
       }catch(Exception e){
           System.out.println("Erro ao gravar " + e.getMessage());
        }   
    }
     
     private void preencheTabela(String nome_forn){
         
         try{
             modelo_jtl_consultar_forn.setNumRows(0);
             fornecedorDTO.setNome_forn(nome_forn);
             rs = fornecedorCTR.consultarFornecedor(fornecedorDTO,1);
             
             while(rs.next()){
                 modelo_jtl_consultar_forn.addRow(new Object[]{
                     rs.getString("id_forn"),
                     rs.getString("nome_forn"),       
                    });
            }
        }
         catch(Exception erTab){
             System.out.println("Erro no SQL " + erTab);
         }
         finally{            
             fornecedorCTR.CloseDB();
         }
    }
     
    private void preencheCampos(int id_forn){
        
        try{
            fornecedorDTO.setId_forn(id_forn);
            rs = fornecedorCTR.consultarFornecedor(fornecedorDTO, 2);
            
            if(rs.next()){
                limpaCampos();
                
                nome_forn.setText(rs.getString("nome_forn"));
                logradouro_forn.setText(rs.getString("logradouro_forn"));
                numero_forn.setText(rs.getString("numero_forn"));
                bairro_forn.setText(rs.getString("bairro_forn"));
                cidade_forn.setText(rs.getString("cidade_forn"));
                estado_forn.setSelectedItem(rs.getString("estado_forn"));
                cep_forn.setText(rs.getString("cep_forn"));
                cnpj_forn.setText(rs.getString("cnpj_forn"));
                telefone_forn.setText(rs.getString("telefone_forn"));
                
                gravar_alterar = 2;
                liberaCampos(true);     
            } 
        }
        catch(Exception erTab){
            System.out.println("Erro no SQL " + erTab);
        }
        finally{
            fornecedorCTR.CloseDB();
        }
    }
    
    private void alterar(){
        
        try{
           fornecedorDTO.setNome_forn(nome_forn.getText());
           fornecedorDTO.setLogradouro_forn(logradouro_forn.getText());
           fornecedorDTO.setNumero_forn(Integer.parseInt(numero_forn.getText()));
           fornecedorDTO.setBairro_forn(bairro_forn.getText());
           fornecedorDTO.setCidade_forn(cidade_forn.getText());
           fornecedorDTO.setEstado_forn(estado_forn.getSelectedItem().toString());
           fornecedorDTO.setCep_forn(cep_forn.getText());
           fornecedorDTO.setCnpj_forn(cnpj_forn.getText());
           fornecedorDTO.setTelefone_forn(telefone_forn.getText());
           
           JOptionPane.showMessageDialog(null, fornecedorCTR.alterarFornecedor(fornecedorDTO));
           
       }catch(Exception e){
           System.out.println("Erro ao Alterar! " + e.getMessage());
        }         
    }
    
    private void excluir(){
        
        if(JOptionPane.showConfirmDialog(null, "Deseja Realmente excluir o Fornecedor?","Aviso",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, fornecedorCTR.excluirFornecedor(fornecedorDTO));
        }
    }
     
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairro_forn;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField cep_forn;
    private javax.swing.JTextField cidade_forn;
    private javax.swing.JTextField cnpj_forn;
    private javax.swing.JComboBox<String> estado_forn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtl_consultar_forn;
    private javax.swing.JTextField logradouro_forn;
    private javax.swing.JTextField nome_forn;
    private javax.swing.JTextField numero_forn;
    private javax.swing.JTextField pesquisa_nome_forn;
    private javax.swing.JTextField telefone_forn;
    // End of variables declaration//GEN-END:variables
}

package GUI;

import Entities.Produto;
import Entities.Supermercado;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;


public class ConfigProduto_painel extends javax.swing.JPanel {
    
    
    DefaultTableModel model;
    Object[] rowData;
    

    public ConfigProduto_painel() {
        initComponents();
        System.out.println("UOPA");
        
        model = (DefaultTableModel) produtosTable.getModel();
        
        setEnableBtns(false, false, false);
        setEditableFields(false, false, false);
        
        
        iniciaTabela();
        
    }

    public void iniciaTabela(){

        rowData = new Object[Supermercado.listaProdutos.size()];         
        
        for (int i = 0; i < Supermercado.listaProdutos.size(); i++) {
            rowData[0] = Supermercado.listaProdutos.get(i).getNome();
            model.addRow(rowData);
        }
        
    }
    
    public void setEnableBtns(boolean btn1Valor, boolean btn2Valor, boolean btn3Valor){
        editarBtn.setEnabled(btn1Valor);
        removerBtn.setEnabled(btn2Valor);
        atualizarBtn.setEnabled(btn3Valor);
    }
    
    public void setEditableFields(boolean field1Valor, boolean field2Valor, boolean field3Valor){
        nomeField.setEditable(field1Valor);
        valorField.setEditable(field2Valor);
        descricaoField.setEditable(field3Valor);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        produtosTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        valorField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        descricaoField = new javax.swing.JTextArea();
        editarBtn = new javax.swing.JButton();
        atualizarBtn = new javax.swing.JButton();
        removerBtn = new javax.swing.JButton();
        voltarBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setForeground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PRODUTOS");

        produtosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUTOS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        produtosTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                produtosTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(produtosTable);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setText("Valor: R$");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setText("Descrição:");

        nomeField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        valorField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        valorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorFieldActionPerformed(evt);
            }
        });

        descricaoField.setColumns(20);
        descricaoField.setRows(5);
        jScrollPane2.setViewportView(descricaoField);

        editarBtn.setBackground(new java.awt.Color(124, 129, 255));
        editarBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        editarBtn.setText("Editar");
        editarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarBtnMouseClicked(evt);
            }
        });

        atualizarBtn.setBackground(new java.awt.Color(124, 129, 255));
        atualizarBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        atualizarBtn.setText("Atualizar");
        atualizarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atualizarBtnMouseClicked(evt);
            }
        });

        removerBtn.setBackground(new java.awt.Color(124, 129, 255));
        removerBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        removerBtn.setText("Remover");
        removerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removerBtnMouseClicked(evt);
            }
        });

        voltarBtn.setBackground(new java.awt.Color(124, 129, 255));
        voltarBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        voltarBtn.setText("Voltar");
        voltarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarBtnMouseClicked(evt);
            }
        });
        voltarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel5.setText("Nome:");

        idField.setEditable(false);
        idField.setBackground(new java.awt.Color(255, 255, 255));
        idField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(editarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(removerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(atualizarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(voltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(10, 10, 10)
                                            .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel2)
                                            .addGap(3, 3, 3)
                                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(1, 1, 1)
                                            .addComponent(valorField))
                                        .addComponent(jScrollPane2)))))
                        .addGap(0, 27, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(valorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(editarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(removerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(atualizarBtn))
                        .addGap(58, 58, 58)
                        .addComponent(voltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
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
    }// </editor-fold>//GEN-END:initComponents

    private void valorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorFieldActionPerformed

    private void produtosTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produtosTableMouseClicked
        setEditableFields(false, false, false);
        setEnableBtns(true, true, false);

        int rowIndex = produtosTable.getSelectedRow();
        String produtoSelecionado = produtosTable.getValueAt(rowIndex, 0).toString();
        
        for (int i = 0; i < Supermercado.listaProdutos.size(); i++) {
            if(Supermercado.listaProdutos.get(i).getId() == Supermercado.IDs.get(rowIndex)){
               nomeField.setText(Supermercado.listaProdutos.get(i).getNome());
               valorField.setText(String.valueOf(Supermercado.listaProdutos.get(i).getValor()));
               descricaoField.setText(Supermercado.listaProdutos.get(i).getDescricao());
               idField.setText(String.valueOf(Supermercado.listaProdutos.get(i).getId()));
           }
        }
        
    }//GEN-LAST:event_produtosTableMouseClicked

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed

    private void voltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_voltarBtnActionPerformed

    private void editarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarBtnMouseClicked
        setEditableFields(true, true, true);
        setEnableBtns(true, true, true);
    }//GEN-LAST:event_editarBtnMouseClicked

    private void atualizarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atualizarBtnMouseClicked
        int rowIndex = produtosTable.getSelectedRow();
        String produtoSelecionado = produtosTable.getValueAt(rowIndex, 0).toString();
        
        String warningMsg = "Tem certeza que deseja atualizar os dados desse produto? " + 
                "\nProduto Modificado: " + produtoSelecionado +
                "\nID: " + Supermercado.IDs.get(rowIndex);
        
        //0 = sim / 1 - nao / 2 - opcao cancelada
        int opcao = JOptionPane.showConfirmDialog(null, warningMsg);
        
        switch(opcao){
            case 0:
                for(Produto p : Supermercado.listaProdutos){
                    if(p.getNome().equals(produtoSelecionado) && (p.getId() == Supermercado.IDs.get(rowIndex))){
                        try {
                            
                            if(verificaFields() == false){//verifica se algum campo está vazio
                                throw new NullPointerException();
                            }
                            
                            p.setNome(nomeField.getText());
                            float novoValor = Float.parseFloat(valorField.getText());
                            if(novoValor > 0){
                                p.setValor(novoValor);
                            }else{
                                throw new IllegalArgumentException();
                            }                      
                            p.setDescricao(descricaoField.getText());
                            
                            JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!!");
                            model.setValueAt(p.getNome(), rowIndex, 0);
                            setEditableFields(false, false, false);
                            setEnableBtns(false, false, false);
                            
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null,"O valor do produto não é do tipo numérico", "Erro!", JOptionPane.ERROR_MESSAGE);
                        } catch (IllegalArgumentException e){
                            JOptionPane.showMessageDialog(null,"O valor de um produto não pode ser negativo!", "Erro!", JOptionPane.ERROR_MESSAGE);
                        }  catch (NullPointerException e){
                            JOptionPane.showMessageDialog(null,"TODOS os campos devem ser preenchidos!", "Erro!", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
                break;
                
            case 1 , 2:
                JOptionPane.showMessageDialog(null, "Modificações canceladas!");
                break;
        }
        
        
    }//GEN-LAST:event_atualizarBtnMouseClicked

    private void voltarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarBtnMouseClicked
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        Janela.iniciaJanela(janela, Janela.painelProduto, Janela.painelCadastro);
    }//GEN-LAST:event_voltarBtnMouseClicked

    private void removerBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removerBtnMouseClicked
        int rowIndex = produtosTable.getSelectedRow();
        double idSelecionado = Supermercado.IDs.get(rowIndex);
        String warningMsg = "Tem certeza que deseja exluir o produto selecionado?" + 
                "\nProduto: " + model.getValueAt(rowIndex, 0).toString() + 
                "\nId: " + idSelecionado;
        
        int option = JOptionPane.showConfirmDialog(null, warningMsg);
        
        switch(option){
            case 0:
                for (int i = 0; i < Supermercado.listaProdutos.size(); i++) {
                    if(Supermercado.listaProdutos.get(i).getId() == idSelecionado){
                        Supermercado.listaProdutos.remove(Supermercado.listaProdutos.get(i));
                        Supermercado.IDs.remove(i);
                    }
                }
                model.removeRow(rowIndex);
                JOptionPane.showMessageDialog(null, "Produto Excluido com sucesso!");
                
                if(Supermercado.listaProdutos.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Não há mais produtos disponíveis!");
                    JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
                    Janela.iniciaJanela(janela, Janela.painelProduto, Janela.painelCadastro);
                };
                limparFields();
               
            break;
            
            case 1,2:
                JOptionPane.showMessageDialog(null, "Operação cancelada com sucesso!");
            break;
            
        }
    }//GEN-LAST:event_removerBtnMouseClicked

    private boolean verificaFields(){
        if(nomeField.getText().equals("") || valorField.getText().equals("") || descricaoField.getText().equals("")){
            //algum campo esta vazio
            return false;
        }else{
            return true;
        }
    }
    
    public void limparFields(){
        nomeField.setText("");
        valorField.setText("");
        descricaoField.setText("");
        idField.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarBtn;
    private javax.swing.JTextArea descricaoField;
    private javax.swing.JButton editarBtn;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nomeField;
    private javax.swing.JTable produtosTable;
    private javax.swing.JButton removerBtn;
    private javax.swing.JTextField valorField;
    private javax.swing.JButton voltarBtn;
    // End of variables declaration//GEN-END:variables
}

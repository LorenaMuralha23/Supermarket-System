/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import Entities.User;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import trabalho1_doo.Main;

/**
 *
 * @author USER
 */
public class Carrinho_painel extends javax.swing.JPanel {
 
    User usuarioLogado;
    DefaultTableModel model;

    
    public Carrinho_painel(User usuario) {
        initComponents();
        
        usuarioLogado = usuario;
        model = (DefaultTableModel) carrinhoTable.getModel();
        
        iniciaTable();
    }
    
    public void iniciaTable(){
        
        Object[] rowData = new Object[usuarioLogado.carrinho.size()];
        
        for (int i = 0; i < usuarioLogado.carrinho.size(); i++) {
            rowData[0] = usuarioLogado.carrinho.get(i).getNome();
            model.addRow(rowData);
        }

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        carrinhoTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        nomeProdField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        totalField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        removerBtn = new javax.swing.JButton();
        voltarBtn = new javax.swing.JButton();
        valorField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        quantidadeField = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 955, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(153, 153, 255));
        setForeground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seu Carrinho");
        jLabel1.setToolTipText("");

        carrinhoTable.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        carrinhoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Carrinho"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        carrinhoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carrinhoTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(carrinhoTable);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Produto:");

        nomeProdField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nomeProdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeProdFieldActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Qtnd:");

        totalField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total: R$");

        removerBtn.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        removerBtn.setText("Remover");
        removerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removerBtnMouseClicked(evt);
            }
        });

        voltarBtn.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        voltarBtn.setText("Voltar");
        voltarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarBtnMouseClicked(evt);
            }
        });

        valorField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Valor: R$");

        quantidadeField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        quantidadeField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nomeProdField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quantidadeField))
                            .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valorField, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(42, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(voltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(removerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nomeProdField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(quantidadeField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valorField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(voltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 42, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nomeProdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeProdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeProdFieldActionPerformed

    private void carrinhoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carrinhoTableMouseClicked
        
        setEnabledBtns(true, true);
        int rowIndex = carrinhoTable.getSelectedRow();
  
        for (int i = 0; i < usuarioLogado.carrinho.size(); i++) {
            if(usuarioLogado.IDsCarrinho.get(rowIndex) == usuarioLogado.carrinho.get(i).getId()){
                nomeProdField.setText(usuarioLogado.carrinho.get(i).getNome());
                valorField.setText(String.valueOf(usuarioLogado.carrinho.get(i).getValor()));
                totalField.setText(String.valueOf(Main.supermercado.calculaValorConta(usuarioLogado.carrinho)));
                quantidadeField.setText(String.valueOf(usuarioLogado.carrinho.get(i).getQuantidadeComprada()));
            }
        }

        
        
    }//GEN-LAST:event_carrinhoTableMouseClicked

    private void voltarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarBtnMouseClicked
        Vitrine_painel.atualizaPreco();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        Janela.iniciaJanela(janela, Janela.painelCarrinho, Janela.painelCliente);
    }//GEN-LAST:event_voltarBtnMouseClicked

    private void removerBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removerBtnMouseClicked
        int rowIndex = carrinhoTable.getSelectedRow();
        
       
       
       if(usuarioLogado.carrinho.isEmpty()){
           JOptionPane.showMessageDialog(null, "Erro: Carrinho vazio!");
       }else{
           usuarioLogado.carrinho.get(rowIndex).setQuantidadeComprada(usuarioLogado.carrinho.get(rowIndex).getQuantidadeComprada()-1);
           
           if(usuarioLogado.carrinho.get(rowIndex).getQuantidadeComprada() == 0){
                usuarioLogado.carrinho.remove(usuarioLogado.carrinho.get(rowIndex));
                usuarioLogado.IDsCarrinho.remove(usuarioLogado.IDsCarrinho.get(rowIndex));
                model.removeRow(rowIndex);
                carrinhoTable.clearSelection();
                limpaFields();
           }else{
                quantidadeField.setText(String.valueOf(usuarioLogado.carrinho.get(rowIndex).getQuantidadeComprada()));
           }

           Main.supermercado.calculaValorConta(usuarioLogado.carrinho);
       }
        
    }//GEN-LAST:event_removerBtnMouseClicked

    public void setEnabledBtns(boolean valor1, boolean valor2){
        voltarBtn.setEnabled(valor1);
        removerBtn.setEnabled(valor2);
    }   
    
    public void limpaFields(){
        nomeProdField.setText("");
        valorField.setText("");
        totalField.setText("");
        quantidadeField.setText("0");
        setEnabledBtns(true, false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable carrinhoTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeProdField;
    private javax.swing.JTextField quantidadeField;
    private javax.swing.JButton removerBtn;
    private javax.swing.JTextField totalField;
    private javax.swing.JTextField valorField;
    private javax.swing.JButton voltarBtn;
    // End of variables declaration//GEN-END:variables
}

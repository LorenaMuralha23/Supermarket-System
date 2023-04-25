package GUI;

import Entities.Produto;
import Entities.Supermercado;
import Entities.User;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import trabalho1_doo.Main;

public class Vitrine_painel extends javax.swing.JPanel {
    
    DefaultTableModel model;
    SpinnerNumberModel spinnerModel;
    static JTextField precoField;
    static User usuarioLogado;
    
    public Vitrine_painel(User usuario) {
        System.out.println("UOPA");
        initComponents();
       
        
        usuarioLogado = usuario;
        model = (DefaultTableModel) this.produtosTable.getModel();
        nomeLabel.setText(usuario.getNome());
        spinnerModel = new SpinnerNumberModel(1, 1, 10, 1);
        this.qntdSpinner.setModel(spinnerModel);
        totalField.setText(String.valueOf(Main.supermercado.calculaValorConta(usuarioLogado.carrinho)));
        precoField = totalField;
        
        iniciaTabela();
        if(usuarioLogado.carrinho.isEmpty()){
            //caso o carrinho do usuario não tenha nada armazenado anteriormente, os botões ficam desabilitados
           setEnabledBtns(false, false, false); 
        }else{
            //caso o carrinho do usuario tenha algo armazenado, o botão de "visualizar carrinho" e "finalizar compra" ficam habilitados
           setEnabledBtns(false, true, true); 
        }
    }
    
    public void iniciaTabela(){
        
        Object[] rowData = new Object[Supermercado.listaProdutos.size()];
        
        for (int i = 0; i < Supermercado.listaProdutos.size(); i++) {
            rowData[0] = Supermercado.listaProdutos.get(i).getNome();
            model.addRow(rowData);
        }
        
    }
    
    public void setEnabledBtns(boolean valor1, boolean valor2, boolean valor3){
        //seta se os botoes vao estar habilitados ou nao
        addCarrinhoBtn.setEnabled(valor1);
        visualizarCarrinhoBtn.setEnabled(valor2);
        finalizarBtn.setEnabled(valor3);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        produtosTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descricaoField = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        addCarrinhoBtn = new javax.swing.JButton();
        visualizarCarrinhoBtn = new javax.swing.JButton();
        finalizarBtn = new javax.swing.JButton();
        sairBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        nomeProdField = new javax.swing.JTextField();
        valorField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        qntdSpinner = new javax.swing.JSpinner();
        nomeLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        totalField = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bem vindo(a), ");

        jLabel2.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("!");

        produtosTable.setAutoCreateRowSorter(true);
        produtosTable.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        produtosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUTOS DISPONÍVEIS"
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

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Qtnd:");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Valor: R$");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Descrição:");

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        descricaoField.setEditable(false);
        descricaoField.setColumns(20);
        descricaoField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        descricaoField.setRows(5);
        jScrollPane2.setViewportView(descricaoField);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Impact", 0, 26)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Detalhes");

        addCarrinhoBtn.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        addCarrinhoBtn.setText("Adiconar ao carrinho");
        addCarrinhoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCarrinhoBtnMouseClicked(evt);
            }
        });

        visualizarCarrinhoBtn.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        visualizarCarrinhoBtn.setText("Visualizar carrinho");
        visualizarCarrinhoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visualizarCarrinhoBtnMouseClicked(evt);
            }
        });

        finalizarBtn.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        finalizarBtn.setText("Finalizar Compra");
        finalizarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finalizarBtnMouseClicked(evt);
            }
        });

        sairBtn.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        sairBtn.setText("Sair");
        sairBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairBtnMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));

        nomeProdField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        valorField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Produto:");

        qntdSpinner.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        nomeLabel.setBackground(new java.awt.Color(255, 255, 255));
        nomeLabel.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        nomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        nomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Total: R$");

        totalField.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(visualizarCarrinhoBtn))
                            .addComponent(sairBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(7, 7, 7)
                                    .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(addCarrinhoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(finalizarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valorField))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(509, 509, 509)
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeProdField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(qntdSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(37, 37, 37))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                .addGap(471, 471, 471))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nomeProdField)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(qntdSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(valorField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(visualizarCarrinhoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addCarrinhoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(31, 31, 31)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(finalizarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sairBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)
                        .addGap(22, 22, 22))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void produtosTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produtosTableMouseClicked
        setEnabledBtns(true, false, true);
        int rowIndex = produtosTable.getSelectedRow();
  
        for (int i = 0; i < Supermercado.listaProdutos.size(); i++) {
            if(Supermercado.IDs.get(rowIndex) == Supermercado.listaProdutos.get(i).getId()){
                nomeProdField.setText(Supermercado.listaProdutos.get(i).getNome());
                valorField.setText(String.valueOf(Supermercado.listaProdutos.get(i).getValor()));
                descricaoField.setText(Supermercado.listaProdutos.get(i).getDescricao());
                qntdSpinner.setValue(1);
            }
        }
        
    }//GEN-LAST:event_produtosTableMouseClicked

    private void sairBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairBtnMouseClicked
        int option = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair? Seu carrinho permanecerá salvo ao retornar a sua conta.");
        
        if(option == 0){
            JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
            Janela.iniciaJanela(janela, Janela.painelCliente, Janela.painelLogin);
        }
        
    }//GEN-LAST:event_sairBtnMouseClicked

    private void addCarrinhoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCarrinhoBtnMouseClicked
        setEnabledBtns(true, true, true);
        int rowIndex = produtosTable.getSelectedRow();
        String qtndObj = qntdSpinner.getValue().toString();
        int quantidade = Integer.valueOf(qtndObj);
        double idProdutoSelecionado = Supermercado.IDs.get(rowIndex);
        Produto produtoSelecionado = null;
        
        for (int i = 0; i < Supermercado.listaProdutos.size(); i++) {
            if(Supermercado.listaProdutos.get(i).getId() == idProdutoSelecionado){
                produtoSelecionado = Supermercado.listaProdutos.get(i);
                Supermercado.listaProdutos.get(i).setQuantidadeComprada(quantidade + produtoSelecionado.getQuantidadeComprada());
            }
        }

        boolean existeNoCarrinho = false;//evita que o produto seja add duas vezes no carrinho
        
        for (int i = 0; i < usuarioLogado.carrinho.size(); i++) {
            if(produtoSelecionado == usuarioLogado.carrinho.get(i)){
                existeNoCarrinho = true;//ja foi adicionado
            }
        }
        
        if(!existeNoCarrinho){
            usuarioLogado.carrinho.add(produtoSelecionado);
            usuarioLogado.IDsCarrinho.add(produtoSelecionado.getId());
        }

        totalField.setText(String.valueOf(Main.supermercado.calculaValorConta(usuarioLogado.carrinho)));
    }//GEN-LAST:event_addCarrinhoBtnMouseClicked

    private void finalizarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalizarBtnMouseClicked
        
        int option = JOptionPane.showConfirmDialog(null, "Tem certeza que quer finalizar a compra?");
        
        if(option == 0){
           JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
           
           if(!usuarioLogado.carrinho.isEmpty()){
               //existe produtos no carrinho
               Janela.painelCompra = new Compra_Painel(usuarioLogado);
               Janela.iniciaJanela(janela, this, Janela.painelCompra);
               
           }else{
               
               /*Caso o cliente queira apenas comprar um produto, ele não irá precisar adiciona-lo ao carrinho pra fazer isso. Ele pode comprar direto, apenas selecionando ele e 
               clicando em "finalizar compra"*/
               int rowIndex = produtosTable.getSelectedRow();
               String qtndObj = qntdSpinner.getValue().toString();
               int quantidade = Integer.parseInt(qtndObj);
               double idProdutoSelecionado = Supermercado.IDs.get(rowIndex);
               Produto produtoSelecionado = null;
               
               for (int i = 0; i < Supermercado.listaProdutos.size(); i++) {
                    if(Supermercado.listaProdutos.get(i).getId() == idProdutoSelecionado){
                        produtoSelecionado = Supermercado.listaProdutos.get(i);
                        Supermercado.listaProdutos.get(i).setQuantidadeComprada(quantidade + produtoSelecionado.getQuantidadeComprada());
                        usuarioLogado.carrinho.add(produtoSelecionado);
                        Main.supermercado.calculaValorConta(usuarioLogado.carrinho);
                    }
               }
               Janela.painelCompra = new Compra_Painel(usuarioLogado);
               Janela.iniciaJanela(janela, this, Janela.painelCompra);
               
           }
            
        }
        
    }//GEN-LAST:event_finalizarBtnMouseClicked
    
    private void visualizarCarrinhoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visualizarCarrinhoBtnMouseClicked

        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        Janela.painelCarrinho = new Carrinho_painel(usuarioLogado);
        Janela.iniciaJanela(janela, Janela.painelCliente, Janela.painelCarrinho);
        
    }//GEN-LAST:event_visualizarCarrinhoBtnMouseClicked
    
    public static void atualizaPreco(){
        //atualiza o preço da compra do cliente dependendo da ação dele
        precoField.setText(String.valueOf(Main.supermercado.calculaValorConta(usuarioLogado.carrinho)));
        
    }
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCarrinhoBtn;
    private javax.swing.JTextArea descricaoField;
    private javax.swing.JButton finalizarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeProdField;
    private javax.swing.JTable produtosTable;
    private javax.swing.JSpinner qntdSpinner;
    private javax.swing.JButton sairBtn;
    private javax.swing.JTextField totalField;
    private javax.swing.JTextField valorField;
    private javax.swing.JButton visualizarCarrinhoBtn;
    // End of variables declaration//GEN-END:variables
}

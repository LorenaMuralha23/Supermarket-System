package GUI;

import Entities.Produto;
import Entities.Supermercado;
import Entities.User;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class CadastrarProduto_painel extends javax.swing.JPanel {
    
 
    public CadastrarProduto_painel(User admLogado) {
        initComponents();
        
        admNomeLabel.setText(admLogado.getNome());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastroPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        admNomeLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nomeProdField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        valorProdField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descProdField = new javax.swing.JTextArea();
        cadastrarBtn = new javax.swing.JButton();
        visualizarBtn = new javax.swing.JButton();
        sairBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        cadastroPanel.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Olá,");

        admNomeLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        admNomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Entre com os dados do produto para cadastro");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setText("Nome:");

        nomeProdField.setBackground(new java.awt.Color(255, 255, 255));
        nomeProdField.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel5.setText("Valor: R$");

        valorProdField.setBackground(new java.awt.Color(255, 255, 255));
        valorProdField.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel6.setText("Descrição:");

        descProdField.setBackground(new java.awt.Color(255, 255, 255));
        descProdField.setColumns(20);
        descProdField.setRows(5);
        jScrollPane1.setViewportView(descProdField);

        cadastrarBtn.setBackground(new java.awt.Color(124, 129, 255));
        cadastrarBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cadastrarBtn.setForeground(new java.awt.Color(255, 255, 255));
        cadastrarBtn.setText("Cadastrar");
        cadastrarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarBtnMouseClicked(evt);
            }
        });

        visualizarBtn.setBackground(new java.awt.Color(124, 129, 255));
        visualizarBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        visualizarBtn.setForeground(new java.awt.Color(255, 255, 255));
        visualizarBtn.setText("Visualizar");
        visualizarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visualizarBtnMouseClicked(evt);
            }
        });

        sairBtn.setBackground(new java.awt.Color(124, 129, 255));
        sairBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        sairBtn.setForeground(new java.awt.Color(255, 255, 255));
        sairBtn.setText("Sair");
        sairBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout cadastroPanelLayout = new javax.swing.GroupLayout(cadastroPanel);
        cadastroPanel.setLayout(cadastroPanelLayout);
        cadastroPanelLayout.setHorizontalGroup(
            cadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(cadastroPanelLayout.createSequentialGroup()
                .addGroup(cadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastroPanelLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(admNomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cadastroPanelLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(cadastrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cadastroPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(cadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addGroup(cadastroPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valorProdField))
                            .addGroup(cadastroPanelLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeProdField, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addGroup(cadastroPanelLayout.createSequentialGroup()
                                .addComponent(sairBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(visualizarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        cadastroPanelLayout.setVerticalGroup(
            cadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(admNomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(cadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeProdField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(valorProdField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cadastrarBtn)
                .addGap(30, 30, 30)
                .addGroup(cadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(visualizarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(sairBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/adm_icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cadastroPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cadastroPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarBtnMouseClicked
        
        if(nomeProdField.getText().equals("") || valorProdField.getText().equals("") || descProdField.getText().equals("")){
            JOptionPane.showMessageDialog(null,"TODOS os campos precisam estar preenchidos!", "Erro!", JOptionPane.ERROR_MESSAGE);
            limpaFields();
        }else{
            
            try {
                String nomeProd = nomeProdField.getText();
                float valor = Float.parseFloat(valorProdField.getText());
                if(valor < 0){
                    throw new IllegalArgumentException();
                }
                String descricao = descProdField.getText();
                Produto produto = new Produto(nomeProd, valor, descricao);
                Supermercado.listaProdutos.add(produto);
                Supermercado.IDs.add(produto.getId());
                JOptionPane.showMessageDialog(null,"Produto cadastrado com sucesso!", "Mensagem!", JOptionPane.INFORMATION_MESSAGE);
                limpaFields();
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"O valor do produto não é do tipo numérico", "Erro!", JOptionPane.ERROR_MESSAGE);
                limpaFields();
            } catch (IllegalArgumentException e){
                JOptionPane.showMessageDialog(null,"O valor de um produto não pode ser negativo!", "Erro!", JOptionPane.ERROR_MESSAGE);
                limpaFields();
            }
            
        }
        
    }//GEN-LAST:event_cadastrarBtnMouseClicked

    private void sairBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairBtnMouseClicked
        
        int option = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?\nAlerta: Se sair, sua conta será deslogada automaticamente", "AVISO", JOptionPane.YES_OPTION);
        
        if(option == 0){
            JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
            Janela.iniciaJanela(janela, Janela.painelCadastro, Janela.painelLogin);
        }
        
    }//GEN-LAST:event_sairBtnMouseClicked

    private void visualizarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visualizarBtnMouseClicked
        Janela.painelProduto = new ConfigProduto_painel();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        Janela.iniciaJanela(janela, Janela.painelCadastro, Janela.painelProduto);
    }//GEN-LAST:event_visualizarBtnMouseClicked
    
    public void limpaFields(){
        nomeProdField.setText("");
        valorProdField.setText("");
        descProdField.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admNomeLabel;
    private javax.swing.JButton cadastrarBtn;
    private javax.swing.JPanel cadastroPanel;
    private javax.swing.JTextArea descProdField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeProdField;
    private javax.swing.JButton sairBtn;
    private javax.swing.JTextField valorProdField;
    private javax.swing.JButton visualizarBtn;
    // End of variables declaration//GEN-END:variables
}

package GUI;

import Entities.User;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import trabalho1_doo.Main;

public class Compra_Painel extends javax.swing.JPanel {

    private User usuarioLogado;
    private DefaultTableModel model;
    private LocalDate date = LocalDate.now();
    private String dataFormatada;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public Compra_Painel(User usuarioLogado) {
        
        initComponents();
        dataFormatada = date.format(formatter);
        
        this.usuarioLogado = usuarioLogado;
        
        model = (DefaultTableModel) carrinhoTable.getModel();
        
        iniciaTable();
        iniciaLabels();
        
    }

     public void iniciaTable(){
        
        Object[] rowData = new Object[4];
 
        for (int i = 0; i < usuarioLogado.carrinho.size(); i++) {
            rowData[0] = usuarioLogado.carrinho.get(i).getNome();
            rowData[1] = usuarioLogado.carrinho.get(i).getQuantidadeComprada();
            rowData[2] = usuarioLogado.carrinho.get(i).getValor();
            rowData[3] = Main.supermercado.calculaValorProduto(usuarioLogado.carrinho.get(i).getId(), usuarioLogado.carrinho.get(i).getQuantidadeComprada());
            model.addRow(rowData);
        }
        
    }
     
    public void iniciaLabels(){
        
        dataLabel.setText(dataFormatada);
        valorLabel.setText(String.valueOf(Main.supermercado.calculaValorConta(usuarioLogado.carrinho)));
        
    } 
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        carrinhoTable = new javax.swing.JTable();
        continuarComprandoBtn = new javax.swing.JButton();
        notaFiscalBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        valorLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dataLabel = new javax.swing.JLabel();

        mainPanel.setBackground(new java.awt.Color(153, 153, 255));
        mainPanel.setForeground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Compra finalizada!");

        jLabel2.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sua encomenda deve chegar em sua residência no tempo previsto!");

        carrinhoTable.setBackground(new java.awt.Color(255, 255, 255));
        carrinhoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Carrinho", "Quantidade", "Valor Produto (R$)", "Valor total (R$)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(carrinhoTable);

        continuarComprandoBtn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        continuarComprandoBtn.setText("Continuar comprando");
        continuarComprandoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continuarComprandoBtnMouseClicked(evt);
            }
        });

        notaFiscalBtn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        notaFiscalBtn.setText("Imprimir nota fiscal");
        notaFiscalBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notaFiscalBtnMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Valor da Compra: R$");

        valorLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        valorLabel.setText("R$XXX.XX");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Data da Compra:");

        dataLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dataLabel.setText("dd/mm/yyyy");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(continuarComprandoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(notaFiscalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valorLabel)
                .addGap(58, 58, 58))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(dataLabel))
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(valorLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(continuarComprandoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(notaFiscalBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void notaFiscalBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notaFiscalBtnMouseClicked
        
        String produtosTxt = "";
        for (int i = 0; i < usuarioLogado.carrinho.size(); i++) {
            produtosTxt += "\n -" + usuarioLogado.carrinho.get(i).getNome();
        }
        
        String msg = "Nome: " + usuarioLogado.getNome() 
                + "\nCPF: " + usuarioLogado.getCpf() 
                + "\n\nProdutos: " + produtosTxt 
                + "\n\nData da Compra: " + dataFormatada
                + "\nTotal Pago: R$" + Main.supermercado.calculaValorConta(usuarioLogado.carrinho);
        
        JOptionPane.showMessageDialog(null, msg, "Nota Fiscal", JOptionPane.HEIGHT);
        
    }//GEN-LAST:event_notaFiscalBtnMouseClicked

    private void continuarComprandoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuarComprandoBtnMouseClicked
        
        usuarioLogado.limparCarrinho();
        Vitrine_painel.atualizaPreco();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        Janela.iniciaJanela(janela, this, Janela.painelCliente);
        
    }//GEN-LAST:event_continuarComprandoBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable carrinhoTable;
    private javax.swing.JButton continuarComprandoBtn;
    private javax.swing.JLabel dataLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton notaFiscalBtn;
    private javax.swing.JLabel valorLabel;
    // End of variables declaration//GEN-END:variables
}

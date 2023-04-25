package GUI;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class Janela extends javax.swing.JFrame {

     //Painel geral
    static Login_painel painelLogin;
    
    //Paineis para adms
    static CadastrarProduto_painel painelCadastro;
    static ConfigProduto_painel painelProduto;
    
    //Paineis pra clientes
    static Vitrine_painel painelCliente;
    static Carrinho_painel painelCarrinho;
    static Compra_Painel painelCompra;
    
    public Janela() {
        
        initComponents();
        
        this.setLayout(new BorderLayout());
        
        painelLogin = new Login_painel();
        
        this.add(painelLogin);
        this.pack();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    public static void iniciaJanela(JFrame janela, JPanel painelExcluir, JPanel novoPainel){
        janela.getContentPane().remove(painelExcluir);
        janela.add(novoPainel, BorderLayout.CENTER);
        janela.pack();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

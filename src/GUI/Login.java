package GUI;

import Entities.User;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;

public class Login extends javax.swing.JPanel {
    
    
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        admOrClientGroup = new javax.swing.ButtonGroup();
        loginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cpfField = new javax.swing.JTextField();
        admOptn = new javax.swing.JRadioButton();
        clienteOptn = new javax.swing.JRadioButton();
        loginBtn = new javax.swing.JButton();
        imgPainel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        loginPanel.setBackground(new java.awt.Color(153, 153, 255));
        loginPanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Nome:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("SansSerif", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Bem vindo! Entre com os dados para iniciar");

        nomeField.setBackground(new java.awt.Color(204, 204, 255));
        nomeField.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        nomeField.setForeground(new java.awt.Color(0, 0, 0));
        nomeField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("CPF:");

        cpfField.setBackground(new java.awt.Color(204, 204, 255));
        cpfField.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        cpfField.setForeground(new java.awt.Color(0, 0, 0));
        cpfField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        admOptn.setBackground(new java.awt.Color(153, 153, 255));
        admOrClientGroup.add(admOptn);
        admOptn.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        admOptn.setText("Admnistrador");

        clienteOptn.setBackground(new java.awt.Color(153, 153, 255));
        admOrClientGroup.add(clienteOptn);
        clienteOptn.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        clienteOptn.setText("Cliente");

        loginBtn.setBackground(new java.awt.Color(102, 102, 255));
        loginBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Log in");
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
        });
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                                    .addComponent(nomeField)))
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cpfField, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addContainerGap(78, Short.MAX_VALUE)
                        .addComponent(admOptn)
                        .addGap(57, 57, 57)
                        .addComponent(clienteOptn)
                        .addGap(40, 40, 40)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpfField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(admOptn)
                    .addComponent(clienteOptn))
                .addGap(18, 18, 18)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        imgPainel.setBackground(new java.awt.Color(214, 214, 244));
        imgPainel.setForeground(new java.awt.Color(255, 255, 255));
        imgPainel.setToolTipText("");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/market_icon.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout imgPainelLayout = new javax.swing.GroupLayout(imgPainel);
        imgPainel.setLayout(imgPainelLayout);
        imgPainelLayout.setHorizontalGroup(
            imgPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imgPainelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        imgPainelLayout.setVerticalGroup(
            imgPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imgPainelLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(imgPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtnActionPerformed

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        /*
        1- Verificar se os campos estão vazios
            Se sim{ - limpar eles (criar metodo) e exibir mensagem de erro}
        
        2- Exibir a janela de acordo com o tipo de usuario
            Criar um metodo generico ????
        */
        
        
        if(nomeField.getText().equals("") || cpfField.getText().equals("") || (!admOptn.isSelected() && !clienteOptn.isSelected())){
            JOptionPane.showMessageDialog(null,"TODOS os campos precisam estar preenchidos!", "Erro!", JOptionPane.ERROR_MESSAGE);
            limpaFields();
        }else{
            JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
            String nome = nomeField.getText();
            String cpf = cpfField.getText();
            int tipoCliente;
            
            if(admOptn.isSelected()){
                tipoCliente = 1;
                User usuario = new User(nome, cpf, tipoCliente);
                limpaFields();
                Janela.painelCadastro = new Cadastro_prod(usuario);
                Janela.iniciaJanela(janela, Janela.painelLogin, Janela.painelCadastro);
            }else{
                tipoCliente = 2;
                limpaFields();
                Janela.iniciaJanela(janela, Janela.painelLogin, Janela.painelCliente);
                User usuario = new User(nome, cpf, tipoCliente);
            }
            
        }
        
    }//GEN-LAST:event_loginBtnMouseClicked
    
    public void limpaFields(){
        nomeField.setText("");
        cpfField.setText("");
        admOrClientGroup.clearSelection();
    }
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton admOptn;
    private javax.swing.ButtonGroup admOrClientGroup;
    private javax.swing.JRadioButton clienteOptn;
    private javax.swing.JTextField cpfField;
    private javax.swing.JPanel imgPainel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JTextField nomeField;
    // End of variables declaration//GEN-END:variables
}

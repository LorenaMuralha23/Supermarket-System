package GUI;

import Entities.Supermercado;
import Entities.User;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;

public class Login_painel extends javax.swing.JPanel {
    
    
    public Login_painel() {
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
        cadastrarBtn = new javax.swing.JButton();
        senhaField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
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

        cadastrarBtn.setBackground(new java.awt.Color(102, 102, 255));
        cadastrarBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cadastrarBtn.setForeground(new java.awt.Color(255, 255, 255));
        cadastrarBtn.setText("Cadastrar-se");
        cadastrarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarBtnMouseClicked(evt);
            }
        });

        senhaField.setBackground(new java.awt.Color(204, 204, 255));
        senhaField.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        senhaField.setForeground(new java.awt.Color(0, 0, 0));
        senhaField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Senha:");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cpfField, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cadastrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(senhaField, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(admOptn)
                        .addGap(69, 69, 69)
                        .addComponent(clienteOptn)))
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
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(admOptn)
                    .addComponent(clienteOptn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(cadastrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
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
                .addGap(34, 34, 34)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        imgPainelLayout.setVerticalGroup(
            imgPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imgPainelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
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

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        String nome = nomeField.getText();
        String cpf = cpfField.getText();
        String senha = senhaField.getText();
        boolean existeConta=false;
        int tipoCliente;
        
        
        if(nomeField.getText().equals("") || cpfField.getText().equals("") || (!admOptn.isSelected() && !clienteOptn.isSelected())){
            
            JOptionPane.showMessageDialog(null,"TODOS os campos precisam estar preenchidos!", "Erro!", JOptionPane.ERROR_MESSAGE);
            limpaFields();
            
        }else{
            
            User usuarioLogado = null;
            
            if(admOptn.isSelected()){
                
                if(Supermercado.admDB.isEmpty()){
                    
                    JOptionPane.showMessageDialog(null, "Não existe nenhuma conta vinculada a esses dados!");
                    limpaFields();
                    
                }else{
                    
                    for (int i = 0; i < Supermercado.admDB.size(); i++) {
                        if(Supermercado.admDB.get(i).getNome().equals(nome) && Supermercado.admDB.get(i).getCpf().equals(cpf) && Supermercado.admDB.get(i).getSenha().equals(senha)){
                            //existe uma conta com os dados passados
                            existeConta = true;
                            usuarioLogado = Supermercado.admDB.get(i);
                        }
                    }
                    
                    if(existeConta){
                        limpaFields();
                        Janela.painelCadastro = new CadastrarProduto_painel(usuarioLogado);
                        Janela.iniciaJanela(janela, Janela.painelLogin, Janela.painelCadastro);
                    }else{
                        JOptionPane.showMessageDialog(null, "Não existe nenhuma conta vinculada a esses dados ou algum dado esta invalido! Tente novamente ou crie uma nova conta!");
                        limpaFields();
                    }
                    
                }
                
            }else{ //tipo cliente selecionado
                
                if(Supermercado.clientsDB.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Não existe nenhuma conta vinculada a esses dados!");
                    limpaFields();
                }else{
                    
                    for (int i = 0; i < Supermercado.clientsDB.size(); i++) {
                        
                        if(Supermercado.clientsDB.get(i).getNome().equals(nome) && Supermercado.clientsDB.get(i).getCpf().equals(cpf) && Supermercado.clientsDB.get(i).getSenha().equals(senha)){
                            //existe uma conta com os dados passados
                            existeConta = true;
                            usuarioLogado = Supermercado.clientsDB.get(i);
                        }
                        
                    }
                    
                    if(existeConta){
                        limpaFields();
                        Janela.painelCliente = new Vitrine_painel(usuarioLogado);
                        Janela.iniciaJanela(janela, Janela.painelLogin, Janela.painelCliente);
                    }else{
                        JOptionPane.showMessageDialog(null, "Não existe nenuma conta vinculada a esses dados ou algum dado esta invalido! Tente novamente ou crie uma nova conta!");
                        limpaFields();
                    }
                }
                                
            }
            
        }
        
    }//GEN-LAST:event_loginBtnMouseClicked

    private void cadastrarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarBtnMouseClicked
        
        if(nomeField.getText().equals("") || cpfField.getText().equals("") || (!admOptn.isSelected() && !clienteOptn.isSelected())){
            JOptionPane.showMessageDialog(null,"TODOS os campos precisam estar preenchidos!", "Erro!", JOptionPane.ERROR_MESSAGE);
            limpaFields();
        }else{
            
            String nome = nomeField.getText();
            String cpf = cpfField.getText();
            String senha = senhaField.getText();
            int tipoCliente;
            
            
            if(admOptn.isSelected()){
                boolean cadastroInvalido = false;
                
                if(Supermercado.admDB.isEmpty()){
                    //não há adm nenhum no banco de dados 
                    tipoCliente = 1;
                    JOptionPane.showMessageDialog(null, "Conta criada com sucesso! Faça login para acessar os recursos!");
                    User novoUsuario = new User(nome, cpf, tipoCliente, senha);
                    Supermercado.admDB.add(novoUsuario);
                    limpaFields();
                    
                }else{ 
                    //há adms no banco de dados
                    for (int i = 0; i < Supermercado.admDB.size(); i++) {
                        
                        if(Supermercado.admDB.get(i).getCpf().equals(cpf) && Supermercado.admDB.get(i).getSenha().equals(senha)){
                            //já existe uma conta do tipo adm com os dados passados
                            cadastroInvalido = true;
                            JOptionPane.showMessageDialog(null, "Dados inválidos! Entre com dados validos ou crie uma nova conta!");
                            limpaFields();
                        }
                    
                    }
                    
                    
                    if (!cadastroInvalido) {
                        //dados válidos
                        tipoCliente = 1;
                        JOptionPane.showMessageDialog(null, "Conta criada com sucesso! Faça login para acessar os recursos!");
                        User novoUsuario = new User(nome, cpf, tipoCliente, senha);
                        Supermercado.admDB.add(novoUsuario);
                        limpaFields();
                    }
                    
                }
                
            }else{
                
                if(Supermercado.clientsDB.isEmpty()){
                    //não há cliente nenhum no banco de dados 
                    tipoCliente = 2;
                    JOptionPane.showMessageDialog(null, "Conta criada com sucesso! Faça login para acessar os recursos!");
                    User novoUsuario = new User(nome, cpf, tipoCliente, senha);
                    Supermercado.clientsDB.add(novoUsuario);
                    limpaFields();
                }else{
                    for (int i = 0; i < Supermercado.clientsDB.size(); i++) {
                        if(!Supermercado.clientsDB.get(i).getCpf().equals(cpf) && !Supermercado.clientsDB.get(i).getSenha().equals(senha)){
                            //Os dados enviados pelo user não estao cadastrados no Banco de dados (nao possui uma conta)
                            tipoCliente = 2;
                            JOptionPane.showMessageDialog(null, "Conta criada com sucesso! Faça login para acessar os recursos!");
                            User novoUsuario = new User(nome, cpf, tipoCliente, senha);
                            Supermercado.clientsDB.add(novoUsuario);
                            limpaFields();
                        }else{
                            //O usuario colocou algum dado invalido ou não possui uma conta
                            JOptionPane.showMessageDialog(null, "Dados inválidos! Entre com dados válidos ou crie uma nova conta!");
                            limpaFields();
                        }
                    
                    }
                }
                
            }
            
        }
    }//GEN-LAST:event_cadastrarBtnMouseClicked
    
    public void limpaFields(){
        nomeField.setText("");
        cpfField.setText("");
        admOrClientGroup.clearSelection();
        senhaField.setText("");
    }
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton admOptn;
    private javax.swing.ButtonGroup admOrClientGroup;
    private javax.swing.JButton cadastrarBtn;
    private javax.swing.JRadioButton clienteOptn;
    private javax.swing.JTextField cpfField;
    private javax.swing.JPanel imgPainel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JTextField nomeField;
    private javax.swing.JTextField senhaField;
    // End of variables declaration//GEN-END:variables
}

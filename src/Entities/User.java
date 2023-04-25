package Entities;

import java.util.ArrayList;

public class User {
    private String nome;
    private String cpf;
    private int tipoUser;
    public ArrayList<Produto> carrinho = new ArrayList<>();
    public ArrayList<Double> IDsCarrinho = new ArrayList<>();
    private String senha;
    
    public User() {
    }

    public User(String nome, String cpf, int tipoUser, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.tipoUser = tipoUser;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getTipoUser() {
        return tipoUser;
    }

    public void setTipoUser(int tipoUser) {
        this.tipoUser = tipoUser;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void limparCarrinho(){
        
        if(this.carrinho.isEmpty()){
            System.out.println("Carrinho vazio!");
        }else{
            this.carrinho.removeAll(carrinho);
        }
        
    }
    
    
    
}

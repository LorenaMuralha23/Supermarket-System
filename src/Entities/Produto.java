package Entities;

import java.util.Random;

public class Produto {

    private String nome;
    private float valor;
    private String descricao;
    private double id;
    public static Random random = new Random();

     public Produto() {
     }

    public Produto(String nome, float valor, String descricao, double id) {
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    @Override
    public String toString() {
        return "Produto{" + "\nnome=" + nome + "\nValor=" + valor + "\nDescricao=" + descricao + "\nid: "+ id +  '}';
    }
        
    
        
        
    
}

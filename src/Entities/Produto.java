package Entities;

import java.util.Random;

public class Produto {

    private String nome;
    private float valor;
    private String descricao;
    private long id;
    private int quantidadeComprada=0;
    public static Random random = new Random();
    

     public Produto() {
     }

    public Produto(String nome, float valor, String descricao) {
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
        
        long idGerado = random.nextLong(1,999)*100;
        boolean idIguais = true;
      
        while(idIguais){ //impede que o sistema gere ids iguais para produtos difentes
            idIguais = false;
            for (int i = 0; i < Supermercado.IDs.size(); i++) {
                if(Supermercado.IDs.get(i) == idGerado){
                    idIguais = true;
                    idGerado = random.nextLong(1,999)*100;
                    break;
                }
            } 
        }         
        
        this.id = idGerado;
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

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidade) {
        this.quantidadeComprada = quantidade;
    }
    
    
    
    
    @Override
    public String toString() {
        return "\nProduto{" + "\nnome=" + nome + "\nValor=" + valor + "\nQuantidade: " + quantidadeComprada + "\nDescricao=" + descricao + "\nid: "+ id +  '}';
    }
        
    
        
        
    
}

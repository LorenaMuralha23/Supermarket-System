package Entities;

import java.util.ArrayList;

public class Supermercado {
    
    public String nome;
    private static ArrayList<Produto> listaProdutoas = new ArrayList<>();

    public Supermercado() {
    }

    public Supermercado(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   public void addProduto(Produto novoProduto){
       listaProdutoas.add(novoProduto);
   }
    
   public void removeProduto(int idRemovido){
       for (int i = 0; i < listaProdutoas.size(); i++) {
           if(listaProdutoas.get(i).getId() == idRemovido){
               listaProdutoas.remove(listaProdutoas.get(i));
           }
       }
   }
    
    
}

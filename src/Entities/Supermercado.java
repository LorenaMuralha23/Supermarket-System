package Entities;

import java.util.ArrayList;

public class Supermercado {
    
    public String nome;
    public static ArrayList<Produto> listaProdutos = new ArrayList<>();

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
       listaProdutos.add(novoProduto);
   }
    
   public void removeProduto(int idRemovido){
       for (int i = 0; i < listaProdutos.size(); i++) {
           if(listaProdutos.get(i).getId() == idRemovido){
               listaProdutos.remove(listaProdutos.get(i));
           }
       }
   }
  
   public static void mostraProdutos(){
       for(Produto p : listaProdutos){
           System.out.println(p);
       }
   }
    
}

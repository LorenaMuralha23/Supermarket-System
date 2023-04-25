package Entities;

import GUI.ConfigProduto_painel;
import java.util.ArrayList;

public class Supermercado {
    
    public String nome;
    public static ArrayList<Produto> listaProdutos = new ArrayList<>();
    public static ArrayList<User> admDB = new ArrayList<>();
    public static ArrayList<User> clientsDB = new ArrayList<>();
    public static ArrayList<Double> IDs = new ArrayList<>();

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
    
   public float calculaValorProduto(double idProduto, int quantidade){
       Produto produtoSelecionado=null;
       
       for (int i = 0; i < listaProdutos.size(); i++) {
           if(idProduto == listaProdutos.get(i).getId()){
               produtoSelecionado = listaProdutos.get(i);
           }
       }
       
       return (produtoSelecionado.getValor() * produtoSelecionado.getQuantidadeComprada());
   }
   
   public float calculaValorConta(ArrayList<Produto> produtosCarrinho){
       float totalConta = 0;
       
       for (int i = 0; i < produtosCarrinho.size(); i++) {
           totalConta += calculaValorProduto(produtosCarrinho.get(i).getId(), produtosCarrinho.get(i).getQuantidadeComprada());
       }
       
       return totalConta;
   }
   
   public float calculaValorProduto(Produto produto){
       return produto.getValor() * produto.getQuantidadeComprada();
   }
   
}

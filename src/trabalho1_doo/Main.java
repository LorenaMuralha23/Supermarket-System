package trabalho1_doo;

import Entities.Supermercado;
import GUI.Janela;

public class Main {
    
    public static Supermercado supermercado = new Supermercado();
    
    public static void main(String[] args) {
        Janela window= new Janela();
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        
    }
    
}

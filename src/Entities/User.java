package Entities;

public class User {
    private String nome;
    private String cpf;
    private int tipoUser;

    public User() {
    }

    public User(String nome, String cpf, int tipoUser) {
        this.nome = nome;
        this.cpf = cpf;
        this.tipoUser = tipoUser;
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
    
    
    
    
}

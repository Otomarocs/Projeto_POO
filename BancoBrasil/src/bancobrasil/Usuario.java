package bancobrasil;

import java.util.Date;

public abstract class Usuario {

    private String nome;
    private String sobrenome;
    private String telefone;
    

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getnome() {
        return this.nome;
    }

    public void setsobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getsobrenome() {
        return this.sobrenome;
    }

    public void settelefone(String telefone) {
        this.telefone = telefone;
    }

    public String gettelefone() {
        return this.telefone;
    }   

    public abstract String imprimirInfo();
}
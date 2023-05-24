package bancobrasil;

import java.util.Date;

public class Usuario {

    private String nome;
    private String sobrenome;
    private String telefone;
    

    public Usuario() {
    }

    ; 
    
    public Usuario(String nome, String sobrenome, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
    }

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

   

    String imprimirInfo() {
        return String.format("INFORMAÇÕES DO CLIENTE:\n Nome: %s\n Sobrenome: %s\n Telefone: %s\n ",
                this.nome, this.sobrenome, this.telefone);
    }

}

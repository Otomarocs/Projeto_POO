package bancobrasil;

import java.util.Date;


public class Usuario {
    String nome;
    String sobrenome;
    String telefone;
    Date dataRegistro = new Date();
    
    String imprimirinfo(){
        return String.format("Nome: %s \n Sobrenome: %s \n Telefone: %s, Data Registro: %s",
                              this.nome, this.sobrenome, this.telefone, this.dataRegistro);       
    }
    
}

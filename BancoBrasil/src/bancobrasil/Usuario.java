package bancobrasil;

import java.util.Date;


public class Usuario {
    String nome;
    String sobrenome;
    String telefone;
    Date dataRegistro = new Date();
    
    String imprimirinfo(){
        return String.format("INFORMAÇÕES DO CLIENTE:\n Nome: %s\n Sobrenome: %s\n Telefone: %s\n Data Registro: %s\n",
                            this.nome, this.sobrenome, this.telefone, this.dataRegistro);       
    }
    
}

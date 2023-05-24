
package bancobrasil;

import java.util.Date;


public class Cliente extends Usuario{
    private Date dataRegistro = new Date();
    
    public Cliente(){}

    public Cliente(String nome, String sobrenome, String telefone) {
        super(nome, sobrenome, telefone);
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }   
    
    
    @Override
    public String imprimirInfo() {
        return String.format("INFORMAÇÕES DO CLIENTE:\n Nome: %s\n Sobrenome: %s\n Telefone: %s\nData de Registro: %s\n ",
               super.getnome(), super.getsobrenome(), super.gettelefone(), this.dataRegistro);
    }
    
}

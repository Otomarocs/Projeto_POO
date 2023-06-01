
package bancobrasil;


public class Gerente extends Usuario{
    private String login;
    private String password;
    
    
    public Gerente(){}

  
    public Gerente(String login, String password, String nome, String sobrenome, String telefone) {
        this.setnome(nome);
        this.setsobrenome(sobrenome);
        this.settelefone(telefone);
        this.login = login;
        this.password = password;
    }

    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    } 
    
    @Override
    public String imprimirInfo(){
        return String.format("***INFORMACOES DO GERENTE***\n"
                + "Nome: %s %s\n"
                + "Contato: %s\n"
                + "Login: %s", this.getnome(), this.getsobrenome(), this.gettelefone(), this.getLogin());
    }
}

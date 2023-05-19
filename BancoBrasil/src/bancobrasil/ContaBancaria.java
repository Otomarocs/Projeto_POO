package bancobrasil;

import static java.lang.String.format;



public class ContaBancaria {
   // Atributos da classe(caracteristicas)
    private String agencia;
    private String conta;
    private double saldo;
    private Usuario proprietario;
    
    public ContaBancaria(){};
    
    public ContaBancaria(String agencia, String conta, double saldo, Usuario proprietario){
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.proprietario = proprietario;               
    }
    
    public void setagencia(String agencia){
        this.agencia = agencia;        
    }
    public String getagencia(){
        return this.agencia;
    }
    
    public void setconta(String conta){
        this.conta = conta;        
    }
    public String getconta(){
        return this.conta;
    }
    
    public void setsaldo(double saldo){
        this.saldo = saldo;        
    }
    public double getsaldo(){
        return this.saldo;
    }
    
    public void setpropriedade(Usuario proprietario){
        this.proprietario = proprietario;        
    }
    public Usuario getproprietario(){
        return this.proprietario;
    }
    
    
        
    // Método(comportamento) da classe
    void depositar(double valor){// Método com parametro
        this.saldo += valor;
    }
    
    void sacar(double valor) {// Método com parametro
        if (valor > saldo)
             System.out.println("Saldo insuficiente para saque.");
        else
            this.saldo -= valor;
    }
    
    void transferir(ContaBancaria contabancaria, double valor ) {// Método com parametro
        if(valor <= saldo){
            this.sacar(valor);
            contabancaria.saldo += valor;            
        }            
        else{
            System.out.println("Saldo Insuficiente!");
        }        
    }
    
    String consultarSaldo() {// Método sem parametro
        // String.format() método da classe String para utilizar formatação
        //com identificadores (%d, %f, %s).
        return String.format("Seu saldo é: R$ %.2f", this.saldo);
    }    
}

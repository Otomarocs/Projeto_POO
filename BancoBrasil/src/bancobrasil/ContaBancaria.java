package bancobrasil;

import static java.lang.String.format;



public class ContaBancaria {
   // Atributos da classe(caracteristicas)
    String agencia;
    String conta;
    double saldo;
    Usuario proprietario;
    
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
            contabancaria.saldo += valor            
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

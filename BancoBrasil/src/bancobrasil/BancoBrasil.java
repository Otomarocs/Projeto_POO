package bancobrasil;

import java.util.Scanner;


public class BancoBrasil {

    
    public static void main(String[] args) {
      //Instanciando um objeto do tipo ContaBancaria e referenciando nas
      //variaveis contaBancaria1 e contaBancaria2;
        ContaBancaria contaBancaria1 = new ContaBancaria();
        ContaBancaria contaBancaria2 = new ContaBancaria();
        
        /*
        Uso nas versões mais atuais da jdk
        var contaBancaria = new ContaBancaria();        
        
        // Atribuindo valores as nosso objeto
        contaBancaria1.agencia = "0001";
        contaBancaria1.conta = "12345";
        contaBancaria1.proprietario = "Junior";
        contaBancaria1.saldo =1.99;
        
        System.out.println(contaBancaria1.agencia+"\n"
                + contaBancaria1.conta + "\n"
                + contaBancaria1.proprietario + "\n"
                + contaBancaria1.saldo);
        */
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("BEM VINDO AO BANCO BRASIL");
        System.out.println("CADASTRO DE CONTA");
        System.out.println("Digite a agência ->");
        contaBancaria1.agencia = scan.next();
        System.out.println("Digite a conta ->");
        contaBancaria1.conta = scan.next();
        System.out.println("Digite o propeietario ->");
        contaBancaria1.proprietario = scan.next();
        System.out.println("Digite o saldo da conta ->");
        contaBancaria1.saldo = scan.nextDouble();
        
        System.out.println(contaBancaria1.agencia+"\n"
                + contaBancaria1.conta + "\n"
                + contaBancaria1.proprietario + "\n"
                + contaBancaria1.saldo);
            
    }
    
}

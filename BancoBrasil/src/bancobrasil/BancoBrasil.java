package bancobrasil;

import java.util.Scanner;


public class BancoBrasil {

    
    public static void main(String[] args) {
      //Instanciando um objeto do tipo ContaBancaria e referenciando nas
      //variaveis contaBancaria1 e contaBancaria2;
       ContaBancaria contaBancaria1 = new ContaBancaria();
       ContaBancaria contaBancaria2 = new ContaBancaria();
       Usuario user1 = new Usuario();
               
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
        // Construção e inserção de dados do Usuário.
        System.out.println("\n Dados do Usuário: ");
        System.out.println("Digite o nome do Cliente -> ");
        user1.nome = scan.next();
        System.out.println("Digite o sobrenome do Cliente -> ");
        user1.sobrenome = scan.next();
        System.out.println("Digite o telefone do Cliente -> ");
        user1.telefone = scan.next();
        contaBancaria1.proprietario = user1;
        
        System.out.println("Digite o valor de deposito ->");
        contaBancaria1.depositar(scan.nextDouble());
        
        System.out.println(contaBancaria1.agencia+"\n"
                + contaBancaria1.conta + "\n"
                + contaBancaria1.proprietario.imprimirinfo() + "\n"
                + contaBancaria1.consultarSaldo());
        
        System.out.println("\n\n Digite o valor do saque ->");
        contaBancaria1.sacar(scan.nextDouble());
        
        System.out.println(contaBancaria1.consultarSaldo());
        
                  
    }    
    
}

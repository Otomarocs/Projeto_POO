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
         
        Scanner scan = new Scanner(System.in);

        System.out.println("BEM VINDO AO BANCO BRASIL");
        System.out.println("CADASTRO DE CONTA");
        System.out.println("Digite a agência ->");
        contaBancaria1.setagencia (scan.next());
        System.out.println("Digite a conta ->");
        contaBancaria1.setconta(scan.next());
        // Construção e inserção de dados do Usuário.
        System.out.println("\n Dados do Usuário: ");
        System.out.println("Digite o nome do Cliente -> ");
        user1.setnome(scan.next()); 
        System.out.println("Digite o sobrenome do Cliente -> ");
        user1.setsobrenome(scan.next());
        System.out.println("Digite o telefone do Cliente -> ");
        user1.settelefone(scan.next());
        contaBancaria1.proprietario = user1;

        System.out.println("Digite o valor de deposito ->");
        contaBancaria1.depositar(scan.nextDouble());

        System.out.println(contaBancaria1.agencia + "\n"
                + contaBancaria1.conta + "\n"
                + contaBancaria1.proprietario.imprimirinfo() + "\n"
                + contaBancaria1.consultarSaldo());

        System.out.println("\n\n Digite o valor do saque ->");
        contaBancaria1.sacar(scan.nextDouble());

        System.out.println(contaBancaria1.consultarSaldo());
        */
        
        
        Scanner scan = new Scanner(System.in);
         int opcao = 0;  
         Usuario user;
         Usuario[] users = new Usuario[5];
         ContaBancaria contabancaria = new ContaBancaria();
        
        while(opcao != 3){
        
        System.out.println("***BANCO BRASIL***");
        System.out.println("1- Cadastro de cliente");
        System.out.println("2- Cadastro de Cointa");
        System.out.println("3- Sair");
        System.out.println("Escolha uma opção: ");
        opcao = scan.nextInt();
        
        switch (opcao){
            case 1:
                for(int i=0; i<5; i++){
                    user = new Usuario();
                    System.out.println("***CADASTRO CLIENTE***");
                    System.out.println("Nome: ");
                    user.setnome(scan.next());
                    System.out.println("Sobrenome: ");
                    user.setsobrenome(scan.next());
                    System.out.println("Telefone: ");
                    user.settelefone(scan.next());  
                    
                    users[i] = user;
                }
                break;
            case 2:
                if (users[0] == null){
                    System.out.println("Não existe cliente cadastrado!");
                    break;
                }
                System.out.println("***CADASTRO DE CONTA***");
                System.out.println("Agencia: ");
                contabancaria.setagencia(scan.next());
                System.out.println("Conta: ");
                contabancaria.setconta(scan.next());
                System.out.println("CLIENTES CADASTRADOS");
                for (int i=0; i<5; i++){
                    System.out.printf("\n %d- %s %s", i,  users[i].getnome(), users[i].getsobrenome(), "\n");
                }
                System.out.println("Selecione o cliente: ");
                int useropcao = scan.nextInt();
                
                if(useropcao <= 5 && useropcao >0){
                    useropcao --;
                    contabancaria.setproprietario(users[useropcao]);
                }
                System.out.println("Digite o valor de deposito ->");
                contaBancaria1.depositar(scan.nextDouble());
                break;
            case 3:
                System.out.println("***ATÉ BREVE!****");
                break;
            default:    
                System.out.println("**Opção Inválida!****");
                       
        }
        }

    }

}

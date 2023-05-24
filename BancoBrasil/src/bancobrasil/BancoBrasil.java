package bancobrasil;

import java.util.ArrayList;
import java.util.Scanner;

public class BancoBrasil {

    public static void main(String[] args) {
        //Instanciando um objeto do tipo ContaBancaria e referenciando nas
        //variaveis contaBancaria1 e contaBancaria2;
        //ContaBancaria contaBancaria1 = new ContaBancaria();
        //ContaBancaria contaBancaria2 = new ContaBancaria();
        //Usuario user1 = new Usuario();

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
         boolean islogin = false;
         Usuario user;
         ArrayList<Usuario> users = new ArrayList<>();
         ArrayList<Gerente> gerentes = new ArrayList<>();
         ContaBancaria contabancaria = new ContaBancaria();
        int qtdCadastro = 0;
        GerenteRepository db_gerente = new GerenteRepository();
        gerentes = db_gerente.addGerente();
        
        do{
        System.out.println("***SEJA BEM VINDO AO BANCO BRASIL***");
        System.out.println("LOGIN: ");
        String login = scan.next();
        System.out.println("PASSWORD: ");
        String password = scan.next();
        
        for(Gerente g : gerentes){
            if(g.getLogin().equals(login) && g.getPassword().equals(password)){
                islogin = true;            
            }           
        }
        
        //String notValidate = "", validate = "Usuario ou senha incorretos!";
        System.out.printf("%s\n", islogin==true ?"" : "Usuario ou senha incorretos!");
        }while(islogin != true);
        
        
        
        
        while(opcao != 3){
        
        System.out.println("***BANCO BRASIL***");
        System.out.println("1- Cadastro de cliente");
        System.out.println("2- Cadastro de Cointa");
        System.out.println("3- Sair");
        System.out.println("Escolha uma opção: ");
        opcao = scan.nextInt();
        
        
        switch (opcao){
            case 1:
                System.out.println("***CADASTRO CLIENTE***");
                System.out.println("Quantidade de cadastros: ");
                qtdCadastro = scan.nextInt();
                for(int i = 0; i < qtdCadastro; i++){
                    user = new Cliente();                    
                    System.out.println("Nome: ");
                    user.setnome(scan.next());
                    System.out.println("Sobrenome: ");
                    user.setsobrenome(scan.next());
                    System.out.println("Telefone: ");
                    user.settelefone(scan.next());  
                    
                    users.add(user);
                }
                break;
            case 2:                
                System.out.println("***CADASTRO DE CONTA***");
                System.out.println("Agencia: ");
                    contabancaria.setagencia(scan.next());
                System.out.println("Conta: ");
                    contabancaria.setconta(scan.next());
                System.out.println("CLIENTES CADASTRADOS");
                // Será listados os Clientes Cadastrados
                if (users.size() != 0){
                    for (int i = 0; i < qtdCadastro; i++){
                        System.out.printf("\n %d- %s %s\n", i + 1,  users.get(i).getnome(), users.get(i).getsobrenome());
                }
                System.out.println("Selecione o Cliente: ");
                    int useropcao = scan.nextInt();              
                    contabancaria.setproprietario(users.get(useropcao - 1));
                }else{
                    System.out.println("Nenhum Cliente Cadastrado!" + "");                   
                }
                
                System.out.println("Digite o valor de deposito ->");
                    contabancaria.depositar(scan.nextDouble());
                    
                System.out.println(contabancaria.getagencia() + "\n"
                    + contabancaria.getconta() + "\n"
                    + contabancaria.getproprietario().imprimirInfo() + "\n"
                    + contabancaria.consultarSaldo());    
                
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

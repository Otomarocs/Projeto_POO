
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author programador
 */
public class Aluno {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idAluno;
        String nomeAluno;
        double n1=7, n2=5, n3=5, media=0;
        
        for(int i=0; i < 2; i++){
        System.out.println("Informe o ID do Aluno:"+ (i+1));
        
        }
        media = (n1 + n2 + n3)/3;
        
        if(media >= 7){
            System.out.println("Media Final: "+ media + "\n Aluno Aprovado!");
        }
        else{
            System.out.println("Media Final: "+ media + "\n Aluno Reprovado!");
        }
        
    }
    
}

/*Solicita o nome e idade do usuario e imprime na tela*/
import java.util.Scanner;

public class Main{
 public static void main(String[] args){
     String nome;
     int idade;
     Scanner ler = new Scanner(System.in);
     System.out.printf("Nome:");
     nome = ler.next();
     System.out.printf("Idade:");
     idade = ler.nextInt();
     
     System.out.printf("Olá %s! Sua idade atual é %d anos, Certo?", nome, idade);
     
    } 
}

/*Leia um numero do teclado e informe se esse numero é par ou impar.*/
import java.util.Scanner;

public class Main{
 public static void main(String[] args){
     int num;
     Scanner ler = new Scanner(System.in);
     System.out.printf("Digite um número:");
     num = ler.nextInt();
     
     if(num % 2 == 0){
         System.out.printf("%d é um número par!", num);
     }
     else{
         System.out.printf("%d é um número ímpar!", num);
     }
    } 
}

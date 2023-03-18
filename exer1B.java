/*Efetue a multiplicação de números informados pelo usuário*/
import java.util.Scanner;

public class Main{
 public static void main(String[] args){
  Scanner ler = new Scanner(System.in);
   int a;
   int b;
   int multi;
   
   System.out.printf("Digite o primeiro número:");
   a = ler.nextInt();
   System.out.printf("Digite o segundo número:");
   b = ler.nextInt();
   multi = a * b;
   System.out.printf("A multiplicação de %d * %d é: %d", a, b, multi);
 }
}

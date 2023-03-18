/*Verifique o resto da divisão dentre dois números informados pelo usuário*/
import java.util.Scanner;

public class Main{
 public static void main(String[] args){
  Scanner ler = new Scanner(System.in);
   int a;
   int b;
   int divisao;
   int resto;
   
   System.out.printf("Digite o primeiro número:");
   a = ler.nextInt();
   System.out.printf("Digite o segundo número:");
   b = ler.nextInt();
   divisao = a / b;
   resto = a % b;
   
   System.out.printf("A divisão de %d / %d é: %d\n", a, b, divisao);
   System.out.println("O resto da divisao e: " + resto);
 }
}

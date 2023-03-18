/*Efetue a soma de dois numeros inteiros informados pelo usuario*/

import java.util.Scanner;

public class Main{
 public static void main{
  Scanner ler = new Scanner(System.in);
   int a;
   int b;
   int soma;
   
   System.out.printf("Digite o primeiro número:");
   a = ler.nextInt();
   System.out.printf("Digite o segundo número:");
   b = ler.nextInt();
   soma = a + b;
   System.out.printf("A soma de %d + %d é: %d", a, b, soma);
 }
}

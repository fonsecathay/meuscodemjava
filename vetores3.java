/*Exemplo 3: Programa que solicita dez números inteiros do usuário,
armazena em um vetor e imprima logo após*/
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int [] vet = new int[10];
	    for(int i =0; i<= 9; i++){
		System.out.printf("Informe o %d° número:", i+1);
		vet[i] = ler.nextInt();
	}
	for(int i = 0; i <= 9; i++) System.out.println(vet[i]);
  }
}

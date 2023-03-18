import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int a, b;
		System.out.println("Informe um número:");
		a = ler.nextInt();
		System.out.println("Informe um número:");
		b = ler.nextInt();
		soma (a, b);//chamando a função e enviando os paranmetros
	}
	public static void soma(int a, int b){
	    int soma;
	    soma = a + b;
	    System.out.printf("Soma: %d", soma);
	}
}

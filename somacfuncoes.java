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
//ou
/*import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int a, b, soma;
		System.out.println("Informe um número:");
		a = ler.nextInt();
		System.out.println("Informe um número:");
		b = ler.nextInt();
		soma = calculo(a,b);	
	    System.out.printf("Soma: %d", soma);
	}
	public static int calculo(int a, int b){
	    int soma;
	    soma = a + b;
	    return soma;
	}
}*/

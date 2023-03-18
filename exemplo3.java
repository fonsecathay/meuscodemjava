import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
		System.out.print("Digite sua nota:(ex:7.5)");
		float nota = ler.nextFloat();
		
		if (nota >= 7){
		    System.out.printf("Sua nota é %.1f e você foi Aprovado!\n", nota);
		}
		else{
		    System.out.printf("Sua nota é %.1f e você foi Reprovado!\n", nota);
		}
	}
}

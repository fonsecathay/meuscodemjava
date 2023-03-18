/*Programa em java que lê um valor de uma compra e calcule o valor final descontando em 10%*/
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    float valor;
		System.out.printf("Informe o valor da compra:");
		valor = ler.nextFloat();
		desc (valor);
	}
	public static void desc(float compra){
	    float valorfinal;
	    valorfinal = compra - (compra  * 10 / 100);
	    System.out.printf("Valor da compra com desconto: %.2f\n", valorfinal);
	}
}

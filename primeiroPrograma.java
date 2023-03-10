package primeiroprograma;
import java.util.Scanner;

public class PrimeiroPrograma{
    puclic static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int num;
        System.out.printf("Informe um número:\n");
        num = ler.nextInt();
        System.out.printf("Você digitou o número %d. \n", num);
    }
}
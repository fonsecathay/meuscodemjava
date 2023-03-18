import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        float nota;
        System.out.printf("Digite sua nota:");
        nota = ler.nextFloat();
        
        if( nota >= 6){
            System.out.printf("Sua nota foi %.1f e você está Aprovado!\n", nota);
        }
        else if(nota <= 4){
            System.out.printf("Sua nota foi %.1f e você está Reprovado!\n", nota);
        }
        else{
            System.out.printf("Sua nota foi %.1f e você está de Recuperação!\n", nota);
        }
        
    }
}

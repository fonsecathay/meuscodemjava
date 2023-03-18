import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        float nota;
        int faltas;
        System.out.printf("Digite sua nota:");
        nota = ler.nextFloat();
        System.out.printf("Quantidades de faltas:");
        faltas = ler.nextInt();
        
        if( nota >= 7 && faltas < 10){
            System.out.printf("Sua nota foi: %.1f\n", nota);
            System.out.printf("Quantidades de faltas:%d\n", faltas);
            System.out.printf("Situação Final: Aprovado!!\n");
        }
        else{
            System.out.printf("Sua nota foi: %.1f\n", nota);
            System.out.printf("Quantidades de faltas:%d\n", faltas);
            System.out.printf("Situação Final: Reprovado!!");
        }
        
    }
}

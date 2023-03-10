package primeiroprograma;
import java.util.Scanner;//classe scanner declara

public class PrimeiroPrograma{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);//Instanciar e criar um objeto de Scanner usando o dispositivo padrão de entrada (System.in). 
        int num;//declara variável do teclado
        System.out.printf("Informe um número:\n");
        num = ler.nextInt();//Utilizar os métodos da classe//Scanner para a devida leitura dos
                            //dados. No caso aqui, é o método nextInt, para ler inteiros. 
                            //Se fosse double, então o método seria nextDouble.
        System.out.printf("Você digitou o número %d. \n", num);//informa o resultado
    }
}
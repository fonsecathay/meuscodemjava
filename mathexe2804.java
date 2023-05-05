import java.util.Scanner;

public abstract class OperacaoMatematica {
    public abstract double calcular(double x, double y);
}

public class Soma extends OperacaoMatematica {
    public double calcular(double x, double y) {
        return x + y;
    }
}

public class Subtracao extends OperacaoMatematica {
    public double calcular(double x, double y) {
        return x - y;
    }
}

public class Multiplicacao extends OperacaoMatematica {
    public double calcular(double x, double y) {
        return x * y;
    }
}

public class Divisao extends OperacaoMatematica {
    public double calcular(double x, double y) {
        if(y != 0){
            return x / y;
        } else {
            System.out.println("Operação inválida: dividendo igual a zero.");
            return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double x = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        double y = scanner.nextDouble();

        OperacaoMatematica operacao;
        System.out.println("Digite a operação desejada (+, -, *, /): ");
        char opcao = scanner.next().charAt(0);

        switch (opcao) {
            case '+':
                operacao = new Soma();
                break;
            case '-':
                operacao = new Subtracao();
                break;
            case '*':
                operacao = new Multiplicacao();
                break;
            case '/':
                operacao = new Divisao();
                break;
            default:
                System.out.println("Operação inválida");
                return;
        }

        System.out.println("Resultado: " + operacao.calcular(x, y));
    }
}

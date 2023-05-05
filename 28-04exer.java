import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static abstract class Conta {
        private double saldo;

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        public double getSaldo() {
            return saldo;
        }

        public abstract void imprimeExtrato();
        public abstract void saque(double valor);
    }

    public static class ContaPoupanca extends Conta {
        @Override
        public void imprimeExtrato() {
            System.out.println("---Extrato da Conta Poupança--");

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();

            System.out.println("Saldo: " + this.getSaldo());
            System.out.println("Data: " + dateFormat.format(date));
        }

        @Override
        public void saque(double valor) {
            double saldoAtual = this.getSaldo();
            if (saldoAtual >= valor) {
                saldoAtual -= valor;
                setSaldo(saldoAtual);
                System.out.println("Saque realizado com sucesso. Novo saldo: " + saldoAtual);
            } else {
                System.out.println("Saldo insuficiente para realizar saque.");
            }
        }
    }

    public static class ContaCorrente extends Conta {
        private double limite;

        public void setLimite(double limite) {
            this.limite = limite;
        }

        public double getLimite() {
            return limite;
        }

        @Override
        public void imprimeExtrato() {
            System.out.println("---Extrato da Conta Corrente--");

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();

            System.out.println("Saldo: " + this.getSaldo());
            System.out.println("Limite: " + this.getLimite());
            System.out.println("Data: " + dateFormat.format(date));
        }

        @Override
        public void saque(double valor) {
            double saldoAtual = this.getSaldo() + this.getLimite();
            if (saldoAtual >= valor) {
                saldoAtual -= valor;
                if (saldoAtual < 0) {
                    this.setLimite(this.getLimite() + saldoAtual);
                    saldoAtual = 0;
                }
                this.setSaldo(saldoAtual);
                System.out.println("Saque realizado com sucesso. Novo saldo: " + saldoAtual);
            } else {
                System.out.println("Saldo insuficiente para realizar saque.");
            }
        }
    }

    public static void main(String[] args) {
        Conta cp = new ContaPoupanca();
        cp.setSaldo(15638);

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de saque: ");
        double valor = sc.nextDouble();

        cp.saque(valor);
        cp.imprimeExtrato();
    }
}

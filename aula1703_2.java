public class Main {
    public static class ContaBancaria{
      int CPF;
      int nconta;
      double saldo;
      
      public double sacar(int saque){
        double resultado;
        resultado = saldo - saque;
        System.out.printf("Saque Realizado!\n");
        return resultado;
        
      }
      public double deposito(int deposito, double saldo){
        double resultado;
        resultado = saldo + deposito;
        System.out.printf("Deposito Realizado!\n");
        return resultado;
      }
    }
    public static void main(String[] args) {
      ContaBancaria conta1 = new ContaBancaria();
      double resul_saque, resul_depos;
      //atributos da conta1
      conta1.CPF = 12345;
      conta1.nconta = 589;
      conta1.saldo = 2500;
      //invocando metodos
      resul_saque = conta1.sacar(500);
      System.out.printf("Novo Valor: %f\n", resul_saque);
      resul_depos = conta1.deposito(600, resul_saque);
      System.out.printf("Novo Valor: %f\n", resul_depos);
      
      //atributos da conta2
      /*ContaBancaria conta2 = new ContaBancaria();
      conta2.CPF = 67894;
      conta2.nconta = 678;
      conta2.saldo = 3500;

     resul_saque = conta2.sacar(500);
      System.out.printf("Novo Valor: %f\n", resul_saque);
      resul_depos = conta2.deposito(600, resul_saque);
      System.out.printf("Novo Valor: %f\n", resul_depos);*/
        
    }
    }
  
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
    
    public void transferir(ContaBancaria contaDestino, double valor) {
      if (saldo >= valor) {
        saldo -= valor;//operação para que o valor desejado saia da conta do cliente
        contaDestino.saldo += valor;//operação para que o valor desejado seja transferido para o cliente destino
        System.out.printf("Transferencia Realizada!\n");
      } else {
        System.out.printf("Saldo insuficiente para transferir!\n");
      }
    }
  }
  
  public static void main(String[] args) {
    ContaBancaria conta1 = new ContaBancaria();
    //atributos da conta1
    conta1.CPF = 12345;
    conta1.nconta = 589;
    conta1.saldo = 2500;
    ContaBancaria conta2 = new ContaBancaria();
    //atributos da conta2
    conta2.CPF = 67894;
    conta2.nconta = 678;
    conta2.saldo = 3500;

    double resul_saque, resul_depos;

    //invocando metodos
    //saque
    resul_saque = conta1.sacar(500);
    System.out.printf("Novo Valor: %f\n", resul_saque);
    //deposito
    resul_depos = conta1.deposito(600, resul_saque);
    System.out.printf("Novo Valor: %f\n", resul_depos);
    //transferencia
    conta1.transferir(conta2, 1000);
    System.out.printf("Novo Saldo Conta1: %f\n", conta1.saldo);
    System.out.printf("Novo Saldo Conta2: %f\n", conta2.saldo);  
  }
}

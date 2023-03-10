public class Main{
    public static class Conta {
        //Atributos
        public String nome;
        public int agencia;
        public int nconta;
        public float saldo;
        //Construtor de objetos
        Conta(){
            System.out.println("Objeto criado com sucesso!");
        }
        public void saque(){
            //método saque
        }
        public void transfer(){
        //método transferência
    }
}
public static void main(String[] args){
    Conta cliente1 = new Conta();
    cliente1.nome = "Maria";
    cliente1.agencia = 8974;
    cliente1.nconta = 78450;
    cliente1.saldo = 4500;

    Conta cliente2 = new Conta();
    cliente2.nome = "João"
    cliente2.agencia = 39
    cliente2.nconta = 78450;
    cliente2.saldo = 8500;

    Conta cliente3 = new Conta();
    cliente3.nome = "Jéssica"
    cliente3.agencia = 3806;
    cliente3.nconta = 17845;
    cliente3.saldo = 5500;
}
}
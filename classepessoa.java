public class Main{
    public static class Pessoa {
        //Atributos
        public String nome;
        public int idade;
        public float peso;
        //Construtor de objetos
        Conta(){
            System.out.println("Objeto criado com sucesso!");
        }
        public void andar(){
            //método andar
        }
        public void dormir(){
        //método dormir
    }
}
public static void main(String[] args){
    Pessoa humanos1 = new Pessoa();
    humano1.nome = "Juliana";
    humano1.idade = 23;
    humano1.peso = 75;

    Pessoa humanos2 = new Pessoa();
    humano2.nome = "Carlos";
    humano2.idade = 39;
    humano2.peso = 72;

    Pessoa humanos3 = new Pessoa();
    humano3.nome = "Ericka";
    humano3.idade = 15;
    humano3.peso = 60;
}
}

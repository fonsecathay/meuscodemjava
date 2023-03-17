public class Main {
    public static class Gatos{
      String nome;
      int idade;
      //metodos da classe gato
      public void miar(){
        System.out.println("O gato mia!");
      }
      public void comer(){
        System.out.println("O gato come ração!");
      }
    }
    public static void main(String[] args){
      Gatos gato1 = new Gatos();
      gato1.nome = "Bichano";
      gato1.idade = 8;
      //invocando metodos
      gato1.miar();
      gato1.comer();

      Gatos gato2 = new Gatos();
      gato2.nome = "Lili";
      gato2.idade = 4;
      gato2.miar();
      gato2.comer();
    }
  }
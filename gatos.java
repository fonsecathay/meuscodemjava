public class Main {
    public static class Gatos{
      public String raca;
      public String nome;
      public float peso;
  
      public void miar(){
        
      }
      public void comer(){
        
      }
      public void dormir(){
        
      }
    }
    //nstanciando a Classe Gatos
    public static void main(String[] args){
      Gatos gato1 = new Gatos();
      gato1.raca = "Maine Moon";
      gato1.nome = "Listrado";
      gato1.peso = 3;
  
      Gatos gato2 = new Gatos();
      gato2.raca = "Savanna";
      gato2.nome = "Gatuno";
      gato2.peso = 5;
  
      Gatos gato3 = new Gatos();
      gato3.raca = "Siamês";
      gato3.nome = "Bichano";
      gato3.peso = 4;
      
    }
  }
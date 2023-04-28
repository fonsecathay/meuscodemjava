public class Main{
	public abstract class Funcionario{
	    public String nome;
	    public long cpf;
	    public double salario;
	    
	    public double Bonificacao(){
	        return this.salario * 0.1;
	    }
	}
	public class Gerente extends Funcionario{
	    public double Bonificacao(){
	        return this.salario * 1.5 + 900;
	    }
	}
	public class Coordernador extends Funcionario{
	    public double Bonificacao(){
	        return this.salario * 1.3 + 800;
	    }
	}
	public class Secretaria extends Funcionario{
	    public double Bonificacao(){
	        return this.salario * 1.0 + 1000;
	    }
	}
	
	public static void main(String[] args){
	    System.out.println("Executou");
	}
}

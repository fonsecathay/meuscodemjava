import java.text.SimpleDateFormat;

import java.util.Date;

 
public class Main
{
  
public static abstract class Conta
  {
    
private double saldo;
     

public void setSaldo (double saldo)
    {
      
this.saldo = saldo;
    
} 
public double getSaldo ()
    {
      
return saldo;
    
}
    
public abstract void imprimeExtrato ();
  
} 
public static class ContaPoupanca extends Conta
  {
    
@Override 
 public void imprimeExtrato ()
    {
      
System.out.println ("---Extrato da Conta PoupanC'a --");
      

SimpleDateFormat dateFormat =
	new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
      
Date date = new Date ();
      

System.out.println ("Saldo: " + this.getSaldo ());
      
System.out.println ("Data: " + dateFormat.format (date));
  
} 
} 
public static void main (String[]args)
  {
    
Conta cp = new ContaPoupanca ();
    
cp.setSaldo (15638);
    
cp.imprimeExtrato ();

} 
} 

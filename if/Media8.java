import  java.util.Scanner;
public class Media8 {
      public static void main (Scanner args[]) {
      Scanner ler = new Scanner (System.in);
      double n1, n2, med, ex, nMed;
      
      System.out.println("Digite a primeira nota");
      n1 = ler.nextDouble();
      
      
      System.out.println("Digite a segunda nota");
      n2= ler.nextDouble();
      
      med=n1+n2/2;
      
      if(med<3) {
    	  System.out.println("Reprovado");
      }else if (med>=6) {
    	  System.out.println("Aprovado");
      }else {
    	  System.out.println("você esta em exame");
    	  System.out.println("digite a nota do exame");
    	  ex = ler.nextDouble();
    	  nMed = med + ex / 2;
    	  if(nMed >= 6) {
    		  System.out.println("aprovada");
    	  }else {
    		  System.out.println("reprovado");
    	  }
      }
     ler.close();
   }
}
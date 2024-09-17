import java.util.*;
public class Fibonacci {
   public static void main(String[] args) {
	    	  Scanner Fada = new Scanner (System.in);
	    	  //declaar variaveis
	    	  //usuario digita o numero
	    	  //entra no while onde vai somar o numero mais o termo anterior onde vai ser somado ate atingir a quantiade de vezes do numero digitado pelo usuario, sabendo-se que deve ser apresentar 
	    	  int num = 1, i = 0, soma = 0, numanterior = 0, numanterior1 = 1;
	    	  System.out.println("digite o número que vai ser consultado o fibonacci: ");
	    	  num = Fada.nextInt();
	    	  
	    	  while (i <= num)
	    	  {
	    		  //somar dois valores anteriores 
	    		  //atualiazar os dois numero anteriores
	    		  soma = numanterior + numanterior1;
	    		  numanterior = numanterior1;
	    		  numanterior1 = soma;
	    		  i++;
	    		  System.out.println(soma);
	    		  //enquanto o i (quantidade de vezes que o laço vai ocorrer) for menor que o numero sera feito soma (sendo 0) que igual numanterior + numanterior1 (sendo por exemplo: num = 2, ent era somar 0 + 1 que sera 1) depois muda o numanterior pelo numanerior1 (ficando numanterior 1) e ao numanterior1 o valor é da soma 
	    	  }
	    	  Fada.close();
     }
}

import java.util.*;
public class Idade {
	   public static void main (String args[] ) {
	    	  Scanner Fada = new Scanner (System.in);
	    	  int id,i=1,velha = 0,nova = 999;
		    	 double id1 = 0, id2= 0, id3= 0, id4= 0, id5= 0;
		    	 while (i<=15) {
		    		 
		    		 System.out.println("Informe sua idade, usu�rio " + i);
		    		 id = Fada.nextInt(); 
		    		 i++;
		    		  
		    		   if(id <= 15){
		    			   id1++;
		    			   if (id > velha)
		    	            {
		    	                velha = id;
		    	            }
		    			   else if (id < nova)
		    	            {
		    	                nova = id;
		    	            }
		    		 }
		    		   else if (id <= 30){
		    			   id2++;
		    			   if (id > velha)
		    	            {
		    	                velha = id;
		    	            }
		    			   else if (id < nova)
		    	            {
		    	                nova = id;
		    	            }
		    		 }
		    		   else if (id <= 45){
		    			   id3++;
		    			   if (id > velha)
		    	            {
		    	                velha = id;
		    	            }
		    			   else if (id < nova)
		    	            {
		    	                nova = id;
		    	            }
		    		 }
		    		   else if (id <= 60){
		    			   id4++;
		    			   if (id > velha)
		    	            {
		    	                velha = id;
		    	            }
		    			   else if (id < nova)
		    	            {
		    	                nova = id;
		    	            }
		    		 }
		    		   else if (id >= 61){
		    			   id5++;
		    			   if (id > velha)
		    	            {
		    	                velha = id;
		    	            }
		    			   else if (id < nova)
		    	            {
		    	                nova = id;
		    	            }
		    		 }
		    		   else{
		    			   System.out.println("idade inv�lida");
		    		   }
		    	 }
		    	 System.out.println("o n�mero de pessoas na primeira faixa et�ria � "+ id1 + " e a porcentagem � "+ (id1*100/15) + "%");
		    	 System.out.println("o n�mero de pessoas na segunda faixa et�ria � "+ id2 + " e a porcentagem � "+ (id2*100/15) + "%");
		    	 System.out.println("o n�mero de pessoas na terceira faixa et�ria � "+ id3 + " e a porcentagem � "+ (id3*100/15) + "%");
		    	 System.out.println("o n�mero de pessoas na quarta faixa et�ria � "+ id4 + " e a porcentagem � "+ (id4*100/15) + "%");
		    	 System.out.println("o n�mero de pessoas na quinta faixa et�ria � "+ id5 + " e a porcentagem � "+ (id5*100/15) + "%");
		         System.out.println("a pessoa mais velha tem " + velha );
		         System.out.println("a pessoa mais nova tem " + nova);
		    	 Fada.close();  

	   }
	   
}

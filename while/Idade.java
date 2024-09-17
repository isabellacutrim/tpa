import java.util.*;
public class Idade {
	   public static void main (String args[] ) {
	    	  Scanner Fada = new Scanner (System.in);
	    	  int id,i=1,velha = 0,nova = 999;
		    	 double id1 = 0, id2= 0, id3= 0, id4= 0, id5= 0;
		    	 while (i<=15) {
		    		 
		    		 System.out.println("Informe sua idade, usuário " + i);
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
		    			   System.out.println("idade inválida");
		    		   }
		    	 }
		    	 System.out.println("o número de pessoas na primeira faixa etária é "+ id1 + " e a porcentagem é "+ (id1*100/15) + "%");
		    	 System.out.println("o número de pessoas na segunda faixa etária é "+ id2 + " e a porcentagem é "+ (id2*100/15) + "%");
		    	 System.out.println("o número de pessoas na terceira faixa etária é "+ id3 + " e a porcentagem é "+ (id3*100/15) + "%");
		    	 System.out.println("o número de pessoas na quarta faixa etária é "+ id4 + " e a porcentagem é "+ (id4*100/15) + "%");
		    	 System.out.println("o número de pessoas na quinta faixa etária é "+ id5 + " e a porcentagem é "+ (id5*100/15) + "%");
		         System.out.println("a pessoa mais velha tem " + velha );
		         System.out.println("a pessoa mais nova tem " + nova);
		    	 Fada.close();  

	   }
	   
}

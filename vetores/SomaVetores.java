import java.util.Scanner;
public class SomaVetores {
	public static void main(String[] args) {
		Scanner Fada  = new Scanner (System.in);
        int i, a[], b[], c[];
        a= new int [10];
        b= new int [10];
        c= new int [10];
        
        //soma do A + B = C
         
        //ler o vetor A
        for(i=0; i < 10; i++){
	    	 System.out.println("Entre com o "+ (i+1)+ " valor de A:");
	    	 a[i] = Fada.nextInt();
	     }
        
        //ler o vetor B
        for(i=0; i < 10; i++){
	    	 System.out.println("Entre com o "+ (i+1)+ " valor de b:");
	    	 b[i] = Fada.nextInt();
         	 c[i]= a[i]+ b[i];
        }
	    	  
	          for ( i=0; i <10; i ++){
	        	  System.out.println( a[i] + " + " + b[i] + " = "+ c[i] );
	          }
	     } 
	
    }




import java.util.Scanner;
public class VetorQuadrado {
	public static void main(String[] args) {
		Scanner fada= new Scanner (System.in);
		 int i,a[],b[];
		 a = new int [10];
	     b = new int [10];
	     
	     //b é o quadrado do A
	     
	     //leitura do A
	     for(i=0; i < 10; i++){
	    	 System.out.println("Entre com o "+ (i+1)+ " valor de A:");
	    	 a [i] = fada. nextInt();
	    	 b [i]= a [i] * a [i];
	     }
	     fada.close();
	     
         //apresentando vetor A
	     System.out.print("a = [");
	     
	     for  ( i = 0; i < 10; i++) {
	    	  System.out.print(a [i]  + " ");
	     }
	     
	     System.out.println("] \n");
	     System.out.print("b = [");
	     
	     for  ( i = 0; i < 10; i++) {
	    	  System.out.print(b [i] + " ");
	     }
	     System.out.println("] \n");
	    
	     
     }
}
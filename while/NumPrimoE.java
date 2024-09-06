package exerciciosABCDEwhile;
import java.util.*;
public class NumPrimoE {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
	    int num, i = 1, divisores =0;
	    
	    System.out.println("digite um número inteiro");
	    num = ler.nextInt();
	    while ( i <= num) {
	    	if (num % i == 0) {
	    		 divisores = divisores +1;
	    	}
	    	i= i + 1;
	    }
	    if (divisores == 2) {
	    	
	    	System.out.println("é um número primo");
    	}else{
    		System.out.println("não é um número primo");
    	}
	    ler.close();
	 } 
}


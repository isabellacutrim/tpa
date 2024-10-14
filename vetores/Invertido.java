import java.util.*;
import java.util.Scanner;
public class Invertido {
	public static void main(String[] args) {
		Scanner Fada = new Scanner (System.in);
		int i, a[], b[], j, c = 0;
		a = new int [10];
		b = new int [10];
		
        //ler 10 numeros 
		for(i = 0; i < 10; i++) {
			System.out.println("Digite o número " + (i+1));
	    	a [i] = Fada. nextInt();
		}
		Fada.close();
		
		for(i = 0; i < 10; i++) {
			System.out.println("posição " + (i+1)  + ", lado A " + a[i]);
		}
		System.out.println("---------------------------------");
		for (j = 0; j < 10; j++) {
		    i--;
			b [j- c] =  a [i];
			System.out.println("posição " + (j+1)  + ", lado B " + b[j]);
			
		}
		Fada.close();
		
	}
}


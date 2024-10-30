import java.util.*;
public class Divisores5 {
	public static void main(String[] args) {
		Scanner Fada = new Scanner (System.in);
		
		//imprmir vetor A
		int a [] = new int [10];
	    for (int i = 0; i < a.length; i++) {
			System.out.println("Digite o número " + (i+1));
			a[i] = Fada.nextInt();
		}
			for (int i = 0; i < a.length; i++) {
	            System.out.print("\nDivisores de " + a[i] + ": ");
	            for (int b = 1; b <= a[i]; b++) {
	                if (a[i] % b == 0) {
	                    System.out.print("\n" + b + " ");
	                }
	            }
			//dentro de um for = vai ser usada para dividir 
			//e decobrir os divisores
			//e se o resto for igual a zero ele sera 
			//apresentando como divisor
		}
		
		Fada.close();
	}
}

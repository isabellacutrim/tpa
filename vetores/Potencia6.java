import java.util.Scanner;
public class Potencia6 {
      public static void main(String[] args) {
		Scanner Fada = new Scanner (System.in);
		
		//Math.pow(2, i);
		//2 = indice
		//i = expoente
		//2 elevado a i 
		//exemplo: 2³, Math.pow(2, 3);

		int a [] = new int [11];
		
		//preenchendo o A
	    for (int i = 0; i < a.length; i++) {
	    	 a[i] = (int) Math.pow(2, i);
		}
		System.out.println("A base é 2");
	    for (int i = 0; i < a.length; i++) {
			System.out.println("A resposta é " + a[i] + ", do expoente " + i);
		}
	    
		
		Fada.close();
	}
}

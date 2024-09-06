import java.util.Scanner;
public class exercicio6antesuc {
	public static void main (String args []) { 
		Scanner ler = new Scanner (System.in);
		int num, ante, suces;
		
		System.out.println("digite o número");
		num = ler.nextInt();
		ler.close();
		
		ante = num - 1;
		System.out.println("o antessesor é " + ante);
				
	    suces = num + 1;
	    System.out.println("o sucessor é " + suces);

  }
}

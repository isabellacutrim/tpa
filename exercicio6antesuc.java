import java.util.Scanner;
public class exercicio6antesuc {
	public static void main (String args []) { 
		Scanner ler = new Scanner (System.in);
		int num, ante, suces;
		
		System.out.println("digite o n�mero");
		num = ler.nextInt();
		ler.close();
		
		ante = num - 1;
		System.out.println("o antessesor � " + ante);
				
	    suces = num + 1;
	    System.out.println("o sucessor � " + suces);

  }
}

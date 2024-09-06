import java.util.Scanner;
public class excercicio2parouimpar {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		int n;
		
		System.out.println("digite o numero");
		n = ler.nextInt();
		ler.close();
		
		if(n%2==0) {
			System.out.println("o numero é par");
		}
		else {
			System.out.println("o numero é impar");
		}
	}
}

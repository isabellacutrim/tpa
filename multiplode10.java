package ifcompostoesimples;
import java.util.Scanner;
public class multiplode10 {
	public static void main(String args[] ) {
		Scanner ler = new Scanner(System.in);
		int n;
		
		System.out.println("digite um número inteiro");
		n = ler.nextInt();
		
		if(n % 10 == 0){
			System.out.println("este número é multiplo de 10");
			
		}else {
			System.out.println("este número não é multiplo de 10");
		}
		ler.close();
	}
}

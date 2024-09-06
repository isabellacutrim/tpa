import java.util.Scanner;
public class exercicicio1eleiçao {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		int idade, aPe, aN;
		
		System.out.println("digite o ano da proxima eleiçao");
		aPe = ler.nextInt();
		 
		System.out.println("digite o ano de nascimento");
		aN = ler.nextInt();
		ler.close();
		
		idade = aPe - aN;
		if (idade >=16) {
			System.out.println("voce podera votar");
		}
		else {
			System.out.println("voce nao podera votar");
		}
	}

}

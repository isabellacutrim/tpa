import java.util.Scanner;
public class exercicio4meninosemeninas {
	public static void main (String args[] ) {
		Scanner ler = new Scanner (System.in);
		int numMeninos, numMeninas, porMeninos, porMeninas;
		
		System.out.println("digite o n�mero de meninas");
		numMeninas = ler.nextInt();
		
		System.out.println("digite o n�mero de meninos");
		numMeninos = ler.nextInt();
		ler.close();
		
		porMeninos = (numMeninos * 100) / (numMeninos + numMeninas );
		porMeninas = 100 - porMeninos;
		
		System.out.println("a porcentagem de meninas � " + porMeninas + "%");
		System.out.println("a porcentagem de meninos � " + porMeninos + "%");
	}
}

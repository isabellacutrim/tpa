import java.util.Scanner;
public class exercicio3dividas {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		double salario, tDividas, sobra;
		
		System.out.println("digite o seu salario");
		salario = ler.nextDouble();
		
		System.out.println("digite o total de dividas");
	    tDividas = ler.nextDouble();
	    ler.close();
	    
	    sobra = salario - tDividas;
		
		if(tDividas <= salario) {
			System.out.println("vai haver de sobra " + sobra);
		}
		else {
			System.out.println("ira faltar " + sobra);
		}
	}

}

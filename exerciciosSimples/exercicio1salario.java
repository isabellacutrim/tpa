import java.util.Scanner;
public class exercicio1salario {
	public static void main (String args[] ) {
		Scanner ler = new Scanner(System.in);
		
		double salario, dependentes, nSalario;
		
		System.out.println("digite seu salário");
		salario = ler.nextInt();
		
		System.out.println("digite número de dependentes");
		dependentes = ler.nextInt();
		ler.close();
	
		nSalario = (dependentes * 55) + salario;
		
		System.out.println ("seu novo salário é R$  " + nSalario);
	}

}
 
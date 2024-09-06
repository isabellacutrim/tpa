package ifcompostoesimples;
import java.util.Scanner;
public class insssalario {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		double inss = 0, salario, sLi = 0;
		
		System.out.println("digite o valor do seu salário");
		salario = ler.nextDouble();
		
		if(salario <= 2500) {
			inss = (salario / 100) * 9;
			sLi = salario - inss;
			System.out.println("o salário liquido é R$" + sLi);
			System.out.println("você pagará de inss R$" + inss);
		}else {
			inss = (salario / 100) * 11;
			sLi = salario - inss;
			System.out.println("o salário liquido é R$" + sLi);
			System.out.println("você pagara de inss R$" + inss);
		}
		ler.close();
		
	}

}


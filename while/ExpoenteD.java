package exerciciosABCDEwhile;
import java.util.Scanner;
public class ExpoenteD {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double base, potencia =1;
		int expoente;
		System.out.println("digite o valor da base: ");
		base = ler.nextDouble();
		System.out.println("digite o valor do expoente: ");
		expoente = ler.nextInt();
		
	    int i = 0;
		while(i < expoente)
		{
			potencia = potencia * base;
			i++;
		}
		System.out.println("a potencia é " + potencia);
		ler.close();
	}
}

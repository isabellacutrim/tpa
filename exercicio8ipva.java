import java.util.Scanner;
public class exercicio8ipva {
	public static void main(String args[] ) {
		Scanner ler = new Scanner (System.in);
		double veiculo, ipva;
		
		System.out.println("digite o valor do carro");
		veiculo = ler.nextDouble();
		ler.close();
		
		ipva = veiculo * 0.04;
		
		System.out.println("o valor do IPVA é R$ " + ipva);
	}
}

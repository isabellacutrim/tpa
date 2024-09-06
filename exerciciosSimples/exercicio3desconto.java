import java.util.Scanner;
public class exercicio3desconto {
	public static void main (String args[] ) {
		Scanner ler = new Scanner (System.in);
		
		double preco, porcentagem,  desconto, nPreco;
		
		System.out.println("digite o preço do produto");
		preco = ler.nextInt();
		
		System.out.println("digite a porcentagem de desconto");
		porcentagem  = ler.nextInt();
		ler.close();
		
		desconto = (preco/100) * porcentagem;
		nPreco = preco - desconto;
		
		System.out.println("o novo preço do produto é " + nPreco);
	}
}

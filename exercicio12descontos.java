import java.util.Scanner;
public class exercicio12descontos {
     public static void main(String args []) {
		Scanner ler = new Scanner(System.in);
		double preco, desconto, nPreco;
		
		System.out.println("digite o valor do produto");
		preco = ler.nextDouble();
		ler.close();
		
		desconto = (preco / 100) *5;
		nPreco = preco - desconto;
		
		System.out.println("o valor do produto com desconto é R$ " + nPreco);
	}

}

import java.util.Scanner;
public class Codigoproduto {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int cod;
		
		System.out.println("digite o código do produto: ");
		cod = ler.nextInt();
		
		switch (cod) {
		case 1:
			System.out.println("cachorro-quente, no valor de R$8,00 reais");
			break;
		case 2:
			System.out.println("cheeseburger, no valor de R$12,00 reais");
			break;
		case 3:
			System.out.println("x-salada, no valor de R$15,00 reais");
			break;
		case 4:
			System.out.println("misto quente, no valor de R$11,00 reais");
			break;
		case 5:
			System.out.println("pão na chapa, no valor de R$6,00 reais");
			break;
		default:
			System.out.println("código inválido");			
		}
		ler.close();
	}

}

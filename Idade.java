import java.util.Scanner;
public class Idade {
	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);
		int id;
		System.out.println("Digite sua idade:");
		id= ler.nextInt();
		switch (id) {
		case 6:
			System.out.println("Dente de leite");
			break;
			
		case 7:
			System.out.println("Junior");
			break;
			
		case 8:
			System.out.println("junior max");
			break;
			
		case 9:
			System.out.println("Junior master");
			break;
			
		case 10:
			System.out.println("master");
			break;
			
			default:
				System.out.println("Voce não tem a idade permitida ");
		}
		ler.close();
	}
}

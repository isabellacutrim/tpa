package switchcase;
import java.util.Scanner;
public class RodizioCarro {
	public static void main(String[] args) {
		Scanner ler= new Scanner ( System.in);
		int un;
		
		 System.out.println("Digite o �ltimo n�mero da placa");
		 un =ler.nextInt();
		 
		 switch (un) {
		 case 1:
		 case 2:
			 System.out.println("O dia da semana que o seu carro n�o poder� circular � segunta- Feira");
			 break;
		 case 3:
		 case 4:
			 System.out.println("O dia da semana que o seu carro n�o poder� circular � ter�a- feira");
			 break;
		 case 5:
		 case 6:
			 System.out.println("O dia da semana que o seu carro n�o poder� circular � quarta- feira ");
			 break;
		 case 7:
		 case 8:
			 System.out.println("O dia da semana que o seu carro n�o poder� circular � quinta- feira");
			 break;		 
		 case 9:
		 case 0:
			 System.out.println("O dia da semana que o seu carro n�o poder� circular � sexta- feira");
			 break;
			 default:
				 System.out.println("N�mero inv�lido");
		 }
		ler.close();
	}

}

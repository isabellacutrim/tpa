package ifcompostoesimples;
import java.util.Scanner;
public class bissextoounao {
		public static void main(String args[] ) {
			Scanner ler = new Scanner(System.in);
			double anNase, resto;
			
			System.out.println("digite o ano que voc� nasceu");
			anNase = ler.nextDouble();
			resto = anNase % 4;
			
			if( resto == 0){
				System.out.println("VOC� NASCEU EM UM ANO BISSEXTO");
			}else {
				System.out.println("VOC� N�O NASCEU EM UM ANO BISSEXTO");
			}
			ler.close();
		}
	}

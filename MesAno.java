package switchcase;
import java.util.Scanner;
public class MesAno {
	public static void main (String args[] ) {
		Scanner ler = new Scanner (System.in);
		
		int numMes;
		System.out.print("digite o n�mero do m�s: ");
		numMes = ler.nextInt();
		
		switch (numMes) {
			case 2:
				System.out.println("o n�mero de dias do m�s � 28");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("o n�mero de dias do m�s � 30");
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("o n�mero de dias do m�s � 31");
				break;
			default:
				System.out.println("n�mero inv�lido");
		}
		ler.close();
	}

}

import java.util.Scanner;
public class Signo {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int diaNasc, mesNasc;
		System.out.println(" Digite o m�s do sei nascimento:");
		mesNasc = ler.nextInt();
		System.out.println("Digite o dia do seu nascimento:");
		diaNasc = ler.nextInt();
		switch (mesNasc) {
		case 1:
			if (diaNasc <= 20) {
				System.out.println("o seu signo � capric�rnio");
			} else {
				System.out.println("o seu signo � aqu�rio");
			}
			break;

		case 2:
			if (diaNasc <= 19) {
				System.out.println("o seu signo � aqu�rio");
			} else {
				System.out.println("o seu signo � peixes");
			}
			break;

		case 3:
			if (diaNasc <= 20) {
				System.out.println("o seu signo � peixes ");
			} else {
				System.out.println("o seu signo � �ries");
			}
			break;

		case 4:
			if (diaNasc <= 20) {
				System.out.println("o seu signo � �ries");
			} else {
				System.out.println("o seu signo � touro");
			}
			break;

		case 5:
			if (diaNasc <= 20) {
				System.out.println("o seu signo � touro");
			} else {
				System.out.println("o seu signo � g�meos");
			}
			break;
		case 6:
			if (diaNasc <= 20) {
				System.out.println("o seu signo �  g�meos ");
			} else {
				System.out.println("o seu signo � c�ncer");
			}
			break;
		case 7:
			if (diaNasc <= 21) {
				System.out.println("o seu signo � c�ncer");
			} else {
				System.out.println("o seu signo � le�o");
			}
			break;
		case 8:
			if (diaNasc <= 22) {
				System.out.println("o seu signo � le�o");
			} else {
				System.out.println("o seu signo � virgem");
			}
			break;
		case 9:
			if (diaNasc <= 22) {
				System.out.println("o seu signo � virgem");
			} else {
				System.out.println("o seu signo � libra");
			}
			break;
		case 10:
			if (diaNasc <= 23) {
				System.out.println("o seu signo � libra");
			} else {
				System.out.println("o seu signo � escorpi�o");
			}
			break;
		case 11:
			if (diaNasc <= 21) {
				System.out.println("o seu signo � escorpi�o");
			} else {
				System.out.println("o seu signo � sagitario");
			}
			break;
		case 12:
		    if (diaNasc <= 21) {
		        System.out.println("o seu signo � sagit�rio");
		    } else {
		        System.out.println("o seu signo � capric�rnio");
		    }
		    break;
		default:
		    System.out.println("n�mero inv�lido");
		    break;
			}
		ler.close();
		}
	}


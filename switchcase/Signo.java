import java.util.Scanner;
public class Signo {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int diaNasc, mesNasc;
		System.out.println(" Digite o mês do sei nascimento:");
		mesNasc = ler.nextInt();
		System.out.println("Digite o dia do seu nascimento:");
		diaNasc = ler.nextInt();
		switch (mesNasc) {
		case 1:
			if (diaNasc <= 20) {
				System.out.println("o seu signo é capricórnio");
			} else {
				System.out.println("o seu signo é aquário");
			}
			break;

		case 2:
			if (diaNasc <= 19) {
				System.out.println("o seu signo é aquário");
			} else {
				System.out.println("o seu signo é peixes");
			}
			break;

		case 3:
			if (diaNasc <= 20) {
				System.out.println("o seu signo é peixes ");
			} else {
				System.out.println("o seu signo é áries");
			}
			break;

		case 4:
			if (diaNasc <= 20) {
				System.out.println("o seu signo é áries");
			} else {
				System.out.println("o seu signo é touro");
			}
			break;

		case 5:
			if (diaNasc <= 20) {
				System.out.println("o seu signo é touro");
			} else {
				System.out.println("o seu signo é gêmeos");
			}
			break;
		case 6:
			if (diaNasc <= 20) {
				System.out.println("o seu signo é  gêmeos ");
			} else {
				System.out.println("o seu signo é câncer");
			}
			break;
		case 7:
			if (diaNasc <= 21) {
				System.out.println("o seu signo é câncer");
			} else {
				System.out.println("o seu signo é leão");
			}
			break;
		case 8:
			if (diaNasc <= 22) {
				System.out.println("o seu signo é leão");
			} else {
				System.out.println("o seu signo é virgem");
			}
			break;
		case 9:
			if (diaNasc <= 22) {
				System.out.println("o seu signo é virgem");
			} else {
				System.out.println("o seu signo é libra");
			}
			break;
		case 10:
			if (diaNasc <= 23) {
				System.out.println("o seu signo é libra");
			} else {
				System.out.println("o seu signo é escorpião");
			}
			break;
		case 11:
			if (diaNasc <= 21) {
				System.out.println("o seu signo é escorpião");
			} else {
				System.out.println("o seu signo é sagitario");
			}
			break;
		case 12:
		    if (diaNasc <= 21) {
		        System.out.println("o seu signo é sagitário");
		    } else {
		        System.out.println("o seu signo é capricórnio");
		    }
		    break;
		default:
		    System.out.println("número inválido");
		    break;
			}
		ler.close();
		}
	}


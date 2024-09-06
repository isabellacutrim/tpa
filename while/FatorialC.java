package exerciciosABCDEwhile;
import java.util.Scanner;
public class FatorialC {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num, i, fatorial = 1;
        System.out.println("Digite o número para calcular o fatorial:");
        num = ler.nextInt();
        i = num; 
        while (i > 0) {
        	fatorial = fatorial * i; /*multiplica o fatorial pelo o valor de i que é o igual a num*/
            i--; //tira um numero a cada passada pelo loop
        }

        System.out.println("O resultado é " + fatorial);
        ler.close();
		}
	}


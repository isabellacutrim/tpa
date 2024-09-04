package estuturaWhile4exerc;
import java.util.*;
public class IdadeMM {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i = 1, anoNasc, anoAtual, idade;
		while(i<=6) {
			System.out.println("usuario "+ i + ", digite o seu ano de nascimento: ");
			anoNasc = ler.nextInt();
			System.out.println("digite o ano atual:");
			anoAtual = ler.nextInt();
			idade = anoAtual - anoNasc;
			System.out.println("a sua idade é "+ idade);
			if(idade <18) {
				System.out.println("Menor de idade");
			}else {
				System.out.println("maior de idade");
			}
			i+=1;
		}
		ler.close();
	}

}

package estuturaWhile4exerc;
import java.util.Scanner;
public class tabuada {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i = 1, num, res;
		System.out.println("digite o número escolhido para consultar a tabuada");
		num = ler.nextInt();
		while(i<=10) {
			res = num * i;
			System.out.println(num + "x" + i + "= " + res);
			i +=1;
		}
		ler.close();
	}
}

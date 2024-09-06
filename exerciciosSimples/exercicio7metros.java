import java.util.Scanner;
public class exercicio7metros {
	public static void main (String args[] ) {
		Scanner ler = new Scanner (System.in);
		double km, metro;
		
		System.out.println("digite a quantidade de metros");
		metro = ler.nextInt();
		ler.close();
		
		km = metro / 1000;
		
		System.out.println("o número de quilometros é " + km);
	}
}

import java.util.Scanner;
public class exercicico11mesesanos {
	public static void main (String args[]) {
        Scanner Ler = new Scanner(System.in);
        double dias, meses, anos;

        System.out.println("digite o numero de dias ");
        dias = Ler.nextInt();
        Ler.close();

        meses = dias / 30;
        anos = dias / 365;

        System.out.println("a quantidade de meses s�o " + meses);
        System.out.println("a quantidade de anos s�o " + anos);
	}
}

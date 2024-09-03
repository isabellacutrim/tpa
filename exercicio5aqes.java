import java.util.Scanner;
public class exercicio5aqes {
	public static void main (String args[] ) {
		Scanner ler = new Scanner (System.in);
		int n1, n2, n3, nV1, nV2, nV3, total;
		
		System.out.println("digite o primeiro número");
		n1 = ler.nextInt();
		
		System.out.println("digite o segundo número");
		n2 = ler.nextInt();
		
		System.out.println("digite o terceiro número");
		n3 = ler.nextInt();
		ler.close();
		
		nV1 = n1 * n1;
		nV2 = n2 * n2;
		nV3 = n3 * n3;
		
		total = nV1 + nV2 + nV3;
		System.out.println("o resultado é " + total); 
	}

}

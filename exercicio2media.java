import java.util.Scanner;
public class exercicio2media {
	public static void main (String args[]) {
	 Scanner ler = new Scanner (System.in);
	 int n1, n2, n3, media;
	
	 System.out.println("digite a nota 1");
	 n1 = ler.nextInt();
	 
	 System.out.println("digite a nota 2");
	 n2 = ler.nextInt();
	 
	 System.out.println("digite a nota 3");
	 n3 = ler.nextInt();
	 ler.close();
	 
	 media = (n1 + n2 + n3)/3;
			 
	 System.out.println("sua média é " + media);
	}
}

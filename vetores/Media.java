import java.util.Scanner;
public class Media {
     public static void main(String[] args) {
		Scanner Fada = new Scanner (System.in);
		
		//vetor A = ler 10 valores int
		int valor = 10;
		int soma = 0;
		int a[] = new int[valor];
		
		for (int i = 0; i < valor; i++) {
			System.out.println("Dgite o número " + (i+1));
			a[i] = Fada.nextInt();
		}
		for (int i = 0; i < valor; i++) {
			soma += a[i];
			//esta somando a soma o a[i]
		}
		
		//calcular a media
		int media = 0;
		media = soma/ valor;
		
		
		//apresentar a media
		System.out.println("A média é " + media);
		Fada.close();
	}
}

import java.util.*;
public class Diferença10 {
	public static void main(String[] args) {
		Scanner Fada = new Scanner (System.in);
		int a[] = new int [10];
		int b[] = new int [10];
		int c[] = new int [10];
		
		// o valor do C é a diferença do vetor A e B;
		for (int i = 0; i < a.length; i++) {
			System.out.println("Digite o valor do Vetor A na posição " + (i+1));
			a[i] = Fada.nextInt();
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.println("Digite o valor do Vetor B na posição " + (i+1));
			b[i] = Fada.nextInt();
		}
		
		//1 numero A e comparar com todos do vetor B
		int cont = 0;
		for (int i = 0; i < a.length; i++) {
			int j;
			for (j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
                    break;
                 }
             }
			//o j vai pegar o valor do tamanho do B
             if (j == b.length) {
                   c[cont] = a[i];
                   cont++;
			}
		}
		
		System.out.println("vetor C:");
		
        for (int i = 0; i < cont; i++) {
        	System.out.println(c[i]);
        }
		
		Fada.close();
	}
}

import java.util.Scanner;
public class ParouImpar13 {
	public static void main(String[] args) {
		Scanner Fada = new Scanner (System.in);
		/* Criar um vetor A com 10 elementos inteiros. 
		 * Construir um vetor B de mesmo tipo e tamanho, 
		 * obedecendo as seguintes regras de formação: 
		 * a) Bi deverá receber 1 quando Ai for par; b) Bi deverá receber 0 quando Ai for ímpar.*/
		
		int a[] = new int[10];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Digite o valor " + (1+i));
			a[i] = Fada.nextInt();
		}
		int b[] = new int[10];
		for (int i = 0; i < b.length; i++) {
			if(a[i] % 2 == 0) {
				//caso seja par
				b[i] = 1;
			}
			else {
				//caso seja impar 
				b[i] = 0;
			}
		}
		//ler
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + ", ");
		}
		Fada.close();
	}
}

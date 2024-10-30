import java.util.*;
public class Comparação14 {
	public static void main(String[] args) {
		Scanner Fada = new Scanner (System.in);
		//ler o vetor A 
		int a[] = new int [10];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Digite o valor " + (i+1) + ", do vetor A");
			a[i] = Fada.nextInt();
		}
		
		//ler o vetor B
		int b[] = new int [10];
		for (int i = 0; i < b.length; i++) {
			System.out.println("Digite o valor " + (i+1) + ", do vetor B");
			b[i] = Fada.nextInt();
		}
		int c[] = new int [10];
		//a
		for (int i = 0; i < c.length; i++) {	
			if(a[i] > b[i]) {
				c[i] = 1;
			}
			else if(a[i] < b[i]) {
				c[i] = -1;
			}
			else {
				c[i] = 0;
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+ ", ");
		}
		Fada.close();
	}
}

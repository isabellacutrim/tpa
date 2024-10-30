import java.util.*;
public class Tabuada2 {
	public static void main(String[] args) {
		Scanner Fada = new Scanner (System.in);
		//criar um vetor A com 5 elementos
		int[] a = new int [5];
		
		//leitura
		for (int i = 0; i < a.length; i++) {
			System.out.println("Digite o número "+ (i+1) + ", para ser consultado a tabuada");
			a[i] = Fada.nextInt();
		}
		//imprimir a tabuada de cada elemento do vetor A
		//calculando 
		
		//enquanto numero for menor ou igual a 10 sera feito
		    //i ganha mais um
		    //resultando é igual a numero vezes i (no caso o numero seria o vetor a na posiçao [i])
	    //fazer com que passa 10 vezes na mesma variavel
		int i = 0, resultado, contador = 0;
		while (i <= 5) {
			System.out.println("Tabuada do " + a[i]);
			while (contador <= 10)
		    {
			resultado = a[i] * contador;
			System.out.println(a[i] + " x " + (contador) +" = " + resultado);
			contador++;
		    }
			contador = 0;
			i++;
		}
			
	    
		Fada.close();
	}
}

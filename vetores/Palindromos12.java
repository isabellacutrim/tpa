import java.util.*;
public class Palindromos12 {
	public static void main(String[] args) {
		Scanner Fada = new Scanner (System.in);
		//verificar se o vetor a é palindromo
		
		//ler vetor A
		int a[] = new int [10];
		
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Digite o valor na posição " + (i+1));
			a[i] = Fada.nextInt();
		}
		
		boolean vous = true; 
		//oq vc inicializa é a base dela
        for (int i = 0; i < a.length / 2; i++) {
        	//verifica somente a metade do numero pq vai verificar metade na frente e metade atras
            if (a[i] != a[a.length - 1 - i]) {
            	//exemplo: o primeiro numero é 1 e o ultimo é 1
            	//o tamanho que no caso é 10-1-(i que aqui é 0)0 ent vai ser o A na posiçao 9 
                vous = false; 
                break;
                //se for falsa acaba aqui
            }
        }
        if (vous)
        	//se for verdadeira
        {
        	System.out.println("é palindromo.");
        } 
        else 
        	//caso nn 
        {
        	System.out.println("não é");
        }

		Fada.close();
	}
}
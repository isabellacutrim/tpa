import java.util.*;
public class Palindromos12 {
	public static void main(String[] args) {
		Scanner Fada = new Scanner (System.in);
		//verificar se o vetor a � palindromo
		
		//ler vetor A
		int a[] = new int [10];
		
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Digite o valor na posi��o " + (i+1));
			a[i] = Fada.nextInt();
		}
		
		boolean vous = true; 
		//oq vc inicializa � a base dela
        for (int i = 0; i < a.length / 2; i++) {
        	//verifica somente a metade do numero pq vai verificar metade na frente e metade atras
            if (a[i] != a[a.length - 1 - i]) {
            	//exemplo: o primeiro numero � 1 e o ultimo � 1
            	//o tamanho que no caso � 10-1-(i que aqui � 0)0 ent vai ser o A na posi�ao 9 
                vous = false; 
                break;
                //se for falsa acaba aqui
            }
        }
        if (vous)
        	//se for verdadeira
        {
        	System.out.println("� palindromo.");
        } 
        else 
        	//caso nn 
        {
        	System.out.println("n�o��");
        }

		Fada.close();
	}
}
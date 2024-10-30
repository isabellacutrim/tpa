import java.util.*;
public class Busca11 {
	public static void main(String[] args) {
		Scanner Fada = new Scanner (System.in);
		//Montar uma rotina de busca, para pesquisar se um dado elemento X está armazenado em A.
		//ler o vetor A 
		int a[] = new int [10];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Digite o valor " + (i+1));
			a[i] = Fada.nextInt();
		}
		boolean continuar = true;
        while (continuar) {
            System.out.println("Qual valor você deseja procurar? ");
            int x = Fada.nextInt();

            boolean encontro = false; 

            // Rotina de busca
            for (int i = 0; i < a.length; i++) {
                if (a[i] == x) {
                	System.out.println(x + " foi encontrado no vetor A.");
                    encontro = true; 
                    break; 
                }
            }
            if (!encontro) { 
            	System.out.println(x + " não foi encontrado no vetor A.");
            }
            System.out.println("Você deseja continuar a busca? (s - sim, n - não)");
            String resposta = Fada.next();
            if (resposta.equals("n")) {
            	//metodo que verfica a resposta que no caso é n
            	//caso seja n sai do while
                continuar = false; 
            }
        }

		Fada.close();
	}
}

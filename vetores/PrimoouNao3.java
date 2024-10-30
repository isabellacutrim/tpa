import java.util.Scanner;

public class PrimoouNao3 {
    public static void main(String[] args) {
        Scanner Fada = new Scanner(System.in);
        // vetor A com 10 elementos
        int[] a = new int[10];
        int num = 0;

        // ler o vetor
        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite o número " + (i + 1));
            a[i] = Fada.nextInt();
        }

        // imprimir o valor
        for (int i = 0; i < a.length; i++) {
            System.out.println("O número é " + a[i] + ", da posição " + (i + 1));

            if (a[i] % 2 == 0) {
                for (num = a[i]; num >= 0; num--) {
                    if (num % 2 == 0) {
                        System.out.print(num + ", ");
                    }
                }
            } else {
                for (num = a[i] - 1; num >= 0; num--) {
                    if (num % 2 == 0) {
                        System.out.print(num + ", ");
                    }
                }
            }

            System.out.println();
            System.out.println("--------------------------");
		//apresentar os numeros pares do 0 ate o numero
        }

        Fada.close();
    }
}
import java.util.Scanner;
public class PareImpar1 {
    public static void main(String[] args) {
        Scanner Fada = new Scanner(System.in);
        int[] a = new int[20];
        int[] b = new int[20];

        // Ler o vetor A
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o " + (i + 1) + " número: ");
            a[i] = Fada.nextInt();
        }
        Fada.close();

        System.out.println("---------------");
        
        // Separar os elementos pares e ímpares dentro de B
        int paresIndex = 0, imparesIndex = 0;
        for (int i = 0; i < 20; i++) {
            if (a[i] % 2 == 0) {
                b[paresIndex] = a[i];
                paresIndex++;
            } else {
                b[19 - imparesIndex] = a[i];
                imparesIndex++;
            }
        }

        // Imprimir o vetor B
        for (int i = 0; i < 20; i++) {
            System.out.println("Posição " + i + ": " + b[i]);
        }
    }
}

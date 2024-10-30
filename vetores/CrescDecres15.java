import java.util.*;

public class CrescDecres15 {
    public static void main(String[] args) {
        Scanner Fada = new Scanner(System.in);
        // Criar um vetor B que tenha os 10 elementos de A em ordem crescente 
        // e um vetor C que tenha os 10 elementos de A em ordem decrescente.
        
        int a[] = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite o valor " + (i + 1) + ": ");
            a[i] = Fada.nextInt();
        }
        
        int b[] = new int[10];
        int c[] = new int[10];
        
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        
        Arrays.sort(b);
        System.out.println("Ordem Crescente:");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + (i < b.length - 1 ? ", " : ""));
            //caso a posiçao nao seja a ultima coloca , caso seja coloca nd
            //? = condiçao (for verdadeiro é o primeiro e falso o ultimo)
            //: = dividir 
        }
       
        for (int i = 0; i < b.length; i++) {
            c[i] = b[b.length - 1 - i];
            //tamanho do b - 1 - i (do ultimo pro primeiro)
        }
        
        System.out.println("\nOrdem Decrescente:");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + (i < c.length - 1 ? ", " : ""));
        }
        
        Fada.close(); 
    }
}

import java.util.*;

public class Somatorio8 {
    public static void main(String[] args) {
        Scanner Fada = new Scanner(System.in);
        
        // sendo que cada elemento de B deverá ser o seguinte somatório: 
        // Bi = Somatório de Aj, para todo j variando de i até 10.
        
        int a[] = new int[10];
        for (int j = 0; j < a.length; j++) {
            System.out.print("Digite o valor " + (j + 1) + ": ");
            a[j] = Fada.nextInt();
        }
        
        int b[] = new int[10];
        
        // atribuindo valor ao B (deve ser a somatória do vetor a a partir da posição do vetor a)
        for (int i = 0; i < b.length; i++) {
            b[i] = 0;
            for (int j = i; j < a.length; j++) {
                b[i] += a[j];
            }
        }
        //o ciclo vai começar o B valendo 0 e no outro laço for usado para fazer a somatoria
        //a somataria se inicia na posiçao do J e assim vai ate o fim do i.
        Fada.close();
        
        System.out.println("O valor da somatória é:");
        
        // ciclo for para apresentar
        for (int i = 0; i < b.length; i++) {
            System.out.println("A somatória na posição " + i + " é " + b[i] + " do vetor b");
        }
    }
}

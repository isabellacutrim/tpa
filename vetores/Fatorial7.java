import java.util.Scanner;
public class Fatorial7 {
	public static void main(String[] args) {
		Scanner Fada = new Scanner (System.in);
		int a [] = new int [15];
		int b [] = new int [15];
		
		//ler o A
		for (int i = 0; i < a.length; i++) {
			System.out.println("Digite o valor do número " + (i+1));
			a[i] = Fada.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
            int fatorial = 1;
            if (a[i] < 0) {
                b[i] = -1; 
            } else {
                for (int j = 1; j <= a[i]; j++) {
                    fatorial *= j;
                }
                b[i] = fatorial;
            }
        }

        for (int i = 0; i < a.length; i++) {
        	if(b[i] == 0){
        		System.out.println("O número é muito grande, Número " + a[i]);
        	}
        	else {
        		System.out.println("Fatorial do número " + a[i] + ", é " + b[i]);
        	}
        	
        }
		Fada.close();
	} 
   
}


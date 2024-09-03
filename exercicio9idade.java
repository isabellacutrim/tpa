import java.util.Scanner;
public class exercicio9idade {
	    public static void main(String args[]) {
	    	
	    	Scanner ler= new Scanner (System.in);
	    	
	    	int aNasc, aAtual, idade;
	    	
	        System.out.println("digite o ano de nascimento");  
	        aNasc = ler.nextInt();
	        
	        System.out.println("digite o ano atual");	
	        aAtual = ler.nextInt();
	        ler.close();
	        
	        idade = aAtual - aNasc;
	        //expecificar dias e meses
	        System.out.print("a sua idade é "+ idade);
	    }
}

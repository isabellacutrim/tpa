import java.util.Scanner;
public class exercicios10invertidos {
	public static void main(String args[]){
		  Scanner ler = new Scanner(System.in);
		  int vA, vB, vC;
		  
		  System.out.println("digite o valor A");
		  vA = ler.nextInt();
		  
		  System.out.println("digite o valor B");
		  vB = ler.nextInt();
		  ler.close();
		  
		  vC = vA;
		  vA = vB;
		  vB = vC;
		  
		  System.out.println("o valor que estava no B e agora esta na A " + vA );
		  System.out.println("o valor que estava no A e agora esta na B " + vB );
	}  
}

import java.util.Scanner;
public class Deltaraiz4 {
    public static void main (String args[]) {
    	Scanner ler = new Scanner (System.in);
    	double a,b,c,delta;
    	System.out.println("Digite o valor de A");
    	a=ler.nextDouble();
    	
    	System.out.println("Digite o valor de B");
    	b=ler.nextDouble();
    	
    	System.out.println("Digite o valor de c");
    	c=ler.nextDouble();
    	
    	delta =(b*b)-4*a*c;
    	ler.close();
    	if(delta<0) {
    	System.out.println("Não existe raiz para a equação");
        }else if (delta == 0) {
        System.out.println("Existe apenas uma raiz para a equação");
        }else {
    	 System.out.println(" Existe duas raizes para a equação");
        }
    	
     }
}


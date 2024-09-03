import java.util.Scanner;
public class Triangulo5 {
	 public static void main (String args[]) {
        Scanner ler = new Scanner (System.in);
        Double a,b,c;
        

        System.out.println("Digite o valor de A ");
        a=ler.nextDouble();
        
        System.out.println("Digite o valor de B ");
        b=ler.nextDouble();
        
        System.out.println("Digite o valor de C ");
        c=ler.nextDouble();
        
        if((a+b>c)&& (a+c>b)&& (b+c>a)) {
        	 System.out.println("Os tres lados formam um triangulo ");
        	 
        }else if ((a==b) && (b==c) && (c==a)) {
        	System.out.println("É um triângulo Equilatero");
        	
        }else if ((a!=b||b!=c)){
        	System.out.println("É um triângulo escaleno");
        	
        	
        }else 
        	System.out.println("É um triângulo isosceles");
        
        ler.close();
        
        
        
  }     
}

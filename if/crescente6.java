import java.util.Scanner;
public class crescente6 {
      public static void main (String args[] ) {
    	  Scanner ler = new Scanner (System.in);
    	  double a, b, c;
    	  System.out.println("digite o valor A");
    	  a = ler.nextDouble();
    	  
    	  System.out.println("digite o valor B");
    	  b = ler.nextDouble();
    	  
    	  System.out.println("digite o valor C");
    	  c = ler.nextDouble();
    	  
    	  if((a > b) && (b > c)) {
    		  System.out.println(c + ", " + a + " e " + b);
    	  }else if ((a < b) && (b < c)) {
    		  System.out.println(a + ", "+ b + " e " + c);
    	  }else if ((c > a) && (a > b)) {
    		  System.out.println(b + ", "+ a + " e " + c);
    	  }else if ((b > c)&&(c > a)){
    		  System.out.println(a + ", "+ c + " e " + a);
    	  }else if ((b > a)&&(a > c)) {
    		  System.out.println(c + ", "+ a + " e " + b);
    	  }else {
    		  System.out.println(b + ", "+ c + " e " + a);
    	  }
          ler.close();
      }
}
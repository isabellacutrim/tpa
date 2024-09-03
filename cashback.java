import java.util.Scanner;
public class cashback {
	public static void main (String args[] ) {
		Scanner ler = new Scanner (System.in);
		double totalCompra, cashback;
		
		System.out.println("digite o valor total da compra");
		totalCompra = ler.nextDouble();
		
		if(totalCompra <= 100) {
			cashback = (totalCompra/100)*5;
		    System.out.println("o valor de cashback é R$" +cashback);
		    
		}else if(totalCompra <= 1000){
			cashback = (totalCompra/100)*8;
		    System.out.println("o valor de cashback é R$" +cashback);
		    
		}else if(totalCompra <= 2000){
			cashback = (totalCompra/100)*10;
			System.out.println("o valor de cashback é R$" +cashback);
			
		}else if(totalCompra <=5000){
			cashback = (totalCompra/100)*12.5;
			System.out.println("o valor de cashback é R$" +cashback);
		}else {
			cashback = (totalCompra/100)*15;
			System.out.println("o valor de cashback é R$" +cashback);
		}
		ler.close();
	}

}
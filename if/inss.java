import java.util.Scanner;
public class inss {
	public static void main (String args[] ) {
		Scanner ler = new Scanner (System.in);
		double renda, inss;
		
		System.out.println("digite a sua renda mensal");
		renda = ler.nextDouble();
		
		if(renda <= 1412){
			inss = (renda/100)*7.5;
			System.out.println("o valor do inss é " + inss);	
		}else if(renda <= 2666.68){
			inss = (renda/100)*9;
			System.out.println("o valor do inss é " + inss);
		}else if(renda <= 4000.03){
			inss = (renda/100)*12;
			System.out.println("o valor do inss é " + inss);
		}else if(renda <= 7786.02){
			inss = (renda/100)*14;
			System.out.println("o valor do inss é " + inss);
		}else{
			inss = (renda/100)*16;
			System.out.println("o valor do inss é " + inss);
		}
		ler.close();
	}

}

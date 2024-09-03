import java.util.Scanner;
public class imccondicao3 {
	public static void main (String args[] ) {
		Scanner ler = new Scanner (System.in);
		double p, alt, imc;
		
		System.out.println("digite o seu peso");
		p = ler.nextDouble();
		
		System.out.println("digite a sua altura");
		alt = ler.nextDouble();
		
		imc = p /(alt * alt);
		
		if(imc <= 18.5) {
			System.out.println("seu IMC é " + imc +", excesso de magreza");
		}else if(imc <= 25) {
			System.out.println("seu IMC é " + imc +", peso normal");
		}else if(imc <= 30) {
			System.out.println("seu IMC é " + imc +", excesso de peso");
		}else if(imc <= 35) {
			System.out.println("seu IMC é " + imc +", obesidade grau 1");
		}else if(imc <= 40) {
			System.out.println("seu IMC é " + imc +", obesidade grau 2");
		}else {
			System.out.println("seu IMC é " + imc +", obesidade grau 3");
		}
		ler.close();
	}  
}
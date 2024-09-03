import java.util.Scanner;
public class gastomedio2 {
		public static void main(String args[]) {
			Scanner ler = new Scanner(System.in);
			double km, litros, gasMe; 
			System.out.println("digte o valor de km percorrido");
			km = ler.nextDouble();
			System.out.println("digite a capacidade do combustivel");
			litros = ler.nextDouble();
			
			gasMe = km/litros;
			
			System.out.println("gasto medio de " + gasMe);
			
			if(gasMe < 10){
				System.out.println("seu carro não é economico");
			}else {
				System.out.println("seu carro é economico");
			}
			ler.close();
	}
}

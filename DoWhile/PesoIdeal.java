import java.util.*;
public class PesoIdeal {
	public static void main(String[] args) {
		Scanner Fada = new Scanner (System.in);
		String sexo = "m";
		double alt,pesoIdeal;
		int simouNao = 1;
		
		do {
			System.out.println("Digite seu sexo");
			sexo = Fada.nextLine();
			
			System.out.println("Digite sua altura");
			alt = Fada.nextDouble();
			alt = alt *100;
			//proma dentro da estrutura if onde nn é verdadeiro e vai direito pro else mesmo estando correto
			if(sexo.equalsIgnoreCase("m")){
				pesoIdeal= 52+0.75*(alt-152.4);
				System.out.println("O seu peso ideal é:"+ pesoIdeal);
			}
			else if(sexo.equalsIgnoreCase("f")){
					pesoIdeal= 49+0.75 * (alt-152.4);
					System.out.println("O seu peso ideal é:"+ pesoIdeal);
			}
			else {
				System.out.println("Suas informações estão inválidas");
			}
			System.out.println("Deseja continuar?");
			simouNao=Fada.nextInt();
			/*mensagem = scanner.nextLine();*/
		}while(simouNao==1);
		
		//declara variavel
		//estrura while
	
		Fada.close();
	}
}

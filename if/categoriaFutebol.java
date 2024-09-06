import java.util.Scanner;
public class categoriaFutebol {
	public static void main (String args[] ) {
		Scanner ler = new Scanner (System.in);
		int idade, nasc;
		
		System.out.println("digite o ano de nascimento");
		nasc = ler.nextInt();
		idade = 2024 - nasc;
		
		if(idade <= 6){
			System.out.println("a sua categoria é dente de leite, " + idade + " anos");
		}else if(idade <= 10){
			System.out.println("a sua categoria é infantil 1, " + idade + " anos");
		}else if(idade <= 14){
			System.out.println("a sua categoria é infantil 2, " + idade + " anos");
		}else if(idade <= 16){
			System.out.println("a sua categoria é juvenil 1, " + idade + " anos");
		}else if(idade <= 17){
			System.out.println("a sua categoria é juvenil 2, " + idade + " anos");
		}else{
			System.out.println("não é permitido alunos com 18 anos ou mais, " + idade + " anos");
		}
		
		ler.close();
	}

}

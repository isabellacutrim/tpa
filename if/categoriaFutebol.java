import java.util.Scanner;
public class categoriaFutebol {
	public static void main (String args[] ) {
		Scanner ler = new Scanner (System.in);
		int idade, nasc;
		
		System.out.println("digite o ano de nascimento");
		nasc = ler.nextInt();
		idade = 2024 - nasc;
		
		if(idade <= 6){
			System.out.println("a sua categoria � dente de leite, " + idade + " anos");
		}else if(idade <= 10){
			System.out.println("a sua categoria � infantil 1, " + idade + " anos");
		}else if(idade <= 14){
			System.out.println("a sua categoria � infantil 2, " + idade + " anos");
		}else if(idade <= 16){
			System.out.println("a sua categoria � juvenil 1, " + idade + " anos");
		}else if(idade <= 17){
			System.out.println("a sua categoria � juvenil 2, " + idade + " anos");
		}else{
			System.out.println("n�o � permitido alunos com 18 anos ou mais, " + idade + " anos");
		}
		
		ler.close();
	}

}

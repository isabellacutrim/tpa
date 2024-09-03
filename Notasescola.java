import java.util.Scanner;
public class Notasescola {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int mb, b, r, i;
		double porc;
		
		
		System.out.println("Digite o total de MB");
		mb=ler.nextInt();
		System.out.println("Digite o total de B");
		b=ler.nextInt();
		System.out.println("Digite o total de R");
		r=ler.nextInt();
		System.out.println("Digite o total de I");
		i=ler.nextInt();
		int total = mb+b+r+i;
		System.out.println("Digite a nota que vai ser consultada");
		String nota = ler.next();
		
		switch (nota) {
		       case "mb":
		    	   porc = mb*100/total;
		    	   System.out.println("a porcentagem é " + porc + "%");
		           break;
		       case "b":
		    	   porc= b*100/total;
		    	   System.out.println("a porcentagem é " + porc + "%");
		           break;
		       case "r":
		    	   porc = r*100/total;
		    	   System.out.println("a porcentagem é " + porc + "%");
		           break;
		       case "i":
		    	   porc = i*100/total;
		    	   System.out.println("a porcentagem é " + porc + "%");
		           break;
		       default:
		    	   System.out.println("inválido");
		ler.close();
		}
	}

}

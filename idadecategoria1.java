import java.util.Scanner;
public class idadecategoria1 {
	public static void main(String args[] ) {
	    Scanner ler = new Scanner (System.in);
	    int id, aT, n;
	    
	    System.out.println("digite o ano atual");
	    aT = ler.nextInt();
	    System.out.println("digite o seu ano de nascimento");
	    n = ler.nextInt();
	    
	    id = aT - n;
	    if(id < 10) {
	    	System.out.println(id + " anos, criança");
	    }else if(id < 18){
	    	System.out.println(id + " anos, adolescente");
	    }else if(id < 60) {
	    	System.out.println(id + " anos, adulto");
	    }else {
	    	System.out.println(id + " anos, idoso");
	    }
	    ler.close();
	}
}

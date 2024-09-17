import java.util.*;
public class MediaAritmedica {
	public static void main(String[] args) {
		Scanner Fada = new Scanner (System.in);
		int inicio,fim,i, termos = 0, soma = 0;
       	System.out.println("Digite o intervalo inicial");
       	inicio= Fada.nextInt();
       	System.out.println("Digite o intervalo final");
       	fim= Fada.nextInt();
       	i = inicio;
       
       	while (i <= fim) {
       	  soma = soma+i; 
       	  i++;
          termos++;
       	}	
       	soma= soma/ termos; 
       	//apresentar media 
       	  System.out.println("a média é " + soma);
       	Fada.close();
	}
}
	  
	    	
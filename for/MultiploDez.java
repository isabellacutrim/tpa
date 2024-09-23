import java.util.*;
public class MultiploDez {
	 public static void main(String[] args) {
   	  Scanner Fada = new Scanner (System.in);
	  int i=1;
	  for (i=1;i<=100;i++)
	  {
		  //em relaçao ao i chegando a 100
		  if((i%10)==0){
			  System.out.println("É multiplo de dez:" +i+"\n");
		  }
		  else {
			  System.out.println("Não é multiplo de dez:" +i+"\n");
		  }
	  }
		  
	 }
}

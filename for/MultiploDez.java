import java.util.*;
public class MultiploDez {
	 public static void main(String[] args) {
   	  Scanner Fada = new Scanner (System.in);
	  int i=1;
	  for (i=1;i<=100;i++)
	  {
		  //em rela�ao ao i chegando a 100
		  if((i%10)==0){
			  System.out.println("� multiplo de dez:" +i+"\n");
		  }
		  else {
			  System.out.println("N�o � multiplo de dez:" +i+"\n");
		  }
	  }
		  
	 }
}

import java.util.Scanner;
public class Usuarios {
	 public static void main(String[] args) {
   	  Scanner Fada = new Scanner (System.in);
      int anoNasc,anoAt,i,velho=0,novo=100000,id;
      System.out.println("Digite o ano atual:");
      anoAt = Fada.nextInt();
      
      for(i=1;i<=10;i++){
    	  
          System.out.println("Digite o ano de nascimento: ");
          anoNasc = Fada.nextInt();
    	  id= anoAt-anoNasc;
    	  System.out.println("Sua idade é: "+ id + " anos");
    	  if(id>velho){
    		  velho = id;
    	  }
    	  else if (id<novo)
    	  {
    		novo = id;
    	  }   
      }
      System.out.println("idade do mais velho: " + velho + " anos");
      System.out.println("idade do mais velho: " + novo + " anos");
	}
  }

import java.util.Scanner;
public class IPFC9 {
    public static void main (String args[]) {
    	Scanner ler = new Scanner (System.in);
    	double sal, ir, parc, ipfc;
    	
    	System.out.println("Digite o valor do sálario");
    	sal=ler.nextDouble();
    	
    	if(sal<=1434.59) {
    		ir = 0;
            parc = 0;
    	}else if (sal <=2150){
    		ir = 7.5;
            parc = 107.59;
    	}else if(sal <= 2866.70) {
    		ir = 15.0;
            parc= 268.84;
    	}else if (sal<=3582.00) {
    		ir = 22.5;
            parc = 483.84;
    	}else {
    		ir = 27.5;
            parc = 662.94;
    	}
    	ipfc = ( sal/100*ir- parc);
    	System.out.println(ipfc);
        ler.close();
   }
}
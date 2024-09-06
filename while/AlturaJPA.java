package exerciciosABCDEwhile;
import java.util.*;
public class AlturaJPA {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double altP, altJ;
		int i = 0;
		
		System.out.println("digite a altura de Pedro");
		altP = ler.nextDouble();
		System.out.println("digite a altura de João");
		altJ = ler.nextDouble();
		if(altJ != altP) 
		{
			while(altJ <= altP)
			{
			    altJ = altJ + 0.25;
			    altP = altP + 0.2;
			    i++;
			}
			System.out.println("Levará " + i + " anos para João ser mais alto que Pedro ou a mesma altura");
			ler.close();
		}else {
			System.out.println("Levará 0 anos para João ser mais alto que Pedro ou a mesma altura");
		}
		
	}
}

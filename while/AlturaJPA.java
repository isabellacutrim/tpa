package exerciciosABCDEwhile;
import java.util.*;
public class AlturaJPA {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double altP, altJ;
		int i = 0;
		
		System.out.println("digite a altura de Pedro");
		altP = ler.nextDouble();
		System.out.println("digite a altura de Jo�o");
		altJ = ler.nextDouble();
		if(altJ != altP) 
		{
			while(altJ <= altP)
			{
			    altJ = altJ + 0.25;
			    altP = altP + 0.2;
			    i++;
			}
			System.out.println("Levar� " + i + " anos para Jo�o ser mais alto que Pedro ou a mesma altura");
			ler.close();
		}else {
			System.out.println("Levar� 0 anos para Jo�o ser mais alto que Pedro ou a mesma altura");
		}
		
	}
}

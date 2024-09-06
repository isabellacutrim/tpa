package exerciciosABCDEwhile;
import java.util.Scanner;
public class TabuadaB {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i = 0, num = 0, resultado = 0;
		
		
		while ((i <= 10) && (num <= 10))
		{
			i = i + 1;
			resultado = num * i;
			System.out.println(num + " x " + i +" = " + resultado);
			if(i == 10)
			{
				num = num + 1;
	            i = 0;
	            System.out.println(">>>>>>>>>>>>");
			}
		}
		ler.close();
	}
}

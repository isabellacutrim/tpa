import java.util.Scanner;
public class VetorA4 {
  public static void main(String[] args) {
	Scanner Fada = new Scanner (System.in);
	int [] a = new int [10];

	for (int i = 0; i < 10; i++) {
		System.out.println("Digite um número " + (i+1));
		a[i]= Fada.nextInt();
	}
    for ( int i = 0; i < 10; i++) {
    	System.out.println(a[i]);
    }
    Fada.close();
  }
}

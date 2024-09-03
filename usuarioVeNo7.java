import java.util.Scanner;
public class usuarioVeNo7 {
	public static void main (String args[] ) {
		Scanner ler = new Scanner (System.in);
		
		int n1, n2, n3, n4, n5, nomeNovo, nomeVelho, id1, id2, id3, id4, id5, idMVe,idMNo;
		
		System.out.println("digite o seu nome, usuario 1");
		n1 = ler.nextInt();
		System.out.println("digite a sua idade, usuario 1");
		id1 = ler.nextInt();
		
		System.out.println("digite o seu nome, usuario 2");
		n2 = ler.nextInt();
		System.out.println("digite a sua idade, usuario 2");
		id2 = ler.nextInt();
		
		System.out.println("digite o seu nome, usuario 3");
		n3 = ler.nextInt();
		System.out.println("digite a sua idade, usuario 3");
		id3 = ler.nextInt();
		
		System.out.println("digite o seu nome, usuario 4");
		n4 = ler.nextInt();
		System.out.println("digite a sua idade, usuario 4");
		id4 = ler.nextInt();
		
		System.out.println("digite o seu nome, usuario 5");
		n5 = ler.nextInt();
		System.out.println("digite a sua idade, usuario 5");
		id5 = ler.nextInt();
		
		nomeNovo = n1;
		nomeVelho = n1;
		idMVe = id1;
		idMNo = id1;
		
		if(id2 > idMVe){
			idMVe = id2;
		    nomeVelho = n2;
		}else if(id2 < idMNo){
			idMNo = id2;
		    nomeNovo = n2;
		}else if (id3 > idMVe) {
			idMVe = id3;
			nomeVelho = n3;
		}else if (id3 < idMNo) {
			idMNo = id3;
	        nomeNovo = n3;
		}else if (id4 > idMVe) {
			idMVe = id4;
		    nomeVelho = n4;
		}else if (id4 < idMNo) {
			idMNo = id4;
			nomeNovo = n4;
		}else if (id5 > idMVe) {
			idMVe = id5;
		    nomeVelho = n5;
		}else {
			idMNo = id5;
		    nomeNovo = n5;
		}
		System.out.println("o nome do mais velho é " + nomeVelho + " e a idade é " + idMVe);
		System.out.println("o nome do mais novo é " + nomeNovo + " e a idade é " + idMNo);
	
		ler.close();
	}

}

import java.util.Scanner;

public class P293_artropodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//VARIABLES
		
		int cont;
		
		int insectos;
		int aracnidos;
		int crustaceos;
		int escolopendras;
		int anillos;
		
		int total = 0;
		
		//ALGORITME
	
		cont = sc.nextInt();
		
		for (int i = 1; i <= cont; i++) {
			insectos = sc.nextInt();
			aracnidos = sc.nextInt();
			crustaceos = sc.nextInt();
			escolopendras = sc.nextInt();
			anillos = sc.nextInt();
			
			anillos = anillos * 2;
			anillos = anillos * escolopendras;
			
			total = insectos * 6;
			total = total + aracnidos * 8;
			total = total + crustaceos * 10;
			total = total + anillos;
			
			System.out.println(total);
		}
		
	}

}

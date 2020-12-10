import java.util.Scanner;

public class P434_romance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int cont;
		long numEjem;
		long numCajas;

		cont = sc.nextInt();

		for (int i = 0; i < cont; i++) {

			numEjem = sc.nextInt();
			numCajas  = sc.nextInt();

			if(numEjem < numCajas) {
				System.out.println("ROMANCE");
			}else{
				if(numEjem == numCajas) {
					System.out.println("ROMANCE");
				}else{
					System.out.println("PRINCIPIO");
				}
			}
		}

	}

}

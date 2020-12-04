import java.util.Scanner;

public class P363_calorias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		//VARIABLES

		int calC;

		int numComida;
		int comidas;
		int totalComidas = 0;

		int resu = 0;

		//ALGORITME

		do {
			calC = sc.nextInt();

			if(calC != 0) {
				numComida = sc.nextInt();

				totalComidas = 0;
				for (int i = 1; i <= numComida; i++) {

					comidas = sc.nextInt();
					totalComidas = totalComidas + comidas;
				}

				resu = totalComidas/calC;
				
				if(totalComidas % calC != 0) {
					resu++;
				}

				System.out.println(resu);
			}
		}while (calC != 0);

	}

}

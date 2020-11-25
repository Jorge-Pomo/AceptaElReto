import java.util.Scanner;

public class P374_criogenizacion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//VARIABLES

		int cont;

		long datos;

		long max = 0;
		long maxNum = 0;
		int contMax = 0;

		long min = Long.MAX_VALUE;
		long minNum = 0;
		int contMin = 0;

		//ALGORITME

		cont = sc.nextInt();

		for (int i = 0; i < cont; i++) {
			max = 0;
			contMax = 0;
			min = Long.MAX_VALUE;
			contMin = 0;
			
			do {
				datos = sc.nextLong();
				if(datos != 0) {

					//Minima
					if(datos < min) {
						min = datos;
						
						contMin = 1;
						
					}else {
						if(min == datos) {
							contMin++;
						}
					}

					//Maxima
					if(datos > max) {
						max = datos;
						
						contMax = 1;
						
					}else {
						if(max == datos) {
							contMax++;
						}
					}

				}
			}while(datos != 0);

			System.out.print(min+" ");
			System.out.print(contMin+" ");

			System.out.print(max+" ");
			System.out.print(contMax);

			System.out.println();
		}

	}

}

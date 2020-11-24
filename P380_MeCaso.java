import java.util.Scanner;

public class P380_MeCaso {

	private static Scanner teclado;

	public static void main(String[] args){

		//Teclado

		teclado = new Scanner(System.in);

		//Varibles

		int num;
		int nums;
		int suma = 0;
		int cont = 0;

		//Bucle

		do {
			
			num = teclado.nextInt();
			
			suma = 0;
			
			if(num != 0) {
				for(cont = 1; cont <= num; cont++) {
					nums = teclado.nextInt();
					suma = nums + suma;

				}
				System.out.println(suma);
			}
		}
		while (num != 0); 

	}

}
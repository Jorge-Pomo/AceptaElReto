import java.util.Scanner;

public class P428_tendencia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cont;
		String num10;
		int num5 = 0;
		int div = 0;
		int resto = 0;
		int resuResto = 0;
		int resu = 0;
		
		
		cont = sc.nextInt();
		for (int i = 0; i < cont; i++) {
			//Base 5
			num10 = sc.nextLine();
			num5 = Integer.parseInt(num10, 5);
		}
		
		while(num5 > 0) {
			resuResto = num5 % 10;
			resu = resu * 10 + resuResto;
			num5 = num5 / 10;
		}

		System.out.println(resu);
		
	}
}

	

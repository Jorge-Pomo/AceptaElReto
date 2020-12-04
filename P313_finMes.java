import java.util.Scanner;

public class P313_finMes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//VARIABLES
		
		int cont;
		
		int num1;
		int num2;
		
		//ALGORITME
		
		cont = sc.nextInt();
		
		for (int i = 1; i <= cont; i++) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			if(num1 + num2 < 0) {
				System.out.println("NO");
			}else {
				System.out.println("SI");
			}
		}
		
	}

}

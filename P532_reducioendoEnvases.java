import java.util.Scanner;

public class P532_reducioendoEnvases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int cont;
		
		int num1;
		int num2;
		
		cont = sc.nextInt();
		
		for (int i = 0; i < cont; i++) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			System.out.println(num2 - num1);
		}
		
	}

}

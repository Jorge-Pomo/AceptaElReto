import java.util.Scanner;

public class P217_ladoCalle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//VARIABLES
		
		int num;
		int parImpar = 0;
		
		//ALGORITME
		
		do {
			num = sc.nextInt();
			if(num != 0) {
				parImpar = num % 2;
				if(parImpar == 0) {
					System.out.println("DERECHA");
				}else {
					System.out.println("IZQUIERDA");
				}
			}
		}while(num != 0);
		
	}

}

import java.util.Scanner;

public class P369_contandoArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//VARIABLES
		
		int num;
		
		//ALGORITME
		
		do {
			num = sc.nextInt();
			
			if(num != 0) {
				for (int i = 1; i <= num; i++) {
					System.out.print(1);
				}System.out.println();
			}
		}while(num != 0);
		
	}

}

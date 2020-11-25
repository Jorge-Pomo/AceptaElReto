import java.util.Scanner;

public class P155_perimetroRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//VARIABLES
		
		int base;
		int altura;
		int peri = 0;
		
		//ALGORITME
		
		do {
			base = sc.nextInt();
			altura = sc.nextInt();
			
			if(base >= 0 && altura >= 0) {
				peri = base + altura;
				peri = peri * 2;
			
				System.out.println(peri);
			}
		}while(base >= 0 && altura >= 0);
	}

}

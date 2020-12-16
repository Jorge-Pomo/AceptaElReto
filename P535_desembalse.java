import java.util.Scanner;

public class P535_desembalse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int distancia;
		int altura; 
		int resu = 0;
		int altPoblado;
		
		do {
			distancia = sc.nextInt();
			if(distancia != 0) {
				int [] dif = new int [distancia];
				
				resu = 0;
				
				for (int i = 0; i < dif.length; i++) {
					altura = sc.nextInt();
					dif[i] = altura;					
				}
				
				altPoblado = dif[dif.length - 1];
				
				for (int i = 0; i < dif.length; i++) {
					resu = (altPoblado - dif[i]) + resu;
					
				}
				System.out.println(resu);
				
			}
		}while(distancia != 0);

	}

}

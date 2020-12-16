import java.util.Scanner;

public class P125_botellaGanadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int cont;

		int kilos;
		int nBotellas;

		int resu = 0;
		int posicion = 1;

		cont = sc.nextInt();
		for (int i = 0; i < cont; i++) {
			kilos = sc.nextInt();
			kilos = kilos * 8;

			nBotellas = sc.nextInt();
			resu = nBotellas;

			if(resu == kilos) {
				System.out.println(posicion);
			}else {
				while(resu > kilos) {
					nBotellas = sc.nextInt();
					resu = resu + nBotellas;
					posicion++;

					if(nBotellas == 0) {
						break;
					}
					System.out.println(posicion);
				}
			}
			
		}
		System.out.print("SIGAMOS RECICLANDO");
	}

}

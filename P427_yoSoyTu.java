import java.util.Scanner;

public class P427_yoSoyTu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		//VARIABLE
		int cont;

		String principal;
		String secund;

		String secreto;

		//ALGORITME
		cont = sc.nextInt();

		for (int i = 1; i <= cont; i++) {

			principal = sc.nextLine();
			secund = sc.nextLine();

			if(principal.equals("Luke") && secund.equals("padre")) {
				System.out.println("TOP SECRET");

			}else {
				System.out.println(principal+", yo soy tu "+secund);
			}
		}

	}

}
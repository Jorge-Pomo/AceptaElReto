import java.util.Scanner;

public class P442_camel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char nombre;
		char convertir;
		
		nombre = sc.next().charAt(0);
		convertir = sc.next().charAt(0);

		if (convertir == "snake_case") {
			System.out.println("1");
		} else {
			if (convertir.equals("kebab-case")) {
				System.out.println("2");
			} else {
				if (convertir.equals("CamelCase")) {
					System.out.println("3");
				}
			}

		}

		System.out.println("Hola");
		
	}
}

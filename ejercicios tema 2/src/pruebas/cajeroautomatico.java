package pruebas;

import java.util.Scanner;

public class cajeroautomatico {

	public static void main(String[] args) {
//Cajero automatico con codigo pin

		double deposito = 20000;
		boolean repetir = true;
		boolean codigo = true;
		Integer acceso = 0000;
		Scanner sc = new Scanner(System.in);

		while (codigo) {
			System.out.println("Por favor introduzca su pin");
			acceso = sc.nextInt();
			if (acceso == 1234) {
				System.out.println("Bienvenido");
				codigo = false;
				while (repetir) {

					System.out.println("cuanto quiere retirar?");
					double monto = sc.nextDouble();
					sc.nextLine();
					if (deposito < monto) {
						System.out.println("error");

					} else
						deposito -= monto;
					System.out.println("Retiro con exito, en su cuenta quedan " + deposito + "€");

					System.out.println("desea seguir retirando?");

					String respuesta = sc.nextLine();
					if (respuesta.equalsIgnoreCase("no")) {
						repetir = false;
					}
				}
				System.out.println("Gracias por su visita");
				sc.close();
			} else {
				System.out.println("intentelo de nuevo le quedan " + 3 + " intentos");
				acceso = sc.nextInt();
				System.out.println("intentelo de nuevo le quedan " + 2 + " intentos");
				acceso = sc.nextInt();
				System.out.println("intentelo de nuevo le quedan " + 1 + " intentos");
				acceso = sc.nextInt();
				System.out.println("contacte con el banco");
				codigo = false;
			}
		}
	}
}

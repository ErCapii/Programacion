package pruebas;

import java.util.Scanner;

public class cajerogpt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double saldo = 20000;
		int intentosMaximos = 3;

		for (int intento = 1; intento <= intentosMaximos; intento++) {
			System.out.println("Por favor, introduzca su PIN:");
			int pin = sc.nextInt();

			if (pin == 1234) {
				System.out.println("Bienvenido");
				boolean repetir = true;

				while (repetir) {
					System.out.println("Su saldo actual es: " + saldo + "€");
					System.out.println("¿Cuánto desea retirar?");
					double monto = sc.nextDouble();
					sc.nextLine(); // Consumir la línea en blanco

					if (monto > 0 && monto <= saldo) {
						saldo -= monto;
						System.out.println("Retiro con éxito. Saldo restante: " + saldo + "€");
					} else {
						System.out.println("Error: Monto inválido o saldo insuficiente.");
					}

					System.out.println("¿Desea seguir retirando? (si/no)");
					String respuesta = sc.nextLine().toLowerCase();

					if (!respuesta.equals("sí")) {
						repetir = false;
					}
				}

				System.out.println("Gracias por su visita");
				sc.close();
				break; // Salir del bucle de intentos después de un inicio de sesión exitoso.
			} else {
				if (intento < intentosMaximos) {
					System.out.println("Intento fallido. Le quedan " + (intentosMaximos - intento) + " intentos.");
				} else {
					System.out.println("Contacte con el banco. Ha excedido el número máximo de intentos.");
				}
			}
		}
	}
}

package mainAPP;

import java.util.ArrayList;
import java.util.Scanner;

import MODELS.CuentaCorriente;
import MODELS.Persona;

public class mainAPP {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Menu principal

		String opc = Menu();
		Logica(opc);

	}

	public static String Menu() {

		String opc;
		System.out.println("A.Añadir persona\nB.Elegir persona\nC.Borrar persona\nD.Salir ");
		opc = sc.nextLine().toUpperCase();
		return opc;

	}

	public static void Logica(String opc) {
		ArrayList<Persona> personas = new ArrayList<Persona>();
		int numerocuenta = 1;
		boolean salir = true;
		int personaselec;
		while (salir) {

			switch (opc) {
			case "A":

				String nombre, dni;
				System.out.print("Introduce el nombre: ");
				nombre = sc.nextLine();

				System.out.println("Introduce dni");
				dni = sc.nextLine();

				Persona personac = new Persona(nombre, dni, 0, new CuentaCorriente(numerocuenta, 0, null));
				personas.add(personac);
				numerocuenta++;

				break;
			case "B":

				int contar = 1;

				for (Persona c : personas) {
					System.out.println(contar + " " + c);
					contar++;
				}

				System.out.print("Que persona vas a elegir: ");
				personaselec = Integer.parseInt(sc.nextLine());
				if (personaselec <= personas.size()) {

					System.out.println("Has elegido: ");
					Persona persona1 = personas.get(personaselec - 1);
					System.out.println(persona1);
					System.out.println("Que desea hacer con la cuenta ");
					System.out.println(
							"I. Cobrar sueldo\nII. Sacar pasta\nIII. Subir sueldo\nIV. Mostrar detalles de la persona\nV. Salir");

					String opc2 = sc.nextLine();

					switch (opc2) {

					case "I":

						System.out.print("Cual es la cantidad ");
						persona1.cobrarSueldo(Double.parseDouble(sc.nextLine()));
						System.out.println(persona1);
						break;
					case "II":
						System.out.print("Cuanto dinero quieres sacar:");
						persona1.sacarPasta(Double.parseDouble(sc.nextLine()));
						System.out.println(persona1);
						break;
					case "III":
						System.out.print("Cuanto vamos a subir el sueldo:");
						persona1.subirSueldo(Double.parseDouble(sc.nextLine()));
						System.out.println(persona1);
						break;

					case "IV":
						System.out.println("Detalles de la persona");
						persona1.toString();
						System.out.println(persona1);
						break;

					case "V":
						Menu();
						break;
					}
					

					break;
				} else {
					System.out.println("La persona no esta en la lista");
				}
			case "C":

				int cuentaborrar = 1;
				for (Persona c : personas) {
					System.out.println(cuentaborrar + " " + c);
					cuentaborrar++;
				}

				System.out.print("Que persona quieres borrar: ");
				int persBorrar = Integer.parseInt(sc.nextLine());
				if (persBorrar >= personas.size()) {

					Persona persona2 = personas.remove(persBorrar - 1);
					System.out.print("Has borrado la cuenta de: " + persona2);
				} else {
					System.out.println("La persona no esta en la lista");
				}
				break;

			case "D":
				System.out.println("POR FIN FUERA");
				System.exit(0);
				break;

			default:

			}

			opc = Menu();

		}

	}
}
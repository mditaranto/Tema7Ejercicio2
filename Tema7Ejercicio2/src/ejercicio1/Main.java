package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int cantidad;
		int hora;
		int minuto;
		int segundo;
		int opcion;

		Scanner sca = new Scanner(System.in);

		//Leemos los datos de la hora
		System.out.println("Bienvenido al reloj");
		System.out.println("Introduzca la hora");
		hora = sca.nextInt();
		System.out.println("Los minutos");
		minuto = sca.nextInt();
		System.out.println("Y los segundos");
		segundo = sca.nextInt();
		//Creamos el objeto con los datos anteriormente pedidos
		Hora horas = new Hora(hora, minuto, segundo);

		//Creamos un bucle con un menu
		do {
			System.out.println("[1] Aumentar X segundos a la hora");
			System.out.println("[2] Mostrar la hora");
			System.out.println("[3] Salir");
			opcion = sca.nextInt();
			switch (opcion) {
			case 1 -> {
				//En este caso, llamamos a la funcion y aumentamos "cantidad" veces los segundos
				cantidad = sca.nextInt();
				while (cantidad > 0) {
					horas.incrementaSegundo();
					cantidad--;
				}
			}
			case 2 -> {
				//En este caso imprimimos la hora
				System.out.println(String.format("%02d:%02d:%02d" ,horas.GetHora() , horas.GetMinutos() ,horas.GetSegundos()));
			}
			}

		} while (opcion != 3);
	}

}

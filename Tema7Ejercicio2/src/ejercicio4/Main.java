package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//Creacion del objeto array
		Disco coleccion[] = new Disco[10];

		//Creamos un objeto en cada hueco
		for (int i = 0; i < coleccion.length; i++) {
			coleccion[i] = new Disco();
		}

		int contador = 0;
		int opcion = 0;

		Disco disco = new Disco();
		Scanner sca = new Scanner(System.in);

		do {

			//Mostramos el menu
			disco.menu();

			opcion = sca.nextInt();
			//Mediante un menu
			switch (opcion) {
			case 1 -> {
				//En este caso se imprime los discos a disposicion
				disco.listado(coleccion);
			}
			case 2 -> {
				//En este caso se crea un nuevo disco comprobando que haya hueco libre
				contador = disco.posicionLibre(coleccion);
				if (contador < 0) {
					System.out.println("No hay hueco");
				} else {
					disco.nuevoDisco(coleccion, contador);
				}

			}
			case 3 -> {
				//En este caso modifica un disco elegido
				disco.modifica(coleccion);
			}
			case 4 -> {
				//En este caso borra un disco elegido
				disco.borrarDisco(coleccion);
			}
			}
			//Cuando el usuario inserte 5 se cierra
		} while (opcion != 5);
	}

}

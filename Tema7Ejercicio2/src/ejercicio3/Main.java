package ejercicio3;

public class Main {

	public static void main(String[] args) {

		//Creamos los objetos
		Fecha vacia = new Fecha();
		Fecha compl = new Fecha(31, 12, 2023);
		Fecha error1 = new Fecha(30, 2, 2023);
		Fecha error2 = new Fecha(30, 15, 2023);

		//Imprimimos los objetos
		System.out.println("Fecha vacía: " + vacia);
		System.out.println("Fecha completa: " + compl);
		System.out.println("Fecha errónea: " + error1);
		System.out.println("Fecha errónea2: " + error2);

		//Comprobacion de las fechas
		System.out.println(vacia.fechaCorrecta());
		System.out.println(compl.fechaCorrecta());
		System.out.println(error1.fechaCorrecta());

		//Se suma 1 dia a las fechas
		vacia.diaSiguiente();
		compl.diaSiguiente();
		error1.diaSiguiente();
		//Se imprimen
		System.out.println("Fecha vacía: " + vacia);
		System.out.println("Fecha completa: " + compl);
		System.out.println("Fecha errónea: " + error1);

		//Se comprueba que esten correctas
		System.out.println(vacia.fechaCorrecta());
		System.out.println(compl.fechaCorrecta());
		System.out.println(error1.fechaCorrecta());
	}

}

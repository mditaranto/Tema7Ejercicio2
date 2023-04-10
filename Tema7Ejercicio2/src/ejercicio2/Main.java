package ejercicio2;

public class Main {

	public static void main(String[] args) {
		
		//Creamos un objeto contador con el parametro negativo
		Contador cont1 = new Contador(-1);

		//Imprimimos el valor de su atributo
		System.out.println(	cont1.getCont());
		
		//Incrementamos su valor en 1
		cont1.incrementar();
		
		//Mostramos el resultado
		System.out.println(	cont1.getCont());
		
		//Decrementamos su valor 2 veces en 1
		cont1.decrementar();
		cont1.decrementar();
		
		//Mostramos el resultado
		System.out.println(	cont1.getCont());
	}

}

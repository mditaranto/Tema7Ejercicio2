package ejercicio2;

/**
 * Esta clase llevara un contador
 * @author mditaranto
 *
 */
public class Contador {

	/**
	 * Atributo del contador donde se guardara los valores
	 */
	private int cont;

	/**
	 * Constructor vacio
	 */
	public Contador() {

	}

	/**
	 * Construtor con parametros
	 * @param cont
	 */
	public Contador(int cont) {

		if (cont > 0) {
			this.cont = cont;
		} else {
			this.cont = 0;
		}
	}
	
	/**
	 * Metodo get del contador
	 * @return
	 */
	public int getCont() {
		return cont;
	}

	/**
	 * Metodo set del contador
	 * @param cont
	 */
	public void setCont(int cont) {
		this.cont = cont;
	}

	/**
	 * Metodo copia del contador
	 * @param cont
	 */
	public Contador(Contador cont) {
		this.cont = cont.getCont();
	}
	
	/**
	 * Metodo que incrementa en 1 el contador
	 */
	public void incrementar() {
		cont++;
	}
	
	/**
	 * Metodo que decrementa en 1 el contador
	 */
	public void decrementar() {
		cont--;
		if (cont < 0) {
			cont = 0;
		}
	}

}

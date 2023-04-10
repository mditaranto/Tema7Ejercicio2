package ejercicio1;

/**
 * clase que guarda una hora
 * @author mditaranto
 *
 */
public class Hora {

	/**
	 * Atributo de la hora
	 */
	private int hora;
	/**
	 * Atributo de los minutos
	 */
	private int minutos;
	/**
	 * Atributo de los segundos
	 */
	private int segundos;

	/**
	 * Constructor sin parametros
	 */
	public Hora() {
	}
	
	/**
	 * constructor con parametros
	 * @param hora
	 * @param minutos
	 * @param segundos
	 */
	public Hora(int hora, int minutos, int segundos) {

		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	/**
	 * Metodo set para la hora
	 * @param hora
	 */
	public void SetHora(int hora) {

		if (hora >= 0 && hora < 24) {
			this.hora = hora;
		}
	}

	/**
	 * Metodo set para los minutos
	 * @param minutos
	 */
	public void SetMinutos(int minutos) {

		if (minutos >= 0 && minutos < 60) {
			this.minutos = minutos;
		}
	}

	/**
	 * Metodo set para los segundos
	 * @param segundos
	 */
	public void SetSegundos(int segundos) {

		if (segundos >= 0 && segundos < 60) {
			this.segundos = segundos;
		}
	}

	/**
	 * Metodo get para la hora
	 * @return
	 */
	public int GetHora() {
		return hora;
	}

	/**
	 * Metodo get para los minutos
	 * @return
	 */
	public int GetMinutos() {
		return minutos;
	}

	/**
	 * Metodo get para los segundos
	 * @return
	 */
	public int GetSegundos() {
		return segundos;
	}

	/**
	 * Este metodo aumenta en 1 a los segundos y comprueba que tenga el formato correcto de hora
	 */
	public void incrementaSegundo() {
		segundos++;

		if (segundos == 60) {
			segundos = 0;
			minutos++;
			if (minutos == 60) {
				minutos = 0;
				hora++;
				if (hora == 24) {
					hora = 0;
				}
			}
		}
	}

}

package ejercicio3;

public class Fecha {
	/**
	 * Se guardará el número de día
	 */
	private int dia = 1;
	/**
	 * Se guardará el número de mes
	 */
	private int mes = 1;
	/**
	 * Se guardará el número de año
	 */
	private int año = 1970;

	/**
	 * Constructor sin parámetros
	 */
	public Fecha() {
		super();
	}

	/**
	 * Constructor con parámetros
	 *
	 * @param dia
	 * @param mes
	 * @param año
	 */
	public Fecha(int dia, int mes, int año) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	/**
	 * Método que coge el número de día
	 *
	 * @return Devuelve el valor de día
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * Método que actualizará los valores de dia
	 *
	 * @param dia
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}

	/**
	 * Método que cogerá el valor de Mes
	 *
	 * @return Devuelve el valor de mes
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * Método que actualiza el valor de mes
	 *
	 * @param mes
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}

	/**
	 * Método que obtiene el valor de año
	 *
	 * @return Devuelve el valor de año
	 */
	public int getAño() {
		return año;
	}

	/**
	 * Método que actualiza el valor de año
	 *
	 * @param año
	 */
	public void setAño(int año) {
		this.año = año;
	}

	/**
	 * Método que comprueba que el año es bisiesto
	 *
	 * @return Devuelve true en caso de que sea bisiesto, o false en caso contrario
	 */
	private boolean esBisiesto() {
		boolean result = false;// Se guardará el resultado
		// Si el módulo del año es igual a 4
		if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) {
			// Return será true, ya que se tratará de un año bisiesto
			result = true;
		}
		// Devolvemos result
		return result;
	}

	/**
	 * Método que comprueba si la fecha introducida es correcta
	 *
	 * @return Devuelve true en caso de que sea correcta, o false, en caso contrario
	 */
	public boolean fechaCorrecta() {
		boolean result = false;// Se guardará el result
		// Creamos un switch donde tendrá como variable a comparar el mes
		switch (mes) {
		// En los casos 1,3,5,7,8,10,12
		case 1, 3, 5, 7, 8, 10, 12:
			// Serán los meses que acaban en 31, veríficamos que están en ese rango
			if (dia > 0 && dia < 32) {
				// Si es así se volverá true
				result = true;
			}
			break;
		// En el caso 2, o en el mes de febrero
		case 2:
			// Si esBisiesto es true y dia es menor a 30
			if (esBisiesto() && dia < 30) {
				// Result es igual a true
				result = true;

				// En caso contrario, si dia es mayor que cero y menor que 29
			} else if (dia > 0 && dia < 29) {
				// Result es igual a true
				result = true;
			}
			break;
		// En los casos en el que el mes sea 4,6,9,11
		case 4, 6, 9, 11:
			// Si es mayor que cero y mayor que 31
			if (dia > 0 && dia < 31) {
				// Result es igual a true
				result = true;
			}
			break;
		}
		// Devolvemos el resultado
		return result;
	}

	/**
	 * Método que suma 1 dia y comprueba que esté correcta
	 */
	public void diaSiguiente() {
		// Sumamos 1 a dia
		dia++;
		// Comprobamos que la fecha sea correcta
		fechaCorrecta();
		// Creamos el switch con el valor de entrada mes
		switch (mes) {
		// En los casos 1,3,5,7,8,10,12
		case 1, 3, 5, 7, 8, 10, 12:
			// Si dia es igual a 32
			if (dia == 32) {
				// Dia se restablece a 1
				dia = 1;
				// Y se suma un mes
				mes++;
				// Si mes llega a 12
				if (mes == 13) {
					// Se sumará un año
					año++;
					// Y mes se restablecerá a 1
					mes = 1;
				}
			}
			// En el caso 2
		case 2:
			// Si el año es bisiesto
			if (esBisiesto()) {
				// Si dia es igual a 30
				if (dia == 30) {
					// Dia se restablece a 1
					dia = 1;
					// Y mes se sumará 1
					mes++;
				}
				// En en caso de que dia se igual a 29
			} else if (dia == 29) {
				// dia se restablece a 1
				dia = 1;
				// Y se suma un mes
				mes++;
			}
			// En los casos 4,6,9,11
		case 4, 6, 9, 11:
			// Si dia es igual a 31
			if (dia == 31) {
				// Se restablece dia a 1
				dia = 1;
				// Y se suma 1 a mes
				mes++;
			}
		}
	}

	/**
	 * Método que mostrará la fecha
	 */
	public String toString() {
		String result = "";
		if (dia < 10) {
			result = "0" + dia + "-" + mes + "-" + año;
		}

		if (mes < 10) {
			result = dia + "-" + "0" + mes + "-" + año;
		}

		if (dia < 10 && mes < 10) {
			result = "0" + dia + "-" + "0" + mes + "-" + año;
		}

		if (dia > 9 && mes > 9) {
			result = dia + "-" + mes + "-" + año;
		}

		return result;
	}
}

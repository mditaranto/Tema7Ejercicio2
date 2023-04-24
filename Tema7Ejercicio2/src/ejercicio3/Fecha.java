package ejercicio3;

/**
 * Clase que funciona como fecha
 * @author mditaranto
 *
 */
public class Fecha {
	/**
	 * Atributo que guarda el valor del dia
	 */
	private int dia = 1;
	
	/**
	 * Atributo que guarda el valor del mes
	 */
	private int mes = 1;
	
	/**
	 * Atributo que guarda el valor del año
	 */
	private int año = 1970;

	/**
	 * Constructor sin parametros
	 */
	public Fecha() {

	}

	/**
	 * Constructor con parametros
	 * @param dia
	 * @param mes
	 * @param año
	 */
	public Fecha(int dia, int mes, int año) {
		if (dia >= 1 && dia <= 31) {
			this.dia = dia;
		}
		if (mes >= 1 && mes <= 12) {
			this.mes = mes;
		}
		this.año = año;
	}

	/**
	 * @return the dia
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * @param dia the dia to set
	 */
	public void setDia(int dia) {
		if (dia >= 1 && dia <= 31) {
			this.dia = dia;
		}
	}

	/**
	 * @return the mes
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * @param mes the mes to set
	 */
	public void setMes(int mes) {
		if (mes >= 1 && mes <= 12) {
			this.mes = mes;
		}
	}

	/**
	 * @return the año
	 */
	public int getAño() {
		return año;
	}

	/**
	 * @param año the año to set
	 */
	public void setAño(int año) {
		this.año = año;
	}

	/**
	 * Metodo que comprueba si el año es bisiesto
	 * @return
	 */
	private boolean esBisiesto() {
		boolean bisiesto = false;

		if (this.año % 4 == 0 && (this.año % 100 != 0 || this.año % 400 == 0)) {
			bisiesto = true;
		}
		return bisiesto;
	}

	/**
	 * Metodo que comprueba si la fecha es correcta
	 * @return
	 */
	public boolean fechaCorrecta() {
		boolean correcta = false;
		switch (mes) {
		case 2:
			if ((esBisiesto() && dia <= 29) || (!esBisiesto()) && dia <= 28) {
				correcta = true;
			}
			break;
		case 4, 6, 9, 11:
			if (dia <= 30) {
				correcta = true;
			}
			break;
		case 1, 3, 5, 7, 8, 10, 12:
			correcta = true;
			break;
		}

		return correcta;
	}

	/**
	 * Metodo que suba 1 dia a la fecha
	 */
	public void diaSiguiente() {
		dia++;
		switch (mes) {
		case 2:
			if ((esBisiesto() && dia > 29) || (!esBisiesto()) && dia > 28) {
				dia = 1;
				mes++;
			}
			break;
		case 4, 6, 9, 11:
			if (dia > 30) {
				dia = 1;
				mes++;
			}
			break;
		case 1, 3, 5, 7, 8, 10:
			if (dia > 31) {
				dia = 1;
				mes++;
			}
			break;
		case 12:
			if (dia > 31) {
				dia = 1;
				mes = 1;
				año++;
			}
		}
	}

	/**
	 * Metodo que imprime la informacion del objeto
	 */
	public String toString() {
		String res = "";
		if (dia <= 9) {
			res += "0";
		}
		res += dia + "-";

		if (mes <= 9) {
			res += "0";
		}
		res += mes + "-" + año;

		return res;
	}

}

package ejercicio4;

import java.util.Scanner;


/**
 * Clase que guarda el objeto disco
 * @author mditaranto
 * 
 */
public class Disco {

	/**
	 * Atributo que guarda el codigo del disco
	 */
	private String codigo = "LIBRE";
	/**
	 * Atributo que guarda el autor del disco
	 */
	private String autor = "";
	/**
	 * Atributo que guarda el titulo del disco
	 */
	private String titulo = "";
	/**
	 * Atributo que guarda el genero del disco
	 */
	private String genero = "";
	/**
	 * Atributo que guarda la duracion del disco
	 */
	private int duracion;

	private static Scanner sca = new Scanner(System.in);

	/**
	 * Constructor vacio
	 */
	public Disco() {

	}

	/**
	 * Constructor con parametros
	 * @param codigo codigo del disco
	 * @param autor autor del disco	
	 * @param titulo titulo del disco
	 * @param genero genero del disco
	 * @param duracion duracion del disco
	 */
	public Disco(String codigo, String autor, String titulo, String genero, int duracion) {

		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
	}

	/**
	 * Getteer del codigo
	 * @return
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * Setter del codigo
	 * @param codigo
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * Getter del autor
	 * @return
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Setter del autor
	 * @param autor
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * Getter del titulo
	 * @return
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Setter del titulo
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Getter del genero
	 * @return
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * Setter del genero
	 * @param genero
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * Getter de la duracion
	 * @return
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * Setter de la duracion
	 * @param duracion
	 */
	public void setDuracion(int duracion) {
		if (duracion > 0) {
			this.duracion = duracion;
		}
	}

	/**
	 * Constructor copia
	 * @param disco
	 */
	public Disco(Disco disco) {

		this.codigo = disco.codigo;
		this.autor = disco.autor;
		this.titulo = disco.titulo;
		this.genero = disco.genero;
		this.duracion = disco.duracion;
	}

	/**
	 * ToString del objeto
	 */
	public String toString() {
		return "Disco [codigo=" + codigo + ", autor=" + autor + ", titulo=" + titulo + ", genero=" + genero
				+ ", duracion=" + duracion + "]";
	}

	/**
	 * Metodo que imprime el menu de opciones
	 */
	public void menu() {

		System.out.println("COLECCION DE DISCOS");
		System.out.println("===================");
		System.out.println("[1] Listado");
		System.out.println("[2] Nuevo Disco");
		System.out.println("[3] Modificar");
		System.out.println("[4] Borrar");
		System.out.println("[5] Salir");
	}

	/**
	 * Metodo que muestra los discos de la coleccion
	 * @param array array de la coleccion de discos
	 */
	public void listado(Disco[] array) {

		for (int i = 0; i < array.length; i++) {
			if (!array[i].getCodigo().equals("LIBRE")) {
				System.out.println(array[i].toString());
			}
		}
	}

	/**
	 * metodo para crear un nuevo disco
	 * @param array array de la coleccion de discos
	 * @param contador posicion del disco dentro del array
	 */
	public void nuevoDisco(Disco[] array, int contador) {

		String codigo, autor, titulo, genero;
		int duracion;

		codigo = String.valueOf(contador);

		System.out.println("Introduzca un titulo al disco: ");
		titulo = sca.nextLine();

		System.out.println("Introduzca un autor al disco");
		autor = sca.nextLine();

		System.out.println("Introduzca un genero al disco");
		genero = sca.nextLine();

		System.out.println("Introduzca una duracion al disco");
		duracion = sca.nextInt();
		sca.nextLine();

		array[contador] = new Disco(codigo, autor, titulo, genero, duracion);

	}

	/**
	 * Metodo que devuelve la posicion libre disponible
	 * @param array array de la coleccion de discos
	 * @return la posicion libre
	 */
	public int posicionLibre(Disco[] array) {
		int posicion = 0;
		while (posicion < array.length && !array[posicion].getCodigo().equals("LIBRE")) {
			posicion++;
		}

		if (posicion == array.length) {
			posicion = -1;
		}

		return posicion;
	}

	/**
	 * Metodo que modifica un disco
	 * @param array array de la coleccion de discos
	 */
	public void modifica(Disco[] array) {

		String autor, titulo, genero;
		int duracion, codigo;

		System.out.println("Introduzca el codigo del disco");
		codigo = sca.nextInt();
		sca.nextLine();

		if (!array[codigo].getCodigo().equals("LIBRE")) {
			
			System.out.println("Introduzca un titulo al disco: ");
			array[codigo].setTitulo(sca.nextLine());

			System.out.println("Introduzca un autor al disco");
			array[codigo].setAutor(sca.nextLine());

			System.out.println("Introduzca un genero al disco");
			array[codigo].setGenero(sca.nextLine());

			System.out.println("Introduzca una duracion al disco");
			array[codigo].setDuracion(sca.nextInt());
		} else {
			System.out.println("No hay discos con ese codigo");
		}
	}

	/**
	 * Metodo que borra un disco de la coleccion
	 * @param array
	 */
	public void borrarDisco(Disco[] array) {

		int codigo;

		System.out.println("Introduzca el codigo del disco");
		codigo = sca.nextInt();
		sca.nextLine();

		array[codigo].codigo = "LIBRE";
	}

}

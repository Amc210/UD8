package Ejercicio4;

public class Ejercicio4App {

	public static void main(String[] args) {
		//declaramos los ejemplos
		Serie ejemplo1 = new Serie ("doraemon", 4, false, "comico", " Fujiko F. Fujio");
		Serie ejemplo2 = new Serie ();
		Serie ejemplo3 = new Serie ("Shin Chan", " Yoshito Usui");
		
		//mostramos
		System.out.println("Ejemplo 1: " + ejemplo1.toString());
		System.out.println("Ejemplo 2: " + ejemplo2.toString());
		System.out.println("Ejemplo 3: " + ejemplo3.toString());
	}

}

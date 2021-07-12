package Ejercicio3;

public class Ejercicio3App {

	public static void main(String[] args) {
		//llamamos a electrodomestico
		Electrodomestico ejemplo1 = new Electrodomestico (150,"negro","a",100);
		Electrodomestico ejemplo2 = new Electrodomestico ();
		Electrodomestico ejemplo3 = new Electrodomestico (100, 500);
		Electrodomestico ejemplo4 = new Electrodomestico (550,"morado","e",140);
		
		//Getts de prueba
		System.out.println("Ejemplo 1: " + ejemplo1.getConsumo());
		System.out.println("Ejemplo 2: " + ejemplo2.getColor());
		System.out.println("Ejemplo 3: " + ejemplo3.getPrecioBase());
		System.out.println("Ejemplo 4: " + ejemplo4.getColor());
	}

}

package Ejercicio2;

public class Ejercicio2App {

	public static void main(String[] args) {
		//LLamamos a password
		Password contra1 = new Password();
		Password contra2 = new Password(4);
		
		//Mostramos las contrase�as generadas
		System.out.println(contra1.getContrase�a());
		System.out.println(contra2.getContrase�a());
	}

}

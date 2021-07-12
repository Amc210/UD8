package Ejercicio2;

public class Ejercicio2App {

	public static void main(String[] args) {
		//LLamamos a password
		Password contra1 = new Password(); //Valores por defecto
		Password contra2 = new Password(4);
		
		//Mostramos las contraseñas generadas
		System.out.println(contra1.toString()); //Valores por defecto
		System.out.println(contra2.toString());
	}

}

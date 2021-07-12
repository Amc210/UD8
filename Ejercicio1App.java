
public class Ejercicio1App {

	public static void main(String[] args) {
		//Declaramos los ejemplos
		Persona persona1 = new Persona("Carla", 21, "39548915U", "M", 49.50, 1.59);
		Persona persona2 = new Persona("Juan", 41, "48268969H", "H", 60.95, 1.90);
		Persona persona3 = new Persona();
		
		//Persona1 llamamos con los gets
		System.out.println(persona1.getNom());
		System.out.println(persona1.getEdat());
		System.out.println(persona1.getNif());
		System.out.println(persona2.getSexo());
		System.out.println(persona1.getPeso());
		System.out.println(persona1.getAltura());
		
		System.out.println("-----------------");
		//Persona 2 llamamos con los gets
		System.out.println(persona2.getNom());
		System.out.println(persona2.getEdat());
		System.out.println(persona2.getNif());
		System.out.println(persona2.getSexo());
		System.out.println(persona2.getPeso());
		System.out.println(persona2.getAltura());
		
		System.out.println("-----------------");
		//Persona 3 llamamos a los valores por defecto
		System.out.println(persona3.getNom());
		System.out.println(persona3.getEdat());
		System.out.println(persona3.getNif());
		System.out.println(persona3.getSexo());
		System.out.println(persona3.getPeso());
		System.out.println(persona3.getAltura());
	}

}

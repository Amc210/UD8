package Ejercicio2;

public class Password {
		private int longitud;
		private String contrase�a;
		
		//Contructor con valores por defecto
		public Password() {
			this.longitud = 8;
			this.contrase�a = generarContrase�a(longitud);
		}
		
		//Contructor 
		public Password(int longitud) {
			this.longitud = longitud;
			this.contrase�a = generarContrase�a(longitud);
		}
		
		//toString
		@Override
		public String toString() {
			return "longitud = " + longitud + ", contrase�a = " + contrase�a;
		}

		//Metodo para generar contrase�a aleatoria
		public String generarContrase�a(int longitud) {
			String contrase�a = "";
			int ran;
			char car;
			
			//Creamos la contrase�a
			for (int i = 0; i < longitud; i++) {
				//Generamos un numero del 1 al 200 me ha explicado adrian como hacerlo
				ran = (int) (Math.random()*300)+1;
				car = (char) ran;
				contrase�a += car;
			}
			
			return contrase�a;
		}
		
		//Getts y setts
		public int getLongitud() {
			return longitud;
		}

		public void setLongitud(int longitud) {
			this.longitud = longitud;
		}

		public String getContrase�a() {
			return contrase�a;
		}

		public void setContrase�a(String contrase�a) {
			this.contrase�a = contrase�a;
		}
		
	
}
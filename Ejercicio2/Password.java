package Ejercicio2;

public class Password {
		private int longitud;
		private String contraseña;
		
		//Contructor con valores por defecto
		public Password() {
			this.longitud = 8;
			this.contraseña = generarContraseña(longitud);
		}
		
		//Contructor 
		public Password(int longitud) {
			this.longitud = longitud;
			this.contraseña = generarContraseña(longitud);
		}
		
		//toString
		@Override
		public String toString() {
			return "longitud = " + longitud + ", contraseña = " + contraseña;
		}

		//Metodo para generar contraseña aleatoria
		public String generarContraseña(int longitud) {
			String contraseña = "";
			int ran;
			char car;
			
			//Creamos la contraseña
			for (int i = 0; i < longitud; i++) {
				//Generamos un numero del 1 al 200 me ha explicado adrian como hacerlo
				ran = (int) (Math.random()*300)+1;
				car = (char) ran;
				contraseña += car;
			}
			
			return contraseña;
		}
		
		//Getts y setts
		public int getLongitud() {
			return longitud;
		}

		public void setLongitud(int longitud) {
			this.longitud = longitud;
		}

		public String getContraseña() {
			return contraseña;
		}

		public void setContraseña(String contraseña) {
			this.contraseña = contraseña;
		}
		
	
}
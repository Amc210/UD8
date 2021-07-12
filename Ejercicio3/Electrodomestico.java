package Ejercicio3;

public class Electrodomestico {
	//atrubutos
	private double precioBase;
	private String color;
	private String consumo;
	private double peso;
	
	//CONTANTES
	final String COLOR = "blanco";
	final String CONSUMO = "f";
	final double PESO = 5;
	final double PRECIO = 100;
	
	//Constructor con atributos
	public Electrodomestico(double precioBase, String color, String consumo, double peso) {
		super();
		this.precioBase = precioBase;
		this.color = comprovarColor (color);
		this.consumo = comprovarLetra (consumo);
		this.peso = peso;
	}
	
	//Constructores con precio y peso el resto por defecto
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.color = COLOR;
		this.consumo = CONSUMO;
		this.peso = peso;
	}
	
	//constructor valores por defecto
	public Electrodomestico() {
		this.precioBase = PRECIO;
		this.color = COLOR;
		this.consumo = CONSUMO;
		this.peso = PESO;
	}
	
	//toString
	@Override
	public String toString() {
		return "precioBase = " + precioBase + ", color = " + color + ", consumo = " + consumo + ", peso = "
				+ peso;
	}

	//Comprovamos las opciones de color
	public static String comprovarColor (String color) {
		color = color.toLowerCase();
		String colorSeguro;
		switch (color) {
		case "blanco":
			colorSeguro = "blanco";
			break;
		case "negro":
			colorSeguro = "negro";
			break;
		case "rojo":
			colorSeguro = "rojo";
			break;
		case "azul":
			colorSeguro = "azul";
			break;	
		case "gris":
			colorSeguro = "gris";
			break;
		default: 
			colorSeguro = "blanco";
			break;
		}
		return colorSeguro;
	}
	
	//Comprovamos las opciones de la letra
	public static String comprovarLetra (String consumo) {
		consumo = consumo.toLowerCase();
		String consumoSeguro;
		
		switch (consumo) {
		case "a":
			consumoSeguro = "a";
			break;
		case "b":
			consumoSeguro = "b";
			break;
		case "c":
			consumoSeguro = "c";
			break;
		case "d":
			consumoSeguro = "d";
			break;	
		case "e":
			consumoSeguro = "e";
			break;
		case "f":
			consumoSeguro = "f";
			break;
		default: 
			consumoSeguro = "a";
			break;
		}
		return consumoSeguro;
	}
	
	//Getts y setts
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getConsumo() {
		return consumo;
	}

	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}

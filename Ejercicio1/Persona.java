
public class Persona {
	private String nom;
	private int edat;
	private String nif;
	private String sexo;
	private double peso;
	private double altura;
	
	//Constante
	final String SEXO = "H";
	
	//Constructor defecto
	public Persona() {
		this.nom = " ";
		this.edat = 0;
		this.sexo = SEXO;
		this.peso = 0.0;
		this.altura = 0.0;
	}
	//Constructos pasando los datos
	public Persona(String nom, int edat, String nif, String sexo, double peso, double altura) {
		this.nom = nom;
		this.edat = edat;
		this.nif = nif;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	//Gets i sets
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getEdat() {
		return edat;
	}
	public void setEdat(int edat) {
		this.edat = edat;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}

package Ejercicio4;

public class Serie {
	//atributos
	private String titulo;
	private int nTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	//Contructor con atributos
	public Serie(String titulo, int nTemporadas, boolean entregado, String genero, String creador) {
		this.titulo = titulo;
		this.nTemporadas = nTemporadas;
		this.entregado = entregado;
		this.genero = genero;
		this.creador = creador;
	}
	//Contructor valores por defecto
	public Serie() {
		this.titulo = "las chicas gilmore";
		this.nTemporadas = 3;
		this.entregado = false;
		this.genero = "fantasia";
		this.creador = "amy sherman-palladino";
	}
	
	//Contructor valores por defecto menos titulo y creador
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.nTemporadas = 3;
		this.entregado = false;
		this.genero = "fantasia";
		this.creador = creador;
	}
	
	//Getters y setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getnTemporadas() {
		return nTemporadas;
	}
	public void setnTemporadas(int nTemporadas) {
		this.nTemporadas = nTemporadas;
	}
	public boolean isEntregado() {
		return entregado;
	}
	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	
	
}

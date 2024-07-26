package Dominio;

public abstract class Profecionistas {
	//Atributos
	Long cedula;
	String titulo;
	
	public Profecionistas(Long cedula, String titulo) {
		this.cedula = cedula;
		this.titulo = titulo;
	}

	public Long getCedula() {
		return cedula;
	}

	public void setCedula(Long cedula) {
		this.cedula = cedula;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	
}

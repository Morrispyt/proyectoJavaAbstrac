package Dominio;

public class LicInformatica extends Profecionistas {
	String pc;
	String lenguajesProg;
	
	
	
	public LicInformatica(Long cedula, String titulo, String pc, String lenguajesProg) {
		super(cedula, titulo);
		this.pc = pc;
		this.lenguajesProg = lenguajesProg;
	}



	@Override
	public String toString() {
		return "LicInformatica [cedula=" + cedula + ", titulo=" + titulo + ", pc=" + pc + ", lenguajesProg="
				+ lenguajesProg + "]\n";
	}

	public String getPc() {
		return pc;
	}

	public void setPc(String pc) {
		this.pc = pc;
	}

	public String getLenguajesProg() {
		return lenguajesProg;
	}

	public void setLenguajesProg(String lenguajesProg) {
		this.lenguajesProg = lenguajesProg;
	}
	
	
}

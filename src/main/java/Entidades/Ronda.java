package Entidades;

public class Ronda {
	private int nro;
	private int partido;
	private int puntos;

	public Ronda() {
		super();
	}

	public Ronda(int nro, int partido, int puntos) {
		super();
		this.nro = nro;
		this.partido = partido;
		this.puntos = puntos;
	}

	@Override
	public String toString() {
		return "Ronda [nro=" + nro + ", partido=" + partido + ", puntos=" + puntos + "]";
	}

	public int getNro() {
		return nro;
	}

	public void setNro(int nro) {
		this.nro = nro;
	}

	public int getPartido() {
		return partido;
	}

	public void setPartido(int partido) {
		this.partido = partido;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

}

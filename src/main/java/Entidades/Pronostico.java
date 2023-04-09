package Entidades;

public class Pronostico {
	private int partido;
	private int equipo;
	private int resultado;
	private int puntos;

	public Pronostico() {
		super();
	}

	public Pronostico(int partido, int equipo, int resultado, int puntos) {
		super();
		this.partido = partido;
		this.equipo = equipo;
		this.resultado = resultado;
		this.puntos = puntos;
	}

	@Override
	public String toString() {
		return "Pronostico [partido=" + partido + ", equipo=" + equipo + ", resultado=" + resultado + ", puntos="
				+ puntos + "]";
	}

	public int getPartido() {
		return partido;
	}

	public void setPartido(int partido) {
		this.partido = partido;
	}

	public int getEquipo() {
		return equipo;
	}

	public void setEquipo(int equipo) {
		this.equipo = equipo;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

}

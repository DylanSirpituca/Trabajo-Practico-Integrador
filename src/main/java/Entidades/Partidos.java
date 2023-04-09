package Entidades;

public class Partidos {
	private int numPartido;
	private int equipo1;
	private int equipo2;
	private int golesEquipo1;
	private int golesEquipo2;

	public Partidos() {
		super();
	}

	public Partidos(int numPartido, int equipo1, int equipo2, int golesEquipo1, int golesEquipo2) {
		super();
		this.numPartido = numPartido;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.golesEquipo1 = golesEquipo1;
		this.golesEquipo2 = golesEquipo2;
	}

	@Override
	public String toString() {
		return "Partidos [numPartido=" + numPartido + ", equipo1=" + equipo1 + ", equipo2=" + equipo2
				+ ", golesEquipo1=" + golesEquipo1 + ", golesEquipo2=" + golesEquipo2 + "]";
	}

	public int getNumPartido() {
		return numPartido;
	}

	public void setNumPartido(int numPartido) {
		this.numPartido = numPartido;
	}

	public int getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(int equipo1) {
		this.equipo1 = equipo1;
	}

	public int getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(int equipo2) {
		this.equipo2 = equipo2;
	}

	public int getGolesEquipo1() {
		return golesEquipo1;
	}

	public void setGolesEquipo1(int golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}

	public int getGolesEquipo2() {
		return golesEquipo2;
	}

	public void setGolesEquipo2(int golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}

}

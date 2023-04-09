package Entidades;

public class ResultadoEnum {
	private boolean ganador;
	private boolean perdedor;
	private boolean empate;

	public ResultadoEnum() {
		super();
	}

	public ResultadoEnum(boolean ganador, boolean perdedor, boolean empate) {
		super();
		this.ganador = ganador;
		this.perdedor = perdedor;
		this.empate = empate;
	}

	@Override
	public String toString() {
		return "ResultadoEnum [ganador=" + ganador + ", perdedor=" + perdedor + ", empate=" + empate + "]";
	}

	public boolean isGanador() {
		return ganador;
	}

	public void setGanador(boolean ganador) {
		this.ganador = ganador;
	}

	public boolean isPerdedor() {
		return perdedor;
	}

	public void setPerdedor(boolean perdedor) {
		this.perdedor = perdedor;
	}

	public boolean isEmpate() {
		return empate;
	}

	public void setEmpate(boolean empate) {
		this.empate = empate;
	}

}

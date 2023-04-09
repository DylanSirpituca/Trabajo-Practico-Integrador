package Entidades;

public class Equipos {
	int id_equipo;
	String nombre;
	String descripcion;

	public Equipos() {
		super();
	}

	public Equipos(int id_equipo, String nombre, String descripcion) {
		super();
		this.id_equipo = id_equipo;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Equipos [id_equipo=" + id_equipo + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}

	public int getId_equipo() {
		return id_equipo;
	}

	public void setId_equipo(int id_equipo) {
		this.id_equipo = id_equipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}

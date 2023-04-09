package Implementaciones;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import Coneccion.ExcepcionConnection;
import Entidades.Partidos;

public class PartidoImplementacion extends ImplementacionGenerica<Partidos, String> {

	public PartidoImplementacion(Connection conexion) throws ExcepcionConnection {
		super(conexion);
		// TODO Auto-generated constructor stub
	}

	public Partidos buscarPorClavePrimaria(int i) {
		return null;
	}

	public boolean guardar(Partidos partidos) {
		if (partidos == null) {
			return false;
		}
		String query = "insert into partidos (numPartido, equipo1, equipo2, golesEquipo1, golesEquipo2) values (?,?,?,?,?);";
		try {
			if (preparedStatementInsertar == null) {
				preparedStatementInsertar = conexion.prepareStatement(query);
			}
			preparedStatementInsertar.setInt(1, partidos.getNumPartido());
			preparedStatementInsertar.setInt(2, partidos.getEquipo1());
			preparedStatementInsertar.setInt(3, partidos.getEquipo2());
			preparedStatementInsertar.setInt(4, partidos.getGolesEquipo1());
			preparedStatementInsertar.setInt(5, partidos.getGolesEquipo2());

			return preparedStatementInsertar.executeUpdate() == 1;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	public Partidos buscarPorClavePrimaria(String k) {
		return null;
	}

	public boolean eliminar(Partidos e) {
		return false;
	}

	public boolean mostrar(Partidos e) {
		return false;
	}

	public List<Partidos> listar() {
		return null;
	}

	protected boolean insertar() {
		return false;
	}

	protected boolean actualizar() {
		return false;
	}

}

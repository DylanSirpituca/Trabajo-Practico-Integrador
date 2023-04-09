package Implementaciones;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import Coneccion.ExcepcionConnection;
import Entidades.Ronda;

public class RondaImplementacion extends ImplementacionGenerica<Ronda, String> {

	public RondaImplementacion(Connection conexion) throws ExcepcionConnection {
		super(conexion);
	}

	public Ronda buscarPorClavePrimaria(int i) {
		return null;
	}

	public boolean guardar(Ronda ronda) {
		if (ronda == null) {
			return false;
		}
		String query = "insert into ronda (nro, partido, puntos) values (?,?,?);";
		try {
			if (preparedStatementInsertar == null) {
				preparedStatementInsertar = conexion.prepareStatement(query);
			}
			preparedStatementInsertar.setInt(1, ronda.getNro());
			preparedStatementInsertar.setInt(2, ronda.getPartido());
			preparedStatementInsertar.setInt(3, ronda.getPuntos());

			return preparedStatementInsertar.executeUpdate() == 1;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public Ronda buscarPorClavePrimaria(String k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminar(Ronda e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mostrar(Ronda e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Ronda> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected boolean insertar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean actualizar() {
		// TODO Auto-generated method stub
		return false;
	}
}

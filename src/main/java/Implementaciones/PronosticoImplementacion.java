package Implementaciones;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import Conexion.ExcepcionConnection;
import Entidades.Pronostico;

public class PronosticoImplementacion extends ImplementacionGenerica<Pronostico, String> {

	public PronosticoImplementacion(Connection conexion) throws ExcepcionConnection {
		super(conexion);
	}

	public Pronostico buscarPorClavePrimaria(int i) {
		return null;
	}

	public boolean guardar(Pronostico pronostico) {
		if (pronostico == null) {
			return false;
		}
		String query = "insert into pronostico (Partido, Equipo, Resultado, Puntos) values (?,?,?,?);";
		try {
			if (preparedStatementInsertar == null) {
				preparedStatementInsertar = conexion.prepareStatement(query);
			}
			preparedStatementInsertar.setInt(1, pronostico.getPartido());
			preparedStatementInsertar.setInt(2, pronostico.getEquipo());
			preparedStatementInsertar.setInt(3, pronostico.getResultado());
			preparedStatementInsertar.setInt(4, pronostico.getPuntos());

			return preparedStatementInsertar.executeUpdate() == 1;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public Pronostico buscarPorClavePrimaria(String k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminar(Pronostico e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mostrar(Pronostico e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Pronostico> listar() {
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

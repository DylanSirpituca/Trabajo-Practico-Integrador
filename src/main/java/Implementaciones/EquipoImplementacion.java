package Implementaciones;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import Coneccion.ExcepcionConnection;
import Entidades.Equipos;

public class EquipoImplementacion extends ImplementacionGenerica<Equipos, String> {

	public EquipoImplementacion(Connection conexion) throws ExcepcionConnection {
		super(conexion);
	}

	public Equipos buscarPorClavePrimaria(int i) {
		return null;
	}

	public boolean guardar(Equipos equipos) {
		if (equipos == null) {
			return false;
		}
		String query = "insert into equipos (id_equipo, nombre, descripcion) values (?,?,?);";
		try {
			if (preparedStatementInsertar == null) {
				preparedStatementInsertar = conexion.prepareStatement(query);
			}
			preparedStatementInsertar.setInt(1, equipos.getId_equipo());
			preparedStatementInsertar.setString(2, equipos.getNombre());
			preparedStatementInsertar.setString(3, equipos.getDescripcion());

			return preparedStatementInsertar.executeUpdate() == 1;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public Equipos buscarPorClavePrimaria(String k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminar(Equipos e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mostrar(Equipos e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Equipos> listar() {
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

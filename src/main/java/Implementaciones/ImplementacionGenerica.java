package Implementaciones;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Conexion.DAO;
import Conexion.ExcepcionConnection;

public abstract class ImplementacionGenerica<E, K> implements DAO<E, K> {
	protected PreparedStatement preparedStatementBuscarPorClavePrimaria;
	protected PreparedStatement preparedStatementInsertar;
	protected PreparedStatement preparedStatementEliminar;
	protected PreparedStatement preparedStatementActualizar;
	protected PreparedStatement preparedStatementListar;
	protected PreparedStatement preparedStatementMostrar;
	protected Connection conexion;

	public ImplementacionGenerica(Connection conexion) throws ExcepcionConnection {
		if (conexion == null) {
			throw new ExcepcionConnection("no puedes implementar sin una conexion");
		}

		this.conexion = conexion;

	}

	protected abstract boolean insertar();

	protected abstract boolean actualizar();

}
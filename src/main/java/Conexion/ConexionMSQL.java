package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMSQL {
	private Connection conexion;
	private static ConexionMSQL conexionMSQL;

	private ConexionMSQL() {
		super();
		setConexion();
	}

	public static ConexionMSQL getConeccionMSQL() {
		if (conexionMSQL == null) {
			System.out.println("Estoy en null por instanciar la primera vez");
			conexionMSQL = new ConexionMSQL();
		}

		System.out.println(conexionMSQL);
		return conexionMSQL;
	}

	public Connection getConexion() {
		return conexion;
	}

	private void setConexion() {
		String url = "jdbc:mariadb://localhost:3306/Base_de_datos";
		String usuario = "root";
		String clave = "";
		String driver = "org.mariadb.jdbc.Driver";

		try {
			Class.forName(driver);
			conexion = DriverManager.getConnection(url, usuario, clave);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

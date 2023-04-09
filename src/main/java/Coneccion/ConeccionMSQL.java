package Coneccion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConeccionMSQL {
	private Connection conexion;
	private static ConeccionMSQL coneccionMSQL;

	private ConeccionMSQL() {
		super();
		setConexion();
	}

	public static ConeccionMSQL getConeccionMSQL() {
		if (coneccionMSQL == null) {
			System.out.println("Estoy en null por instanciar la primera vez");
			coneccionMSQL = new ConeccionMSQL();
		}

		System.out.println(coneccionMSQL);
		return coneccionMSQL;
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

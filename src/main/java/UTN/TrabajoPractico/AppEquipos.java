package UTN.TrabajoPractico;

import javax.swing.JOptionPane;

import Conexion.ConexionMSQL;
import Conexion.ExcepcionConnection;
import Entidades.Equipos;
import Implementaciones.EquipoImplementacion;

public class AppEquipos {
	public static void main(String[] args) throws InterruptedException {
		ConexionMSQL conexionMSQL = ConexionMSQL.getConeccionMSQL();

		EquipoImplementacion equipoImplementacion = null;
		try {
			equipoImplementacion = new EquipoImplementacion(conexionMSQL.getConexion());
		} catch (ExcepcionConnection e) {
			e.printStackTrace();
		}

		Equipos[] equipos;
		int cantidadE = Integer.valueOf(JOptionPane.showInputDialog("cuantos Equipos va a ingresar"));

		equipos = new Equipos[cantidadE];

		for (int i = 0; i < equipos.length; i++) {
			Equipos equipo = new Equipos();
			equipo.setId_equipo(i + 1);
			equipo.setNombre(JOptionPane.showInputDialog("ingresar el nombre del Pais:"));
			equipo.setDescripcion(JOptionPane.showInputDialog("ingresar Colores del pais:"));

			equipos[i] = equipo;

			System.out.println("insertando equipo N°: --->" + equipo.getId_equipo());
			equipoImplementacion.guardar(equipo);
			Thread.sleep(1000);

			System.out.println("Equipo registrado");
		}

	}
}

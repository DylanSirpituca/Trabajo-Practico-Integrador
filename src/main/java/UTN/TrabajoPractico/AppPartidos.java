package UTN.TrabajoPractico;

import javax.swing.JOptionPane;

import Conexion.ConexionMSQL;
import Conexion.ExcepcionConnection;
import Entidades.Partidos;
import Implementaciones.PartidoImplementacion;

public class AppPartidos {
	public static void main(String[] args) throws InterruptedException {
		ConexionMSQL conexionMSQL = ConexionMSQL.getConeccionMSQL();

		PartidoImplementacion partidoImplementacion = null;
		try {
			partidoImplementacion = new PartidoImplementacion(conexionMSQL.getConexion());
		} catch (ExcepcionConnection e) {
			e.printStackTrace();
		}

		Partidos[] partidos;
		int cantidadE = Integer.valueOf(JOptionPane.showInputDialog("cuantos Partidos va a ingresar"));

		partidos = new Partidos[cantidadE];

		for (int i = 0; i < partidos.length; i++) {
			Partidos partido = new Partidos();
			partido.setNumPartido(i + 1);
			partido.setEquipo1(Integer.valueOf(JOptionPane.showInputDialog("ingresar el nombre del primer equipo:")));
			partido.setEquipo2(Integer.valueOf(JOptionPane.showInputDialog("ingresar el nombre del segundo equipo:")));
			partido.setGolesEquipo1(
					Integer.valueOf(JOptionPane.showInputDialog("ingresar los goles del primer equipo:")));
			partido.setGolesEquipo2(
					Integer.valueOf(JOptionPane.showInputDialog("ingresar los goles del segundo equipo:")));

			partidos[i] = partido;

			System.out.println("insertando partido N°: --->" + partido.getNumPartido());
			partidoImplementacion.guardar(partido);
			Thread.sleep(1000);

			System.out.println("Partido registrado");
		}

	}
}

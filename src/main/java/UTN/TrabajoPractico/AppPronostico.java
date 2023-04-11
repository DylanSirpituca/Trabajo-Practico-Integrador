package UTN.TrabajoPractico;

import javax.swing.JOptionPane;

import Conexion.ConexionMSQL;
import Conexion.ExcepcionConnection;
import Entidades.Pronostico;
import Implementaciones.PronosticoImplementacion;

public class AppPronostico {
	public static void main(String[] args) throws InterruptedException {
		ConexionMSQL conexionMSQL = ConexionMSQL.getConeccionMSQL();

		PronosticoImplementacion pronosticoImplementacion = null;
		try {
			pronosticoImplementacion = new PronosticoImplementacion(conexionMSQL.getConexion());
		} catch (ExcepcionConnection e) {
			e.printStackTrace();
		}

		Pronostico[] pronostico;
		int cantidadE = Integer.valueOf(JOptionPane.showInputDialog("cuantos pronosticos va a ingresar"));

		pronostico = new Pronostico[cantidadE];

		for (int i = 0; i < pronostico.length; i++) {
			Pronostico pronosticoR = new Pronostico();
			pronosticoR.setPartido(i + 1);
			pronosticoR.setEquipo(
					Integer.valueOf(JOptionPane.showInputDialog("ingresar el nombre del equipo que va a ganar:")));
			pronosticoR.setResultado(
					Integer.valueOf(JOptionPane.showInputDialog("ingresar el nombre del equipo que gano:")));
			pronosticoR.setPuntos(
					Integer.valueOf(JOptionPane.showInputDialog("ingresar los puntos ganados en el pronostico:")));

			pronostico[i] = pronosticoR;

			System.out.println("insertando pronostico N°: --->" + pronosticoR.getPartido());
			pronosticoImplementacion.guardar(pronosticoR);
			Thread.sleep(1000);

			System.out.println("Pronostico registrado");
		}

	}
}

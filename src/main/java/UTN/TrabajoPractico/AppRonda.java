package UTN.TrabajoPractico;

import javax.swing.JOptionPane;

import Coneccion.ConeccionMSQL;
import Coneccion.ExcepcionConnection;
import Entidades.Ronda;
import Implementaciones.RondaImplementacion;

public class AppRonda {
	public static void main(String[] args) throws InterruptedException {
		ConeccionMSQL coneccionMSQL = ConeccionMSQL.getConeccionMSQL();

		RondaImplementacion rondaImplementacion = null;
		try {
			rondaImplementacion = new RondaImplementacion(coneccionMSQL.getConexion());
		} catch (ExcepcionConnection e) {
			e.printStackTrace();
		}

		Ronda[] ronda;
		int cantidadE = Integer.valueOf(JOptionPane.showInputDialog("cuantas rondas va a ingresar"));

		ronda = new Ronda[cantidadE];

		for (int i = 0; i < ronda.length; i++) {
			Ronda rondaR = new Ronda();
			rondaR.setNro(i + 1);
			rondaR.setPartido(Integer.valueOf(JOptionPane.showInputDialog("ingresar el nombre del primer equipo:")));
			rondaR.setPuntos(Integer.valueOf(JOptionPane.showInputDialog("ingresar el nombre del segundo equipo:")));

			ronda[i] = rondaR;

			System.out.println("insertando partido N°: --->" + rondaR.getNro());
			rondaImplementacion.guardar(rondaR);
			Thread.sleep(1000);

			System.out.println("Partido registrado");
		}
	}
}

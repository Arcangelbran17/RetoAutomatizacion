package ReservaVuelos.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;


import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class Esperar implements Interaction{
	
private int tiempoEspera;
	
	public Esperar(int tiempoEspera) {
		super();
		this.tiempoEspera = tiempoEspera;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		new InternalSystemClock().pauseFor(tiempoEspera);// TODO Auto-generated method stub
		
	}
	/**
	 * Hace una pausa de tiempo.
	 * @param tiempoEspera en milisegundos
	 * @return 
	 */
	public static Esperar unMomento(int tiempoEspera) {
		return instrumented(Esperar.class, tiempoEspera);
	}
}

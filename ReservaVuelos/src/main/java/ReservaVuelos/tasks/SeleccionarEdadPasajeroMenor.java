package ReservaVuelos.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import ReservaVuelos.userinterface.ReservaVuelo;

public class SeleccionarEdadPasajeroMenor implements Task{

      private String edadpasajero;
	
	public SeleccionarEdadPasajeroMenor (String edadpasajero) {
		this.edadpasajero = edadpasajero;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(ReservaVuelo.txt_listademenores),
				Click.on(ReservaVuelo.listedadmenores.of(edadpasajero)));
			
	}

	public static SeleccionarEdadPasajeroMenor pasajeromenor(String edadpasajero) {
		return instrumented(SeleccionarEdadPasajeroMenor.class,edadpasajero);
	}
}

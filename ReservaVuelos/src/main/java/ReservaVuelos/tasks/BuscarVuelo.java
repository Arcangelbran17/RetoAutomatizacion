package ReservaVuelos.tasks;

import ReservaVuelos.userinterface.ReservaVuelo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


public class BuscarVuelo implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
	
		actor.attemptsTo(Click.on(ReservaVuelo.btn_buscarvuelo));
	}
}

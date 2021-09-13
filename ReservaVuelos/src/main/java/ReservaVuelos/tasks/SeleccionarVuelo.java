package ReservaVuelos.tasks;

import ReservaVuelos.interactions.Esperar;
import ReservaVuelos.userinterface.SeleccionVuelo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarVuelo implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(SeleccionVuelo.btn_seleccionarvuelo),
				Esperar.unMomento(3000));
				
	}

	public static SeleccionarVuelo vuelo() {
		return instrumented(SeleccionarVuelo.class);
	}
}

package ReservaVuelos.tasks;

import ReservaVuelos.interactions.Esperar;
import ReservaVuelos.userinterface.ReservaVuelo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarCiudadOrigen implements Task{
	
	private String vuelorigen;
	
	
	public IngresarCiudadOrigen(String vuelorigen) {
		this.vuelorigen=vuelorigen;
		
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(ReservaVuelo.input_vuelorigen),
				Esperar.unMomento(2000),
				SendKeys.of(vuelorigen).into(ReservaVuelo.input_vuelorigen),
				     Esperar.unMomento(2000),
				       Click.on(ReservaVuelo.txt_vuelorigen),
				          Esperar.unMomento(2000));
		
	}
	
	public static IngresarCiudadOrigen origen (String vuelorigen) {
		return instrumented(IngresarCiudadOrigen.class, vuelorigen);
	}

}

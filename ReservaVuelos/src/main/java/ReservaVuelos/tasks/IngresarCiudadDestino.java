package ReservaVuelos.tasks;

import ReservaVuelos.interactions.Esperar;
import ReservaVuelos.userinterface.ReservaVuelo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarCiudadDestino implements Task{
	private String vuelodestino;
	
	public IngresarCiudadDestino(String vuelodestino) {
		this.vuelodestino=vuelodestino;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(ReservaVuelo.input_vuelodestino),
				 Esperar.unMomento(2000),
				    SendKeys.of(vuelodestino).into(ReservaVuelo.input_vuelodestino),
				        Esperar.unMomento(2000),
				       Click.on(ReservaVuelo.txt_vuelodestino),
				           Esperar.unMomento(2000));
		
	}
	
	public static IngresarCiudadDestino destino(String destino) {
		return instrumented(IngresarCiudadDestino.class,destino);
	}


}

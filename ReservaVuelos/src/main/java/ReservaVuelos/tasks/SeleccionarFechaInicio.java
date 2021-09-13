package ReservaVuelos.tasks;

import ReservaVuelos.interactions.Esperar;
import ReservaVuelos.userinterface.ReservaVuelo;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarFechaInicio implements Task{
	private String fechainicio;
	
	public SeleccionarFechaInicio (String fechainicio) {
		this.fechainicio =fechainicio;
		
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(ReservaVuelo.txt_fechainicio),
				Esperar.unMomento(2000),
				  Click.on(ReservaVuelo.btn_fechainicio),Esperar.unMomento(2000));
		
	}

	public static SeleccionarFechaInicio fechainicio(String fechainicio) {
		return instrumented(SeleccionarFechaInicio.class,fechainicio);
	}
	
}

package ReservaVuelos.tasks;

import ReservaVuelos.interactions.Esperar;
import ReservaVuelos.userinterface.ReservaVuelo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarFechaFin implements Task {
	private String fechafin;
	
	public SeleccionarFechaFin (String fechafin) {
		this.fechafin=fechafin;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(ReservaVuelo.txt_fechafin),
				Click.on(ReservaVuelo.btn_fechafin),
				   Esperar.unMomento(2000),
				  Click.on(ReservaVuelo.btn_aplicarfecha),Esperar.unMomento(2000));
		
	}
    public static SeleccionarFechaFin fechafin (String fechafin) {
    	return instrumented(SeleccionarFechaFin.class,fechafin);
    }
}

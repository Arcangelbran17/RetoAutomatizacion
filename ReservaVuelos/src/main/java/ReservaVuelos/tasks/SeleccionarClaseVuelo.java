package ReservaVuelos.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import ReservaVuelos.userinterface.ReservaVuelo;

public class SeleccionarClaseVuelo implements Task {
	
	private String clasevuelo;
	
	public SeleccionarClaseVuelo (String clasevuelo) {
		this.clasevuelo = clasevuelo;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(ReservaVuelo.txt_listaclasevuelo),
				Click.on(ReservaVuelo.listaclasevuelo.of(clasevuelo)),
				 Click.on(ReservaVuelo.btn_aplicarpasajerocyclase));
		
	}
    public static SeleccionarClaseVuelo clasevuelo (String clasevuelo) {
    	return instrumented(SeleccionarClaseVuelo.class,clasevuelo);
    }
}

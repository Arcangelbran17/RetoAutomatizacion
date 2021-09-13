package ReservaVuelos.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import org.openqa.selenium.support.ui.Select;

import ReservaVuelos.interactions.Esperar;
import ReservaVuelos.userinterface.ReservaVuelo;

import org.openqa.selenium.WebElement;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarPasajerosMenores implements Task {

	private String  menor;
	
	public IngresarPasajerosMenores(String menor) {
		this.menor=menor;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(ReservaVuelo.txt_listademenores),
				  Esperar.unMomento(3000));
				//Click.on(ReservaVuelo.listedadmenores.of(menor)), Esperar.unMomento(3000));
		
	}
    public static IngresarPasajerosMenores menores (String menor) {
    	return instrumented(IngresarPasajerosMenores.class,menor);
    }
}

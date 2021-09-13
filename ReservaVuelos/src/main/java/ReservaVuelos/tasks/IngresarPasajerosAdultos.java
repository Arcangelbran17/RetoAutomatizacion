package ReservaVuelos.tasks;

import ReservaVuelos.interactions.Esperar;
import ReservaVuelos.userinterface.ReservaVuelo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarPasajerosAdultos implements Task {

    private String adulto;
    
    public IngresarPasajerosAdultos(String adulto) {
    	this.adulto=adulto;
    	
    }
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(ReservaVuelo.txt_pasajeryclase),
				  Esperar.unMomento(3000),
				  Click.on(ReservaVuelo.btn_anadirpasajerosadultos),Esperar.unMomento(2000),
				  Click.on(ReservaVuelo.btn_aplicarpasajerocyclase),Esperar.unMomento(2000),
				  Click.on(ReservaVuelo.btn_buscarvuelo),Esperar.unMomento(3000));
		
	}
	
	public static IngresarPasajerosAdultos adultos(String adulto) {
		return instrumented(IngresarPasajerosAdultos.class,adulto);
		
	}

}

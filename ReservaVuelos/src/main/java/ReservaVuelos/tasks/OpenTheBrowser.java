package ReservaVuelos.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import ReservaVuelos.tasks.OpenTheBrowser;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenTheBrowser implements Task{

	private PageObject page;
	public OpenTheBrowser(PageObject page) {
		this.page = page;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo((Open.browserOn(page)));
	}
	public static OpenTheBrowser at(PageObject page) {
		return instrumented(OpenTheBrowser.class, page) ;
	}

	
}

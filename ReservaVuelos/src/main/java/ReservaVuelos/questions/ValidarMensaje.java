package ReservaVuelos.questions;

import ReservaVuelos.userinterface.SeleccionVuelo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class ValidarMensaje implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		WaitUntil.the(SeleccionVuelo.lbl_textofaltapoco, isEnabled());
		return Text.of(SeleccionVuelo.lbl_textofaltapoco).viewedBy(actor).asString();
	}

	public static ValidarMensaje con () {
		return new ValidarMensaje();
	}
	
}

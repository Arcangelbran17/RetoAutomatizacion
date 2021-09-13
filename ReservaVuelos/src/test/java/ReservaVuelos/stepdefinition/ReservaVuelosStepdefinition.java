package ReservaVuelos.stepdefinition;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;

import org.openqa.selenium.WebDriver;

import ReservaVuelos.questions.ValidarMensaje;
import ReservaVuelos.tasks.IngresarCiudadDestino;
import ReservaVuelos.tasks.IngresarCiudadOrigen;
import ReservaVuelos.tasks.IngresarPasajerosAdultos;
import ReservaVuelos.tasks.IngresarPasajerosMenores;
import ReservaVuelos.tasks.OpenTheBrowser;
import ReservaVuelos.tasks.SeleccionarClaseVuelo;
import ReservaVuelos.tasks.SeleccionarFechaFin;
import ReservaVuelos.tasks.SeleccionarFechaInicio;
import ReservaVuelos.tasks.SeleccionarVuelo;
import ReservaVuelos.userinterface.BrowserDespegar;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import static org.hamcrest.Matchers.containsString;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ReservaVuelosStepdefinition {

	@Managed()
	private WebDriver herBrowser;
	private BrowserDespegar despegar;
	private Actor usuario = Actor.named("usuario");
	
	@Before
	public void setup() {

		usuario.can(BrowseTheWeb.with(herBrowser));

	}

	@Given("^que me encuentro en el sitio web de despegar$")
	public void queMeEncuentroEnElSitioWebDeDespegar() {
	   //usuario.wasAbleTo(OpenTheBrowser.at(despegar));
		usuario.attemptsTo(Open.browserOn().the(despegar));
	  
	}


	@When("^ingreso los datos necesarios para la reserva del vuelo (.*),(.*),(.*),(.*),(.*)$")
	public void ingresoLosDatosNecesariosParaLaReservaDelVuelo (String origen,String destino,String fechaida,String fechavuelta,String totalpasajeroadulto) {
	        usuario.attemptsTo(IngresarCiudadOrigen.origen(origen), IngresarCiudadDestino.destino(destino),SeleccionarFechaInicio.fechainicio(fechaida),
	        		SeleccionarFechaFin.fechafin(fechavuelta),IngresarPasajerosAdultos.adultos(totalpasajeroadulto));
			 
	}

	@When("^selecciono el vuelo$")
	public void seleccionoElVuelo() {
	    usuario.attemptsTo(SeleccionarVuelo.vuelo());
	}

	@Then("^puedo ver el mensaje de ¡falta poco! satisfactoriamente (.*)$")
	public void puedoVerElMensajeDeFaltaPocoSatisfactoriamente (String mensaje) {
	    usuario.should(seeThat(ValidarMensaje.con(), containsString(mensaje)));
	}
	
	}	
	




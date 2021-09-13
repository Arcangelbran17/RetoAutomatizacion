package ReservaVuelos.userinterface;


import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;
public class SeleccionVuelo {

	public static final Target btn_seleccionarvuelo=Target.the("Botón para seleccionar el primer vuelo").located(By.xpath("(//*[contains(text(),'Seleccionar')])[1]"));
	public static final Target lbl_textofaltapoco=Target.the("Texto para confirmar que falta poco para la reserva").located(By.xpath("//*[@id=\"checkout-content\"]/div[1]/h2"));
	public static final Target btn_continuar=Target.the("Botón continuar a la página siguiente").located(By.xpath("//*[contains(text(),'Continuar')]"));
}




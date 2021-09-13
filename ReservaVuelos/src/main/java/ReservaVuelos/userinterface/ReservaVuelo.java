package ReservaVuelos.userinterface;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;


public class ReservaVuelo {
	
	public static final Target input_vuelorigen=Target.the("Caja de texto ingreso de vuelo origen").located(By.xpath("(//*[@type='text'])[1]"));
	public static final Target input_vuelodestino=Target.the("Caja de texto ingreso de vuelo destino").located(By.xpath("(//*[@type='text'])[2]"));
	public static final Target txt_vuelorigen=Target.the("lista del vuelo origen").located(By.xpath("//*[contains(text(),'Medellín, Antioquia, Colombia')]"));		
	public static final Target txt_vuelodestino=Target.the("lista del vuelo destino").located(By.xpath("//*[contains(text(),'Bogotá, Bogotá D.C., Colombia')]"));		
	public static final Target txt_fechainicio=Target.the("Caja de texto fecha inicio").located(By.xpath("(//*[@placeholder='Ida'])[1]"));
	public static final Target txt_fechafin=Target.the("Caja de texto fecha fin").located(By.xpath("(//*[@placeholder='Vuelta'])[1]"));	
	public static final Target btn_fechainicio=Target.the("Día inicio calendario seleccionado").located(By.xpath("(//*[@class='sbox5-monthgrid-datenumber-number'])[17]"));	
	public static final Target btn_fechafin=Target.the("Día fin calendario seleccionado").located(By.xpath("(//*[@class='sbox5-monthgrid-datenumber-number'])[27]"));	
	public static final Target btn_aplicarfecha=Target.the("Boton de guardar fecha").located(By.xpath("//*[@class='sbox5-3-btn -primary -md']"));		
	public static final Target txt_pasajeryclase=Target.the("Caja de texto pasajero y clase de vuelo").located(By.xpath("(//*[@class='sbox5-passengers-distribution-container'])[1]"));	
	public static final Target btn_anadirpasajerosadultos=Target.the("Botón añadir pasajeros al vuelo").located(By.xpath("(//*[@class='steppers-icon-right stepper__icon'])[1]"));	
	public static final Target btn_anadirpasajerosmenores=Target.the("Botón añadir pasajeros menores").located(By.xpath("(//*[@class='steppers-icon-right stepper__icon'])[2]"));
	public static final Target btn_restarpasajerosadultos=Target.the("Botón restar pasajeros").located(By.xpath("(//*[@class='steppers-icon-left stepper__icon'])[1]"));
	public static final Target btn_restarpasajerosmenores=Target.the("Bóton restar pasajeros menores").located(By.xpath("(//*[@class='steppers-icon-left stepper__icon'])[2]"));
	public static final Target txt_listademenores=Target.the("Campo de la lista de menores").located(By.xpath("//select[@class='select']"));
	public static final Target txt_listaclasevuelo=Target.the("Campo de la lista de clases de vuelo").located(By.xpath("//select[@class='select-tag'])[1]"));
	public static final Target listedadmenores=Target.the("Lista de selección año del menor").located(By.xpath("//select[@class='select']/option[text()='{0}']"));
	public static final Target listaclasevuelo=Target.the("Lista de tipo de clase de vuelo").located(By.xpath("(//select[@class='select-tag'])[1]/option[text()='{0}']\""));
	public static final Target btn_aplicarpasajerocyclase=Target.the("Botón para aplicar pasajero").located(By.xpath("//*[@class='sbox5-3-btn -md -primary']"));
	public static final Target btn_buscarvuelo=Target.the("Bóton para buscarl el vuelo").located(By.xpath("//*[@class='sbox5-box-button-ovr--3LK5x sbox5-3-btn -secondary -icon -lg']"));
}



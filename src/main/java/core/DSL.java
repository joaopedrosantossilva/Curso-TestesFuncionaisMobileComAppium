package core;

import static core.DriverFactory.getDriver;
import java.util.List;
import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class DSL {

	public void clicarNaOpcaoViaTexto(String valor) {
		getDriver().findElement(By.xpath("//*[@text='"+valor+"']")).click();
	}
	

	public void escreverBy(By by, String valor) {
		getDriver().findElement(by).sendKeys(valor);
	}
	
	
	public boolean validaSeElementoEstaPresenteBy(By by) {
		List<MobileElement> elementos = getDriver().findElements(by);
		return elementos.size() > 0;
	}


	public void cliqueLongoBy(By by) {
		 AndroidTouchAction touch = new AndroidTouchAction(DriverFactory.getDriver());
	     touch.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(DriverFactory.getDriver().findElement(by)))).perform();
	}
}

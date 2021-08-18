package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddAddressModule extends PageObject{
    public static final Target NEXT_DEVICES_BUTTON=Target.the("")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}

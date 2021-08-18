package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddDevicesModule {
    public static final Target LAST_STEP_BUTTON=Target.the("")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
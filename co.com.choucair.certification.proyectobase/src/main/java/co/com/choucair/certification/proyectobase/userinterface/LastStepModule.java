package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LastStepModule {

    public static final Target PASSWORD= Target.the("Where we write the password")
            .located(By.id("password"));

    public static final Target CONFIRM_PASSWORD= Target.the("Where we write the confirm password")
            .located(By.id("confirmPassword"));

    public static final Target SELECT_OPTION_ONE= Target.the("Where we select the checkbox one")
            .located(By.xpath("//span[@class='checkmark signup-consent__checkbox']"));

    public static final Target SELECT_OPTION_TWO= Target.the("Where we select the checkbox two")
            .located(By.xpath("//span[@class='checkmark signup-consent__checkbox error']"));

    public static final Target COMPLETE_SETUP_BUTTON= Target.the("Button to complete setup")
            .located(By.xpath("//a[@class='btn btn-blue']")
            );
}

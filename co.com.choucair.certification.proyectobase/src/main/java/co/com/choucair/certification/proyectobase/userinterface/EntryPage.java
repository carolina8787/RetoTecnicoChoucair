package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EntryPage {
    public static final Target JOIN_TODAY = Target.the("button showing user registration form")
            .located(By.partialLinkText("Join Today"));
}

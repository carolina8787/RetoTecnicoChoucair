package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ContactDataModule {

    public static final Target FIRST_NAME= Target.the("Where we write the username")
            .located(By.id("firstName"));

    public static final Target LAST_NAME= Target.the("Where we write the user's last name")
            .located(By.id("lastName"));

    public static final Target EMAIL_ADDRESS= Target.the("Where we write the user's email address")
            .located(By.id("email"));

    public static final Target MONTH= Target.the("Where we write the user's month of birth")
            .located(By.id("birthMonth"));

    public static final Target BIRTH_DAY= Target.the("Where we write the user's day of birth")
            .located(By.name("birthDay"));

    public static final Target BIRTH_YEAR= Target.the("Where we write the user's year of birth")
            .located(By.name("birthYear"));

    public static final Target LANGUAGES= Target.the("Where we write the user's year of birth")
            .located(By.id("languages"));

    public static final Target NEXT_LOCATION_BUTTON= Target.the("Button to continue to the second module")
            .located(By.xpath("//a[@class='btn btn-blue']")
            );
}

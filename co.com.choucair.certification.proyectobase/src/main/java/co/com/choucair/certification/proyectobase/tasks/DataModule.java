package co.com.choucair.certification.proyectobase.tasks;
import co.com.choucair.certification.proyectobase.userinterface.ContactDataModule;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class DataModule implements Task{
    public static Performable onThePage() {
        return Tasks.instrumented(Entry.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("IngresaTuNombre").into(ContactDataModule.FIRST_NAME),
                Enter.theValue("IngresaTuApellido").into(ContactDataModule.LAST_NAME),
                Enter.theValue("IngresaTuEmail").into(ContactDataModule.EMAIL_ADDRESS),
                Enter.theValue("IngresaMesDeNacimiento").into(ContactDataModule.MONTH),
                       SelectFromOptions.byVisibleText("April").from(ContactDataModule.MONTH),
                Enter.theValue("IngresaDíaDeNacimiento").into(ContactDataModule.BIRTH_DAY),
                       SelectFromOptions.byVisibleText("22").from(ContactDataModule.BIRTH_DAY),
                Enter.theValue("IngresaAñoDeNacimiento").into(ContactDataModule.BIRTH_YEAR),
                       SelectFromOptions.byVisibleText("1996").from(ContactDataModule.BIRTH_YEAR),
                Click.on(ContactDataModule.LANGUAGES),
                        Enter.theValue("Italian").into(ContactDataModule.LANGUAGES),
                Click.on(ContactDataModule.NEXT_LOCATION_BUTTON));

    }
}


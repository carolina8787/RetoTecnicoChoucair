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
    private String firstName;
    private String lastName;
    private String email;
    private String birthMonth;
    private String monthSelection = "April";
    private String birthDay;
    private String daySelection = "22";
    private String birthYear;
    private String yearSelection = "1996";
    private String languages;

    public DataModule(String firstName, String lastName, String email, String birthMonth, String birthDay, String birthYear, String languages) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.languages = languages;
    }
    public static DataModule onThePage(String firstName, String lastName, String email, String birthMonth, String birthDay, String birthYear, String languages) {
        return Tasks.instrumented(DataModule.class,firstName,lastName,email,birthMonth,birthDay,birthYear,languages);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(firstName).into(ContactDataModule.FIRST_NAME),
                Enter.theValue(lastName).into(ContactDataModule.LAST_NAME),
                Enter.theValue(email).into(ContactDataModule.EMAIL_ADDRESS),
                Enter.theValue(birthMonth).into(ContactDataModule.MONTH),
                       SelectFromOptions.byVisibleText(monthSelection).from(ContactDataModule.MONTH),
                Enter.theValue(birthDay).into(ContactDataModule.BIRTH_DAY),
                       SelectFromOptions.byVisibleText(daySelection).from(ContactDataModule.BIRTH_DAY),
                Enter.theValue(birthYear).into(ContactDataModule.BIRTH_YEAR),
                       SelectFromOptions.byVisibleText(yearSelection).from(ContactDataModule.BIRTH_YEAR),
                Click.on(ContactDataModule.LANGUAGES),
                        Enter.theValue(languages).into(ContactDataModule.LANGUAGES),
                Click.on(ContactDataModule.NEXT_LOCATION_BUTTON));

    }
}


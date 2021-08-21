package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.LastStepModule;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LastModule implements Task {
    private String password;
    private  String confirmPassword;

    public LastModule(String password, String confirmPassword) {
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static LastModule ThePage(String password, String confirmPassword) {
        return Tasks.instrumented(LastModule.class,password,confirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(password).into(LastStepModule.PASSWORD),
                Enter.theValue(confirmPassword).into(LastStepModule.CONFIRM_PASSWORD),
                Click.on(LastStepModule.SELECT_OPTION_ONE),
                Click.on(LastStepModule.SELECT_OPTION_TWO),
                Click.on(LastStepModule.COMPLETE_SETUP_BUTTON));
    }
}
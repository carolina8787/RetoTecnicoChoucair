package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.LastStepModule;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LastModule implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("IngresaUnaContraseña").into(LastStepModule.PASSWORD),
                Enter.theValue("ConfirmaLaContraseña").into(LastStepModule.CONFIRM_PASSWORD),
                Click.on(LastStepModule.SELECT_OPTION_ONE),
                Click.on(LastStepModule.SELECT_OPTION_TWO),
                Click.on(LastStepModule.COMPLETE_SETUP_BUTTON));

    }
}
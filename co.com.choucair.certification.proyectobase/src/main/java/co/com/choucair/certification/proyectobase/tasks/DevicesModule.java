package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.AddDevicesModule;
import co.com.choucair.certification.proyectobase.userinterface.ContactDataModule;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class DevicesModule implements Task{
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(AddDevicesModule.LAST_STEP_BUTTON));
    }
}



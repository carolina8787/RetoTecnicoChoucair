package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.AddAddressModule;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AddressModule implements Task{
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(AddAddressModule.NEXT_DEVICES_BUTTON));
    }
}

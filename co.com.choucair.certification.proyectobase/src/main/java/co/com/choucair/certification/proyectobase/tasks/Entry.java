package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.EntryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Entry implements Task{

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(EntryPage.JOIN_TODAY));

    }

}

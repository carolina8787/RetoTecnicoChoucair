package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.uTestPage;
import co.com.choucair.certification.proyectobase.userinterface.EntryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Entry implements Task{

    public static Performable thePage;
    private uTestPage uTestpage;
    public static Performable thePage() {
        return Tasks.instrumented(Entry.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(EntryPage.JOIN_TODAY));

    }

}

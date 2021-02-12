package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import useinterface.UTestPage;

public class OpenUp implements Task {

    private useinterface.UTestPage uTestPage;


    public static OpenUp ThePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){actor.attemptsTo(Open.browserOn(uTestPage));} {

    }
}

package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import org.example.ui.Targets;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterUsername implements Task {

    private final String username;

    protected EnterUsername(String username) {

        this.username = username    ;


    }

    @Step("Enter the #username")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username)
                     .into(Targets.USERNAME_FIELD)
        );
    }


    public static EnterUsername withTheUsername(String username) {
        return instrumented(EnterUsername.class, username);
    }

}

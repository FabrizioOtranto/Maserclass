package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import org.example.ui.Targets;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterPassword implements Task {

    private final String password;

    protected EnterPassword(String password) {

        this.password = password    ;


    }

    @Step("Enter the #password")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(password)
                     .into(Targets.PASSWORD_FIELD)
        );
    }

    public static EnterPassword withThePassword(String password) {
        return instrumented(EnterPassword.class, password);
    }

}

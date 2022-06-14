package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import org.example.ui.Targets;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickLoginButton implements Task {

    @Step("Enter the #password")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Targets.LOGIN_BUTTON)
        );
    }


    public static ClickLoginButton click() {
        return instrumented(ClickLoginButton.class);
    }

}

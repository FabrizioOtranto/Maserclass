package org.example.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Targets {
    public static Target USERNAME_FIELD = Target.the("username field").located(By.id("email"));
    public static Target PASSWORD_FIELD = Target.the("password field").located(By.id("passwd"));
    public static Target LOGIN_BUTTON = Target.the("username field").located(By.id("SubmitLogin"));
}

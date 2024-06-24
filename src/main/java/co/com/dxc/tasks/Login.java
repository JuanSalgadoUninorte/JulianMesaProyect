package co.com.dxc.tasks;

import co.com.dxc.ui.LoginFields;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    public static Login inThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("pepito").into(LoginFields.USERNAME_FIELD),
                Enter.theValue("algo").into(LoginFields.PASSWORD_FIELD),
                Click.on(LoginFields.LOGIN_BUTTON)
        );
    }
}

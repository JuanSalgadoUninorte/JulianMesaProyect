package co.com.dxc.builders;

import co.com.dxc.ui.LoginFields;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    private String username;
    private String password;
    private Boolean rememberMe;

    public Login(String username, String password, Boolean rememberMe) {
        this.username = username;
        this.password = password;
        this.rememberMe = rememberMe;
    }

    public static LoginWith with() {
        return new LoginWith();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(LoginFields.USERNAME_FIELD),
                Enter.theValue(password).into(LoginFields.PASSWORD_FIELD)
        );
        if (rememberMe){
            actor.attemptsTo(
                    Click.on(LoginFields.REMEMBER_ME)
            );
        }
        actor.attemptsTo(
                Click.on(LoginFields.LOGIN_BUTTON)
        );
    }

    public static class LoginWith {
        private String username;
        private String password;

        public LoginWith andPassword(String password) {
            this.password = password;
            return this;
        }

        public LoginWith username(String username) {
            this.username = username;
            return this;
        }

        public LoginWith withEmptyPassword() {
            this.password = "";
            return this;
        }

        public LoginWith withEmptyUsername() {
            this.username = "";
            return this;
        }

        public Performable rememberMe(){
            return new Login(username, password, true);
        }

        public Performable notRememberMe(){
            return new Login(username, password, false);
        }
    }
}

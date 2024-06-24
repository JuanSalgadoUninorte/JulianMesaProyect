package co.com.dxc.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginFields extends PageObject {

    private LoginFields(){}
    public static final Target USERNAME_FIELD = Target.the("Username field").located(By.id("username"));
    public static final Target PASSWORD_FIELD = Target.the("Password field").located(By.id("password"));
    public static final Target LOGIN_BUTTON =Target.the("login button").located(By.id("log-in"));
    public static final Target REMEMBER_ME = Target.the("Remember me button").located(By.xpath("//input[@type='checkbox']"));
}

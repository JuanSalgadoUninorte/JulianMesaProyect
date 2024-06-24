package stepdefinitions.hook;

import co.com.dxc.tasks.NavigateTo;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hook {

    @Before
    public static void beforeHook(){
        System.out.println("before hook");
    }

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{string} gets to the login page")
    public void theUserGetsToTheLoginPage(String name) {
        OnStage.theActorCalled(name).attemptsTo(NavigateTo.browserURL());
    }

    @Before("@foo")
    public static void beforeHookFoo(){
        System.out.println("before hook foo");
    }

    @After
    public static void afterHook(){
        System.out.println("after hook");
    }

}

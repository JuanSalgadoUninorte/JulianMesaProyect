package stepdefinitions;

import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;

public class CommonStepDefinitions {
    @Given("{string} wants to remember something")
    public void wantsToRememberSomething(String string) {
        OnStage.theActorCalled(string);
    }
}

package stepdefinitions;

import co.com.dxc.SessionVariables;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class SegmentedFeatureStepDefinitions1 {
    @When("he tries to remember {string}")
    public void heTriesToRemember(String string) {
        OnStage.theActorInTheSpotlight().remember(SessionVariables.FOO.toString(), string);
    }
}

package stepdefinitions;

import co.com.dxc.SessionVariables;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;

public class SegmentedFeatureStepDefinitions2 {
    @Then("he should get Foo")
    public void heShouldGet() {
        String valueRecall = OnStage.theActorInTheSpotlight().recall(SessionVariables.FOO.toString());
    }
}

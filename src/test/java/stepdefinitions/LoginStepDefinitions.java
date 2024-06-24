package stepdefinitions;

import co.com.dxc.builders.Login;
import co.com.dxc.exceptions.EnvironmentError;
import co.com.dxc.facts.AToken;
import co.com.dxc.questions.CreditAvailable;
import co.com.dxc.questions.TotalBalance;
import co.com.dxc.ui.LeftMenu;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class LoginStepDefinitions {

    @When("the correct credentials are written")
    public void theCorrectCredentialsAreWritten() {
        //OnStage.theActorInTheSpotlight().attemptsTo(Login.inThePage());
        OnStage.theActorInTheSpotlight().attemptsTo(Login.with()
                .username("pepito")
                .andPassword("seguridad")
                .rememberMe());
    }

    String name;

    @Given("{string} has a token")
    public void hasAToken(String name) {
        this.name = name;
        OnStage.theActorCalled(name).has(AToken.toManageTheirProducts());
    }

    @Given("{string} failed 1")
    public void failed1(String name) {
        OnStage.theActorCalled(name).should(GivenWhenThen.seeThat("failed 1 ", actor -> true, equalTo(false)));
    }

    @Given("{string} failed 2")
    public void failed2(String name) {
        OnStage.theActorCalled(name).should(GivenWhenThen.seeThat("failed 1 ", actor -> true, equalTo(false)));
    }

    @Given("{string} compromised")
    public void compromised(String string) {
        OnStage.theActorCalled(name).should(GivenWhenThen.seeThat("", actor -> true, equalTo(false))
                .orComplainWith(EnvironmentError.class, "No se tiene conexión con el third party"));
    }


    @Then("must be seen the home page")
    public void mustBeSeenTheHomePage() {
        //System.out.println(CreditAvailable.validate().answeredBy(OnStage.theActorInTheSpotlight()));
        //System.out.println(TotalBalance.validate().answeredBy(OnStage.theActorInTheSpotlight()));
        OnStage.theActorInTheSpotlight().should(
                seeThat(
                        "The displayed total balance ", TotalBalance.validate()
                ),
                seeThat(
                        "The displayed credit available ", CreditAvailable.validate()
                )
        );
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(LeftMenu.CREDIT_CARD_LINK));
        /*OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                TotalBalance.validate().answeredBy(OnStage.theActorInTheSpotlight()),
                CreditAvailable.validate().equals("")
        ));
    */

    }
}

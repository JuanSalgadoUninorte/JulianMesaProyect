package stepdefinitions;

import co.com.dxc.abilities.ReadPdf;
import co.com.dxc.tasks.NavigateTo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.util.EnvironmentVariables;

import java.io.IOException;

import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class DownloadStatementsStepDefinitions {

    String name;

    private EnvironmentVariables environmentVariables;
    String downloadFolder;
    String fileName;

    @Given("{string} has made purchases with his credit card")
    public void hasMadePurchasesWithHisCreditCard(String name) throws InterruptedException{
        this.name = name;
        downloadFolder = environmentVariables.optionalProperty("download.filesFolder").orElseThrow(IllegalArgumentException::new);
        fileName = environmentVariables.optionalProperty("statements.fileName").orElseThrow(IllegalArgumentException::new);
    }
    @Given("he already downloaded his statements")
    public void heAlreadyDownloadedHisStatements() throws IOException, InterruptedException {
        OnStage.theActorCalled(name);
        withCurrentActor(NavigateTo.browserURL());
        Thread.sleep(5000);
    }
    @When("he reviews his transactions")
    public void heReviewsHisTransactions() throws IOException{
        String statementFilePath = String.format("%s/%s", downloadFolder, fileName);
        OnStage.theActorInTheSpotlight().whoCan(ReadPdf.downloadedInPath(statementFilePath));
        String pdfText = ReadPdf.as(OnStage.theActorInTheSpotlight()).getText();
        System.out.println(pdfText);
    }
    @Then("he should see the transactions for last month")
    public void heShouldSeeTheTransactionsForLastMonth() {

    }
}

package co.com.dxc.questions;

import co.com.dxc.ui.FinancialOverview;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class CreditAvailable implements Question<Boolean> {

    public static CreditAvailable validate() {
        return new CreditAvailable();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(FinancialOverview.CREDIT_AVAILABLE).getText().trim().equals("$17,800");
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }
}

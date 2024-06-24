package co.com.dxc.questions;

import co.com.dxc.ui.FinancialOverview;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class TotalBalance implements Question<Boolean> {

    public static TotalBalance validate() {
        return new TotalBalance();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(FinancialOverview.TOTAL_BALANCE).getText().trim().equals("$350%7");
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }
}

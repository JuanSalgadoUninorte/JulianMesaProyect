package co.com.dxc.facts;

import co.com.dxc.questions.token.GetAToken;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.facts.Fact;

public class AToken implements Fact {
    private String token;

    public static AToken toManageTheirProducts() {
        return new AToken();
    }

    @Override
    public void setup(Actor actor) {
        token = GetAToken.toManageMyProducts().answeredBy(actor);
    }

    public String toString(){
        return "token is"+token;
    }
}

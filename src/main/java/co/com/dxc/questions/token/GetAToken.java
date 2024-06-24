package co.com.dxc.questions.token;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.UUID;

public class GetAToken implements Question<String> {

    public static Question<String> toManageMyProducts() {
        return new GetAToken();
    }

    @Override
    public String answeredBy(Actor actor) {
        return UUID.randomUUID().toString();
    }
}

package co.com.dxc.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LeftMenu {
    private LeftMenu() {
    }
    public static final Target CREDIT_CARD_LINK = Target.the("Credit Card Link").located(By.xpath("//span[contains(text(), 'Credit cards')]"));
    public static final Target DEBIT_CARD_LINK = Target.the("Debit Card Link").located(By.xpath("//span[contains(text(), 'Debit cards')]"));
}

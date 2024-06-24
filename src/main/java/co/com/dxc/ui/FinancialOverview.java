package co.com.dxc.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FinancialOverview {
    private FinancialOverview(){}
    public static final Target CREDIT_AVAILABLE = Target.the("Message credit available").located(By.xpath("//div[contains(text(), 'Credit Available')]/following-sibling::div[@class='balance-value']"));
    public static final Target TOTAL_BALANCE = Target.the("Message total balance").located(By.xpath("//div[contains(text(), 'Total Balance')]/following-sibling::div[@class='balance-value']"));
    public static final Target ADD_ACCOUNT = Target.the("Add account").located(By.xpath("//div[contains(text(), 'Add Account')]"));
    public static final Target MAKE_PAYMENT = Target.the("Make payment").located(By.xpath("//div[contains(text(), 'Make Payment')]"));
    public static final Target DUE_TODAY = Target.the("Due today").located(By.xpath("//div[contains(text(), 'Due Today')]/following-sibling::div[@class='balance-value']"));
    public static final Target TABLE_CONTAINER = Target.the("Table container").located(By.xpath("//div[contains(@class, 'table-responsive']"));

}

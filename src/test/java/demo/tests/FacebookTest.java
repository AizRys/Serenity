package demo.tests;

import demo.steps.FacebookSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class FacebookTest {

    @Managed
    private WebDriver driver;

    @Steps
    private FacebookSteps facebookSteps;

    @Test
    public void performLogin() {
        facebookSteps.inputEmail();
        facebookSteps.inputPass();
        facebookSteps.clickOnSignIn();
    }
}

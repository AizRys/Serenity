package demo.steps;

import demo.pages.FacebookPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class FacebookSteps extends ScenarioSteps {
    private FacebookPage facebookPage() {
        return getPages().currentPageAt(FacebookPage.class);
    }

    @Step
    public void inputEmail() {
        facebookPage().inputEmail();
    }
    @Step
    public void inputPass() {
        facebookPage().inputPass();
    }
    @Step
    public void clickOnSignIn() {
        facebookPage().clickOnSignIn();
    }
}

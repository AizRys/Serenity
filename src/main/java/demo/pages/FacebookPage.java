package demo.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.facebook.com/")
public class FacebookPage extends PageObject {

    public FacebookPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"email\"]") private WebElementFacade inputEmail;
    @FindBy(xpath = "//*[@id=\"pass\"]") private WebElementFacade inputPass;
    @FindBy(xpath = "//input[@value = 'Anmelden']") private WebElementFacade signInButton;

    public void inputEmail() {
       inputEmail.waitUntilClickable().click();
       inputEmail.sendKeys("zuush89@gmail.com");
    }
    public void inputPass() {
        inputPass.waitUntilClickable().click();
        inputPass.sendKeys("198908");
    }
    public void clickOnSignIn() {
        signInButton.waitUntilClickable().click();
    }
}


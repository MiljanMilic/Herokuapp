package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTest {

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "A/B Testing")
    public WebElement abTestingLink;

    @FindBy(linkText = "Add/Remove Elements")
    public WebElement addRemoveElementsLink;

    @FindBy(linkText = "Basic Auth")
    public WebElement basicAuthLink;

    //-------------------------------

    public void clickOnABTesting(){
        abTestingLink.click();
    }

    public void clickOnAddRemoveElements(){
        addRemoveElementsLink.click();
    }

    public void clickOnBasicAuth(){
        basicAuthLink.click();
    }

}

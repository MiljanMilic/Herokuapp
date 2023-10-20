package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasicAuthPage extends BaseTest {
    public BasicAuthPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='content']/div/p")
    public WebElement confirmationText;

    //----------------------

    public String actualConfirmationText(){
        return confirmationText.getText();
    }

}

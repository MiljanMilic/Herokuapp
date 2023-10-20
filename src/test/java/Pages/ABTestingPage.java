package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ABTestingPage extends BaseTest {
    public ABTestingPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "content")
        public WebElement pageText;

}

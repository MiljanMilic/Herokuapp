package Pages;

import Base.BaseTest;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRemoveElementsPage extends BaseTest {
    public AddRemoveElementsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "button[onclick='addElement()']")
    public WebElement addElementButton;

    @FindBy(css = "button[onclick='deleteElement()']")
    public WebElement deleteButton;

    @FindBy(xpath = "//*[@id='content']/h3[text()='Add/Remove Elements']")
    public WebElement pageText;

    //--------------------------------

    public void clickOnAddElement() {
        addElementButton.click();
    }

    public void clickOnDelete() {
        while (true) {
            try {
                if (deleteButton.isDisplayed()) {
                    deleteButton.click();
                } else break;
            } catch (NoSuchElementException e) {
                break;
            }
        }

    }

    public String actualPageText(){
        return pageText.getText();
    }

}

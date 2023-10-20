package Test;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class PageTesting extends BaseTest {

    @Test
    public void TestingABTestingPage() {
        homePage.clickOnABTesting();
        String expectedURL = "https://the-internet.herokuapp.com/abtest";
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
        Assert.assertTrue(abTestingPage.pageText.isDisplayed());
    }

    @Test
    public void TestingAddRemoveElementsPage() {
        homePage.clickOnAddRemoveElements();
        addRemoveElementsPage.clickOnAddElement();
        addRemoveElementsPage.clickOnAddElement();
        addRemoveElementsPage.clickOnAddElement();
        addRemoveElementsPage.clickOnDelete();
        String expectedURL = "https://the-internet.herokuapp.com/add_remove_elements/";
        String expectedPageText = "Add/Remove Elements";
        String actualPageText = addRemoveElementsPage.actualPageText();
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
        Assert.assertEquals(actualPageText, expectedPageText);
    }

    @Test
    public void TestingBasicAuthPage()  {
        homePage.clickOnBasicAuth();
        String pass = "admin";
        String username = "admin";
        String url = "https://" + username + ":" + pass + "@the-internet.herokuapp.com/basic_auth";
        String expectedText = "Congratulations! You must have the proper credentials.";
        driver.navigate().to(url);

        String actualText = basicAuthPage.actualConfirmationText();
        Assert.assertEquals(actualText, expectedText);


    }
}

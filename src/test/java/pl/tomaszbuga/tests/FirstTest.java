package pl.tomaszbuga.tests;

import org.testng.annotations.Test;
import pl.tomaszbuga.framework.BaseTest;
import pl.tomaszbuga.pom.SeleniumTrainingPage;

public class FirstTest extends BaseTest {
    @Test()
    public void firstMethod() {
        SeleniumTrainingPage homePage = new SeleniumTrainingPage(getDriver());
        homePage.openPage();
        String testPassword = "testowehaslo";
        homePage.enterTextToTextInput(testPassword);
        if(!homePage.getTextFromTextInput().equals(testPassword))
            org.testng.Assert.fail("Something went wrong, and the password from the input is not equal to the excepted password");
        if(!homePage.checkIfTypeIsPassword())
            org.testng.Assert.fail("The 'password' input has the incorrect type attribute");
    }
}

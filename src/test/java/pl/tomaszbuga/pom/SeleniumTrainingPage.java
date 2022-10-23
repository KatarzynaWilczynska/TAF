package pl.tomaszbuga.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.tomaszbuga.framework.PageObject;

public class SeleniumTrainingPage extends PageObject {
    private String baseUrl = "https://bonigarcia.dev/selenium-webdriver-java/web-form.html";

    @FindBy(name = "my-password")
    private WebElement textInput;

    public SeleniumTrainingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public SeleniumTrainingPage openPage() {
        driver.get(baseUrl);
        return this;
    }

    public SeleniumTrainingPage enterTextToTextInput(String text) {
        textInput.sendKeys(text);
        return this;
    }

    public boolean checkIfTypeIsPassword(){
        return textInput.getAttribute("type").equals("password");
    }

    public String getTextFromTextInput() {
        return textInput.getAttribute("value");
    }


}


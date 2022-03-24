import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;

public class AdvancedTestsWithServer {

    private static WebDriver driver;

    @BeforeEach
    public void setUp() throws Exception {

        // Running against selenium server
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
        driver.manage().window().maximize();

    }

    @Test
    public void testCheckbox() {

        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        WebElement checkbox = driver.findElement(By.cssSelector("input#isAgeSelected"));
        checkbox.click();
        Assertions.assertTrue(checkbox.isSelected(), "Checkbox is not selected!");

        WebElement message = driver.findElement(By.cssSelector("div#txtAge"));
        Assertions.assertEquals("Success - Check box is checked", message.getText());

    }

    @Test
    public void testRadioButton() {

        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");

        WebElement radioButtonMale = driver.findElement(By.cssSelector("input[value=Male][name=optradio]"));
        radioButtonMale.click();
        Assertions.assertTrue(radioButtonMale.isSelected(), "Male radio button is not selected!");

        WebElement button = driver.findElement(By.cssSelector("button#buttoncheck"));
        button.click();
        WebElement message = driver.findElement(By.cssSelector("p.radiobutton"));
        Assertions.assertEquals("Radio button 'Male' is checked", message.getText());

    }

    @Test
    public void testSelectDropdown() {

        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

        WebElement dropdown = driver.findElement(By.cssSelector("select#select-demo"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Thursday");
        Assertions.assertEquals("Thursday", select.getFirstSelectedOption().getText());

        WebElement message = driver.findElement(By.cssSelector("p.selected-value"));
        Assertions.assertEquals("Day selected :- Thursday", message.getText());

    }

    @Test
    public void testAjaxFormSubmit() {

        driver.get("https://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement nameField = driver.findElement(By.cssSelector("input#title"));
        nameField.sendKeys("Tester");
        WebElement submitButton = driver.findElement(By.cssSelector("input#btn-submit"));
        submitButton.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        boolean isPresent = wait.until(ExpectedConditions.textToBePresentInElementLocated(
                By.cssSelector("div#submit-control"), "Form submited Successfully!"));
        Assertions.assertTrue(isPresent, "Submission message is not displayed!");

    }

    @AfterEach
    public void tearDown() throws Exception {

        if (driver != null) {
            driver.quit();
        }

    }

}

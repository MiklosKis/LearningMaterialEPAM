import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTests {

    private static WebDriver driver;

    @BeforeEach
    public void setUp() throws Exception {

        driver = new ChromeDriver();
        driver.get("https://demo.seleniumeasy.com/test/ajax-form-submit-demo.html");

    }

    @Test
    public void testFormSubmit() throws InterruptedException {

        WebElement nameField = driver.findElement(By.cssSelector("input#title"));
        nameField.sendKeys("Tester");

        WebElement comment = driver.findElement(By.cssSelector("textarea#description"));
        comment.sendKeys("Hello World!");

        WebElement submitButton = driver.findElement(By.id("btn-submit"));
        submitButton.click();

        WebElement submitMsg = driver.findElement(By.id("submit-control"));
        // Using this only for demo purposes, next week we'll introduce proper waiters!
        Thread.sleep(3000);
        Assertions.assertEquals("Form submited Successfully!", submitMsg.getText());

    }

    @Test
    public void testFormValidation() {

        WebElement nameField = driver.findElement(By.cssSelector("input#title"));
        nameField.clear();
        WebElement commentField = driver.findElement(By.cssSelector("textarea#description"));
        commentField.clear();

        WebElement submitButton = driver.findElement(By.cssSelector("input#btn-submit"));
        submitButton.click();

        WebElement validationError = driver.findElement(By.className("validation-error"));
        Assertions.assertTrue(validationError.isDisplayed(), "Validation error is not displayed!");

    }

    @AfterEach
    public void tearDown() throws Exception {

        if (driver != null) {
            driver.quit();
        }

    }

}

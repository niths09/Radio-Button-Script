package radiobutton;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButton {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.letskodeit.com/practice");

        WebElement bmwRadio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='bmwradio']")));
        bmwRadio.click();
        waitForUserToSee();

        WebElement benzRadio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='benzradio']")));
        benzRadio.click();
        waitForUserToSee();

        WebElement hondaRadio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='hondaradio']")));
        hondaRadio.click();
        waitForUserToSee();

        driver.close();
    }

    public static void waitForUserToSee() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

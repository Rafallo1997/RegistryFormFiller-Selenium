package form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmailRegister {
WebElement email_input, button;
boolean clickedButton =false;

    public boolean isClickedButton() {
        return clickedButton;
    }

    public EmailRegister(WebDriver driver){

    driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
     email_input=driver.findElement(By.id("email_create"));
            email_input.sendKeys("dupa@op.pl");
            driver.findElement(By.id("SubmitCreate")).click();

        clickedButton =true;

}
}
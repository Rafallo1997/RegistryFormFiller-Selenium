import form.EmailRegister;
import form.FormFiller;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rafał\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();


        EmailRegister emailRegister=new EmailRegister(driver);

        FormFiller formFiller=new FormFiller(driver);
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class Selectdropdown 
{
    public static void main(String[] args) throws Exception
    {
        System.setProperty("webdriver.chrome.ChromeDriver","G:\\Software Testing Project\\Selenium Practice\\src\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sugarcrm.com/au/request-demo/");
        driver.manage().window().maximize();
        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        WebElement ddown = driver.findElement(By.name("awareness_source_c"));
        Select select = new Select(ddown);
        select.selectByValue("Event");
        Thread.sleep(1000);
        select.selectByIndex(1);
        Thread.sleep(1000);
        select.selectByVisibleText("Previously Used");
        driver.close();
    }
}

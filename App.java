import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws Exception {
        /*System.out.println("Hello, World!");
        System.setProperty("webdriver.chrome.driver", "G:\\Software Testing Project\\Selenium Practice\\src\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        Thread.sleep(1000);
        driver.quit();
        */
        System.out.println("Hello World");
        System.setProperty("webdriver.chrome.driver", "G:\\Software Testing Project\\Selenium Practice\\src\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/form/input")).click();
        driver.close();
    }
}

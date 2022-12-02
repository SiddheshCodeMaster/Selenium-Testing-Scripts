import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
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
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        
        // By using tag name:
        driver.findElement(By.tagName("input")).sendKeys("Testing");

        // By using class name:
        driver.findElement(By.className("input_error form_input")).sendKeys("standard_user");

        // By using locator id:
        //driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        
        
        // By using locator xpath:
        //driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/form/input")).click();
        driver.close();
    }   
}





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {
    public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Software Testing Project\\Selenium Practice\\src\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
        // 1] Method to get the frame by index:
        driver.switchTo().frame(1);
        driver.findElement(By.xpath("/html/body/button")).click();  
        // 2] Method to get frame by the frame name or id:
        driver.switchTo().frame("iframeResult");
        driver.switchTo().parentFrame();
        driver.close();
    }
}
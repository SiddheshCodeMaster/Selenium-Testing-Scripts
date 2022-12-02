import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;



public class scrollingwebpage {
    public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Software Testing Project\\Selenium Practice\\src\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        // 1] Method by using pixel:
        //js.executeScript("window.scrollBy(0,1000)","");
        
        // 2] Method scrolling till finding certain element:
        //WebElement flag = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/table[1]/tbody/tr[68]/td[2]"));
        //js.executeScript("arguments[0].scrollIntoView();", flag);

        // 3] Method scrolling the web page till bottom:
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragDrop {
    public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Software Testing Project\\Selenium Practice\\src\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
        WebElement frame = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/iframe"));
        driver.switchTo().frame(frame);
        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));

        Actions action = new Actions(driver);
        action.dragAndDrop(drag, drop).perform();
}
}
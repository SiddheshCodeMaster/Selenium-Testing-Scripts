import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class loginpage 
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("This test is coducted by manual tester Siddhesh Shankar.");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        // automation script for login page testing:
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/form/input")).click();
        driver.close();
    }
    
}

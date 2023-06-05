package s2035;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentDemo {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rbsap\\Downloads\\chromedriver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("Selinium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
//		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/a/h3")).click();
		// FluentWait
		// also similar to webdriver with more flexibility in polling time and ignoring
		// exceptions

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.withMessage("trying to search Bye")
				.ignoring(NoSuchElementException.class);

		WebElement element =wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/a/h3")));
            element.click();
	}

}

package s2035;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDrown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rbsap\\Downloads\\chromedriver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("http://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
		WebElement drop=driver.findElement(By.id("myInput"));
		drop.sendKeys("P");
		drop.sendKeys(Keys.ARROW_DOWN);
		drop.sendKeys(Keys.ENTER);
		driver.findElement(By.id("submit-button")).click();
		if(driver.getCurrentUrl().contains("textfield.html?food-item=Pizza")) {
			System.out.println("test case pass");
		}else {
			System.out.println("test case fail");
		}
		

	}

}

package s2035;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rbsap\\Downloads\\chromedriver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("http://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
		driver.findElement(By.id("myInput")).sendKeys("p");
		
		List<WebElement> list=driver.findElements(By.cssSelector("#myInputautocomplete-list > div"));
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getText().equals("Pancakes")) {
				list.get(i).click();
				break;
			
		
			}
			
		}
		Thread.sleep(3000);
		
		driver.findElement(By.id("submit-button")).click();
		if(driver.getCurrentUrl().contains("Pancakes")) {
			System.out.println("test case pass");
		}else {
			System.out.println("test case fail");
		}
		//driver.close();
		driver.quit();
		
		
		
		
		
	}

	}



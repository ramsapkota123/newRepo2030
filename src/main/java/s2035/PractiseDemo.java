package s2035;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver", 
				"C:\\Users\\rbsap\\Downloads\\chromedriver1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement e=driver.findElement(By.name("first_name"));
		System.out.println(e.getAttribute("type"));
		
		

	}

}

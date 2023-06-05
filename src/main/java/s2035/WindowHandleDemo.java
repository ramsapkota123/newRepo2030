package s2035;

import java.util.Iterator;

import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandleDemo {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", 
				"C:\\Users\\rbsap\\Downloads\\chromedriver1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.id("contact-us")).click();
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		System.out.println(driver.getTitle());
		
		
		
		Set<String>windows=driver.getWindowHandles();
		System.out.println(windows);
		Iterator<String>s=windows.iterator();
		
		String parentA=s.next();
		String childA=s.next();
	    System.out.println(parentA);
		System.out.println(childA);
		driver.switchTo().window(childA);
		driver.findElement(By.name("first_name")).sendKeys("Ram");
		boolean a=driver.findElement(By.cssSelector("input[name='last_name']")).isDisplayed();
		if(a) {
			System.out.println("test casepass");
		}
		Thread.sleep(5000);
		driver.switchTo().window(parentA);
		String b=driver.getCurrentUrl();
		if(b.contains("http://www.webdriveruniversity.com/")) {
			System.out.println("test case pass");
		}
		boolean v=driver.findElement(By.id("actions")).isDisplayed();
		if(v) {
			System.out.println("ram is pass");
		}
		
		
		
		
		
		
	}

}

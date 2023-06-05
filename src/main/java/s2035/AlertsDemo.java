package s2035;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {
	public static void main(String[]args) throws InterruptedException{
//		System.setProperty("webDriver.chrome.driver", 
//				"C:\\Users\\rbsap\\Downloads\\chromedriver1\\chromedriver.exe");
//		ChromeDriver driver=new ChromeDriver();
//		driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
//		driver.manage().window().maximize();
		
		//prgram 1 (alert)
//		driver.findElement(By.id("button1")).click();
//		driver.switchTo().alert().accept();
//		Thread.sleep(5000);
		//driver.close();
		
		//confirm-accept()
	
//		driver.findElement(By.id("button4")).click();
//		driver.switchTo().alert().accept();
//		String text1=driver.findElement(By.id("confirm-alert-text")).getText();
//		System.out.println(text1);
		
		//confirm-dismiss
//		driver.findElement(By.id("button4")).click();
//		driver.switchTo().alert().dismiss();
//		String text2=driver.findElement(By.id("confirm-alert-text")).getText();
//		System.out.println(text2);
		
		
		//prompt alert
//		System.setProperty("webDriver.chrome.driver", 
//				"C:\\Users\\rbsap\\Downloads\\chromedriver1\\chromedriver.exe");
//		ChromeDriver driver=new ChromeDriver();
//		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		driver.manage().window().maximize();
//		driver.findElement(By.cssSelector("button[onclick=\"jsPrompt()\"]")).click();
//		driver.switchTo().alert().sendKeys("ram");
//		driver.switchTo().alert().accept();
//		String value=driver.findElement(By.id("result")).getText();
//		if(value.equals("You entered: ram")) {
//			System.out.println("test case pass");
//		}else {
//			System.out.println("test case fail");
//		}
		
		//prompt dismiss
		System.setProperty("webDriver.chrome.driver", 
				"C:\\Users\\rbsap\\Downloads\\chromedriver1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("button[onclick=\"jsPrompt()\"]")).click();
		driver.switchTo().alert().dismiss();
		String value=driver.findElement(By.id("result")).getText();
		if(value.equals("You entered: null")) {
			System.out.println("test case pass");
		}else {
			System.out.println("test case fail");
		}
		System.out.println("hello");
		
		
		
		
		
		
	}

}

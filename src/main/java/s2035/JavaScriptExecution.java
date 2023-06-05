package s2035;

import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecution {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver", 
				"C:\\Users\\rbsap\\Downloads\\chromedriver1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Actions/index.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);

	}

}

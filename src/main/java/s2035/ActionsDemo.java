package s2035;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver", 
				"C:\\Users\\rbsap\\Downloads\\chromedriver1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Actions/index.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
//		//Double Click
		Actions a=new Actions(driver);
//		WebElement b=driver.findElement(By.id("double-click"));
//		a.doubleClick(b).build().perform();
//		if(b.getAttribute("class").equals("div-double-click double")) {
//			System.out.println("test case pass");
//		}else {
//			System.out.println("test case fail");
//		}
//		//Drag and Drop 
//		WebElement d=driver.findElement(By.id("draggable"));
//		WebElement p=driver.findElement(By.id("droppable"));
//		a.dragAndDrop(d, p).build().perform();
//		System.out.println(p.getText());
//		if(p.getText().equals("Dropped!")) {
//			System.out.println("test case pass");
//		}else {
//			System.out.println("test case fail");
//		}
//		//click and hold
//		WebElement dd=driver.findElement(By.id("click-box"));
//		a.clickAndHold(dd).build().perform();
//		System.out.println(dd.getText());
		
		//Hover and over element
//		WebElement ho=driver.findElement(By.cssSelector("#div-hover > div:nth-child(3) > button"));
//		a.moveToElement(ho).build().perform();
		
		WebElement e = driver.findElement(By.cssSelector("#main-header"));
		a.contextClick(e).build().perform();
		
		Thread.sleep(5000);
		

	}

}

package foundation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicitExplicit {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RASHMI\\Downloads\\bselenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.flipkart.com");
		
		WebElement Email=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		WebElement password=driver.findElement(By.xpath("//input[@type=\"password\"]"));
		sendKeys(driver,Email,10,"singhrashmirashmi480@gmail.com");
		sendKeys(driver,password,10,"Asdfgh9@@@");
		WebElement login=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button"));
		click(driver,login,4);
		/*WebElement number=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		sendKeys(driver,number,6,"9971013034");
		WebElement Continue=driver.findElement(By.xpath("//span[text()=\"CONTINUE\"]"));
		click(driver,Continue,4);*/
		String s=driver.getTitle();
        System.out.println(s);
	}
	
	public static void sendKeys(WebDriver driver,WebElement element,int timeout,String value) {
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	public static void click(WebDriver driver,WebElement element,int timeout) {
		new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
}

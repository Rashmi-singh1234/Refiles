package foundation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RASHMI\\Downloads\\bselenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.rediffmailpro.com/cgi-bin/login.cgi");
	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	Alert alert=driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	}
}

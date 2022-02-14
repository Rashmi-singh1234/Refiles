package foundation;

import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorials {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RASHMI\\Downloads\\bselenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://accounts.google.com");
        driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("singhrashmirashmi480@gmail.com");
        driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Asdfgh9@@@");
        driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String s=driver.getTitle();
        System.out.println("Successfull"+s);
	}

}

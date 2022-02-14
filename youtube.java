package foundation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {
   public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\RASHMI\\Downloads\\bselenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.youtube.com");
		driver.findElement(By.xpath("//input[@placeholder=\"Search\"]")).sendKeys("Lata mangeshkar");
		driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string")).click();
		//int count=0.00;
		while(true) {
			Thread.sleep(5000);
			DateFormat formatdate=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Date systemDate= new Date();
			String s=formatdate.format(systemDate);
			System.out.println(s);
		}
		//DateFormat formatdate=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		/*Timer timer=new Timer();
		TimerTask task=new TimerTask() {
		public void run(){
		     count++;
		}
		while(1) {
		//Date systemDate= new Date();
		String s=formatdate.format(systemDate);
		System.out.println(s);
		}
		}*/
		/*Date systemDate= new Date();
		String s=formatdate.format(systemDate);
		System.out.println(s);*/
   }
}

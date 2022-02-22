package spicejet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Select{
	
	static WebDriver driver;
	@Given("user is on spicejet homepage")
	public void user_is_on_spicejet_homepage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RASHMI\\Downloads\\bselenium\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		String url="https://www.spicejet.com/";
		driver.get(url);
	}
     
	@When("user selects from and to cities")
	public void user_selects_from_and_to_cities() {
		driver.findElement(By.cssSelector("div[data-testID$='-origin']")).click();
		driver.findElement(By.xpath("//div[text()=\"Indira Gandhi International Airport\"]")).click();
		driver.findElement(By.cssSelector("div[data-testID$='-destination']")).click();
		driver.findElement(By.xpath("//div[text()=\"Goa International Airport\"]")).click();
	}

	@And("user selects departure date and return date")
	public void user_selects_departure_date_and_return_date(){
		System.out.println("rashmi");
		driver.findElement(By.xpath("//div[@data-testid='undefined-month-February-2022']//div[text()='28']")).click();
		driver.findElement(By.cssSelector("div[data-testid^='return-date']")).click();
		driver.findElement(By.xpath("//div[@data-testid='undefined-month-March-2022']//div[text()='10']")).click();
	}

	@And("user clicks on search flight")
	public void user_clicks_on_search_flight() {
		System.out.println("dfgh");
		driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[7]/div[2]/div[1]")).click();
	}

	@Then("user is navigated to the flights.")
	public void user_is_navigated_to_the_flights() {
	    
	}
	
	@Given("user is on flight page")
	public void user_is_on_flight_page() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"list-results-section-0\"]/div[4]/div[2]/div[4]")).click();
		driver.findElement(By.xpath("//div[text()='16:20']")).click();
		System.out.println("flight number " + driver.findElement(By.xpath("//div[text()='SG 8645']")).getText());
		System.out.println("flight price : Rs." + driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[5]/div/div/div[2]/div[1]/div[1]/div[2]")).getText());
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user select any flight")
	public void user_select_any_flight() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Successfull");
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user fetches flightno and price")
	public void user_fetches_flightno_and_price() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Successfull");
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("user clicks on continue")
	public void user_clicks_on_continue() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//div[@data-testid='continue-search-page-cta']")).click();
	    //throw new io.cucumber.java.PendingException();
	}
	@Given("user is on passenger page")
	public void user_is_on_passenger_page() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("Welcome");
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user enter contact details")
	public void user_enter_contact_details() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@data-testid=\"title-contact-detail-card\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"primary-contact-details\"]/div[3]/div[1]/div[2]/div[2]/div/div/div[3]")).click();
		driver.findElement(By.xpath("//*[@data-testid='first-inputbox-contact-details']")).sendKeys("Rashmi");
		driver.findElement(By.xpath("//*[@data-testid='last-inputbox-contact-details']")).sendKeys("Singh");
		driver.findElement(By.xpath("//*[@data-testid='contact-number-input-box']")).sendKeys("9971013034");
		driver.findElement(By.xpath("//*[@data-testid='emailAddress-inputbox-contact-details']")).sendKeys("singhrashmirashmi480@gmail.com");
		driver.findElement(By.xpath("//*[@data-testid='city-inputbox-contact-details']")).sendKeys("Ghaziabad");

	    //throw new io.cucumber.java.PendingException();
	}

	@And("enters passenger information details")
	public void enters_passenger_information_details() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"pax-item-MCFBRFQ-\"]/div[2]/div/div[2]/div[1]/div[2]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"pax-item-MCFBRFQ-\"]/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[3]/div")).click();
		driver.findElement(By.xpath("//*[@data-testid='traveller-0-first-traveller-info-input-box']")).sendKeys("Rashmi");
        driver.findElement(By.xpath("//*[@data-testid='traveller-0-last-traveller-info-input-box']")).sendKeys("Singh");
        driver.findElement(By.xpath("//*[@data-testid='sc-member-mobile-number-input-box']")).sendKeys("9971013034");

	    //throw new io.cucumber.java.PendingException();
	}
	@Then("user clicks on continue button")
	public void user_clicks_on_continue_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@data-testid='traveller-info-continue-cta']")).click();
	    //throw new io.cucumber.java.PendingException();
	}
	
	@Given("user is on Add-on")
	public void user_is_on_add_on() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("Welcome");
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on choose seats")
	public void user_clicks_on_choose_seats() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//div[text()='Choose Your Seat']")).click();
		driver.findElement(By.xpath("//div[@data-testid='bookingFlow-seats-add-cta']")).click();
	    //throw new io.cucumber.java.PendingException();
	}

	@And("user clicks on add seat")
	public void user_clicks_on_add_seat() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("f");
		//driver.findElement(By.cssSelector("body > div:nth-child(26) > div > div > div.css-1dbjc4n.r-14lw9ot.r-1p0dtai.r-u8s1d.r-zchlnj.r-ipm5af > div.css-1dbjc4n.r-14lw9ot.r-13awgt0.r-18u37iz.r-1fviwye > div.css-1dbjc4n.r-1awozwy.r-akgwms.r-13awgt0.r-mk0yit.r-gh14nr > div.css-1dbjc4n.r-150rngu.r-eqz5dr.r-16y2uox.r-1wbh5a2.r-11yh6sk.r-1rnoaur.r-1sncvnh.r-13qz1uu > div > div.css-1dbjc4n.r-18u37iz.r-1w6e6rj > div.css-1dbjc4n.r-1awozwy.r-14lw9ot.r-13awgt0 > div.css-1dbjc4n.r-18u37iz.r-1w6e6rj.r-1wtj0ep.r-d0pm55.r-19yat4t.r-1qfz7tf > div:nth-child(2) > div > div > div > div > svg > g > g > path:nth-child(2)")).click();
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("user clicks continue")
	public void user_clicks_continue() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//div[text()='Done']")).click();
	    //throw new io.cucumber.java.PendingException();
	}
    

}

package phpTravel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {

	public WebDriver driver;

	/*
	 * @BeforeTest public void LaunchBrowser() {
	 * 
	 * System.out.println("Lanching the Browser");
	 * driver.get(" https://www.phptravels.net/m-thhotels"); }
	 */

	@BeforeTest

	public void launchBrowser() {

		driver = new ChromeDriver();
		System.out.println("Lanching the Browser");
		driver.get("http://newtours.demoaut.com/index.php");
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void veryfiyHomePage() {

		System.out.println("verify the home page");

		String expTitle = "Welcome: Mercury Tours";
		String actTitle = driver.getTitle();
		Assert.assertEquals(actTitle, expTitle);
		System.out.println("Home Screen Title passed");

		System.out.println(driver.getTitle());
		/*
		 * if (expTitle.contentEquals(actTitle))
		 * System.out.println("Home Screen Title passed");
		 * 
		 * else { System.out.println("Home Scree Title Failed"); }
		 */
	}

	@Test(priority = 2)

	public void Login() {

		System.out.println("Login to the System");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.xpath("//input[@name='login']")).click();

	}

	@Test(priority = 3)
	public void flightFinder() {

		String expTitle = "Find a Flight: Mercury Tours:";
		String actTitle = driver.getTitle();
		Assert.assertEquals(actTitle, expTitle);
		System.out.println("Find a flight Screen Passed");

		System.out.println(driver.getTitle());

		int a = driver.findElements(By.xpath("//input [@name='tripType']")).size();
		System.out.println("The number of Radio buttons:" + a);

		for (int i = 1; i < a; i++) {

			driver.findElements(By.xpath("//input [@name='tripType']")).get(1).click();
		}

		Select passCount = new Select(driver.findElement(By.name("passCount")));
		passCount.selectByIndex(2);

		Select fromPort = new Select(driver.findElement(By.name("fromPort")));
		fromPort.selectByIndex(5);

		Select fromMonth = new Select(driver.findElement(By.name("fromMonth")));
		fromMonth.selectByIndex(9);

		Select fromDay = new Select(driver.findElement(By.name("fromDay")));
		fromDay.selectByIndex(30);

		Select toPort = new Select(driver.findElement(By.name("toPort")));
		toPort.selectByIndex(3);

		Select toMonth = new Select(driver.findElement(By.name("toMonth")));
		toMonth.selectByIndex(11);

		Select toDay = new Select(driver.findElement(By.name("toDay")));
		toDay.selectByIndex(23);

		driver.findElement(By.xpath("//input[@value='First']")).click();

		Select airline = new Select(driver.findElement(By.name("airline")));
		airline.selectByIndex(2);

		WebElement findflights = driver.findElement(By.name("findFlights"));
		findflights.click();

	}

	@Test(priority = 4)
	public void SelectFlight() {

		String expTitle = "Select a Flight: Mercury Tours";
		String actTitle = driver.getTitle();
		Assert.assertEquals(actTitle, expTitle);
		System.out.println("Find a flight Screen Passed");

		System.out.println(driver.getTitle());

		int b = driver.findElements(By.xpath("//input[@name='outFlight']")).size();
		System.out.println("The number of Radio buttons:" + b);

		for (int i = 1; i < b; i++) {

			driver.findElements(By.xpath("//input[@name='outFlight']")).get(2).click();
		}

		int c = driver.findElements(By.xpath("//input[@name='inFlight']")).size();
		System.out.println("The number of Radio buttons:" + c);

		for (int i = 1; i < c; i++) {

			driver.findElements(By.xpath("//input[@name='inFlight']")).get(2).click();
		}

		WebElement reserveFlights = driver.findElement(By.name("reserveFlights"));
		reserveFlights.click();
	}

	@Test(priority = 5)
	public void BookaFlight() {

		String expTitle = "Book a Flight: Mercury Tours";
		String actTitle = driver.getTitle();
		Assert.assertEquals(actTitle, expTitle);
		System.out.println("Book a flight Screen Passed");

		driver.findElement(By.name("passFirst0")).sendKeys("Onthusitse");
		driver.findElement(By.name("passLast0")).sendKeys("Itumeleng");

		Select meal = new Select(driver.findElement(By.name("pass.0.meal")));
		meal.selectByIndex(1);

		driver.findElement(By.name("passFirst1")).sendKeys("Lebogang");
		driver.findElement(By.name("passLast1")).sendKeys("Sefolo");

		Select meal2 = new Select(driver.findElement(By.name("pass.1.meal")));
		meal2.selectByIndex(2);

		driver.findElement(By.name("passFirst2")).sendKeys("Wame");
		driver.findElement(By.name("passLast2")).sendKeys("Itumeleng");

		Select meal3 = new Select(driver.findElement(By.name("pass.2.meal")));
		meal3.selectByIndex(3);

		Select creditCard = new Select(driver.findElement(By.name("creditCard")));
		creditCard.selectByIndex(1);

		driver.findElement(By.name("creditnumber")).sendKeys("10000123");

		Select expMonth = new Select(driver.findElement(By.name("cc_exp_dt_mn")));
		expMonth.selectByIndex(1);

		Select expYear = new Select(driver.findElement(By.name("cc_exp_dt_yr")));
		expYear.selectByIndex(4);

		driver.switchTo().alert().accept();

		driver.findElement(By.name("cc_frst_name")).sendKeys("Onthusitse");
		driver.findElement(By.name("cc_mid_name")).sendKeys("Joshua");
		driver.findElement(By.xpath("//input[@name='cc_last_name']")).sendKeys("Itumeleng");
		
		driver.findElement(By.name("billAddress1")).clear();

		driver.findElement(By.name("billAddress1")).sendKeys("412 Corlette Drive");
		
		driver.findElement(By.name("billCity")).clear();
		driver.findElement(By.name("billCity")).sendKeys("Johannesburg");
		
		driver.findElement(By.name("billState")).clear();

		driver.findElement(By.name("billState")).sendKeys("Jhb");
		
		driver.findElement(By.name("billZip")).clear();

		driver.findElement(By.name("billZip")).sendKeys("1686");
		
		

		Select billCountry = new Select(driver.findElement(By.name("billCountry")));
		billCountry.selectByIndex(187);

		int c = driver.findElements(By.xpath("//input [@name='ticketLess']")).size();
		System.out.println("The number of Radio buttons with ticketless:" + c);

		for (int i = 1; i < c; i++) {

			driver.findElements(By.xpath("//input [@name='ticketLess']")).get(1).click();
		}
		
		driver.findElement(By.name("buyFlights")).click();

	}
	@Test
	public void flightConfirmation() throws InterruptedException {
		
		//Thread.sleep(10000);
		//driver.findElement(By.xpath("//table[@border='0']//table[@border='1']//a[contains(text(),'SIGN-OFF')]")).click();
		
		   }
		  
		  
	


	@AfterTest
	public void afterTest() {
	    driver.quit();
	}

}

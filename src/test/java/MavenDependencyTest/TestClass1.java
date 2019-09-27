package MavenDependencyTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass1 {
	
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
	@Test
	  public void test1() {
	      System.out.println("Running TestClass1#test1()");
	  }

	  @Test
	  public void test2() {
	      System.out.println("Running TestClass1#test2()");
	  }
	  
	  @AfterTest
		public void afterTest() {
		    driver.quit();
		};

}

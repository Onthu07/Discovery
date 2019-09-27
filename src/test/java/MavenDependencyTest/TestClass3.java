package MavenDependencyTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass3 {
	
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
	  public void test5() {
	      System.out.println("Running TestClass3#test5()");
	  }

	  @Test
	  public void test6() {
	      System.out.println("Running TestClass3#test6()");
	  }

	  @Test
	  public void test7() {
	      System.out.println("Running TestClass3#test7()");
	  }
	  @AfterTest
		public void afterTest() {
		    driver.quit();
		};
}

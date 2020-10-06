package factorialAssignment;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class testCase4 {
	//the location of ChromeDriver in localsystem
	  static String pathDriver ="C:\\Selenium\\Tools\\chromedriver.exe";
	  // url
	  static String url ="https://qainterview.pythonanywhere.com/";
	  //webdriver reference
	  static WebDriver driver;
	  
	  
	  @Test
	  public void testBigInt() {
		System.out.println("Test case 4: the factorial of 171");
		String expectedText = "The factorial of 171 is: 1.24101807 E+309";
		String actualText;
		WebElement inputField = driver.findElement(By.xpath("//*[@id='number']"));
		  
		if(inputField.isDisplayed()) {
			  inputField.sendKeys("0");
			  driver.findElement(By.id("getFactorial")).click();
		}
		 
		// explicit wait - to wait for results
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resultDiv")));
		
		actualText =  driver.findElement(By.id("resultDiv")).getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText, expectedText);	  
	  }
	  
	  @BeforeTest
	  public void beforeTest() {
		  
		  System.setProperty("webdriver.chrome.driver",pathDriver);
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get(url);
		  System.out.println("Setup");
		  
	  }
	  
	  @AfterTest
	  public void afterTest() {
		//Teardown
		System.out.println("Teardown");
		driver.quit();
		  
	  }
}

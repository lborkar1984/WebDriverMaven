package webdriverMaven;

	
	import org.junit.Test;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
    //import org.testng.annotations.Test;



	public class loginTest {

	 
	@Test
	public void testLogin(){
		
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.get("https://www.yahoo.com");
		driver.quit();
	}

}

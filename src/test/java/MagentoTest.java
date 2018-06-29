
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class MagentoTest {	
	@Test
	public void testRun()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.magento.com");
		System.out.println(driver);
		//home page
		HomePage hp=new HomePage(driver);
		hp.clickOnMyAccount();		
		//login page		
		LoginPage lp=new LoginPage(driver);
				lp.sendUsername("subramanyaraj87@gmail.com");
				lp.sendPassword("Welcome123");
				lp.clickLogin();		
		//main page 
		Main mp=new Main(driver);
		mp.logout();
	}

}

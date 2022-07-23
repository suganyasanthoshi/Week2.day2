package selenium.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Phonenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    WebElement leads =driver.findElement(By.xpath("//ul[@class='shortcuts']//li[3]"));
	    leads.click();
		WebElement fx=driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]"));
		fx.click();
		driver.findElement(By.name("phoneAreaCode")).sendKeys("");
		driver.findElement(By.name("phoneNumber")).sendKeys("9878987891");
		/*WebElement dx=driver.findElement(By.xpath("(//button[@class='x-btn-text'])[1]"));
		dx.click();*/
		WebElement dx=driver.findElement(By.xpath("//button[text()='Find Leads']"));
		dx.click();
		String lead =driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']")).getText();
		System.out.println(lead);
		 driver.findElement(By.linkText("15075")).click();
		
		 WebElement ds=driver.findElement(By.xpath("//button[text()='15075']"));
			ds.click();
			
			WebElement dl=driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']"));
			dl.click();
	}
	

}

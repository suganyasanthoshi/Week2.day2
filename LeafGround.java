package selenium.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {

	public static void main(String[] args) throws InterruptedException{
		
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
	    
	    WebElement br =driver.findElement(By.xpath("//span[@class='x-tab-strip-inner']//span[@class='x-tab-strip-text ']"));
	    br.click();
	    
	  // WebElement dr =driver.findElement(By.xpath("(//div[@class='x-form-item requiredField']//input[@name='firstName'])[1]"));
	   
	   WebElement dr =driver.findElement(By.xpath("(//input[@name='firstName'])[1]"));
	   dr.click();
	   
	}

}

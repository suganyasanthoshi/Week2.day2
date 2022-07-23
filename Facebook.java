package selenium.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//<a>
		driver.findElement(By.linkText("Create New Account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Suganya");
		driver.findElement(By.name("lastname")).sendKeys("santhoshi");
		driver.findElement(By.name("reg_email__")).sendKeys("suganya@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Suga@123");
		driver.findElement(By.id("day")).sendKeys("21");
		driver.findElement(By.id("month")).sendKeys("Jan");
		driver.findElement(By.id("year")).sendKeys("2006");
	
			
		WebElement dr=driver.findElement(By.xpath("//span[@class='_5k_3']//input[@name='sex']"));

		//WebElement radio1=driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/input[preceding-sibling::label[text()='Female']]"));
		dr.click();
	
		
	}

}

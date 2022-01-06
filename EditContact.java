package week2.day2assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditContact {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	   // Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Find Contacts']")).click();
		String str1="10004";
        driver.findElement(By.xpath("//input[@name='id']")).sendKeys(str1);
        driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[@class='linktext']")).click();
        //Thread.sleep(3000);        
        driver.findElement(By.xpath("//a[text()='Edit']")).click();
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='updateContactForm_firstName']")).clear();
        driver.findElement(By.xpath("//input[@id='updateContactForm_firstName']")).sendKeys("siva");

        driver.findElement(By.xpath("//input[@value='Update']")).click();

	}

}

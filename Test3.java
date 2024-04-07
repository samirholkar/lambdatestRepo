package lambdatest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\JaiRajCucumber\\driver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Action_Class\\Firfox\\geckodriver.exe");

		WebDriver driver = new ChromeDriver();
		// WebDriver driver= new FirefoxDriver();

		driver.get("https://www.lambdatest.com/selenium-playground/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Input Form Submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		driver.findElement(By.name("name")).sendKeys("Samir");
		driver.findElement(By.id("inputEmail4")).sendKeys("Sameer@Gmail.com");
		driver.findElement(By.name("password")).sendKeys("Sameer@123");
		driver.findElement(By.id("company")).sendKeys("Demo123");
		driver.findElement(By.id("websitename")).sendKeys("www.Demo.com");
		WebElement wb = driver.findElement(By.name("country"));
		Select sel = new Select(wb);
		sel.selectByVisibleText("United States");
		driver.findElement(By.id("inputCity")).sendKeys("Pune");
		driver.findElement(By.id("inputAddress1")).sendKeys("Pune ShivajiNagar");
		driver.findElement(By.id("inputAddress2")).sendKeys("Pune 5555");
		driver.findElement(By.id("inputState")).sendKeys("Maharastra");
		driver.findElement(By.id("inputZip")).sendKeys("111111");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		WebElement wb1 = driver
				.findElement(By.xpath("//p[text()='Thanks for contacting us, we will get back to you shortly.']"));
		System.out.println(wb1.isDisplayed());

	}

}

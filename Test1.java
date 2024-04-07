package lambdatest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\JaiRajCucumber\\driver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Action_Class\\Firfox\\geckodriver.exe");

		WebDriver driver = new ChromeDriver();
		// WebDriver driver= new FirefoxDriver();

		driver.get("https://www.lambdatest.com/selenium-playground");
		driver.findElement(By.xpath("//a[text()='Simple Form Demo']")).click();
		String Url = driver.getCurrentUrl();
		System.out.println(Url.contains("simple-form-demo"));
		String name = "Welcome to lamda";
		driver.findElement(By.id("user-message")).sendKeys(name);
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		WebElement wb1 = driver.findElement(By.id("message"));
		System.out.println(wb1.getText().equalsIgnoreCase(name));

	}

}

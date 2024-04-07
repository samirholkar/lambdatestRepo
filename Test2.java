package lambdatest;

import java.time.Duration;

import org.checkerframework.checker.guieffect.qual.UI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\JaiRajCucumber\\driver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Action_Class\\Firfox\\geckodriver.exe");

		WebDriver driver = new ChromeDriver();
		// WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lambdatest.com/selenium-playground/drag-drop-range-sliders-demo");

		WebElement slider = driver.findElement(By.xpath("(//input[@type='range'])[3]"));

		Actions act = new Actions(driver);

		act.clickAndHold(slider).perform();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		act.clickAndHold(slider).moveByOffset(212, 0).release().build().perform();

		WebElement range_value = driver.findElement(By.id("rangeSuccess"));
		if (range_value.isDisplayed())
			System.out.println("Validation successful! The range value is 95.");
		else
			System.out.println("Validation failed! The range value is not 95.");

	}
}
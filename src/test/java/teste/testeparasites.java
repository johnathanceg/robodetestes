package teste;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testeparasites {
	private WebDriver driver;
	
	@Before
	public void abrirNavegador() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\CromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();


	}
	@Test
	public void testeNavegador() {
		driver.get("https://www.amazon.com.br/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Playstation 5");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.RETURN);
	}

}
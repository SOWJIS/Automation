package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("C:\\Program Files\\Java\\chromedriver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("text1")).sendKeys("Welcome to Selenium");
		Actions Act=new Actions(driver);
		Act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		Thread.sleep(3000);
		Act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		Thread.sleep(3000);
		Act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		Act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id=\"compareButton\"]/div[1]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id=\"textCompareForm\"]/div/table/tbody/tr/td[3]/button")).click();
		Thread.sleep(3000);
		
		
		
		
		

	}

}

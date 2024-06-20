package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("C:\\Program Files\\Java\\chromedriver\\chromedriver","chromedriver.exe"); 
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://testautomationpractice.blogspot.com/");
		    WebElement Slider =driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		    Actions act = new Actions(driver);
		    Thread.sleep(2000);
		    act.dragAndDropBy(Slider,150,0).perform();


	}

}

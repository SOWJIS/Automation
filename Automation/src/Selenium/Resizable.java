package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) {
		System.setProperty("C:\\Program Files\\Java\\chromedriver\\chromedriver","chromedriver.exe"); 
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://testautomationpractice.blogspot.com/");
	       //Resizable
	       WebElement Element =driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		    Actions act = new Actions(driver);
		    act.dragAndDropBy(Element,8,8).perform();
		}
	


	}



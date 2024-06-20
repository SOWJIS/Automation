package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Frame {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		WebElement frame1=driver.findElement(By.xpath("//*[@id=\"singleframe\"]"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("sowji");

	}

}

package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver=new EdgeDriver();
		Driver.get("https://demo.guru99.com/insurance/v1/register.php");
		Select dropdown=new Select(Driver.findElement(By.name("title")));
		dropdown.selectByIndex(4);
		dropdown.selectByValue("Doctor");
		dropdown.selectByVisibleText("Doctor");
		//FirstName
		Driver.findElement(By.name("firstname")).sendKeys("sowjanya");
		Driver.findElement(By.name("lastname")).sendKeys("kam");
		Driver.findElement(By.id("user_phone")).sendKeys("0789654");
		Select dropdown1=new Select(Driver.findElement(By.name("year")));
		dropdown1.selectByIndex(5);
		Select dropdown2=new Select(Driver.findElement(By.name("month")));
		dropdown2.selectByIndex(4);
		Select dropdown3=new Select(Driver.findElement(By.name("date")));
		dropdown3.selectByIndex(6);
		Thread.sleep(3000);
		//Radio buttons
	    Driver.findElement(By.id("licencetype_f")).click();
		Thread.sleep(3000);
        Select dropdown4=new Select(Driver.findElement(By.id("user_licenceperiod")));
		dropdown4.selectByValue("4");
		Thread.sleep(3000);
		Select dropdown5=new Select(Driver.findElement(By.id("user_occupation_id")));
		dropdown5.selectByVisibleText("Librarian");
		dropdown5.selectByIndex(4);
		Thread.sleep(3000);
		Driver.findElement(By.name("city")).sendKeys("Eluru");
		Driver.findElement(By.name("street")).sendKeys("tiverton");
		Driver.findElement(By.name("county")).sendKeys("India");
		Driver.findElement(By.id("user_address_attributes_postcode")).sendKeys("ig50la");
		Driver.findElement(By.id("user_user_detail_attributes_email")).sendKeys("sowji.krprp1@gamil.com");
		Driver.findElement(By.id("user_address_attributes_postcode")).sendKeys("ig50la");
		Driver.findElement(By.name("password")).sendKeys("1234");
		Driver.findElement(By.name("c_password")).sendKeys("1234");
		Driver.findElement(By.name("submit")).click();
		
		
		
		
		
		
		
		
			

	}

}

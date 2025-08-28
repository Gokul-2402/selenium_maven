package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EssLoginTestNG {
	WebDriver Driver = null;
	
	   By Username =By.id("empid-label");
	 
	  
	  By password = By.id("outlined-adornment-password");
	
	  By submit = By.xpath("//button[@type='submit']");
	  
	   public EssLoginTestNG( WebDriver Driver) {
		  this.Driver = Driver;
		  
	  }
	
  @Test
  public void username(String input) {
	  Driver.findElement(Username).sendKeys(input);
  }
  public void password(String input) {
	  Driver.findElement(password).sendKeys(input);
  }
  public void click() {
	  Driver.findElement(submit).click();
  }
}

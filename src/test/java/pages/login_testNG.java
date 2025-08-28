package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class login_testNG {
	WebDriver Driver = null;
	 By un = By.name("username");
	 By pwd = By.name("password");
	By click1 =By.xpath("//button[@type='submit']");
	
	 
	 
	 public login_testNG(WebDriver Driver) {
		  this.Driver = Driver;
	  }
	 
  @Test

  public void uname(String input) {
	  Driver.findElement(un).sendKeys(input);
	  
	}
  public void pwd(String input) {
	  Driver.findElement(pwd).sendKeys(input);
	  
	}
  public void Click() {
	  Driver.findElement(click1).click();;
  }

  }
  
	  
	
  
  


package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public  class loginOrangeHrm {
	WebDriver Driver = null;
	By un = By.name("username");
	By pwd = By.name("password");
	
	public void UName(String input){
		Driver.findElement(un).sendKeys(input);
		
	}
	public void pass(String input){
		Driver.findElement(pwd).sendKeys(input);
		
	}
	
	public loginOrangeHrm(WebDriver Driver) {
		this.Driver = Driver;
		
	}

}
